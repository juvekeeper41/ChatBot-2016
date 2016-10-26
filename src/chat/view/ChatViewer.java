package chat.view;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class ChatViewer
{
	private String windowMessage;
	private ImageIcon chatIcon;
	
	public ChatViewer()
	{
		windowMessage = "This message brought to you by Jake's 'chatbot'! :D";
		chatIcon = new ImageIcon(getClass().getResource("image/chatbot.jpg"));
	}
	
	public String collectResponse(String displayText)
	{
		String userInput = "";
		
		userInput = JOptionPane.showInputDialog(null, displayText, windowMessage, JOptionPane.INFORMATION_MESSAGE, chatIcon, null, "Type here please!").toString();
		
		return userInput;
	}
	
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	public int collectUserOption(String question)
	{
		int response = 0;
		
		response = JOptionPane.showConfirmDialog(null, question);
		return response;
	}
}
