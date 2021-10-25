package janken_game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel {
	public static JLabel headerLabel;
	public static JLabel mainLabel;
	public static void createPanel(JFrame frame) {
		
		//header
		Dimension headerPanelDimension = new Dimension(640, 50);
		JPanel headerPanel = setPanel(Color.BLACK, headerPanelDimension);
		headerLabel = new JLabel("Let's play with me!!");
		headerLabel = setFont(Color.WHITE,headerLabel,36);
		headerPanel.add(headerLabel);
		frame.add(headerPanel,BorderLayout.NORTH);
		
		//main
		Dimension mainPanelDimension = new Dimension(640, 380);
		JPanel mainPanel = setPanel(Color.WHITE,mainPanelDimension);
		mainLabel = new JLabel("Rock, Scissor, Paper...");
		mainLabel = setFont(Color.BLACK,mainLabel,54);
		mainPanel.add(mainLabel);
		frame.add(mainPanel,BorderLayout.CENTER);
		
		//footer
		Dimension footerPanelDimension = new Dimension(640, 50);
		JPanel footerPanel = setPanel(Color.BLACK,footerPanelDimension);
		Player.createButton(footerPanel);
		frame.add(footerPanel, BorderLayout.SOUTH);
	}
	public static JPanel setPanel(Color color, Dimension PanelDimension) {
		JPanel panel = new JPanel();
		panel.setPreferredSize(PanelDimension);
		panel.setLayout(new BorderLayout());
		panel.setBackground(color);
		return(panel);
	}
	public static JLabel setFont(Color clr,JLabel label,int strSize) {
		label.setForeground(clr);
		Font labelFont = new Font("senrif",Font.PLAIN,strSize);
		label.setFont(labelFont);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		return(label);
	}
}
   

