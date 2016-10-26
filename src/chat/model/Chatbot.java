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

	private void buildMemesList()
	{
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
	 * String is empty or null, otherwise returns true. 
	 * * @param currentInput 
	 * * @return A true or false based on the length of the supplied String.
	 */
	public boolean lengthChecker(String currentInput)
	{
		boolean hasLength = false;
		
		if (currentInput !=null && !currentInput.equals(""))
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
		
		if(currentInput.contains(content))
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
		
		for(String currentPoliticalTopic : politicalTopicList)
		{
			if(currentInput.contains(currentPoliticalTopic))
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
		boolean meme = true;
		
		for(String currentMeme : memesList)
		{
			if(currentInput.contains(currentMeme))
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

	if(currentInput == "exit")
	{
		checker = false;
	}
	
	if(currentInput == "quit")
	{
		checker = true;
	}
	return checker;
	}
}
