package org.rb.chatbot.core;

/**
 * This is the glue that sticks the webhandler functions together.
 * 
 * @author RB
 * 
 */
public class MainClass {

	/**
	 * A starting point for the code. Nothing much in here. Move along
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		String requestMessage = "Hi ! I'm an automated bot and I'm sorry if I'm interrupting you right now but I have a small request. \n"
				+ "I forgot to wish a good friend of mine 'Happy Birthday' and I think I might have touched a nerve. D'oh ! \n"
				+ "I plan on collecting messages from several people wishing her a happy birthday and giving it to her. That'll make her happy. \n"
				+ "Can you do that for me ? Her name is <insertNameHere> :-) \n"
				+ "I'll wait until you disconnect. Feel free to disconnect immediately if you're busy/not interested. Thanks";
		BirthdayBot.startBirthdayBot(requestMessage);
	}
}
