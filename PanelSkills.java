import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.ComponentOrientation;
import javax.swing.JEditorPane;

public class PanelSkills extends JPanel {
	
	private Image img_graphic = new ImageIcon(FrameLogin.class.getResource("res/Graphic.png")).getImage().getScaledInstance(180,180, Image.SCALE_SMOOTH);
	private Image img_coding = new ImageIcon(FrameLogin.class.getResource("res/Code.png")).getImage().getScaledInstance(180,180, Image.SCALE_SMOOTH);
	private Image img_pb1 = new ImageIcon(FrameLogin.class.getResource("res/PB1.png")).getImage().getScaledInstance(224,180, Image.SCALE_SMOOTH);
	private Image img_pb2 = new ImageIcon(FrameLogin.class.getResource("res/PB2.png")).getImage().getScaledInstance(224,180, Image.SCALE_SMOOTH);

	/**
	 * Create the panel.
	 */
	public PanelSkills() {
		setForeground(new Color(25, 25, 112));
		setBackground(new Color(25, 25, 112));
		
		setBounds(10, 0,735, 540);
		setLayout(null);
		
		JLabel lblSkills = new JLabel("Skills");
		lblSkills.setForeground(new Color(255, 255, 255));
		lblSkills.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkills.setBackground(new Color(255, 255, 255));
		lblSkills.setFont(new Font("Genty Demo", Font.PLAIN, 55));
		lblSkills.setBounds(10, 40, 715, 82);
		add(lblSkills);
		
		JLabel lblNewLabel = new JLabel(" Graphic Design /");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("RocaOne-Bl", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(139, 274, 172, 26);
		add(lblNewLabel);
		
		JLabel lblGraphic = new JLabel("");
		lblGraphic.setHorizontalAlignment(SwingConstants.CENTER);
		lblGraphic.setBounds(128, 116, 180, 180);
		lblGraphic.setIcon(new ImageIcon(img_graphic));
		add(lblGraphic);
		
		JLabel lblIllustrator = new JLabel("Illustrator");
		lblIllustrator.setHorizontalAlignment(SwingConstants.CENTER);
		lblIllustrator.setForeground(Color.WHITE);
		lblIllustrator.setFont(new Font("RocaOne-Bl", Font.PLAIN, 15));
		lblIllustrator.setBounds(136, 290, 172, 26);
		add(lblIllustrator);
		
		JLabel lblIllustrator_1 = new JLabel("Coding");
		lblIllustrator_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIllustrator_1.setForeground(Color.WHITE);
		lblIllustrator_1.setFont(new Font("RocaOne-Bl", Font.PLAIN, 15));
		lblIllustrator_1.setBounds(433, 270, 172, 46);
		add(lblIllustrator_1);
		
		JLabel lblCoding = new JLabel("");
		lblCoding.setHorizontalAlignment(SwingConstants.CENTER);
		lblCoding.setBounds(423, 116, 180, 180);
		lblCoding.setIcon(new ImageIcon(img_coding));
		add(lblCoding);
		
		JTextPane txtpnGraphic = new JTextPane();
		txtpnGraphic.setEditable(false);
		txtpnGraphic.setForeground(new Color(176, 196, 222));
		txtpnGraphic.setFont(new Font("RocaOne-Rg", Font.PLAIN, 12));
		txtpnGraphic.setBackground(new Color(25, 25, 112));
		txtpnGraphic.setText("Using FireAlpaca, Adobe Illustrator, Photoshop, PowerPoint, and Canva. I love to transform concepts into stunning visual masterpieces.  I also take commissions and post my work on Instagram.");
		txtpnGraphic.setBounds(113, 317, 260, 123);
		add(txtpnGraphic);
		
		JTextPane txtpnCode = new JTextPane();
		txtpnCode.setText(" I'm studying JavaScript and also familiar with HTML. My goal is to excel in coding, broaden my skills, and achieve success. Join me as I embark on this exciting journey to become a skilled programmer.");
		txtpnCode.setForeground(new Color(176, 196, 222));
		txtpnCode.setFont(new Font("RocaOne-Rg", Font.PLAIN, 12));
		txtpnCode.setEditable(false);
		txtpnCode.setBackground(new Color(25, 25, 112));
		txtpnCode.setBounds(403, 317, 246, 123);
		add(txtpnCode);
		
		JLabel lblPB2 = new JLabel("");
		lblPB2.setBounds(113, 422, 246, 68);
		lblPB2.setIcon(new ImageIcon(img_pb2));
		add(lblPB2);
		
		JLabel lblPB1 = new JLabel("");
		lblPB1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPB1.setBounds(413, 438, 224, 61);
		lblPB1.setIcon(new ImageIcon(img_pb1));
		add(lblPB1);
	}
}