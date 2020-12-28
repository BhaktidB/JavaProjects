package bhakti;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.*;

public class MainPage extends JFrame implements ActionListener{

	JButton adds,issue,addb,returnb;
	JButton search_b,rbook,viewbook,viewstudent;
	JMenuBar menubar;
	JMenu help,about,logout;
	JMenuItem contact,library,author,book,exit;
	private JLabel statusLabel;
	MainPage(){
		adds = new JButton("Add Student");
		adds.setBounds(50, 50, 150, 50);
		issue = new JButton("Issue Book");
		issue.setBounds(50, 175, 150, 50);
		addb = new JButton("Add Book");
		addb.setBounds(300, 50, 150, 50);
		returnb = new JButton("Return Book");
		returnb.setBounds(300, 200, 150, 50);
		rbook = new JButton("Return Book");
		add(rbook);
		rbook.addActionListener(this);
		rbook.setBounds(300, 175, 150, 50);
		search_b = new JButton("Search Book");
		search_b.setBounds(50,300,150,50);
		add(search_b);
		search_b.addActionListener(this);
		viewbook = new JButton("View Book");
		viewbook.setBounds(300,300,150,50);
		add(viewbook);
		viewbook.addActionListener(this);
		viewstudent = new JButton("View student");
		viewstudent.setBounds(180,400,150,50);
		add(viewstudent);
		viewstudent.addActionListener(this);
		menubar = new JMenuBar();
		setJMenuBar(menubar);
		
		help = new JMenu("HELP");
		menubar.add(help);
		contact = new JMenuItem("CONTACT US");
		help.add(contact);

		about=new JMenu("ABOUT");
		//about.setActionCommand("Contact us @ 987654321");

		menubar.add(about);
		library=new JMenuItem("LIBRARY");
		about.add(library);
		author=new JMenuItem("AUTHORS");
		about.add(author);
		book=new JMenuItem("BOOKS");
		about.add(book);


		logout = new JMenu("LOGOUT");
		menubar.add(logout);
		exit = new JMenuItem("EXIT");
		logout.add(exit);


		 
		 
		add(adds);
		add(issue);
		add(addb);
		add(returnb);
		
		
		
		adds.addActionListener(this);
		issue.addActionListener(this);
		addb.addActionListener(this);
		returnb.addActionListener(this);
		contact.addActionListener(this);
		library.addActionListener(this);
		author.addActionListener(this);
		book.addActionListener(this);
		
		exit.addActionListener(new exitaction());
		
		setVisible(true); 
		setSize(500,600); 
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle("Library Management System"); 
		setLayout(null);  
		//setLocation(getMousePosition());
		
		
		
	}
	
//	class MenuItemListener implements ActionListener {
//	      public void actionPerformed(ActionEvent e) {            
//	         statusLabel.setText(e.getActionCommand() + " JMenuItem clicked.");
//	      }    
//	   }
	
	class exitaction implements ActionListener{
		public void actionPerformed (ActionEvent e ) {try {
			System.exit(0);
		}catch(Exception pe) {
			System.out.println("Error in exiting");
		}
			
		}
	}
	
	public static void main(String[] args) throws IOException{
		MainPage mp = new MainPage();
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		if(e.getSource()==adds) {
			AddStudent as= new AddStudent();
		    this.setVisible(true);
		}
		if(e.getSource()==issue) {
			IssueBook ib = new IssueBook();
		    this.setVisible(true);
		}
		if(e.getSource()==addb) {
			AddBook ab= new AddBook();
		    this.setVisible(true);
		}
		if(e.getSource()==search_b) {
			Search s = new Search();
		    this.setVisible(true);
		}
		if(e.getSource()==rbook) {
			ReturnBook rb = new ReturnBook();
		    this.setVisible(true);
		}
		if(e.getSource()==viewbook) {
			ViewB vb = new ViewB();
		    this.setVisible(true);
		}
		if(e.getSource()==viewstudent) {
			ViewS vs = new ViewS();
		    this.setVisible(true);
		}
		if(e.getSource()==contact) {
			JOptionPane.showMessageDialog( null, "Contact us @ 987654321", "Infomation",
			        JOptionPane.INFORMATION_MESSAGE);		    this.setVisible(true);
		}
		if(e.getSource()==library) {
			JOptionPane.showMessageDialog( null, "Library Management System created by group Omega. Still under process..!", "library",
			        JOptionPane.INFORMATION_MESSAGE);		    this.setVisible(true);
		}
		if(e.getSource()==author) {
			JOptionPane.showMessageDialog( null, "Renowned authors for students.", "authors",
			        JOptionPane.INFORMATION_MESSAGE);		    this.setVisible(true);
		}
		if(e.getSource()==book) {
			JOptionPane.showMessageDialog( null, "Books for Engineering students.", "authors",
			        JOptionPane.INFORMATION_MESSAGE);		    this.setVisible(true);
		}
		
		}catch(Exception ae) {
			JOptionPane.showMessageDialog(this, "not found");
		}
	}
}
