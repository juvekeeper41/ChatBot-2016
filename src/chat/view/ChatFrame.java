package chat.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import chat.controller.ChatController;

public class ChatFrame extends JFrame
{

	private ChatPanel appPanel;
	private ChatController baseController;
	
	public ChatFrame(ChatController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new ChatPanel(baseController);
		
		setupFrame();
	}
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(new Dimension(600, 400));
		this.setTitle("Jake's Chatbot");
		this.setResizable(false);
		this.setVisible(true);
	}
}
