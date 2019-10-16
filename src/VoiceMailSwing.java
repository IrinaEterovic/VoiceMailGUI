

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VoiceMailSwing {

	private JFrame frame;
	String userInput="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VoiceMailSwing window = new VoiceMailSwing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VoiceMailSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 570, 434);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblVoicemail = new JLabel("VoiceMail");
		lblVoicemail.setBounds(169, 16, 69, 20);
		frame.getContentPane().add(lblVoicemail);
		

		JTextPane txtpnInstructions = new JTextPane();
		txtpnInstructions.setText("Enter mailbox number followed by send");
		txtpnInstructions.setBounds(253, 103, 245, 208);
		//txtpnInstructions.setEditable(false);
		frame.getContentPane().add(txtpnInstructions);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(15, 44, 223, 22);
		frame.getContentPane().add(textArea);
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				System.out.println(textArea.getText());
				if(textArea.getText().equals("1")) {
					txtpnInstructions.setText("You have reached mailbox " + textArea.getText() +
							"\n Please leave a message now and hang up");
					userInput="";
//					if(textArea.getText().equals("10")) {
//						txtpnInstructions.setText(  "Enter 1 to listen to your messages\n"
//													+ "Enter 2 to change your passcode\n"
//													+ "Enter 3 to change your greeting");	
//						userInput="";
//					}		
				}
				else {
					txtpnInstructions.setText("Incorrect mailbox number. Try again!");
					userInput="";
				}
				
				
				textArea.setText(userInput);
			}
		});
		
		btnSend.setBounds(253, 40, 115, 29);
		frame.getContentPane().add(btnSend);
		
		JButton btnHangUp = new JButton("Hang Up");
		btnHangUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				userInput="";
				userInput=textArea.getText();
				txtpnInstructions.setText("Dejo el mensaje:"+userInput);
				userInput="";
			}
		});
		btnHangUp.setBounds(383, 40, 115, 29);
		frame.getContentPane().add(btnHangUp);
		
		JButton btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				userInput=userInput+"1";
				textArea.setText(userInput);
			}
		});
		btnOne.setBounds(15, 103, 60, 40);
		frame.getContentPane().add(btnOne);
		
		JButton btnTwo = new JButton("2");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				userInput+="2";
				textArea.setText(userInput);
			}
		});
		btnTwo.setBounds(90, 103, 60, 40);
		frame.getContentPane().add(btnTwo);
		
		JButton btnThree = new JButton("3");	
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				userInput+="3";
				textArea.setText(userInput);
			}
		});
		btnThree.setBounds(169, 103, 60, 40);
		frame.getContentPane().add(btnThree);
		
		JButton btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				userInput+="4";
				textArea.setText(userInput);
			}
		});
		btnFour.setBounds(15, 159, 60, 40);
		frame.getContentPane().add(btnFour);
		
		JButton btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				userInput+="5";
				textArea.setText(userInput);
			}
		});
		btnFive.setBounds(90, 159, 60, 40);
		frame.getContentPane().add(btnFive);
		
		JButton btnSix = new JButton("6");
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				userInput+="6";
				textArea.setText(userInput);
			}
		});
		btnSix.setBounds(169, 159, 60, 40);
		frame.getContentPane().add(btnSix);
		
		JButton btnSeven = new JButton("7");
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				userInput+="7";
				textArea.setText(userInput);
			}
		});
		btnSeven.setBounds(15, 215, 60, 40);
		frame.getContentPane().add(btnSeven);
		
		JButton btnEight = new JButton("8");
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				userInput+="8";
				textArea.setText(userInput);
			}
		});
		btnEight.setBounds(90, 215, 60, 40);
		frame.getContentPane().add(btnEight);
		
		JButton btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				userInput+="9";
				textArea.setText(userInput);
			}
		});
		btnNine.setBounds(169, 215, 60, 40);
		frame.getContentPane().add(btnNine);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				userInput+="0";
				textArea.setText(userInput);
			}
		});
		btnZero.setBounds(90, 271, 60, 40);
		frame.getContentPane().add(btnZero);
		
		
		
	}
}
