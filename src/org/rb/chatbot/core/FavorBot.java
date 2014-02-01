package org.rb.chatbot.core;

import java.util.ArrayList;

public class FavorBot {

	public static void startFavorBot(String requestMessage, ArrayList<String> topics) {
		WebHandler webHandler = new WebHandler(ConstantTextStrings.WEBSITE_URL);
		webHandler.startBrowser();
		while (true) {
			try {
				String fileName = "convs/" + UtilityFunctions.getCurrentTimeStamp() + ".txt";
				webHandler.startNewChat(topics);
				webHandler.waitForChatStart();
				for(String message : requestMessage.split("\\n")){
					webHandler.sendMessage(message);
				}

				while (!webHandler.hasDisconnected()) {
					webHandler.waitForNewMessage();
					if(webHandler.getTranscript().contains(ConstantTextStrings.BOT_WAITED_TOO_LONG)){
						break;
					}
				}
				
				webHandler.disconnect();				
				UtilityFunctions.writeToFile(webHandler.getTranscript(),fileName);
			} catch (Exception e) {
				continue;
			}
		}
	}
	
}