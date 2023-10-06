
package atm.simulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Withdrawal extends JFrame implements ActionListener {
    JButton withdraw, back;
    JTextField amount;
    String pinno_;
    Withdrawal(String pin_no){
        this.pinno_ = pin_no;
        
         setLayout(null);
         ImageIcon atm_interface = new ImageIcon(ClassLoader.getSystemResource("atm/simulator/atm_1.jpg"));
          Image atm_interface2 = atm_interface.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
          ImageIcon atm_interface3= new ImageIcon(atm_interface2);
          JLabel image = new JLabel(atm_interface3);
        image.setBounds(0, 0, 900, 900);
        setUndecorated(true);
        add(image);
        
        JLabel amt_deposit = new JLabel("Enter the amount you want to withdraw");
        amt_deposit.setBounds(200,320,700, 35);
         amt_deposit.setForeground(Color.WHITE);
         amt_deposit.setFont(new Font("Raleway", Font.BOLD,15));
        image.add(amt_deposit);
        
        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD,15));
        amount.setBounds(180,370,300, 35);
        image.add(amount);
        
        withdraw = new JButton("Withdraw");
        withdraw.setBounds(355,550,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        back = new JButton("Back");
        back.setBounds(180,550,150,30);
        back.addActionListener(this);
        image.add(back);
        
        
                
        
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== withdraw){
            String amount_db = amount.getText();
            Date date = new Date();
            if(amount_db.equals("")){
                 JOptionPane.showMessageDialog(null,  "Please enter the amount you want to withdraw");
            } else{
                try{
                      Conn connection = new Conn();
                String query = "insert into bank values('"+pinno_+"', '"+date+"', 'Withdrawal', '"+amount_db+"')";
                connection.s.executeUpdate(query);
                 JOptionPane.showMessageDialog(null,  "Rs " + amount_db + " Withdrawan Successfully");
                 setVisible(false);
                 new Transactions(pinno_).setVisible(true);
                } catch(Exception e){
                    System.out.println(e);
                }
              
                
            }
        } else if(ae.getSource()==back){
            setVisible(false);
            new Transactions(pinno_).setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new Withdrawal("");
    }
    
}
