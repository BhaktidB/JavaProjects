package bhakti;

import javax.swing.*; 
import java.awt.*;
import java.io.IOException;
import java.util.*;

public class ViewB extends JFrame {

	ViewB(){
		String column[]={"ID","NAME","BOOK","PUBLICATION","DATE"}; 
		 String data[][]={ 
				 {"101","Amit","Coder","Arihanth","1/2/2020"},
	                {"102","Jai","Fun with OOPJ","Oxford","1/2/2020"},
	                {"101","Sachin","ANIME","Kanaboon","1/2/2020"},
	                {"108","Rahul","General knowledge","Arihanth","5/2/2020"},
	                {"104","Sakshi","Coders at Work","Apress","5/2/2020"},
	                {"105","Gaurav","Concrete Technology","SS","6/2/2020"},
	                {"107","Sarika","Strength of Materials","Geometric","6/2/2020"},
	                {"107","Amruta","Structral Dyanamics","SS","7/2/2020"},
	                {"103","Ashutosh","Adavnced Dictionary","Oxford","8/2/2020"},
	                {"104","Suchita","Beginning Python","Apress","8/2/2020"},
	                {"106","vishwas","Python Algorithm","Apress","8/2/2020"},
	                {"109","Sagar","Java Design Patterns","Apress","10/2/2020"}};    
		        
					JTable jt=new JTable(data,column);    
					jt.setBounds(30,40,200,300);          
					JScrollPane sp=new JScrollPane(jt);    
					add(sp); 
					
					
					setTitle("View Books"); 
					setSize(500,400);    
					setVisible(true); 
	}
	
	public static void main(String[] args) {
		ViewB vb = new ViewB();
	}

}
