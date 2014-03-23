import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.GridLayout;


public class TestFrame extends JFrame {
	public TestFrame() {
		setLayout(new GridLayout(5,3,7,7));
		
		add(new JLabel("Name"));
		add(new JTextField());
		add(new JLabel("Age"));
		add(new JTextField());
		add(new JLabel("Height"));
		add(new JTextField());
		add(new JLabel("Weight"));
		add(new JTextField());
	}
	