import java.awt.EventQueue;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

public class ProfileDashboard extends JFrame {

	private JPanel contentPane;

	private Image img_logo = new ImageIcon(FrameLogin.class.getResource("res/Profile.png")).getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH);
	private Image img_about_me = new ImageIcon(FrameLogin.class.getResource("res/AboutMe.png")).getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH);
	private Image img_skills = new ImageIcon(FrameLogin.class.getResource("res/Skills.png")).getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH);
	private Image img_hobbies = new ImageIcon(FrameLogin.class.getResource("res/Hobbies.png")).getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH);
	private Image img_artworks = new ImageIcon(FrameLogin.class.getResource("res/Artworks.png")).getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH);
	private Image img_educational = new ImageIcon(FrameLogin.class.getResource("res/Educational BG.png")).getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH);
	private Image img_sign_out = new ImageIcon(FrameLogin.class.getResource("res/SignOut.png")).getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH);
	private Image img_home = new ImageIcon(FrameLogin.class.getResource("res/Home.png")).getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH);
	
	private PanelHome panelHome;
	private PanelAboutMe panelAboutMe;
	private PanelSkills panelSkills;
	private PanelHobbies panelHobbies;
	private PanelArtworks panelArtworks;
	private PanelEducation panelEducation;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfileDashboard frame = new ProfileDashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProfileDashboard() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Documents\\Portfolio\\Icons\\Me.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 100, 1041, 611);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(25, 25, 112), 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelHome = new PanelHome();
		panelHome.setBounds(10, 0, 735, 540);
		panelHome.setBackground(new Color(25, 25, 112));
		panelAboutMe = new PanelAboutMe();
		panelSkills = new PanelSkills();
		panelHobbies = new PanelHobbies();
		panelArtworks = new PanelArtworks();
		panelEducation = new PanelEducation();
		
		JPanel paneMenu = new JPanel();
		paneMenu.setBorder(null);
		paneMenu.setBackground(new Color(176, 196, 222));
		paneMenu.setBounds(10, 11, 262, 589);
		contentPane.add(paneMenu);
		paneMenu.setLayout(null);
		
		JLabel lblProfile = new JLabel("");
		lblProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfile.setBounds(70, 36, 118, 111);
		lblProfile.setIcon(new ImageIcon(img_logo));
		paneMenu.add(lblProfile);
		
		JLabel lblNewLabel_1_1 = new JLabel("BSIT-MAA Student");
		lblNewLabel_1_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(21, 21, 21));
		lblNewLabel_1_1.setFont(new Font("RocaOne-Rg", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(10, 172, 252, 30);
		paneMenu.add(lblNewLabel_1_1);
		
		JPanel paneHome = new JPanel();
		paneHome.setLayout(null);
		paneHome.setForeground(new Color(21, 21, 21));
		JPanel paneHome1 = new JPanel();
		paneHome1.addMouseListener(new PanelButtonMouseAdapter(paneHome1) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelHome);
			}
			});
		paneHome1.setBackground(new Color(25, 25, 112));
		paneHome1.setBounds(10, 216, 242, 33);
		paneMenu.add(paneHome1);
		paneHome1.setLayout(null);
		
		
		JLabel lblHome_1 = new JLabel("HOME");
		lblHome_1.setForeground(Color.WHITE);
		lblHome_1.setFont(new Font("Florencesans Exp", Font.BOLD, 14));
		lblHome_1.setBounds(53, 0, 189, 33);
		paneHome1.add(lblHome_1);
		
		JLabel lblHome = new JLabel("");
		lblHome.setBounds(10, 0, 40, 33);
		lblHome.setIcon(new ImageIcon(img_home));
		paneHome1.add(lblHome);
		
		JPanel paneAboutMe = new JPanel();
		paneAboutMe.setForeground(new Color(21, 21, 21));
		paneAboutMe.addMouseListener(new PanelButtonMouseAdapter(paneAboutMe) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelAboutMe);
			}
	});
		paneAboutMe.setBackground(new Color(25, 25, 112));
		paneAboutMe.setBounds(10, 260, 242, 33);
		paneMenu.add(paneAboutMe);
		paneAboutMe.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ABOUT ME");
		lblNewLabel.setFont(new Font("Florencesans Exp", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(53, 0, 189, 33);
		paneAboutMe.add(lblNewLabel);
		
		JLabel lblAboutMe = new JLabel("");
		lblAboutMe.setBounds(10, 0, 30, 33);
		lblAboutMe.setIcon(new ImageIcon(img_about_me));
		paneAboutMe.add(lblAboutMe);
		
		JPanel paneSkills = new JPanel();
		paneSkills.addMouseListener(new PanelButtonMouseAdapter(paneSkills) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelSkills);
			}
			});
		paneSkills.setBackground(new Color(25, 25, 112));
		paneSkills.setBounds(10, 305, 242, 33);
		paneMenu.add(paneSkills);
		paneSkills.setLayout(null);
		
		JLabel lblSkills = new JLabel("SKILLS");
		lblSkills.setBounds(54, 0, 188, 33);
		paneSkills.add(lblSkills);
		lblSkills.setForeground(Color.WHITE);
		lblSkills.setFont(new Font("Florencesans Exp", Font.BOLD, 14));
		
		JLabel lblSkills1 = new JLabel("");
		lblSkills1.setBounds(10, 0, 37, 33);
		lblSkills1.setIcon(new ImageIcon(img_skills));
		paneSkills.add(lblSkills1);
		
		JPanel paneHobbies = new JPanel();
		paneHobbies.addMouseListener(new PanelButtonMouseAdapter(paneHobbies) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelHobbies);
			}
		});
		paneHobbies.setBackground(new Color(25, 25, 112));
		paneHobbies.setBounds(10, 349, 242, 33);
		paneMenu.add(paneHobbies);
		paneHobbies.setLayout(null);
		
		JLabel lblHobbies = new JLabel("HOBBIES");
		lblHobbies.setBounds(55, 0, 187, 33);
		lblHobbies.setForeground(Color.WHITE);
		lblHobbies.setFont(new Font("Florencesans Exp", Font.BOLD, 14));
		paneHobbies.add(lblHobbies);
		
		JLabel lblHobbies1 = new JLabel("");
		lblHobbies1.setBounds(10, 0, 37, 33);
		lblHobbies1.setIcon(new ImageIcon(img_hobbies));
		paneHobbies.add(lblHobbies1);
		
		JPanel paneArtworks = new JPanel();
		paneArtworks.setForeground(new Color(0, 0, 0));
		paneArtworks.addMouseListener(new PanelButtonMouseAdapter(paneArtworks) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelArtworks);
			}
		});
		paneArtworks.setBackground(new Color(25, 25, 112));
		paneArtworks.setBounds(10, 393, 242, 33);
		paneMenu.add(paneArtworks);
		paneArtworks.setLayout(null);
		
		JLabel lblArtworks = new JLabel("WORKS");
		lblArtworks.setBounds(55, 0, 187, 33);
		lblArtworks.setForeground(Color.WHITE);
		lblArtworks.setFont(new Font("Florencesans Exp", Font.BOLD, 14));
		paneArtworks.add(lblArtworks);
		
		JLabel lblArtworks1 = new JLabel("");
		lblArtworks1.setBounds(10, 0, 37, 33);
		lblArtworks1.setIcon(new ImageIcon(img_artworks));
		paneArtworks.add(lblArtworks1);
		
		JPanel paneSettings = new JPanel();
		paneSettings.setForeground(new Color(0, 0, 0));
		paneSettings.addMouseListener(new PanelButtonMouseAdapter(paneSettings) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelEducation);
			}
		});
		paneSettings.setBackground(new Color(25, 25, 112));
		paneSettings.setBounds(10, 437, 242, 33);
		paneMenu.add(paneSettings);
		paneSettings.setLayout(null);
		
		JLabel lblSettings = new JLabel("EDUCATION");
		lblSettings.setBounds(57, 0, 185, 33);
		lblSettings.setForeground(Color.WHITE);
		lblSettings.setFont(new Font("Florencesans Exp", Font.BOLD, 14));
		paneSettings.add(lblSettings);
		
		JLabel lblSettings1 = new JLabel("");
		lblSettings1.setBounds(10, 0, 37, 33);
		lblSettings1.setIcon(new ImageIcon(img_educational));
		paneSettings.add(lblSettings1);
		
		JPanel paneSignOut = new JPanel();
		paneSignOut.setForeground(new Color(0, 0, 0));
		paneSignOut.addMouseListener(new PanelButtonMouseAdapter(paneSignOut) {
		@Override
		public void mouseClicked(MouseEvent e) {
			
			if(JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?") == 0) {
				FrameLogin frameLogin = new FrameLogin();
				frameLogin.setVisible(true);
				ProfileDashboard.this.dispose();
			}
		}
		});
		paneSignOut.setBackground(new Color(25, 25, 112));
		paneSignOut.setBounds(10, 481, 242, 33);
		paneMenu.add(paneSignOut);
		paneSignOut.setLayout(null);
		
		JLabel lblSignOut = new JLabel("SIGN OUT");
		lblSignOut.setBounds(55, 0, 187, 33);
		lblSignOut.setForeground(Color.WHITE);
		lblSignOut.setFont(new Font("Florencesans Exp", Font.BOLD, 14));
		paneSignOut.add(lblSignOut);
		
		JLabel lblSignOut1 = new JLabel("");
		lblSignOut1.setBounds(10, 0, 37, 33);
		lblSignOut1.setIcon(new ImageIcon(img_sign_out));
		paneSignOut.add(lblSignOut1);
		
		JLabel lblNewLabel_1 = new JLabel("Milian A. Estonilo");
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("RocaOne-Bl", Font.PLAIN, 17));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(10, 158, 252, 27);
		paneMenu.add(lblNewLabel_1);
		
		
		
		JLabel lblX = new JLabel("X");
		lblX.setHorizontalAlignment(SwingConstants.RIGHT);
		lblX.setForeground(new Color(176, 196, 222));
		lblX.setFont(new Font("Quicksand Bold", Font.PLAIN, 20));
		lblX.setBounds(996, 11, 35, 14);
		contentPane.add(lblX);
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					ProfileDashboard.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.BLUE
						);
			}
			@Override
		public void mouseExited(MouseEvent e) {
			lblX.setForeground(Color.WHITE);
			}
		});
		
		JPanel panelMainContent = new JPanel();
		panelMainContent.setBounds(276, 36, 755, 540);
		contentPane.add(panelMainContent);
		panelMainContent.setLayout(null);
		
		panelMainContent.add(panelHome);
		panelMainContent.add(panelAboutMe);
		panelMainContent.add(panelSkills);
		panelMainContent.add(panelHobbies);
		panelMainContent.add(panelArtworks);
		panelMainContent.add(panelEducation);
		
		menuClicked(panelHome);
		
	} 
	
	public void menuClicked(JPanel panel) {
		panelHome.setVisible(false);
		panelAboutMe.setVisible(false);
		panelSkills.setVisible(false);
		panelHobbies.setVisible(false);
		panelArtworks.setVisible(false);
		panelEducation.setVisible(false);
		
		panel.setVisible(true);
	}
	
	
		
		
		
		
	
		
		private class PanelButtonMouseAdapter extends MouseAdapter {
			
			JPanel panel;
			public PanelButtonMouseAdapter(JPanel panel) {
				this.panel = panel;
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setBackground(new Color(0, 0, 36));
		}
			
			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBackground(new Color(25, 25, 112));
		}
			
			@Override
			public void mousePressed(MouseEvent e) {
				panel.setBackground(new Color(25, 25, 112));
		}
			
			
			@Override
			public void mouseReleased(MouseEvent e) {
				panel.setBackground(new Color(0, 0, 36));
		}
			

		}
}