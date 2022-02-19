package pck1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class SwingClass  {

	public static void main(String[] args) {
		
		JFrame fr=new JFrame("jivesh");
		
		fr.setVisible(true);
		fr.setSize(300,299);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.getContentPane().setBackground(Color.CYAN);
		
		JButton b1;
		JLabel l1,l2,l3;
		JTextField t1,t2,t3;
//		First Label
		l1=new JLabel("Enter First Number:");
		
		fr.add(l1);
		l1.setBounds(0,90,130,30);
		l1.setFont(new Font("Rozha One",Font.BOLD,10));
//		Second Label
		l2=new JLabel("Enter Second Number:");
		fr.add(l2);
		l2.setBounds(10,100,100,30);
		l2.setFont(new Font("",Font.BOLD,10));
		
//		First TextField
		t1=new JTextField();
		fr.add(t1);
		t1.setSize(140,23);
		t1.setBounds(160,100,120,15);
		
//		Second TextField
		t2=new JTextField();
		fr.add(t2);
		t2.setBounds(160,125,120,15);
//		third TextField
		t3=new JTextField();
		fr.add(t3);
		t3.setBounds(100,150,100,20);
		t3.setEditable(false);
		
//		button
		b1=new JButton("Enter");
		
		fr.add(b1);
		b1.setBounds(100,180,70,20);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long c=0;
				String s1=t1.getText();
				String s2=t2.getText();
				try {
				long a=Long.parseLong(s1);
				long b=Long.parseLong(s2);
				
				
				
				
					
				
				
					
				
				c=a+b;
				}
				
				
				catch(NumberFormatException e2)
				{
					System.out.println("NumberFormatException occurred");
					System.out.println("Invailid Input");
					System.out.println("Please Enter Vailid Input");
					
				}
				
				
				
				
				String result=String.valueOf(c);
				t3.setText(result);
			}
		});
		
		
		
		
		

	}

}


 
