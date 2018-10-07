import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class PANEL extends JFrame {

	   private JButton red;
	   private JButton blue;
	   private JButton green;
	   private JLabel label;

	   PANEL() {
		   //set panel
	       super("Question 3 homework 3");
	       setLayout(new FlowLayout());
	       //Create buttons
	       red = new JButton("RED");
	       green = new JButton("GREEN");
	       blue = new JButton("BLUE");

	       label = new JLabel("");
	       label.setIcon(new ImageIcon("images/red.png"));
	       //When acctionlistener on red
	       red.addActionListener(new ActionListener() 
	       {
	           public void actionPerformed(ActionEvent e) {
	        	   label.setIcon(new ImageIcon("images/redbutton.png"));
	           }
	       });
	       //When acctionlistener on green
	       green.addActionListener(new ActionListener() 
	       {
	           public void actionPerformed(ActionEvent e) {
	        	   label.setIcon(new ImageIcon("images/greenbutton.jpg"));
	           }
	       });
	       //When acctionlistener on blue
	       blue.addActionListener(new ActionListener() 
	       {  
	           public void actionPerformed(ActionEvent e) {
	        	   label.setIcon(new ImageIcon("images/bluebutton.jpg"));
	           }
	       });

	       add(red);
	       add(green);
	       add(blue);

	       add(label);
	   }

	   public static void main(String[] args) {
		   PANEL frame = new PANEL();
	       frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	       frame.setSize(new Dimension(800, 600));
	       frame.setVisible(true);
	   }

	}
