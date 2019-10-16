import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.TouchListener;
import org.eclipse.swt.events.TouchEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;

public class VoiceMailWindow {

	protected Shell shell;
	private Text text;
	private Text instructionsTextField;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			VoiceMailWindow window = new VoiceMailWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(503, 498);
		shell.setText("Voice Mail GUI");
		shell.setLayout(null);
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(10, 61, 192, 31);
		

		
		Button btnSend = new Button(shell, SWT.NONE);
		btnSend.setBounds(233, 59, 101, 35);
		btnSend.setText("Send");
		
		Button btnHangUp = new Button(shell, SWT.NONE);
		btnHangUp.setBounds(340, 59, 107, 35);
		btnHangUp.setText("HangUp");
		
		Button btnOne= new Button(shell, SWT.NONE);
		btnOne.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		
		btnOne.setBounds(10, 98, 60, 60);
		btnOne.setText("1");
		
		Button btnTwo= new Button(shell, SWT.NONE);
		btnTwo.setBounds(76, 98, 60, 60);
		btnTwo.setText("2");
		
		Button btnThree = new Button(shell, SWT.NONE);
		btnThree.setBounds(142, 98, 60, 60);
		btnThree.setText("3");
		
		Button btnFour = new Button(shell, SWT.NONE);
		btnFour.setBounds(10, 164, 60, 60);
		btnFour.setText("4");
		
		Button btnFive = new Button(shell, SWT.NONE);
		btnFive.setBounds(76, 164, 60, 60);
		btnFive.setText("5");
		
		Button btnSix = new Button(shell, SWT.NONE);
		btnSix.setBounds(142, 164, 60, 60);
		btnSix.setText("6");
		
		Button btnSeven = new Button(shell, SWT.NONE);
		btnSeven.setBounds(10, 230, 60, 60);
		btnSeven.setText("7");
		
		Button btnEight = new Button(shell, SWT.NONE);
		btnEight.setBounds(76, 230, 60, 60);
		btnEight.setText("8");
		
		Button btnNine = new Button(shell, SWT.NONE);
		btnNine.setBounds(142, 230, 60, 60);
		btnNine.setText("9");
		
		Button btnZero = new Button(shell, SWT.NONE);
		btnZero.setBounds(76, 296, 60, 60);
		btnZero.setText("0");
		
		instructionsTextField = new Text(shell, SWT.BORDER);
		instructionsTextField.setBounds(233, 97, 214, 259);
		instructionsTextField.setMessage("Enter mailbox number followed by send");
		
		 
		
		Label lblVoiceMail = new Label(shell, SWT.NONE);
		lblVoiceMail.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblVoiceMail.setBounds(158, 10, 125, 45);
		lblVoiceMail.setText("Voice Mail");

	}
}
