package bhakti;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ReturnBook extends JFrame implements ActionListener {
	JLabel id,name,publication,book,nb,date;
	public JTextField idt,namet,publicationt,bookt,nbt,datet;
	 JButton add,reset,reset1;
	 JLabel l1,l2,l3,l4,l5,l6;
	 JFrame returnj ;
	ReturnBook(){
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
		 
		 add = new JButton("Return");
		 add.setBounds(50,350,150,30);
		 add.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		 add.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));	 
		 add.setBackground(Color.BLACK);
		 add.setForeground(Color.WHITE);
		 add(add);
		 
		 reset = new JButton("Reset");
		 reset.setBounds(250,350,150,30);
		 add(reset);
		 
		 reset1 = new JButton("Reset");
		 reset1.setBounds(250,350,150,30);
		 reset.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		 reset.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));	 
		 reset.setBackground(Color.BLACK);
		 reset.setForeground(Color.WHITE);
		 add(reset1);
		 
		 reset.addActionListener(this);
		 add.addActionListener(new ActionListener(){

	            @Override
	            public void actionPerformed(ActionEvent e) {
	              //new returnj();
	            	
	            
	            
	                JOptionPane.showMessageDialog(null, "Successfully Book Returned..!");
	            }
	        });
		setVisible(true); 
		setSize(500,500); 
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle("Return Book"); 
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
		ReturnBook rb = new ReturnBook();

	}

}
 class returnj extends JFrame{
	 JLabel l1,l2,l3,l4,l5,l6,l;
	 JTextField idt,namet,publicationt,bookt,nbt,datet;
	
	 returnj(){
		 l = new JLabel("Generated");
		 l1 = new JLabel("id: "+idt);
         l2 = new JLabel("Student Name: "+namet);
         l3 = new JLabel("Book"+bookt);
         l4 = new JLabel("Publication: "+publicationt);
         l5 = new JLabel("No. of Books: "+nbt);
         l6 = new JLabel("Date: "+datet);
         
         add(l1);
         add(l2);
         add(l3);
         add(l4);
         add(l5);
         add(l6);
         setVisible(true); 
 		setSize(500,500); 
 		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 		setTitle("Return Book"); 
 		setLayout(new FlowLayout());  
	 }
}
