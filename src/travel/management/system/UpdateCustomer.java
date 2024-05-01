/*package travel.management.system;


import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class UpdateCustomer extends JFrame {
	Connection conn = null;
	PreparedStatement pst = null;
	private JPanel contentPane;
	private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t1id,t1gender;
        JComboBox comboBox;
        JRadioButton r1,r2;
        Choice c1;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateCustomer frame = new UpdateCustomer("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UpdateCustomer(String username) throws SQLException {
		System.out.println(username);
                setBounds(200, 100, 850, 550);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
                Image i3 = i1.getImage().getScaledInstance(400, 300,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(450,100,450,300);
                add(l1);
		
		JLabel lblName = new JLabel("UPDATE CUSTOMER DETAILS");
		lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		lblName.setBounds(118, 11, 260, 53);
		contentPane.add(lblName);
                
                JLabel l3 = new JLabel("Username :");
		l3.setBounds(35, 70, 200, 14);
		contentPane.add(l3);
                
                t7 = new JTextField();
		t7.setBounds(271, 70, 150, 20);
		contentPane.add(t7);
		t7.setColumns(10);
                
                JLabel lblId = new JLabel("ID :");
		lblId.setBounds(35, 110, 200, 14);
		contentPane.add(lblId);
                

        t1id = new JTextField();
t1id.setBounds(271, 110, 150, 20);
contentPane.add(t1id);

                
                JLabel l2 = new JLabel("Number :");
		l2.setBounds(35, 150, 200, 14);
		contentPane.add(l2);
                
                t1 = new JTextField();
		t1.setBounds(271, 150, 150, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JLabel lblName_1 = new JLabel("Name :");
		lblName_1.setBounds(35, 190, 200, 14);
		contentPane.add(lblName_1);
		
		t2 = new JTextField();
		t2.setBounds(271, 190, 150, 20);
		contentPane.add(t2);
		t2.setColumns(10);

                
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setBounds(35, 230, 200, 14);
		contentPane.add(lblGender);
                

        t1gender = new JTextField();
        t1gender.setBounds(271, 150, 150, 20);
contentPane.add(t1gender);
t1gender.setColumns(10);
                
		JLabel lblCountry = new JLabel("Country :");
		lblCountry.setBounds(35, 270, 200, 14);
		contentPane.add(lblCountry);
                
                t3 = new JTextField();
		t3.setBounds(271, 270, 150, 20);
		contentPane.add(t3);
		t3.setColumns(10);
		
		JLabel lblReserveRoomNumber = new JLabel("Permanent Address :");
		lblReserveRoomNumber.setBounds(35, 310, 200, 14);
		contentPane.add(lblReserveRoomNumber);
                
                t5 = new JTextField();
		t5.setBounds(271, 310, 150, 20);
		contentPane.add(t5);
		t5.setColumns(10);
           	
		JLabel lblCheckInStatus = new JLabel("Phone :");
		lblCheckInStatus.setBounds(35, 350, 200, 14);
		contentPane.add(lblCheckInStatus);
                
                t6 = new JTextField();
		t6.setBounds(271, 350, 150, 20);
		contentPane.add(t6);
		t6.setColumns(10);
		
		JLabel lblDeposite = new JLabel("Email :");
		lblDeposite.setBounds(35, 390, 200, 14);
		contentPane.add(lblDeposite);
		
		t8 = new JTextField();
		t8.setBounds(271, 390, 150, 20);
		contentPane.add(t8);
		t8.setColumns(10);
		
		
                try{
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from customer where s9 = '"+username+"'");
                    while(rs.next()){
                        t7.setText(rs.getString("s9"));  
                        t2.setText(rs.getString("s3"));
                        t1id.setText(rs.getString("s1"));
                        t1.setText(rs.getString("s2"));
                        t1gender.setText(rs.getString("s4"));
                        t3.setText(rs.getString("s5"));
                        t5.setText(rs.getString("s7"));
                        t6.setText(rs.getString("s8"));
                        t8.setText(rs.getString("s10"));
                    }
                }catch(Exception e){ }
		
		

		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            Conn c = new Conn();
                            String radio = null;
                            
                            if(r1.isSelected()){ 
                                radio = "Male";
                            }
                            else if(r2.isSelected()){ 
                                radio = "Female";
                            }
                           
                          
                            try{
	    			String s9 = t7.getText(); //username
                    String s1 = t1id.getText(); //id
	    			String s2 =  t1.getText();//number
	    			String s3 =  t2.getText();//name
                    String s4 =  t1gender.getText();//gender
	    			String s5 =  t3.getText();//country
	    			String s7 =  t5.getText();  //address
                    String s8 =  t6.getText();//phone
                    String s10 = t8.getText(); //email
                                
                                String q1 = "update customer set t7='"+s9+"',t1id='"+s1+"', t1='"+s2+"',t2='"+s3+"',t1gender='"+s4+"',t3='"+s5+"',t5='"+s7+"',t6='"+s8+"',t8='"+s10+"'";
                                c.s.executeUpdate(q1);
                                
	    			JOptionPane.showMessageDialog(null, "Customer Added Successfully");
                                setVisible(true);
	    		}catch(SQLException e1){
	    			System.out.println(e1.getMessage());
	    		}
		    		catch(NumberFormatException s){
		    			JOptionPane.showMessageDialog(null, "Please enter a valid Number");
			}
			}
		});
		btnNewButton.setBounds(100, 430, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            setVisible(false);
                            new Dashbrd().setVisible(true);
			}
		}); 
		btnExit.setBounds(260, 430, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
	}
}
*/
package travel.management.system;


import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class UpdateCustomer extends JFrame {
	Connection conn = null;
	PreparedStatement pst = null;
	private JPanel contentPane;
	private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateCustomer frame = new UpdateCustomer("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UpdateCustomer(String username) throws SQLException {
		System.out.println(username);
                setBounds(450, 100, 850, 550);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
                Image i3 = i1.getImage().getScaledInstance(200, 400,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(500,40,200,400);
                add(l1);
		
		JLabel lblName = new JLabel("UPDATE CUSTOMER DETAILS");
		lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		lblName.setBounds(118, 11, 300, 53);
		contentPane.add(lblName);
                
                JLabel l3 = new JLabel("Username :");
		l3.setBounds(35, 70, 200, 14);
		contentPane.add(l3);
                
                t1 = new JTextField();
		t1.setBounds(271, 70, 150, 20);
		contentPane.add(t1);
		t1.setColumns(10);
                
                JLabel lblId = new JLabel("ID :");
		lblId.setBounds(35, 110, 200, 14);
		contentPane.add(lblId);
                
                t2 = new JTextField();
		t2.setBounds(271, 110, 150, 20);
		contentPane.add(t2);
		t2.setColumns(10);
                
                JLabel l2 = new JLabel("Number :");
		l2.setBounds(35, 150, 200, 14);
		contentPane.add(l2);
                
                t3 = new JTextField();
		t3.setBounds(271, 150, 150, 20);
		contentPane.add(t3);
		t3.setColumns(10);
		
		JLabel lblName_1 = new JLabel("Name :");
		lblName_1.setBounds(35, 190, 200, 14);
		contentPane.add(lblName_1);
		
		t4 = new JTextField();
		t4.setBounds(271, 190, 150, 20);
		contentPane.add(t4);
		t4.setColumns(10);

                
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setBounds(35, 230, 200, 14);
		contentPane.add(lblGender);
                
                t5 = new JTextField();
		t5.setBounds(271, 230, 150, 20);
		contentPane.add(t5);
		t5.setColumns(10);
                
		JLabel lblCountry = new JLabel("Country :");
		lblCountry.setBounds(35, 270, 200, 14);
		contentPane.add(lblCountry);
                
                t6 = new JTextField();
		t6.setBounds(271, 270, 150, 20);
		contentPane.add(t6);
		t6.setColumns(10);
		
		JLabel lblReserveRoomNumber = new JLabel("Permanent Address :");
		lblReserveRoomNumber.setBounds(35, 310, 200, 14);
		contentPane.add(lblReserveRoomNumber);
                
                t7 = new JTextField();
		t7.setBounds(271, 310, 150, 20);
		contentPane.add(t7);
		t7.setColumns(10);
           	
		JLabel lblCheckInStatus = new JLabel("Phone :");
		lblCheckInStatus.setBounds(35, 350, 200, 14);
		contentPane.add(lblCheckInStatus);
                
                t8 = new JTextField();
		t8.setBounds(271, 350, 150, 20);
		contentPane.add(t8);
		t8.setColumns(10);
		
		JLabel lblDeposite = new JLabel("Email :");
		lblDeposite.setBounds(35, 390, 200, 14);
		contentPane.add(lblDeposite);
		
		t9 = new JTextField();
		t9.setBounds(271, 390, 150, 20);
		contentPane.add(t9);
		t9.setColumns(10);
		
		
                try{
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from customer where s9 = '"+username+"'");
                    if(rs.next()){
                        t1.setText(rs.getString("s9"));  
                        t2.setText(rs.getString("s1"));
                        t3.setText(rs.getString("s2"));  
                        t4.setText(rs.getString("s3"));
                        t5.setText(rs.getString("s4"));  
                        t6.setText(rs.getString("s5"));
                        t7.setText(rs.getString("s7"));  
                        t8.setText(rs.getString("s8"));
                        t9.setText(rs.getString("s10"));
                    }
                }catch(Exception e){ }
		
		

		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            Conn c = new Conn();
                           
                          
                            try{
	    			String s1 = t1.getText();
                                String s2 = t2.getText(); 
	    			String s3 =  t3.getText();
	    			String s4 =  t4.getText();
                                String s5 =  t5.getText();
	    			String s6 =  t6.getText();
	    			String s7 =  t7.getText(); 
                                String s8 =  t8.getText();
                                String s9 = t9.getText(); 
                                
                                String q1 = "update customer set s1 = '"+s2+"', s2 = '"+s3+"', s3 = '"+s4+"', s4 = '"+s5+"', s5 = '"+s6+"', s7 = '"+s7+"', s8 = '"+s8+"', s10 = '"+s9+"' where s9 = '"+s1+"'";
                                c.s.executeUpdate(q1);
                                
	    			JOptionPane.showMessageDialog(null, "Customer Detail Updated Successfully");
                                setVisible(false);
                                //new Dashbrd().setVisible(true);
	    		}catch(SQLException e1){
	    			System.out.println(e1.getMessage());
	    		}
		    		catch(NumberFormatException s){
		    			JOptionPane.showMessageDialog(null, "Please enter a valid Number");
			}
			}
		});
		btnNewButton.setBounds(100, 430, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            setVisible(false);
                           // new Dashbrd().setVisible(true);
			}
		}); 
		btnExit.setBounds(260, 430, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
	}
}