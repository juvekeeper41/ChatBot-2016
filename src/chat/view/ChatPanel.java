package chat.view;

import javax.swing.*;
import chat.controller.ChatController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatPanel extends JPanel
{
	private ChatController baseController;
	private SpringLayout baseLayout;
	private JTextArea chatDisplay;
	private JTextField chatField;
	private JButton saveButton;
	private JButton postButton;
	private JButton twitterButton;
	private JButton chatButton;
	private JLabel chatTitle;
	
	public ChatPanel(ChatController baseController)
	{
		//save button, post button
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		chatDisplay = new JTextArea(5, 25);
		chatField = new JTextField(25);
		saveButton = new JButton("Save");
		postButton = new JButton("Post to Twitter");
		twitterButton = new JButton("Check Twitter");
		chatButton = new JButton("Chat with the bot");
		chatTitle = new JLabel("Jake's Chatbot!");
		setupChatDisplay();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	/**
	 * Constructed the display of the Panel for the visual segment of the panel.
	 */
	
	private void setupChatDisplay()
	{
		chatDisplay.setEditable(false);
		chatDisplay.setEnabled(false);
		chatDisplay.setWrapStyleWord(true);
		chatDisplay.setLineWrap(true);
	}
	/**
	 * Set size requirements, and set text requirements.
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.BLUE);
		this.add(saveButton);
		this.add(chatButton);
		this.add(postButton);
		this.add(chatDisplay);
		this.add(chatField);
		this.add(chatTitle);
		this.add(twitterButton);
	}
	/**
	 * Set elements of the panel, and set linked the components thereof.
	 */
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.EAST, postButton, 147, SpringLayout.WEST, chatButton);
		baseLayout.putConstraint(SpringLayout.NORTH, postButton, 6, SpringLayout.SOUTH, twitterButton);
		baseLayout.putConstraint(SpringLayout.WEST, postButton, 0, SpringLayout.WEST, twitterButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, postButton, 35, SpringLayout.SOUTH, twitterButton);
		baseLayout.putConstraint(SpringLayout.NORTH, saveButton, 6, SpringLayout.SOUTH, postButton);
		baseLayout.putConstraint(SpringLayout.WEST, saveButton, 181, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatDisplay, 6, SpringLayout.SOUTH, chatTitle);
		baseLayout.putConstraint(SpringLayout.NORTH, twitterButton, 6, SpringLayout.SOUTH, chatButton);
		baseLayout.putConstraint(SpringLayout.EAST, twitterButton, -10, SpringLayout.EAST, chatButton);
		baseLayout.putConstraint(SpringLayout.NORTH, chatButton, 6, SpringLayout.SOUTH, chatField);
		baseLayout.putConstraint(SpringLayout.WEST, chatButton, 136, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatField, 6, SpringLayout.SOUTH, chatDisplay);
		baseLayout.putConstraint(SpringLayout.WEST, chatField, 0, SpringLayout.WEST, chatDisplay);
		baseLayout.putConstraint(SpringLayout.WEST, chatDisplay, 63, SpringLayout.WEST, this);
	}
	/**
	 * Added the constraints of the panel, linked the buttons to positions.
	 */
	
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String personWords = chatField.getText();
				String chatbotResponse = baseController.useChatbotCheckers(personWords);
				
				chatDisplay.setText("You said: " + personWords + "\n" + "Chatbot says: " + chatbotResponse);
				chatField.setText("");
				
			}
		});
		
//		chatButton.addActionListener(new ActionListener()
//		{
//			
//		}
//		
//		saveChatButton.addActionListener(new ActionListener()
//		{
//			
//		}
//		
//		loadsChatButton.addActionListener(new ActionListener()
//		{
//						
//		}
//		
//		searchTwitterButton.addActionListener(new ActionListener()
//		{
//			
//		}
		/**
		 * Setup and added the listeners to the panel.
		 * Used the "ChatBotCheckers" method to check the text inserted.
		 */
	}
}
