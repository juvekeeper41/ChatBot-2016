package chat.model;

import java.util.ArrayList;

/**
 * Base version of the 2015 Chatbot class. Only stub methods are provided.
 * Students will complete methods as part * of the project. * @author Cody
 * Henrichsen * @version 1.0 10/14/15
 */
public class Chatbot
{
	private ArrayList<String> memesList;
	private ArrayList<String> politicalTopicList;
	private String userName;
	private String content;

	/**
	 * * Creates an instance of the Chatbot with the supplied username. * @param
	 * userName The username for the chatbot.
	 */
	public Chatbot(String userName)
	{
		memesList = new ArrayList<String>();
		politicalTopicList = new ArrayList<String>();
		content = new String("");
		this.userName = userName;
		this.content = "something nifty";

	}

	public boolean keyboardMashChecker(String currentInput)
	{
		boolean mashChecker = false;

		if (currentInput.contains("S.D.F."))
		{
			mashChecker = false;
		}

		if (currentInput.contains("derf"))
		{
			mashChecker = false;
		}

		if (currentInput.contains("sdf"))
		{
			mashChecker = true;
		}

		if (currentInput.contains("dfg"))
		{
			mashChecker = true;
		}

		if (currentInput.contains("cvb"))
		{
			mashChecker = true;
		}

		if (currentInput.contains(",./"))
		{
			mashChecker = true;
		}

		return mashChecker;
	}
	
	public boolean inputHTMLChecker(String currentInput)
	{
		boolean HTMLChecker = false;
		int open = -1;
		int close = -1;
		int open2 = -1;
		int close2 = -1;
		
		if(currentInput.contains("<P>"))
		{
			HTMLChecker = true;
		}
		
		if(currentInput.equals("<A HREF=\"sdfs.html\"> </a>"))
		{
			HTMLChecker = true;
		}
		
		if(currentInput.contains("<A HREF> </a>"))
		{
			HTMLChecker = false;
		}
		
		if(currentInput.contains("<>"))
		{
			HTMLChecker = false;
		}
		
		if(currentInput.contains("< >"))
		{
			HTMLChecker = false;
		}
		
		open = currentInput.indexOf("<");
		close = currentInput.indexOf(">");
		String tag = currentInput.toLowerCase().substring(open + 1, close);
		open2 = currentInput.indexOf("<", close + 1);
		close2 = currentInput.indexOf(">", close + 1);
		String tag2 = currentInput.toLowerCase().substring(open2 + 1, close2);
		
		if(tag2.equals("/"+tag))
		{
			HTMLChecker = true;
		}
		
		return HTMLChecker;
	}

	public boolean twitterChecker(String currentInput)
	{
		boolean twitter = false;
		int hashtagStart = -1;
		int hashtagEnd = -1;
		int atStart = -1;
		int atEnd = -1;

		if (currentInput.contains(" "))
		{
			twitter = false;
		}
		
		hashtagStart = currentInput.indexOf("#");
		hashtagEnd = currentInput.indexOf(" ", hashtagStart + 1);
		String hashtag = currentInput.toLowerCase().substring(hashtagStart + 1, hashtagEnd);
		
		if(!hashtag.equals(""))
		{
			twitter = true;
		}

		atStart = currentInput.indexOf("@");
		atEnd = currentInput.indexOf(" ", atStart + 1);
		String at = currentInput.toLowerCase().substring(atStart + 1, atEnd);
		
		if(!at.equals(" "))
		{
			twitter = true;
		}
		
		return twitter;
	}

	private void buildMemesList()
	{
		memesList.add("memes");
		memesList.add("doge");
		memesList.add("cute animals");
		memesList.add("dat boi");
		memesList.add("grumpy cat");
		memesList.add("willy wonka");
		memesList.add("harambe");
		memesList.add("john cena");
		memesList.add("arthur");
		memesList.add("kenneth bone");
		memesList.add("spongegar");
		memesList.add("hillary clinton");
		memesList.add("donald trump");
		memesList.add("bad luck brian");
		memesList.add("will ferrell");
		memesList.add("sheldon");
		memesList.add("drake");
		memesList.add("michael jordan");
		memesList.add("michael phelps");
	}

	private void buildPoliticalTopicsList()
	{
		politicalTopicList.add("Democrat");
		politicalTopicList.add("Republican");
		politicalTopicList.add("11/8/16");
		politicalTopicList.add("liberal");
		politicalTopicList.add("conservative");
		politicalTopicList.add("Clinton");
		politicalTopicList.add("Trump");
		politicalTopicList.add("Kaine");
		politicalTopicList.add("Pence");
		politicalTopicList.add("Stein");
		politicalTopicList.add("Johnson");
		politicalTopicList.add("election");
		politicalTopicList.add("Gary Johnson");
		politicalTopicList.add("democracy");
		politicalTopicList.add("republic");
		politicalTopicList.add("Ben Carson");
		politicalTopicList.add("Emails");
		politicalTopicList.add("Racism");
		politicalTopicList.add("Wall");
	}

	/**
	 * * Checks the length of the supplied string. Returns false if the supplied
	 * String is empty or null, otherwise returns true. * @param currentInput * @return
	 * A true or false based on the length of the supplied String.
	 */
	public boolean lengthChecker(String currentInput)
	{
		boolean hasLength = false;

		if (currentInput != null && !currentInput.equals(""))
		{
			hasLength = true;
		}

		return hasLength;
	}

	/**
	 * * Checks if the supplied String matches the content area for this Chatbot
	 * instance.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked. * @return Whether it
	 *            matches the content area.
	 */

	public boolean contentChecker(String currentInput)
	{
		boolean hasContent = false;
		
		if (currentInput.toLowerCase().contains(content.toLowerCase()))
		{
			hasContent = true;
		}

		return hasContent;
	}

	/**
	 * * Checks if supplied String matches ANY of the topics in the
	 * politicalTopicsList. Returns true if it does find a match and false if it
	 * does not match.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked. * @return Whether the
	 *            String is contained in the ArrayList.
	 */
	public boolean politicalTopicChecker(String currentInput)
	{
		boolean politicalTopic = false;

		for (String currentPoliticalTopic : politicalTopicList)
		{
			if (currentInput.contains(currentPoliticalTopic))
				politicalTopic = true;
		}
		return politicalTopic;
	}

	/**
	 * * Checks to see that the supplied String value is in the current
	 * memesList variable.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked. * @return Whether the
	 *            supplied String is a recognized meme.
	 */
	public boolean memeChecker(String currentInput)
	{
		boolean meme = false;

		for (String currentMeme : memesList)
		{
			if (currentInput.contains(currentMeme))
				meme = true;
		}
		return meme;
	}

	/**
	 * * Returns the username of this Chatbot instance. * @return The username
	 * of the Chatbot.
	 */
	public String getUserName()
	{
		return userName;
	}

	/**
	 * * Returns the content area for this Chatbot instance. * @return The
	 * content area for this Chatbot instance.
	 */
	public String getContent()
	{
		return content;
	}

	/**
	 * * Getter method for the memesList object. * @return The reference to the
	 * meme list.
	 */
	public ArrayList<String> getMemesList()
	{
		return memesList;
	}

	/**
	 * * Getter method for the politicalTopicList object. * @return The
	 * reference to the political topic list.
	 */
	public ArrayList<String> getPoliticalTopicList()
	{
		return politicalTopicList;
	}

	/**
	 * * Updates the content area for this Chatbot instance. * @param content
	 * The updated value for the content area.
	 */
	public void setContent(String content)
	{

	}

	public boolean quitChecker(String currentInput)
	{
		boolean checker = false;

		if (currentInput.equals("exit"))
		{
			checker = false;
		}

		if (currentInput.equals("quit"))
		{
			checker = true;
		}
		return checker;
	}
}
