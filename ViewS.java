package bhakti;

import javax.swing.*; 
import java.awt.*;
import java.io.IOException;
import java.util.*;

public class ViewS extends JFrame{

	ViewS(){
		String column[]={"ID","NAME","SURNAME","SEM"}; 
		 String data[][]={ 
				 {"101","Amit","Sharma","4"},
	                {"102","Jai","Varma","4"},
	                {"103","Sachin","More","2"},
	                {"108","Rahul","Waghmare","2"},
	                {"104","Sakshi","Kamte","6"},
	                {"105","Gaurav","sawant","4",},
	                {"107","Sarika","vishwkarma","6"},
	                {"107","Amruta","Khanvilkar","8"},
	                {"103","Ashutosh","Gaikwad","2"},
	                {"104","Suchita","Singh","4",},
	                {"106","vishwas","Deshpande","8"},
	                {"109","Sagar","Sarpotdar","4"}};    
		        
					JTable jt=new JTable(data,column);    
					jt.setBounds(30,40,200,300);          
					JScrollPane sp=new JScrollPane(jt);    
					add(sp); 

					setTitle("View Students"); 
					setSize(500,400);    
					setVisible(true);    
		

		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle("View Student"); 
		setLayout(null); 
	}
	
	public static void main(String[] args) {
		ViewS vs = new ViewS();
	}

}
