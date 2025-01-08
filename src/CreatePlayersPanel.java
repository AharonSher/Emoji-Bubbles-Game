import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreatePlayersPanel extends JPanel {
	
	private JLabel test, testImg;

	public CreatePlayersPanel() {
		super();
		
		test = new JLabel("Hello");
		testImg = new JLabel(new ImageIcon("images/roll.png"));
		this.add(test);
		this.add(testImg);
	}
	
	

}
