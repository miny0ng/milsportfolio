import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

public class PanelHome extends JPanel {
	
	
	private Image img_fb = new ImageIcon(FrameLogin.class.getResource("res/FB.png")).getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH);
	private Image img_twitter = new ImageIcon(FrameLogin.class.getResource("res/Twitter.png")).getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH);
	private Image img_instagram = new ImageIcon(FrameLogin.class.getResource("res/Instagram.png")).getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH);

	/**
	 * Create the panel.
	 */
	public PanelHome() {
setBackground(new Color(25, 25, 112));
		
		setBounds(10, 0,735, 540);
		setLayout(null);
		
		JLabel lblHello = new JLabel("Hello, I'm Milian");
		lblHello.setHorizontalAlignment(SwingConstants.CENTER);
		lblHello.setForeground(Color.WHITE);
		lblHello.setFont(new Font("Genty Demo", Font.PLAIN, 55));
		lblHello.setBackground(SystemColor.menu);
		lblHello.setBounds(10, 85, 715, 82);
		add(lblHello);
		
		JTextPane txtpnInThisPortfolio = new JTextPane();
		txtpnInThisPortfolio.setEditable(false);
		txtpnInThisPortfolio.setText("In this portfolio, you'll see the informations about myself, my skills, hobbies, and artworks. I hope you enjoy reviewing my work and learning more about me.\r\n\r\nIf you have any questions or would like to connect, please feel free to contact me through the information provided. Thank you for visiting my portfolio! ");
		txtpnInThisPortfolio.setForeground(new Color(176, 196, 222));
		txtpnInThisPortfolio.setFont(new Font("RocaOne-Rg", Font.PLAIN, 12));
		txtpnInThisPortfolio.setBackground(new Color(25, 25, 112));
		txtpnInThisPortfolio.setBounds(65, 336, 597, 110);
		add(txtpnInThisPortfolio);
		
		JLabel lblContactNo = new JLabel("CONTACT NO.: +63 9984 134 308");
		lblContactNo.setForeground(Color.WHITE);
		lblContactNo.setFont(new Font("RocaOne-Rg", Font.PLAIN, 11));
		lblContactNo.setBounds(102, 486, 201, 14);
		add(lblContactNo);
		
		JLabel lblFB = new JLabel("");
		lblFB.setVerticalAlignment(SwingConstants.TOP);
		lblFB.setBounds(313, 473, 36, 40);
		lblFB.setIcon(new ImageIcon(img_fb));
		add(lblFB);
		lblFB.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // When the label is clicked, open the Facebook profile in a web browser
                try {
                    Desktop.getDesktop().browse(new URI("https://www.facebook.com/miny0ng"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
		
		JLabel lblTwitter = new JLabel("");
		lblTwitter.setVerticalAlignment(SwingConstants.TOP);
		lblTwitter.setBounds(348, 473, 36, 40);
		lblTwitter.setIcon(new ImageIcon(img_twitter));
		add(lblTwitter);
		lblTwitter.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // When the label is clicked, open the Twitter profile in a web browser
                try {
                    Desktop.getDesktop().browse(new URI("https://www.twitter.com/maeynwa"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
		
		JLabel lblInstagram = new JLabel("");
		lblInstagram.setVerticalAlignment(SwingConstants.TOP);
		lblInstagram.setBounds(381, 473, 36, 40);
		lblInstagram.setIcon(new ImageIcon(img_instagram));
		add(lblInstagram);
		
		lblInstagram.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // When the label is clicked, open the Facebook profile in a web browser
                try {
                    Desktop.getDesktop().browse(new URI("https://www.instagram.com/maekthv"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
		
		JLabel lblEmailMilianestonilogmailcom = new JLabel("EMAIL: milianestonilo@gmail.com");
		lblEmailMilianestonilogmailcom.setForeground(Color.WHITE);
		lblEmailMilianestonilogmailcom.setFont(new Font("RocaOne-Rg", Font.PLAIN, 11));
		lblEmailMilianestonilogmailcom.setBounds(461, 486, 201, 14);
		add(lblEmailMilianestonilogmailcom);
		
		JLabel lblItStudent = new JLabel("IT Student • Graphic Designer • Illustrator ");
		lblItStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblItStudent.setForeground(Color.WHITE);
		lblItStudent.setFont(new Font("RocaOne-Bl", Font.PLAIN, 15));
		lblItStudent.setBackground(SystemColor.menu);
		lblItStudent.setBounds(20, 142, 693, 82);
		add(lblItStudent);
	}
}