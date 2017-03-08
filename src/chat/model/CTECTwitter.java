package chat.model;

import java.util.ArrayList;
import chat.controller.ChatController;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.Status;
import java.util.List;
import twitter4j.Twitter;


public class CTECTwitter 
{
	private ChatController baseController;
	private Twitter chatbotTwitter;
	private List<Status> searchedTweets;
	private List<String> tweetedWords;
	
	public CTECTwitter(ChatController baseController)
	{
		this.baseController = baseController;
		this.searchedTweets = new ArrayList<Status>();
		this.tweetedWords = new ArrayList<String>();
		this.chatbotTwitter = TwitterFactory.getSingleton();
	}
	
	public void sendTweet(String text)
	{
		try
		{
			chatbotTwitter.updateStatus("I Jacob just tweeted from my Java Chatbot program 2017! #APCSRocks @CTECNow Thanks @cscheerleader & @codyhenrichsen! @ChatbotCTEC");
			
		}
		catch(TwitterException tweetError)
		{
			baseController.handleErrors(tweetError);
		}
		catch(Exception otherError)
		{
			baseController.handleErrors(otherError);
		}
	}
	
	private String [] createIgnoredWordList()
	{
		return null;
	}
	
	private void collectTweets(String username)
	{
		
	}
	
	public String getMostCommonWord(String username)
	{
		return null;
	}
	
	private void removeEmptyText()
	{
		for(int index = 0; index < tweetedWords.size(); index++)
		{
			if(tweetedWords.get(index).trim().equals(""))
			{
				tweetedWords.remove(index);
				index--;
			}
		}
	}
}
