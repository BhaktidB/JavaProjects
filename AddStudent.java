package bhakti;
import javax.swing.*; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.*;
import javax.swing.*;

import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.table.DefaultTableModel;
public class AddStudent extends JFrame{

	JFrame frame;
	JTable table;
	JTextField textId,textName,textSur,textSem,textBranch;
	JButton btnAdd,btnDelete,btnUpdate,btnReset;
	
	AddStudent(){

		 // create JFrame and JTable
	         frame = new JFrame();
	         table = new JTable(); 
	        frame.setTitle("Add Student");
	        // create a table model and set a Column Identifiers to this model 
	        Object[] columns = {"Id","Name","Surname","Sem","Branch"};
	        DefaultTableModel model = new DefaultTableModel();
	        model.setColumnIdentifiers(columns);
	        
	        // set the model to the table
	        table.setModel(model);
	        
	        // Change A JTable Background Color, Font Size, Font Color, Row Height
	        table.setBackground(Color.LIGHT_GRAY);
	        table.setForeground(Color.black);
	        Font font = new Font("",1,22);
	        table.setFont(font);
	        table.setRowHeight(30);
	        
	        // create JTextFields
	         textId = new JTextField();
	         textName = new JTextField();
	         textSur = new JTextField();
	         textSem = new JTextField();
	         textBranch = new JTextField();
	        
	        // create JButtons
	         btnAdd = new JButton("Add");
	         btnDelete = new JButton("Delete");
	         btnUpdate = new JButton("Update");     
	         btnReset = new JButton("Reset");
	        
	        textId.setBounds(20, 220, 100, 25);
	        textName.setBounds(20, 250, 100, 25);
	        textSur.setBounds(20, 280, 100, 25);
	        textSem.setBounds(20, 310, 100, 25);
	        textBranch.setBounds(20, 340, 100, 25);
	        
	        btnAdd.setBounds(150, 220, 100, 25);
	        btnUpdate.setBounds(150, 265, 100, 25);
	        btnDelete.setBounds(150, 310, 100, 25);
	        btnReset.setBounds(300, 310, 100, 25);
	        
	        // create JScrollPane
	        JScrollPane pane = new JScrollPane(table);
	        pane.setBounds(0, 0, 880, 200);
	        
	        frame.setLayout(null);
	        
	        frame.add(pane);
	        
	        // add JTextFields to the jframe
	        frame.add(textId);
	        frame.add(textName);
	        frame.add(textSur);
	        frame.add(textSem);
	        frame.add(textBranch);
	        // add JButtons to the jframe
	        frame.add(btnAdd);
	        frame.add(btnDelete);
	        frame.add(btnUpdate);
	        frame.add(btnReset);
	        
	        // create an array of objects to set the row data
	        Object[] row = new Object[5];
	        
	        // button add row
	        btnAdd.addActionListener(new ActionListener(){

	            @Override
	            public void actionPerformed(ActionEvent e) {
	             
	                row[0] = textId.getText();
	                row[1] = textName.getText();
	                row[2] = textSur.getText();
	                row[3] = textSem.getText();
	                row[4] = textBranch.getText();
	                // add row to the model
	                model.addRow(row);
	                JOptionPane.showMessageDialog(null, "Successfully Student Added..!");
	            }
	        });
	        
	        // button remove row
	        btnDelete.addActionListener(new ActionListener(){

	            @Override
	            public void actionPerformed(ActionEvent e) {
	            
	                // i = the index of the selected row
	                int i = table.getSelectedRow();
	                if(i >= 0){
	                    // remove a row from jtable
	                    model.removeRow(i);
	                }
	                else{
	       
	                    System.out.println("Delete Error");
	                }
	            }
	        });
	        
	        // get selected row data From table to textfields 
	        table.addMouseListener(new MouseAdapter(){
	        
	        @Override
	        public void mouseClicked(MouseEvent e){
	            
	            // i = the index of the selected row
	            int i = table.getSelectedRow();
	            /*
	             * selects the row which mouse selects or clicks on
	             */
	            textId.setText(model.getValueAt(i, 0).toString());
	            textName.setText(model.getValueAt(i, 1).toString());
	            textSur.setText(model.getValueAt(i, 2).toString());
	            textSem.setText(model.getValueAt(i, 3).toString());
	            textBranch.setText(model.getValueAt(i, 4).toString());
	        }
	        });
	        
	        // button update row
	        btnUpdate.addActionListener(new ActionListener(){

	            @Override
	            public void actionPerformed(ActionEvent e) {
	             
	                // i = the index of the selected row
	                int i = table.getSelectedRow();
	                
	                if(i >= 0) 
	                {
	                   model.setValueAt(textId.getText(), i, 0);
	                   model.setValueAt(textName.getText(), i, 1);
	                   model.setValueAt(textSur.getText(), i, 2);
	                   model.setValueAt(textSem.getText(), i, 3);
	                   model.setValueAt(textBranch.getText(), i, 3);
	                }
	                else{
	                    System.out.println("Update Error");
	                }
	            }
	        });
	        
	        btnReset.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					textId.setText("");
					textName.setText("");
					textSur.setText("");
					textSem.setText("");
					textBranch.setText("");
				}
	        	
	        });
	        
	        frame.setSize(900,500);
	        frame.setLocationRelativeTo(null);
	        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	}
	
	public static void main(String[] args) throws IOException{
		AddStudent as = new AddStudent();

		
	}
	
	
	
}
