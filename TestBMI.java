import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestBMI extends javax.swing.JFrame {
	private JButton Enter;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JLabel label9;
	private JLabel label10;
	private JLabel label11;
	private JLabel label12;
	private JTextField BMI;
	private JTextField Name;
	private JTextField Age;
	private JTextField Height;
	private JTextField Weight;
	private String name;
	private int age;
	private double weight; 
	private double height; 
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double METERS_PER_INCH = 0.0254;
	private double bmi;
	private String status;

public TestBMI(String name, int age, double weight, double height) {
		    this.name = name;
		    this.age = age;
		    this.weight = weight;
		    this.height = height;
		  }
		  
		  public TestBMI(String name, double weight, double height) {
		    this(name, 20, weight, height);
		  }
	public TestBMI() {
		

		label1 = new JLabel("Name : ");
		this.add(label1);

		Name = new JTextField();
		this.add(Name);

		label2 = new JLabel("Male / Female");
		this.add(label2);

		label3 = new JLabel("Age : ");
		this.add(label3);

		Age = new JTextField();
		this.add(Age);

		label4 = new JLabel("years");
		this.add(label4);

		label5 = new JLabel("Height : ");
		this.add(label5);

		Height = new JTextField();
		this.add(Height);

		label6 = new JLabel("Inch");
		this.add(label6);

		label7 = new JLabel("Weight : ");
		this.add(label7);

		Weight = new JTextField();
		this.add(Weight);

		label8 = new JLabel("Pound");
		this.add(label8);


		Enter = new JButton("Enter");
		this.add(Enter);


		label9 = new JLabel("                BMI :   (kg / (m * m)");
		this.add(label9);

		BMI = new JTextField();
		this.add(BMI);Enter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				name = Name.getText().trim();
				age = Integer.parseInt(Age.getText().trim()); 
				height = Double.parseDouble(Height.getText().trim());
				weight = Double.parseDouble(Weight.getText().trim());
				bmi = getBMI();
				status = getStatus();
				BMI.setText(bmi + "     " + status);
			}
		});

	}
public static void main(String[] args) {

	try {
		TestBMI frame = new TestBMI();
		frame.setTitle("BMI");
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(6, 3, 3, 3));
		frame.setVisible(true);
		frame.setSize(500, 400);
		frame.setLocationRelativeTo(null);
	} catch (Exception e) {

	}
}
public double getBMI() {
    double bmi = weight * KILOGRAMS_PER_POUND / 
      ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
    return Math.round(bmi * 100) / 100.0;
  }
  
  public String getStatus() {
    double bmi = getBMI();
    if (bmi < 18.5)
      return "Underweight";
    else if (bmi < 25)
      return "Normal";
    else if (bmi < 30)
      return "Overweight";
    else
      return "Obese";
  }
  
  public String showName() {
    return name;
  }
  
  public int showAge() {
    return age;
  }
  
  public double showWeight() {
    return weight;
  }
  
  public double showHeight() {
    return height;
  }
}
