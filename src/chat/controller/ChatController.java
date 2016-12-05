package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatViewer;
import chat.view.ChatFrame;

public class ChatController
{
	private String randomTopicGenerator;
	private Chatbot stupidBot;
	private ChatViewer display;
	private ChatFrame appFrame;
	public ChatController()
	{
		stupidBot = new Chatbot("Unintelligent Chat Machine");
		appFrame = new ChatFrame(this);
	}
	
	/**
	 * 
	 */
	
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
					if(!stupidBot.quitChecker(input))
					{
					
						if(stupidBot.memeChecker(input))
						{
							checkedInput += "\nYou like memes!\n";
						}
						if(stupidBot.contentChecker(input))
						{
							checkedInput += "\nYou know my secret topic!\n";
						}
						
						if(stupidBot.inputHTMLChecker(input))
						{
							checkedInput += "\nYou are typing in HTML!\n";
						}
						
						if(stupidBot.politicalTopicChecker(input))
						{
							checkedInput += "\nYou are talking about political topics!\n";
						}
						
						if(stupidBot.quitChecker(input))
						{
							checkedInput += "\nYou have to go? Until next time! :)\n";
						}
						
						if(stupidBot.twitterChecker(input))
						{
							checkedInput += "\nYou are talking about Twitter!\n";
						}
						
						if(stupidBot.keyboardMashChecker(input))
						{
							checkedInput += "\nYou are just mashing keys.\n";
						}
						
						if(!stupidBot.lengthChecker(checkedInput))
						{
							checkedInput = "I have idea what you mean about " + input;
						}
						
						int canBeRandom = (int) (Math.random() * 2);
						if(canBeRandom % 2 == 0)
						{
							checkedInput += randomTopicGenerator();
						}
					}
					else
					{
						display.displayMessage("Thanks for chatting! Talk to you soon.");
						System.exit(0);
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
				
				private String randomTopicGenerator()
				{
					String randomTopic = "";
					int random = (int) (Math.random() * 7);
					
					switch(random)
					{
					case 0:
						randomTopic = ". It's time for some industrial!";
						break;
					case 1:
						randomTopic = ". Reading novels is a great way to spend your time!";
						break;
					case 2:
						randomTopic = ". I love to play sports.";
						break;
					case 3:
						randomTopic = ". Java is awesome!";
						break;
					case 4:
						randomTopic = ". Did you hear about the new iPhone?";
						break;
					case 5:
						randomTopic = ". Might you bring me some Sriracha?";
						break;
					case 6:
						randomTopic = ". Do/Did you enjoy school?";
						break;
					default:
						randomTopic = ". This can't be happening!";
						break;
					}
					
					return randomTopic;
				}


}

