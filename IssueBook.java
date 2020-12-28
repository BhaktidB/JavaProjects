package bhakti;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.*;

public class IssueBook extends JFrame implements ActionListener {
	JLabel id,name,publication,book,nb,date;
	 JTextField idt,namet,publicationt,bookt,nbt,datet;
	 JButton add,reset,reset1;
	IssueBook(){
		
		id = new JLabel("ID");
		 id.setBounds(50,50,150,50);
		 add(id);
		 
		 name = new JLabel("Student Name");
		 name.setBounds(50,100,150,50);
		 add(name);
		 
		 book = new JLabel("Book");
		 book.setBounds(50,150,150,50);
		 add(book);
		 
		 publication = new JLabel("Publication");
		 publication.setBounds(50,200,150,50);
		 add(publication);
		 
		 nb = new JLabel("No. of Books");
		 nb.setBounds(50,250,150,50);
		 add(nb);
		 
		 date = new JLabel("Date");
		 date.setBounds(50,300,150,50);
		 add(date);
		 
		 idt = new JTextField(20);
		 idt.setBounds(250,50,150,30);
		 add(idt);
		 
		 namet = new JTextField(20);
		 namet.setBounds(250,100,150,30);
		 add(namet);
		 
		 bookt = new JTextField(20);
		 bookt.setBounds(250,150,150,30);
		 add(bookt);
		 
		 publicationt = new JTextField(20);
		 publicationt.setBounds(250,200,150,30);
		 add(publicationt);
		 
		 nbt = new JTextField(20);
		 nbt.setBounds(250,250,150,30);
		 add(nbt);
		 
		 datet = new JTextField(20);
		 datet.setBounds(250,300,150,30);
		 add(datet);
		 
		 add = new JButton("Issue");
		 add.setBounds(50,350,150,30);
		 add.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		 add.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));	 
		 add.setBackground(Color.BLACK);
		 add.setForeground(Color.WHITE);
		 add(add);
		 
		 reset = new JButton("Reset");
		 reset.setBounds(250,350,150,30);
		 reset.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		 reset.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));	 
		 reset.setBackground(Color.BLACK);
		 reset.setForeground(Color.WHITE);
		 add(reset);
		 
		 reset1 = new JButton("Reset");
		 reset1.setBounds(250,350,150,30);
		 add(reset1);
		
		 reset.addActionListener(this);
		 
		 add.addActionListener(new ActionListener(){
			
	            @Override
	            public void actionPerformed(ActionEvent e) {
	             
	                
	                JOptionPane.showMessageDialog(null, "Successfully Book Added..!");
	            }
	        });
		 
		setVisible(true); 
		setSize(500,500); 
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle("Issue Book"); 
		setLayout(null);  
	}
	
	public void actionPerformed(ActionEvent e)
	{
	idt.setText("");
	namet.setText("");
	publicationt.setText("");
	datet.setText("");
	bookt.setText("");
	nbt.setText("");
	}
	
	public static void main(String[] args) {
		IssueBook ib = new IssueBook();

	}
}
