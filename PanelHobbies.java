import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

public class PanelHobbies extends JPanel {
	
	private Image img_digiart = new ImageIcon(FrameLogin.class.getResource("res/DigiArt.png")).getImage().getScaledInstance(140,140, Image.SCALE_SMOOTH);
	private Image img_stan = new ImageIcon(FrameLogin.class.getResource("res/Stan.png")).getImage().getScaledInstance(140,140, Image.SCALE_SMOOTH);
	private Image img_selfcare = new ImageIcon(FrameLogin.class.getResource("res/MakeUp.png")).getImage().getScaledInstance(140,140, Image.SCALE_SMOOTH);
	private Image img_crochet = new ImageIcon(FrameLogin.class.getResource("res/Crochet.png")).getImage().getScaledInstance(140,140, Image.SCALE_SMOOTH);
	private Image img_collect = new ImageIcon(FrameLogin.class.getResource("res/Collect.png")).getImage().getScaledInstance(140,140, Image.SCALE_SMOOTH);
	private Image img_music = new ImageIcon(FrameLogin.class.getResource("res/Music.png")).getImage().getScaledInstance(140,140, Image.SCALE_SMOOTH);



	/**
	 * Create the panel.
	 */
	public PanelHobbies() {
		setBackground(new Color(25, 25, 112));
		
		setBounds(10, 0,735, 540);
		setLayout(null);
		
		JLabel lblTop6 = new JLabel("My Top 6 Hobbies");
		lblTop6.setForeground(new Color(176, 196, 222));
		lblTop6.setFont(new Font("RocaOne-Bl", Font.PLAIN, 17));
		lblTop6.setHorizontalAlignment(SwingConstants.CENTER);
		lblTop6.setBounds(20, 108, 692, 27);
		add(lblTop6);
		
		JLabel lblHobbies = new JLabel("Hobbies");
		lblHobbies.setForeground(new Color(255, 255, 255));
		lblHobbies.setFont(new Font("Genty Demo", Font.PLAIN, 55));
		lblHobbies.setHorizontalAlignment(SwingConstants.CENTER);
		lblHobbies.setBounds(10, 40, 715, 82);
		add(lblHobbies);
		
		JLabel lblDigiArt = new JLabel("");
		lblDigiArt.setHorizontalAlignment(SwingConstants.CENTER);
		lblDigiArt.setBounds(91, 151, 140, 140);
		lblDigiArt.setIcon(new ImageIcon(img_digiart));
		add(lblDigiArt);
		
		JLabel lblStan = new JLabel("");
		lblStan.setHorizontalAlignment(SwingConstants.CENTER);
		lblStan.setBounds(302, 151, 140, 140);
		lblStan.setIcon(new ImageIcon(img_stan));
		add(lblStan);
		
		JLabel lblSelfCare = new JLabel("");
		lblSelfCare.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelfCare.setBounds(518, 151, 140, 140);
		lblSelfCare.setIcon(new ImageIcon(img_selfcare));
		add(lblSelfCare);
		
		JLabel lblMusic = new JLabel("");
		lblMusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblMusic.setBounds(518, 342, 140, 140);
		lblMusic.setIcon(new ImageIcon(img_music));
		add(lblMusic);
		
		JLabel lblCollect = new JLabel("");
		lblCollect.setHorizontalAlignment(SwingConstants.CENTER);
		lblCollect.setBounds(302, 342, 140, 140);
		lblCollect.setIcon(new ImageIcon(img_collect));
		add(lblCollect);
		
		JLabel lblCrochet = new JLabel("");
		lblCrochet.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrochet.setBounds(91, 342, 140, 140);
		lblCrochet.setIcon(new ImageIcon(img_crochet));
		add(lblCrochet);
		
		JLabel lblSelfcare = new JLabel("Drawing");
		lblSelfcare.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelfcare.setForeground(new Color(255, 255, 255));
		lblSelfcare.setFont(new Font("RocaOne-Rg", Font.PLAIN, 15));
		lblSelfcare.setBounds(61, 289, 206, 27);
		add(lblSelfcare);
		
		JLabel lblStanning = new JLabel("Stanning");
		lblStanning.setHorizontalAlignment(SwingConstants.CENTER);
		lblStanning.setForeground(Color.WHITE);
		lblStanning.setFont(new Font("RocaOne-Rg", Font.PLAIN, 15));
		lblStanning.setBounds(267, 289, 206, 27);
		add(lblStanning);
		
		JLabel lblDrawing_1_1 = new JLabel("Self-Care");
		lblDrawing_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrawing_1_1.setForeground(Color.WHITE);
		lblDrawing_1_1.setFont(new Font("RocaOne-Rg", Font.PLAIN, 15));
		lblDrawing_1_1.setBounds(481, 289, 206, 27);
		add(lblDrawing_1_1);
		
		JLabel lblCrocheting = new JLabel("Crocheting");
		lblCrocheting.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrocheting.setForeground(Color.WHITE);
		lblCrocheting.setFont(new Font("RocaOne-Rg", Font.PLAIN, 15));
		lblCrocheting.setBounds(61, 484, 206, 27);
		add(lblCrocheting);
		
		JLabel lblCollecting = new JLabel("Collecting");
		lblCollecting.setHorizontalAlignment(SwingConstants.CENTER);
		lblCollecting.setForeground(Color.WHITE);
		lblCollecting.setFont(new Font("RocaOne-Rg", Font.PLAIN, 15));
		lblCollecting.setBounds(267, 484, 206, 27);
		add(lblCollecting);
		
		JLabel lblListening = new JLabel("Listening to Music");
		lblListening.setHorizontalAlignment(SwingConstants.CENTER);
		lblListening.setForeground(Color.WHITE);
		lblListening.setFont(new Font("RocaOne-Rg", Font.PLAIN, 15));
		lblListening.setBounds(481, 484, 206, 27);
		add(lblListening);
	}
}