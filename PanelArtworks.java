import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JScrollBar;

public class PanelArtworks extends JPanel {
	
	private Image img_art1 = new ImageIcon(FrameLogin.class.getResource("res/ART1.png")).getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
	private Image img_art2 = new ImageIcon(FrameLogin.class.getResource("res/ART2.png")).getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
	private Image img_art3 = new ImageIcon(FrameLogin.class.getResource("res/ART3.png")).getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
	private Image img_art4 = new ImageIcon(FrameLogin.class.getResource("res/ART4.png")).getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
	private Image img_art5 = new ImageIcon(FrameLogin.class.getResource("res/ART5.png")).getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
	private Image img_art6 = new ImageIcon(FrameLogin.class.getResource("res/ART6.png")).getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
	private Image img_art7 = new ImageIcon(FrameLogin.class.getResource("res/ART7.png")).getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
	private Image img_art8 = new ImageIcon(FrameLogin.class.getResource("res/ART8.png")).getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
	private Image img_art9 = new ImageIcon(FrameLogin.class.getResource("res/ART9.png")).getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
	private Image img_art10 = new ImageIcon(FrameLogin.class.getResource("res/ART10.png")).getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
	private Image img_art11 = new ImageIcon(FrameLogin.class.getResource("res/ART11.png")).getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
	private Image img_art12 = new ImageIcon(FrameLogin.class.getResource("res/ART12.png")).getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
	private Image img_art13 = new ImageIcon(FrameLogin.class.getResource("res/ART13.png")).getImage().getScaledInstance(191,357, Image.SCALE_SMOOTH);
	

	/**
	 * Create the panel.
	 */
	public PanelArtworks() {
		setBackground(new Color(25, 25, 112));
		
		setBounds(10, 0,735, 540);
		setLayout(null);
		
		JLabel lblArtworks = new JLabel("Works");
		lblArtworks.setHorizontalAlignment(SwingConstants.CENTER);
		lblArtworks.setFont(new Font("Genty Demo", Font.PLAIN, 55));
		lblArtworks.setForeground(new Color(255, 255, 255));
		lblArtworks.setBounds(10, 40, 715, 82);
		add(lblArtworks);
		
		JLabel lblSomeOfMy = new JLabel("some of my artworks and commissions");
		lblSomeOfMy.setHorizontalAlignment(SwingConstants.CENTER);
		lblSomeOfMy.setForeground(new Color(176, 196, 222));
		lblSomeOfMy.setFont(new Font("RocaOne-Bl", Font.PLAIN, 17));
		lblSomeOfMy.setBounds(20, 108, 705, 27);
		add(lblSomeOfMy);
		
		JLabel lblART1 = new JLabel("");
		lblART1.setHorizontalAlignment(SwingConstants.CENTER);
		lblART1.setBackground(new Color(240, 240, 240));
		lblART1.setBounds(31, 146, 130, 130);
		lblART1.setIcon(new ImageIcon(img_art1));
		add(lblART1);
		
		JLabel lblART3 = new JLabel("");
		lblART3.setHorizontalAlignment(SwingConstants.CENTER);
		lblART3.setIcon(new ImageIcon(img_art3));
		lblART3.setBackground(SystemColor.menu);
		lblART3.setBounds(151, 373, 130, 130);
		add(lblART3);
		
		JLabel lblART5 = new JLabel("");
		lblART5.setHorizontalAlignment(SwingConstants.CENTER);
		lblART5.setBackground(SystemColor.menu);
		lblART5.setBounds(31, 373, 130, 130);
		lblART5.setIcon(new ImageIcon(img_art5));
		add(lblART5);
		
		JLabel lblART6 = new JLabel("");
		lblART6.setHorizontalAlignment(SwingConstants.CENTER);
		lblART6.setBackground(SystemColor.menu);
		lblART6.setBounds(151, 259, 130, 130);
		lblART6.setIcon(new ImageIcon(img_art6));
		add(lblART6);
		
		JLabel lblART4 = new JLabel("");
		lblART4.setHorizontalAlignment(SwingConstants.CENTER);
		lblART4.setBackground(SystemColor.menu);
		lblART4.setBounds(569, 259, 130, 130);
		lblART4.setIcon(new ImageIcon(img_art4));
		add(lblART4);
		
		JLabel lblART2 = new JLabel("");
		lblART2.setHorizontalAlignment(SwingConstants.CENTER);
		lblART2.setBackground(SystemColor.menu);
		lblART2.setBounds(569, 373, 130, 130);
		lblART2.setIcon(new ImageIcon(img_art2));
		add(lblART2);
		
		JLabel lblART9 = new JLabel("");
		lblART9.setHorizontalAlignment(SwingConstants.CENTER);
		lblART9.setBackground(SystemColor.menu);
		lblART9.setBounds(455, 373, 130, 130);
		lblART9.setIcon(new ImageIcon(img_art9));
		add(lblART9);
		
		JLabel lblART8 = new JLabel("");
		lblART8.setHorizontalAlignment(SwingConstants.CENTER);
		lblART8.setBackground(SystemColor.menu);
		lblART8.setBounds(455, 259, 130, 130);
		lblART8.setIcon(new ImageIcon(img_art8));
		add(lblART8);
		
		JLabel lblART7 = new JLabel("");
		lblART7.setHorizontalAlignment(SwingConstants.CENTER);
		lblART7.setBackground(SystemColor.menu);
		lblART7.setBounds(455, 146, 130, 130);
		lblART7.setIcon(new ImageIcon(img_art7));
		add(lblART7);
		
		JLabel lblART12 = new JLabel("");
		lblART12.setHorizontalAlignment(SwingConstants.CENTER);
		lblART12.setBackground(SystemColor.menu);
		lblART12.setBounds(151, 146, 130, 130);
		lblART12.setIcon(new ImageIcon(img_art12));
		add(lblART12);
		
		JLabel lblART10 = new JLabel("");
		lblART10.setHorizontalAlignment(SwingConstants.CENTER);
		lblART10.setBackground(SystemColor.menu);
		lblART10.setBounds(31, 259, 130, 130);
		lblART10.setIcon(new ImageIcon(img_art10));
		add(lblART10);
		
		JLabel lblART11 = new JLabel("");
		lblART11.setHorizontalAlignment(SwingConstants.CENTER);
		lblART11.setBackground(SystemColor.menu);
		lblART11.setBounds(569, 146, 130, 130);
		lblART11.setIcon(new ImageIcon(img_art11));
		add(lblART11);
		
	
		
		JLabel lblART13 = new JLabel("");
		lblART13.setHorizontalAlignment(SwingConstants.CENTER);
		lblART13.setBounds(268, 133, 201, 370);
		lblART13.setIcon(new ImageIcon(img_art13));
		add(lblART13);
		
		JLabel lblemail = new JLabel("EMAIL: miliancreate@gmail.com");
		lblemail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblemail.setForeground(new Color(176, 196, 222));
		lblemail.setFont(new Font("RocaOne-Rg", Font.PLAIN, 11));
		lblemail.setBounds(41, 502, 647, 27);
		add(lblemail);
		
		JLabel lblinsta = new JLabel("IG: @miliancreate");
		lblinsta.setHorizontalAlignment(SwingConstants.LEFT);
		lblinsta.setForeground(new Color(176, 196, 222));
		lblinsta.setFont(new Font("RocaOne-Rg", Font.PLAIN, 11));
		lblinsta.setBounds(51, 502, 647, 27);
		add(lblinsta);
	}
}