import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class FrameLogin extends JFrame {
	
	private Image img_logo = new ImageIcon(FrameLogin.class.getResource("res/Facebook.png")).getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	private JLabel lblLoginMessage = new JLabel("");

	private ProfileDashboard ProfileDashboard;

	private Window newframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLogin frame = new FrameLogin();
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
	public FrameLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Documents\\Portfolio\\Icons\\Me.png"));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 465);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(25, 25, 112), 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(246, 177, 324, 30);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			if(txtUsername.getText().equals("Username")) {
				txtUsername.setText("");
			}
			else {
				txtUsername.selectAll();
			}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsername.getText().equals(""))
					txtUsername.setText("Username");
			}
		});
		txtUsername.setBackground(new Color(176, 196, 222));
		txtUsername.setBorder(null);
		txtUsername.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtUsername.setText("Username");
		txtUsername.setBounds(10, 0, 304, 30);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(176, 196, 222));
		panel_1.setBounds(246, 212, 324, 30);
		contentPane.add(panel_1);
		
		txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtPassword.getText().equals("Password")) {
					txtPassword.setEchoChar('●');
					txtPassword.setText("");
					}
				else {
					txtPassword.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
			if(txtPassword.getText().equals("")) {
				txtPassword.setText("Password");
				txtPassword.setEchoChar((char)0);
			}
				
			}
		});
		txtPassword.setBackground(new Color(176, 196, 222));
		txtPassword.setEchoChar((char)0);
		txtPassword.setBorder(null);
		txtPassword.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtPassword.setText("Password");
		txtPassword.setBounds(10, 0, 304, 30);
		panel_1.add(txtPassword);
		
		JPanel pnlBtnLogin = new JPanel();
		pnlBtnLogin.setBackground(new Color(25, 25, 112));
		pnlBtnLogin.setBounds(328, 282, 145, 30);
		contentPane.add(pnlBtnLogin);
		pnlBtnLogin.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOG IN");
		lblLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtUsername.getText().equals("userme") && txtPassword.getText().equals("userme1234")) {
					lblLoginMessage.setText("");
					JOptionPane.showMessageDialog(null,"Login successfull");
					
					ProfileDashboard profiledashboard = new ProfileDashboard();
					profiledashboard.setVisible(true);
					FrameLogin.this.dispose();
				}
				else if(txtUsername.getText().equals("") || txtUsername.getText().equals("Username") || 
						txtPassword.getText().equals("") || txtPassword.getText().equals("Password")) {
					lblLoginMessage.setText("Please input all requirements!");
					
				}
				else {
					lblLoginMessage.setText("Invalid Username or Password");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(10, 10, 190));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(25, 25, 112));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(30, 30, 120));
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(25, 25, 112));
			}
		});
		lblLogin.setBackground(new Color(21, 21, 21));
		lblLogin.setBounds(0, 0, 145, 41);
		pnlBtnLogin.add(lblLogin);
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("RocaOne-Bl", Font.BOLD, 14));
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					FrameLogin.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.BLUE);
			}
			@Override
		public void mouseExited(MouseEvent e) {
			lblX.setForeground(Color.WHITE);
			}
		});
		lblX.setHorizontalAlignment(SwingConstants.RIGHT);
		lblX.setForeground(new Color(176, 196, 222));
		lblX.setFont(new Font("Quicksand Bold", Font.PLAIN, 20));
		lblX.setBounds(765, 11, 35, 14);
		contentPane.add(lblX);
		
		JLabel lblPortfolio = new JLabel("My Portfolio");
		lblPortfolio.setFont(new Font("Village", Font.PLAIN, 65));
		lblPortfolio.setForeground(new Color(25, 25, 112));
		lblPortfolio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPortfolio.setBounds(246, 99, 324, 54);
		contentPane.add(lblPortfolio);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblIconLogo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIconLogo.setBounds(312, 351, 46, 41);
		contentPane.add(lblIconLogo);
		lblIconLogo.setIcon(new ImageIcon(img_logo));
		
		lblIconLogo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // When the label is clicked, open the Facebook profile in a web browser
                try {
                    Desktop.getDesktop().browse(new URI("https://www.facebook.com"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
	
		
		JLabel lblor = new JLabel("or");
		lblor.setHorizontalAlignment(SwingConstants.CENTER);
		lblor.setForeground(new Color(0, 0, 0));
		lblor.setFont(new Font("RocaOne-Rg", Font.PLAIN, 17));
		lblor.setBounds(328, 323, 145, 30);
		contentPane.add(lblor);
		
		JLabel lblLoginWithFacebook = new JLabel("Login with Facebook");
		lblLoginWithFacebook.setHorizontalTextPosition(SwingConstants.LEFT);
		lblLoginWithFacebook.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginWithFacebook.setForeground(new Color(0, 0, 0));
		lblLoginWithFacebook.setFont(new Font("RocaOne-Rg", Font.PLAIN, 13));
		lblLoginWithFacebook.setBounds(328, 358, 183, 30);
		contentPane.add(lblLoginWithFacebook);
		
		lblLoginWithFacebook.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                // When the label is clicked, open the Facebook profile in a web browser
	                try {
	                    Desktop.getDesktop().browse(new URI("https://www.facebook.com"));
	                } catch (Exception ex) {
	                    ex.printStackTrace();
	                }
	            }
	        });
		
		lblLoginMessage.setForeground(new Color(165, 42, 42));
		lblLoginMessage.setFont(new Font("RocaOne-Rg", Font.PLAIN, 12));
		lblLoginMessage.setBounds(246, 253, 324, 18);
		contentPane.add(lblLoginMessage);
		setLocationRelativeTo(null);
		
	}
	
}