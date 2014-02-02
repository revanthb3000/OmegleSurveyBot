package org.rb.chatbot.core;

import java.util.ArrayList;
import java.util.Arrays;

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
		consoleExample();
		//birthdayExample();
	}
	
	public static void consoleExample(){
		ArrayList<String> topics = new ArrayList<String>(Arrays.asList("help", "sad", "advice"));
		String requestMessage = "Hi ! I'm an automated bot and I'm sorry if I'm interrupting you right now but I have a small request. \n"
				+ "A friend of mine lost someone very close to him and has been depressed for a while now. Needless to say, I failed at lifting his spirits. \n"
				+ "I plan on collecting messages from several people telling him to cheer up and giving it. That'll make him happy. \n"
				+ "Can you do that for me ? His name is <insertNameHere> :-) \n"
				+ "I'll wait until you disconnect. Feel free to disconnect immediately if you're busy/not interested. Thanks";
		FavorBot.startFavorBot(requestMessage, topics);
	}
	
	public static void birthdayExample(){
		ArrayList<String> topics = new ArrayList<String>(Arrays.asList("help", "happy", "birthday"));
		String requestMessage = "Hi ! I'm an automated bot and I'm sorry if I'm interrupting you right now but I have a small request. \n"
				+ "I forgot to wish a good friend of mine 'Happy Birthday' and I think I might have touched a nerve. D'oh ! \n"
				+ "I plan on collecting messages from several people wishing her a happy birthday and giving it to her. That'll make her happy. \n"
				+ "Can you do that for me ? Her name is <insertNameHere> :-) \n"
				+ "I'll wait until you disconnect. Feel free to disconnect immediately if you're busy/not interested. Thanks";
		FavorBot.startFavorBot(requestMessage, topics);
	}
}
