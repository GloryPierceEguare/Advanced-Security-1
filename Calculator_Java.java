package Calculator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI {
	//Initialize JFrame
	private JFrame frame = new JFrame ("Calculator");
	
	//Initialize Text Area
	private JTextArea textArea = new JTextArea();
	
	//Calculation Variables
	String strNum1 ="";
	String strNum2 ="";
	String[] statement;
	int num1 = 0;
	int num2 = 0;
	String strResult;
	int result = 0;
	
	//Initialize Calculator Buttons
	private JButton button0 = new JButton("0");
	private JButton button1 = new JButton("1");
	private JButton button2 = new JButton("2");
	private JButton button3 = new JButton("3");
	private JButton button4 = new JButton("4");
	private JButton button5 = new JButton("5");
	private JButton button6 = new JButton("6");
	private JButton button7 = new JButton("7");
	private JButton button8 = new JButton("8");
	private JButton button9 = new JButton("9");
	
	private JButton buttonadd = new JButton("+");
	private JButton buttonsub = new JButton("-");
	private JButton buttonmul = new JButton("*");
	private JButton buttondiv = new JButton("/");
	private JButton buttonequals = new JButton("=");
	private JButton buttonclear = new JButton("CLEAR");
	
	//Colours
	Color color = new Color(0, 153, 0); 
	Color color2 = new Color(204, 0, 0);
	
	public GUI() {
		//Frame Attributes:
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(405, 560);
        frame.setResizable(false);
        frame.setLayout(null);
        
        //Text Area Attributes
        textArea.setSize(370, 100);
        textArea.setLocation(10, 15);
        textArea.setEditable(false);
        
        //Text Area Font Size
        Font font = textArea.getFont();
        float size = font.getSize() + 60.0f;
        textArea.setFont( font.deriveFont(size) );
        
        //button0
        button0.setSize(80, 50);
        button0.setLocation(105, 460);
        button0.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		textArea.append("0");
        	}
        });
        
        //button1
        button1.setSize(80, 50);
        button1.setLocation(10, 385);
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
            	textArea.append("1");
            }
        });
       
        //button2
        button2.setSize(80, 50);
        button2.setLocation(105, 385);
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
            	textArea.append("2");
            }
        });
       
        //button3
        button3.setSize(80, 50);
        button3.setLocation(200, 385);
        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
            	textArea.append("3");
            }
        });
       
        //button4
        button4.setSize(80, 50);
        button4.setLocation(10, 300);
        button4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
            	textArea.append("4");
            }
        });
               
        //button5
        button5.setSize(80, 50);
        button5.setLocation(105, 300);
        button5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
            	textArea.append("5");
            }
        });
               
        //button6
        button6.setSize(80, 50);
        button6.setLocation(200, 300);
        button6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
            	textArea.append("6");
            }
        });
       
        //button7
        button7.setSize(80, 50);
        button7.setLocation(10, 220);
        button7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
            	textArea.append("7");
            }
        });
                       
        //button8
        button8.setSize(80, 50);
        button8.setLocation(105, 220);
        button8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
            	textArea.append("8");
            }
        });
                       
        //button9
        button9.setSize(80, 50);
        button9.setLocation(200, 220);
        button9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
            	textArea.append("9");
            }
        });
        
        //buttonclear
        buttonclear.setSize(220, 60);
        buttonclear.setLocation(10, 140);
        buttonclear.setBackground(color2);
        buttonclear.setOpaque(true);
        buttonclear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
            	//Clear textArea when pressed
            	textArea.setText("");
            }
        });
        
        //buttonadd
        buttonadd.setSize(70, 60);
        buttonadd.setLocation(310, 455);
        buttonadd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
            	textArea.append("+");
            }
        });
        
        //buttonsub
        buttonsub.setSize(70, 60);
        buttonsub.setLocation(310, 375);
        buttonsub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
            	textArea.append("-");
            }
        });
        
        //buttonmul
        buttonmul.setSize(70, 60);
        buttonmul.setLocation(310, 295);
        buttonmul.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
            	textArea.append("*");
            }
        });
        
        //buttondiv
        buttondiv.setSize(70, 60);
        buttondiv.setLocation(310, 220);
        buttondiv.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
            	textArea.append("/");
            }
        });
        
        //buttonequals
        buttonequals.setSize(130, 60);
        buttonequals.setLocation(250, 140);
        buttonequals.setBackground(color);
        buttonequals.setOpaque(true);
        buttonequals.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
            	//If else statements to do the calculations for each of the 4 mathematical operators
            	//Addition if statement
            	if(textArea.getText().contains("+")) {
            		statement = textArea.getText().split("\\+");
            		strNum1 = statement[0];
            		strNum2 = statement[1];
            		num1 = Integer.parseInt(strNum1);
            		num2 = Integer.parseInt(strNum2);
            		
            		result = num1 + num2;
            		strResult = Integer.toString(result);
            		
            		textArea.setText(strResult);
            	}
            	//Subtraction if statement
            	else if(textArea.getText().contains("-")) {
            		statement = textArea.getText().split("\\-");
            		strNum1 = statement[0];
            		strNum2 = statement[1];
            		num1 = Integer.parseInt(strNum1);
            		num2 = Integer.parseInt(strNum2);
            		
            		result = num1 - num2;
            		strResult = Integer.toString(result);
            		
            		textArea.setText(strResult);
            	}
            	//Multiplication if statement
            	else if(textArea.getText().contains("*")) {
            		statement = textArea.getText().split("\\*");
            		strNum1 = statement[0];
            		strNum2 = statement[1];
            		num1 = Integer.parseInt(strNum1);
            		num2 = Integer.parseInt(strNum2);
            		
            		result = num1 * num2;
            		strResult = Integer.toString(result);
            		
            		textArea.setText(strResult);
            	}
            	//Division if statement
            	else if(textArea.getText().contains("/")) {
            		statement = textArea.getText().split("\\/");
            		strNum1 = statement[0];
            		strNum2 = statement[1];
            		num1 = Integer.parseInt(strNum1);
            		num2 = Integer.parseInt(strNum2);
            		
            		result = num1 / num2;
            		strResult = Integer.toString(result);
            		
            		//Display the result
            		textArea.setText(strResult);
            	}
            }
        });
       
        //Add textArea to the GUI
        frame.add(textArea);
        
        //Add Buttons to GUI
        frame.add(button0);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(buttonclear);
        
        //Add the operation buttons to the GUI
        frame.add(buttonadd);
        frame.add(buttonsub);
        frame.add(buttonmul);
        frame.add(buttondiv);
        frame.add(buttonequals);
	}

	public static void main(String[] args) {
		new GUI();

	}

}
