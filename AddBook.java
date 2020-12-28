package bhakti;
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
public class AddBook extends JFrame {

	JFrame frame ;
    JTable table ; 
    JTextField textId,textBook,textPub,textDate;
    JButton btnAdd,btnDelete,btnUpdate,btnReset;
    
	AddBook(){
		// create JFrame and JTable
         frame = new JFrame();
         table = new JTable(); 
        frame.setTitle("Add Book");
        // create a table model and set a Column Identifiers to this model 
        Object[] columns = {"Id","Book","Publication","Date"};
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
         textBook = new JTextField();
         textPub = new JTextField();
         textDate = new JTextField();
        
        // create JButtons
         btnAdd = new JButton("Add");
         btnDelete = new JButton("Delete");
         btnUpdate = new JButton("Update");     
         btnReset = new JButton("Reset");
        
        textId.setBounds(20, 220, 100, 25);
        textBook.setBounds(20, 250, 100, 25);
        textPub.setBounds(20, 280, 100, 25);
        textDate.setBounds(20, 310, 100, 25);
        
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
        frame.add(textBook);
        frame.add(textPub);
        frame.add(textDate);
    
        // add JButtons to the jframe
        frame.add(btnAdd);
        frame.add(btnDelete);
        frame.add(btnUpdate);
        frame.add(btnReset);
        
        // create an array of objects to set the row data
        Object[] row = new Object[4];
        
        // button add row
        btnAdd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                row[0] = textId.getText();
                row[1] = textBook.getText();
                row[2] = textPub.getText();
                row[3] = textDate.getText();
                
                // add row to the model
                model.addRow(row);
                JOptionPane.showMessageDialog(null, "Successfully Book Added..!");
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
            
            textId.setText(model.getValueAt(i, 0).toString());
            textBook.setText(model.getValueAt(i, 1).toString());
            textPub.setText(model.getValueAt(i, 2).toString());
            textDate.setText(model.getValueAt(i, 3).toString());
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
                   model.setValueAt(textBook.getText(), i, 1);
                   model.setValueAt(textPub.getText(), i, 2);
                   model.setValueAt(textDate.getText(), i, 3);
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
				textBook.setText("");
				textPub.setText("");
				textDate.setText("");
			}
        	
        });
        
        frame.setSize(900,400);
        frame.setLocationRelativeTo(null);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}
	
	public static void main(String[] args) throws IOException{
		AddBook ab = new AddBook();
		
		
		 
	        
	    }
	}
	



