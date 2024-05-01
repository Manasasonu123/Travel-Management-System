
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.*;
public class View extends JFrame implements ActionListener{
    JButton back;
    View(String username){
        setBounds(450,100,870,625);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername=new JLabel("username");
        lblusername.setBounds(10, 10, 69, 14);
        add(lblusername);
        
        JLabel labelusername=new JLabel();
        labelusername.setBounds(200, 10, 69, 14);
        add(labelusername);
        //
       JLabel lblCleanStatus = new JLabel("Id Type");
       lblCleanStatus.setBounds(10, 60, 69, 14);
       add(lblCleanStatus);
        
        JLabel labelid=new JLabel();
        labelid.setBounds(200, 60, 69, 14);
        add(labelid);
        //
        JLabel lblnum = new JLabel("Number");
       lblnum.setBounds(10, 110, 69, 14);
       add(lblnum);
        
        JLabel labelnum=new JLabel();
        labelnum.setBounds(200, 110, 69, 14);
        add(labelnum);
        //
        JLabel lblname = new JLabel("Name");
       lblname.setBounds(10, 160, 69, 14);
       add(lblname);
        
        JLabel labelname=new JLabel();
        labelname.setBounds(200, 160, 69, 14);
        add(labelname);
        //
        JLabel lblgend = new JLabel("Gender");
       lblgend.setBounds(10, 210, 69, 14);
       add(lblgend);
        
        JLabel labelgend=new JLabel();
        labelgend.setBounds(200, 210, 69, 14);
        add(labelgend);
        //
        JLabel lblctry = new JLabel("Country");
       lblctry.setBounds(450, 10, 69, 14);
       add(lblctry);
        
        JLabel labelctry=new JLabel();
        labelctry.setBounds(600, 10, 69, 14);
        add(labelctry);
        //
           JLabel lbladd = new JLabel("Address");
       lbladd.setBounds(450, 60, 69, 14);
       add(lbladd);
        
        JLabel labeladd=new JLabel();
        labeladd.setBounds(600, 60, 69, 14);
        add(labeladd);
        //
           JLabel lblph = new JLabel("Phone no");
       lblph.setBounds(450, 110, 69, 14);
       add(lblph);
        
        JLabel labelph=new JLabel();
        labelph.setBounds(600, 110, 69, 14);
        add(labelph);
        //
           JLabel lblma = new JLabel("Email");
       lblma.setBounds(450, 160, 69, 14);
       add(lblma);
        
        JLabel labelma=new JLabel();
        labelma.setBounds(600, 160, 69, 14);
        add(labelma);
     
        back=new JButton("back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(360,300,100,25);
        back.addActionListener(this);
        add(back);
        
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
                Image i3 = i1.getImage().getScaledInstance(600, 200,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(35,400,800,200);
                add(l1);
                
                
        try{
            Conn conn=new Conn();
            String qry="select * from customer where s9='"+username+"' ";
            ResultSet rs=conn.s.executeQuery(qry);
            while(rs.next()){
                labelusername.setText(rs.getNString("s9"));
                labelid.setText(rs.getNString("s1"));
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
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == back){
                this.setVisible(false);
                //new Dashbrd().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new View("Divya");
    }
}
