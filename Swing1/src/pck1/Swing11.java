package pck1;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Swing11 extends JFrame implements ActionListener
{
	public JButton b1,b2,b3;
	public JLabel l1,l2,l3;
	public JTextField t1,t2,t3,t4;
	
	public Swing11()
	{
		
	}
	public Swing11(String a)
	
	{
		super(a);
	}
	public void setComponent()
	{	
		l1=new JLabel("Enter no1");
		l2=new JLabel("Enter no2");

		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		b1=new JButton("ADD");
		b2=new JButton("SUB");
		setLayout(null);
		l1.setBounds(50,50,200,20);
		add(l1);
		l2.setBounds(50,100,100,20);
		add(l2);
		t1.setBounds(150,50,100,20);
		t1.setToolTipText("Enter int val");
		add(t1);
		t2.setBounds(150,100,100,20);
		t2.setToolTipText("Enter int val");
		add(t2);
		t3.setBounds(40,180,100,20);
		add(t3); 
		t3.setEditable(false);
		t3.setBackground(Color.WHITE);
		t4.setBounds(160,180,100,20);
		add(t4); 
		t4.setEditable(false);
		t4.setBackground(Color.WHITE);
		b1.setBounds(40,220,100,20);
		b1.setToolTipText("Click here");
		add(b1);
		
		b1.addActionListener(this);
		b2.setBounds(160,220,100,20);
		b2.setToolTipText("Click here");
		add(b2);
		b2.addActionListener(this);
		
		
		
		}
	public static void main(String args []) 
	{
		Swing11 jf=new Swing11("jivesh");
		jf.setComponent();
		jf.setVisible(true);
		jf.setSize(360,640);
		jf.getContentPane().setBackground(Color.CYAN);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
	int a,b,c;
	if(e.getSource()==b1)
	{
		try {
		 a=Integer.parseInt(t1.getText());
		 b=Integer.parseInt(t2.getText());
		c=a+b;
		t3.setText("Addition="+c);
		}
		catch(NumberFormatException e1)
		{
			String s4=e.getActionCommand();
			Frame sw =null ;
			JDialog d=new JDialog(sw, "Warning");
			JLabel l=new JLabel("Invialid Input");
			d.getContentPane().setBackground(Color.RED);
			d.add(l);
			d.setSize(250,100);
			d.setVisible(true);
		}
	}
	else if(e.getSource()==b2)
	{
		try {
		 a=Integer.parseInt(t1.getText());
		 b=Integer.parseInt(t2.getText());
		c=a-b;
		t4.setText("Substractin="+c);
		
		}
		catch(NumberFormatException e2)
		{
			String s4=e.getActionCommand();
			Frame sw =null ;
			JDialog d=new JDialog(sw, "Warning");
			JLabel l=new JLabel("Invialid Input");
			d.getContentPane().setBackground(Color.RED);
			d.add(l);
			d.setSize(250,100);
			d.setVisible(true);
		}
	}
	}
}