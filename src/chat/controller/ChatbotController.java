package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatViewer;
import chat.view.ChatFrame;

public class ChatbotController
{
	private Chatbot stupidBot;
	private ChatViewer display;
	private ChatFrame appFrame;
	public ChatbotController()
	{
		stupidBot = new Chatbot("Unintelligent Chat Machine");
		appFrame = new ChatFrame(this);
	}
	
	public void start()
	{
		
	}
//		String response = display.collectResponse("What do you want to talk about?");
//		
//		while(stupidBot.lengthChecker(response))
//		{
//			display.displayMessage(useChatbotCheckers(response));
//			response = display.collectResponse("Oh, you want to talk about " + response +"? Tell me more...");
//		}
//	}
				
				public String useChatbotCheckers(String input)
				{
					String checkedInput = "";
					
					if(stupidBot.memeChecker(input))
					{
						checkedInput += "\nYou like memes!\n";
					}
					if(stupidBot.contentChecker(input))
					{
						checkedInput += "\nYou know my secret topic\n";
					}
					
					if(!stupidBot.lengthChecker(checkedInput))
					{
						checkedInput = "I have idea what you mean about " + input;
					}
					return checkedInput;
	}
				
				public ChatFrame getBaseFrame()
				{
					return appFrame;
				}
				
				public Chatbot getChatbot()
				{
					return stupidBot;
				}


}

