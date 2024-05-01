package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.*;

public class Dashbrd extends JFrame implements ActionListener{
    //JButton addPerDet,upPerDet,checkpack,dePerDet,bookpack,viewpack,viewhotel,bookhotel,viewbookhotel,destin,pay,calc,map,about;
    JButton addPerDet,viPerDet,upPerDet,bookpack,destin,checkpack,bookhotel,viewbookhotel,viewpack,viewhotel,dePerDet,about;
    String username;
    Dashbrd(String username){
        this.username=username;
        setForeground(Color.CYAN);
        setLayout(null);
    	setExtendedState(JFrame.MAXIMIZED_BOTH);
    	setLayout(null);
    	
    	
    	JPanel p1=new JPanel();
    	p1.setLayout(null);
    	p1.setBackground(new Color(0,0,102));
    	p1.setBounds(0,0,2400,65);
    	add(p1);
    	
    	ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
    	Image i2=i1.getImage().getScaledInstance(70,70 , Image.SCALE_DEFAULT);
    	ImageIcon i3=new ImageIcon(i2);
    	JLabel icon=new JLabel(i3);
    	icon.setBounds(5,0,70,70);
    	p1.add(icon);
    	
    	JLabel heading=new JLabel("Dashboard");
    	heading.setBounds(80,10,300,40);
    	heading.setForeground(Color.WHITE);
    	heading.setFont(new Font("Tahoma",Font.BOLD,25));
    	p1.add(heading);
    	
    	JPanel p2=new JPanel();
    	p2.setLayout(null);
    	p2.setBackground(new Color(0,0,102));
    	p2.setBounds(0,65,250,900);
    	add(p2);
    	
    	addPerDet=new JButton("Add Personal Details");
        addPerDet.addActionListener(this);
    	addPerDet.setBounds(0,0,250,50);
    	addPerDet.setBackground(new Color(0,0,102));
    	addPerDet.setForeground(Color.WHITE);
    	addPerDet.setFont(new Font("Tahoma",Font.PLAIN,15));
    	//addPerDet.setMargin(new Insets(0,0,0,50));
    	p2.add(addPerDet);
    	
    	upPerDet=new JButton("Update Personal Details");
    	upPerDet.setBounds(0,50,250,50);
        upPerDet.setBackground(new Color(0,0,102));
    	upPerDet.setForeground(Color.WHITE);
    	upPerDet.setFont(new Font("Tahoma",Font.PLAIN,15));
    	//upPerDet.setMargin(new Insets(0,0,0,50));
        upPerDet.addActionListener(this);
    	p2.add(upPerDet);
    	
    	viPerDet=new JButton("View Personal Details");
    	viPerDet.setBounds(0,100,250,50);
        viPerDet.setBackground(new Color(0,0,102));
    	viPerDet.setForeground(Color.WHITE);
    	viPerDet.setFont(new Font("Tahoma",Font.PLAIN,15));
    	//viPerDet.setMargin(new Insets(0,0,0,50));
        viPerDet.addActionListener(this);
    	p2.add(viPerDet);
    	
    	dePerDet=new JButton("Delete Personal Details");
        dePerDet.addActionListener(this);
    	dePerDet.setBounds(0,150,250,50);
    	dePerDet.setBackground(new Color(0,0,102));
    	dePerDet.setForeground(Color.WHITE);
    	dePerDet.setFont(new Font("Tahoma",Font.PLAIN,15));
    	//viPerDet.setMargin(new Insets(0,0,0,50));
    	p2.add(dePerDet);
    	
    	checkpack=new JButton("Check Packages");
    	checkpack.setBounds(0,200,250,50);
    	checkpack.setBackground(new Color(0,0,102));
    	checkpack.setForeground(Color.WHITE);
    	checkpack.setFont(new Font("Tahoma",Font.PLAIN,15));
    	//viPerDet.setMargin(new Insets(0,0,0,50));
        checkpack.addActionListener(this);
    	p2.add(checkpack);
    	
    	 bookpack=new JButton("Book Package");
    	bookpack.setBounds(0,250,250,50);
    	bookpack.setBackground(new Color(0,0,102));
    	bookpack.setForeground(Color.WHITE);
    	bookpack.setFont(new Font("Tahoma",Font.PLAIN,15));
    	//viPerDet.setMargin(new Insets(0,0,0,50));
        bookpack.addActionListener(this);
    	p2.add(bookpack);
    	
    	viewpack=new JButton("View Package");
    	viewpack.setBounds(0,300,250,50);
    	viewpack.setBackground(new Color(0,0,102));
    	viewpack.setForeground(Color.WHITE);
    	viewpack.setFont(new Font("Tahoma",Font.PLAIN,15));
    	//viPerDet.setMargin(new Insets(0,0,0,50));
        viewpack.addActionListener(this);
    	p2.add(viewpack);
    	
    	viewhotel=new JButton("View Hotels");
    	viewhotel.setBounds(0,350,250,50);
    	viewhotel.setBackground(new Color(0,0,102));
    	viewhotel.setForeground(Color.WHITE);
    	viewhotel.setFont(new Font("Tahoma",Font.PLAIN,15));
    	//viPerDet.setMargin(new Insets(0,0,0,50));
        viewhotel.addActionListener(this);
    	p2.add(viewhotel);
    	
    	 bookhotel=new JButton("Book Hotels");
    	 bookhotel.setBounds(0,400,250,50);
    	 bookhotel.setBackground(new Color(0,0,102));
    	 bookhotel.setForeground(Color.WHITE);
    	 bookhotel.setFont(new Font("Tahoma",Font.PLAIN,15));
    	//viPerDet.setMargin(new Insets(0,0,0,50));
        bookhotel.addActionListener(this);
    	p2.add( bookhotel);
 
    	viewbookhotel=new JButton("View Booked Hotels");
    	viewbookhotel.setBounds(0,450,250,50);
    	viewbookhotel.setBackground(new Color(0,0,102));
    	viewbookhotel.setForeground(Color.WHITE);
    	viewbookhotel.setFont(new Font("Tahoma",Font.PLAIN,15));
    	//viPerDet.setMargin(new Insets(0,0,0,50));
        viewbookhotel.addActionListener(this);
    	p2.add(viewbookhotel);
    	
    	destin=new JButton("Destinations");
    	destin.setBounds(0,500,250,50);
    	destin.setBackground(new Color(0,0,102));
    	destin.setForeground(Color.WHITE);
    	destin.setFont(new Font("Tahoma",Font.PLAIN,15));
    	//viPerDet.setMargin(new Insets(0,0,0,50));
        destin.addActionListener(this);
    	p2.add(destin);
    	
    	JButton pay=new JButton("Payments");
    	pay.setBounds(0,550,250,50);
    	pay.setBackground(new Color(0,0,102));
    	pay.setForeground(Color.WHITE);
    	pay.setFont(new Font("Tahoma",Font.PLAIN,15));
    	//viPerDet.setMargin(new Insets(0,0,0,50));
    	p2.add(pay);
    	
    	JButton calc=new JButton("Calculator");
    	calc.setBounds(0,600,250,50);
    	calc.setBackground(new Color(0,0,102));
    	calc.setForeground(Color.WHITE);
    	calc.setFont(new Font("Tahoma",Font.PLAIN,15));
    	//viPerDet.setMargin(new Insets(0,0,0,50));
    	p2.add(calc);
    	
    	JButton map=new JButton("Map");
    	map.setBounds(0,650,250,50);
    	map.setBackground(new Color(0,0,102));
    	map.setForeground(Color.WHITE);
    	map.setFont(new Font("Tahoma",Font.PLAIN,15));
    	//viPerDet.setMargin(new Insets(0,0,0,50));
    	p2.add(map);
    	
    	about=new JButton("About");
    	about.setBounds(0,700,250,40);
    	about.setBackground(new Color(0,0,102));
    	about.setForeground(Color.WHITE);
    	about.setFont(new Font("Tahoma",Font.PLAIN,15));
    	//viPerDet.setMargin(new Insets(0,0,0,50));
        about.addActionListener(this);
    	p2.add(about);

    	ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
    	Image i5=i4.getImage().getScaledInstance(3000, 900,Image.SCALE_DEFAULT);
    	ImageIcon i6=new ImageIcon(i5);
    	JLabel image=new JLabel(i6);
    	image.setBounds(0,0,2400,900);
    	add(image);
    	
    	JLabel text=new JLabel("Travel and Tourism Management system");
    	text.setBounds(500,70,1000,70);
    	text.setForeground(Color.WHITE);
    	text.setFont(new Font("Raleway",Font.BOLD,40));
    	image.add(text);
    	
    	
    	setVisible(true);
        
      
    }
    public void actionPerformed(ActionEvent ae){
        try{
            if(ae.getSource()==addPerDet){
                this.setVisible(true);
                new AddCustomer1(username).setVisible(true);
            }
               if(ae.getSource()==viPerDet){
                this.setVisible(true);
                new View(username).setVisible(true);
            }
               if(ae.getSource()==upPerDet){
                   this.setVisible(true);
                   new UpdateCustomer(username).setVisible(true);
               }
               if(ae.getSource()==bookpack){
                   this.setVisible(true);
                   new BookPackage(username).setVisible(true);
               }
               if(ae.getSource()==destin){
                   this.setVisible(true);
                   new Dsetination().setVisible(true);
               }
               if(ae.getSource()==checkpack){
                   this.setVisible(true);
                   new CheckPackage().setVisible(true);
               }
               if(ae.getSource()==bookhotel){
                   this.setVisible(true);
                   new BookHotel(username).setVisible(true);
               }if(ae.getSource()==viewbookhotel){
                   this.setVisible(true);
                   new ViewBookedHotel(username).setVisible(true);
               }
               if(ae.getSource()==viewpack){
                   this.setVisible(true);
                   new ViewPackage(username).setVisible(true);
               }
               if(ae.getSource()==viewhotel){
                   this.setVisible(true);
                   new ViewHotel().setVisible(true);
               }
               if(ae.getSource()==dePerDet){
                   this.setVisible(true);
                   new DeleteCustomer().setVisible(true);
               }
               if(ae.getSource()==about){
                   this.setVisible(true);
                   new About().setVisible(true);
               }
                
        }catch(Exception e){
            System.out.println(e);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new Dashbrd("").setVisible(true);
	}

}
