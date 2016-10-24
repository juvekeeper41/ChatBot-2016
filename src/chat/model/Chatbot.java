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

	private void buildMemesList(ArrayList<String> memesList)
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

	private void buildPoliticalTopicsList(ArrayList<String> politicalTopicsList)
	{
		politicalTopicsList.add("Democrat");
		politicalTopicsList.add("Republican");
		politicalTopicsList.add("11/8/16");
		politicalTopicsList.add("liberal");
		politicalTopicsList.add("conservative");
		politicalTopicsList.add("Clinton");
		politicalTopicsList.add("Trump");
		politicalTopicsList.add("Kaine");
		politicalTopicsList.add("Pence");
		politicalTopicsList.add("Stein");
		politicalTopicsList.add("Johnson");
		politicalTopicsList.add("election");
		politicalTopicsList.add("Gary Johnson");
		politicalTopicsList.add("democracy");
		politicalTopicsList.add("republic");
		politicalTopicsList.add("");
		politicalTopicsList.add("");
		politicalTopicsList.add("");
		politicalTopicsList.add("");
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
		return false;
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
		return false;
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
