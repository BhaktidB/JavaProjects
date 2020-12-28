package bhakti;

import javax.swing.*; 
import java.awt.*;
import java.io.IOException;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Search extends JFrame {
	 private JTextField jtf;
	   private JLabel searchLbl;
	   private TableModel model;
	   private JTable table;
	   private TableRowSorter sorter;
	   private JScrollPane jsp;
	Search(){
		
		setTitle("Search");
	      jtf = new JTextField(15);
	      searchLbl = new JLabel("Search");
	      String[] columnNames = {"ID","NAME","BOOK","PUBLICATION","DATE"};
	      Object[][] rowData = {{"101","Amit","Coder","Arihanth","1/2/2020"},
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
	      model = new DefaultTableModel(rowData, columnNames);
	      /*
	       * M - the type of the model, which must be an implementation of TableModel
	       * An implementation of RowSorter that provides sorting and filtering using a TableModel. 
	       * This will do all the wiring such that when the user does the appropriate gesture,
	       *  such as clicking on the column header, the table will visually sort.
	       */
	      sorter = new TableRowSorter<>(model);
	      table = new JTable(model);
	      table.setRowSorter(sorter);
	      setLayout(new FlowLayout(FlowLayout.CENTER));
	      jsp = new JScrollPane(table);
	      add(searchLbl);
	      add(jtf);
	      add(jsp);
	      /*
	       * this code helps tp filter and search for the data in jtable
	       */
	      jtf.getDocument().addDocumentListener(new DocumentListener() {
	    	  /*
	    	   * methods of documnetlistener
	    	   */
	         @Override
	         public void insertUpdate(DocumentEvent e) {
	            search(jtf.getText());
	         }
	         @Override
	         public void removeUpdate(DocumentEvent e) {
	            search(jtf.getText());
	         }
	         @Override
	         public void changedUpdate(DocumentEvent e) {
	            search(jtf.getText());
	         }
	         public void search(String str) {
	            if (str.length() == 0) {
	               sorter.setRowFilter(null);
	            } else {
	               sorter.setRowFilter(RowFilter.regexFilter(str));
	            }
	         }
	      });
	      setSize(475, 300);
	      
	      setLocationRelativeTo(null);
	      setResizable(false);
	      setVisible(true);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
	}
	public static void main(String[] args) {
		Search s = new Search();

	}
	
}
