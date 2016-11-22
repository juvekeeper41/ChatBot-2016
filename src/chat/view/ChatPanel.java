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
	private JButton chatButton;
	private JLabel chatTitle;
	
	public ChatPanel(ChatController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		chatDisplay = new JTextArea(5, 25);
		chatField = new JTextField(25);
		chatButton = new JButton("Chat with the bot");
		chatTitle = new JLabel("Jake's Chatbot!");
		
		setupChatDisplay();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	/**
	 * Constucted the display of the Panel for the visual segment of the panel.
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
		this.setBackground(Color.RED);
		this.add(chatButton);
		this.add(chatDisplay);
		this.add(chatField);
		this.add(chatTitle);
	}
	/**
	 * Set elements of the panel, and set linked the components thereof.
	 */
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, chatDisplay, -6, SpringLayout.NORTH, chatField);
		baseLayout.putConstraint(SpringLayout.WEST, chatButton, 63, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatDisplay, 0, SpringLayout.WEST, chatButton);
		baseLayout.putConstraint(SpringLayout.WEST, chatField, 0, SpringLayout.WEST, chatButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatField, -12, SpringLayout.NORTH, chatButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatButton, -10, SpringLayout.SOUTH, this);
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
		/**
		 * Setup and added the listeners to the panel.
		 * Used the "ChatBotCheckers" method to check the text inserted.
		 */
	}
}
