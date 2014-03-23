import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;

public class TestFrame extends JFrame {
	public TestFrame() {
		//Set GridLayout, 5 rows , 3 columns , and gaps 5 between
		// components horizontally and vertically
		setLayout(new GridLayout(5,3,5,5));
		
		//Add labels , text , and button fields to the frame
		add(new JLabel("Name"));
		// I try to change the 5 to another number 
		//but there is no change. Need a answer please
		add(new JTextField(5));
		add(new JLabel("Age"));
		add(new JTextField(2));
		add(new JLabel("Height"));
		add(new JTextField(7));
		add(new JLabel("Weight"));
		add(new JTextField(5));
		add(new JButton("Enter"));
		add(new JTextField());
	}
	
	
	
	
	
	
	/** Main method */
	public static void main(String[] args) {
      TestFrame frame = new TestFrame();
      frame.setTitle("GUI");
      frame.setSize(1000,625);
      //Center the frame
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
		
		
		
		
		
		
				
	}
}