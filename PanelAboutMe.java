import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

import javax.swing.JTextPane;

public class PanelAboutMe extends JPanel {
	
	
	
	private Image img_photo = new ImageIcon(FrameLogin.class.getResource("res/Mypic.png")).getImage().getScaledInstance(320,320, Image.SCALE_SMOOTH);
	private Image img_abme1 = new ImageIcon(FrameLogin.class.getResource("res/ABME1.png")).getImage().getScaledInstance(438,285, Image.SCALE_SMOOTH);
	private Image img_abme2 = new ImageIcon(FrameLogin.class.getResource("res/ABME2.png")).getImage().getScaledInstance(663,88, Image.SCALE_SMOOTH);


	/**
	 * Create the panel.
	 */
	public PanelAboutMe() {
		setBackground(new Color(25, 25, 112));
		
		setBounds(10, 0,735, 540);
		setVisible(true);
		setLayout(null);
		
		JLabel lblAboutMe = new JLabel("About Me!");
		lblAboutMe.setBackground(new Color(240, 240, 240));
		lblAboutMe.setBounds(10, 40, 715, 82);
		lblAboutMe.setHorizontalAlignment(SwingConstants.CENTER);
		lblAboutMe.setForeground(new Color(255, 255, 255));
		lblAboutMe.setFont(new Font("Genty Demo", Font.PLAIN, 55));
		add(lblAboutMe);
		
		JLabel lblMe = new JLabel("");
		lblMe.setHorizontalAlignment(SwingConstants.CENTER);
		lblMe.setBackground(new Color(240, 240, 240));
		lblMe.setIcon(new ImageIcon(img_photo));
		lblMe.setBounds(43, 133, 215, 285);
		add(lblMe);
		
		JLabel ABME1 = new JLabel("");
		ABME1.setBounds(268, 133, 438, 285);
		ABME1.setIcon(new ImageIcon(img_abme1));
		add(ABME1);
		
		JLabel ABME2 = new JLabel("");
		ABME2.setBounds(43, 429, 672, 88);
		ABME2.setIcon(new ImageIcon(img_abme2));
		add(ABME2);
		
		
		
		
	}
}