/*
package travel.management.system;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
public class BookPackage extends JFrame {
    
    Choice cpak;
    JTextField tf;
    BookPackage(String username){
        setBounds(350,200,1100,500);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel txt=new JLabel("Book Package");
        txt.setBounds(100,10,200,30);
        txt.setFont(new Font("Tahoma",Font.BOLD,20));
        add(txt);
        
        
              JLabel lblusername=new JLabel("username");
        lblusername.setBounds(10, 60, 69, 14);
        add(lblusername);
        
        JLabel labelusername=new JLabel();
        labelusername.setBounds(200, 60, 69, 14);
        add(labelusername);
        //
       JLabel lblCleanStatus = new JLabel("Select Package");//lblpackage
       lblCleanStatus.setBounds(10, 120, 140, 14);
       add(lblCleanStatus);
        
        cpak=new Choice();
        cpak.add("GOLD PACKAGE");
        cpak.add("SILVER PACKAGE");
        cpak.add("BRONZE PACKAGE");
        cpak.setBounds(200,120,200,20);
        add(cpak);
        //
          JLabel lblnum = new JLabel("Total persons");//lblperson
       lblnum.setBounds(10, 180, 69, 14);
       add(lblnum);
        
       tf=new JTextField();
       tf.setBounds(200,180,200,20);
       add(tf);
      
        //
        JLabel lblname = new JLabel("ID");//lblid
       lblname.setBounds(10, 240, 69, 14);
       add(lblname);
        
        JLabel labelname=new JLabel();
        labelname.setBounds(200, 240, 69, 14);
        add(labelname);
        //
        JLabel lblgend = new JLabel("Number");//lblnum
       lblgend.setBounds(10, 300, 69, 14);
       add(lblgend);
        
        JLabel labelgend=new JLabel();
        labelgend.setBounds(200, 300, 69, 14);
        add(labelgend);
        //
        JLabel lblctry = new JLabel("Phone");//lblphone
       lblctry.setBounds(10, 360, 69, 14);
       add(lblctry);
        
        JLabel labelctry=new JLabel();
        labelctry.setBounds(200, 360, 69, 14);
        add(labelctry);
        //
           JLabel lbladd = new JLabel("Total Price");//lbltotal
       lbladd.setBounds(10, 420, 69, 14);
       add(lbladd);
        
        JLabel labeladd=new JLabel();//labelprice
        labeladd.setBounds(200, 420, 69, 14);
        add(labeladd);
        //
         try{
            Conn conn=new Conn();
            String qry="select * from customer where s9='"+username+"' ";
            ResultSet rs=conn.s.executeQuery(qry);
            while(rs.next()){
                labelusername.setText(rs.getNString("s9"));
                lblCleanStatus.setText(rs.getNString("s1"));
                labelnum.setText(rs.getNString("s2"));
                labelname.setText(rs.getNString("s3"));
                labelgend.setText(rs.getNString("s4"));
                labelctry.setText(rs.getNString("s5"));
                labeladd.setText(rs.getNString("s7"));
                labelph.setText(rs.getNString("s8"));
                labelma.setText(rs.getNString("s10"));
            }
        }catch(Exception e){
            
        }
        
        
        setVisible(true);
    }
    public static void main(String[] args) {
        new BookPackage();
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
public class BookPackage extends JFrame {
	private JPanel contentPane;
        JTextField t1,t2;
        Choice c1,c2,c3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookPackage frame = new BookPackage("Divya");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BookPackage(String username) {
		setBounds(450, 100, 1100, 450);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
                Image i3 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel la1 = new JLabel(i2);
                la1.setBounds(450,50,700,300);
                add(la1);
		
		JLabel lblName = new JLabel("BOOK PACKAGE");
		lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		lblName.setBounds(118, 11, 300, 53);
		contentPane.add(lblName);
                
                JLabel la2 = new JLabel("Username :");
		la2.setBounds(35, 70, 200, 14);
		contentPane.add(la2);
                
                JLabel l1 = new JLabel(username);
		l1.setBounds(271, 70, 200, 14);
		contentPane.add(l1);
                
                JLabel lblId = new JLabel("Select Package :");
		lblId.setBounds(35, 110, 200, 14);
		contentPane.add(lblId);
                
                c1 = new Choice();
                c1.add("Gold Package");
                c1.add("Silver Package");
                c1.add("Bronze Package");
                c1.setBounds(271, 110, 150, 30);
                add(c1);
                
                JLabel la3 = new JLabel("Total Persons");
		la3.setBounds(35, 150, 200, 14);
		contentPane.add(la3);
                
                t1 = new JTextField();
                t1.setText("0");
		t1.setBounds(271, 150, 150, 20);
		contentPane.add(t1);
		t1.setColumns(10);
                
		JLabel lbl1 = new JLabel("ID :");
		lbl1.setBounds(35, 190, 200, 14);
		contentPane.add(lbl1);
                
                JLabel l2 = new JLabel();
		l2.setBounds(271, 190, 200, 14);
		contentPane.add(l2);
		
		JLabel lbl2 = new JLabel("Number :");
		lbl2.setBounds(35, 230, 200, 14);
		contentPane.add(lbl2);
                
                JLabel l3 = new JLabel();
		l3.setBounds(271, 230, 200, 14);
		contentPane.add(l3);
           	
		JLabel lbl3 = new JLabel("Phone :");
		lbl3.setBounds(35, 270, 200, 14);
		contentPane.add(lbl3);
                
                JLabel l4 = new JLabel();
		l4.setBounds(271, 270, 200, 14);
		contentPane.add(l4);

		
		JLabel lblDeposite = new JLabel("Total Price :");
		lblDeposite.setBounds(35, 310, 200, 14);
		contentPane.add(lblDeposite);
		
		JLabel l5 = new JLabel();
		l5.setBounds(271, 310, 200, 14);
                l5.setForeground(Color.RED);
		contentPane.add(l5);
                
                try{
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from customer where s9 = '"+username+"'");
                    while(rs.next()){
                        l2.setText(rs.getString("s1"));
                        l3.setText(rs.getString("s2"));
                        l4.setText(rs.getString("s8"));
                        
                    }

                    rs.close();
                }catch(SQLException e){}
                
                JButton b1 = new JButton("Check Price");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            String p = c1.getSelectedItem();
                            int cost = 0;
                            if(p.equals("Gold Package")) {
                                cost += 12000;
                            }if(p.equals("Silver Package")){
                                cost += 25000;
                            }else if(p.equals("Bronze Package")){
                                cost += 32000;
                            }
                            
                            cost *= Integer.parseInt(t1.getText());
                            l5.setText("Rs "+cost);
                            
                        }
		});
		b1.setBounds(50, 350, 120, 30);
                b1.setBackground(Color.BLACK);
                b1.setForeground(Color.WHITE);
		contentPane.add(b1);
		

		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            Conn c = new Conn();
                           
                          
                            try{
	    			String s1 = c1.getSelectedItem(); 
                                
                                String q1 = "insert into bookPackage values('"+username+"', '"+c1.getSelectedItem()+"', '"+t1.getText()+"', '"+l2.getText()+"', '"+l3.getText()+"', '"+l4.getText()+"', '"+l5.getText()+"')";
                                c.s.executeUpdate(q1);
                                
	    			JOptionPane.showMessageDialog(null, "Package Booked Successfully");
                                setVisible(false);
                                //new Dashbrd().setVisible(true);
                            }catch(Exception ee){
	    			System.out.println(ee.getMessage());
                            }
                            
			}
		});
		btnNewButton.setBounds(200, 350, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            setVisible(false);
                            //new Dashbrd().setVisible(true);
			}
		}); 
		btnExit.setBounds(350, 350, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
	}
}