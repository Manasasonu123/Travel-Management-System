
package travel.management.system;
import javax.swing.*;
import java.awt.*;
public class Loading extends JFrame implements Runnable {
    Thread t;
    JProgressBar bar;
    
    public void run()
    {
        try{
            for(int i=1;i<101;i++){
                int max=bar.getMaximum();
                int value=bar.getValue();
                
                if(value<max){
                    bar.setValue(bar.getValue()+1);
                }else
                {
                    setVisible(false);
                    //new Dashbrd().setVisible(true);
                }
                Thread.sleep(50);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public Loading(){
        t=new Thread(this);
        setBounds(500,200,650,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel txt=new JLabel("Travel and Tourism application");
        txt.setBounds(50,20,600,40);
        txt.setForeground(Color.BLUE);
        txt.setFont(new Font("Railway",Font.BOLD,35));
        add(txt);
        
        JProgressBar bar=new JProgressBar();
        bar.setBounds(150,100,300,35);
        add(bar);
        bar.setStringPainted(true);
        
        JLabel txt1=new JLabel("Please wait......");
        txt1.setBounds(200,130,150,40);
        txt1.setForeground(Color.red);
        txt1.setFont(new Font("Railway",Font.BOLD,20));
        add(txt1);
        
        JLabel txt2=new JLabel("welcome");
        txt2.setBounds(20,310,400,40);
        txt2.setForeground(Color.red);
        txt2.setFont(new Font("Railway",Font.BOLD,16));
        add(txt2);
        
        t.start();
        setVisible(true);
    }
   public static void main(String[] args) {
       new Loading();
   }
}
