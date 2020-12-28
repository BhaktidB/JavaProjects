package bhakti;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame implements ActionListener{
	JLabel u,p,admin;
	JTextField txt;
	JPasswordField pass;
	JButton b,button;
	LoginPage(){
		admin = new JLabel("Admin Login");
		admin.setBounds(150,0, 200, 80);
		admin.setFont(new Font("Verdana", Font.PLAIN, 18));
		add(admin);
		u = new JLabel("Username");	
		u.setBounds(70, 50,150,50);
		p = new JLabel("Password");
		p.setBounds(70, 110,150,50);
		txt = new JTextField(20);
		txt.setBounds(145, 65,150,30);
		pass = new JPasswordField(20);
		pass.setBounds(145,115,150,30);
		b = new JButton("Verify");
		b.setBounds(145,175,150,30);
		button = new JButton("Verify");
		button.setBounds(145,145,150,30);
		
		add(u);
		add(txt);
		add(p);
		add(pass);
		add(b);
		add(button);
		
		b.addActionListener(this);
		
		setVisible(true); 
		setSize(400,350); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle("Login Page"); 
		setLayout(null);  
	}
	public static void main(String[] args) {
		LoginPage pg = new LoginPage();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = txt.getText();
		char []pw1 = name.toCharArray();
        char []correct1 = new char[]{'a','d','m','i','n'};
		String[] cn = new String[] {"admin"};
		char[] pw = pass.getPassword();
		char[] correct = new char[] {'p','a','s','s','w','o','r','d'};
		if(Arrays.equals(pw,correct) && (Arrays.equals(pw1,correct1))) {
			//JOptionPane.showMessageDialog(this, "Success");
			
			if(e.getSource()==b) {
				MainPage mp = new MainPage();
			    this.setVisible(true);
			    dispose();
			}
			
		}else {
			JOptionPane.showMessageDialog(this, "Incorrect Password");
			
		}
		
	}

}
