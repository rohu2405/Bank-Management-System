
package atm.simulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
 
public class Transactions extends JFrame implements ActionListener {
    
    JButton deposit,withdrawal,mini_statement,fast_cash,pin_change,balance_inquiry, exit;
    String pin_number;
    
    Transactions(String pinno){
        this.pin_number = pinno;
        
        setLayout(null);
         ImageIcon atm_interface = new ImageIcon(ClassLoader.getSystemResource("atm/simulator/atm_1.jpg"));
          Image atm_interface2 = atm_interface.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
          ImageIcon atm_interface3= new ImageIcon(atm_interface2);
          JLabel image = new JLabel(atm_interface3);
        image.setBounds(0, 0, 900, 900);
       
       
        add(image);
        
        
        JLabel text = new JLabel("Please select your transaction");
        text.setBounds(220,320,700, 35);
         text.setForeground(Color.WHITE);
         text.setFont(new Font("Raleway", Font.BOLD,15));
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(170,450,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
         withdrawal = new JButton("Cash Withdrawal");
        withdrawal.setBounds(170,485,150,30);
        withdrawal.addActionListener(this);
        image.add(withdrawal);
        
         mini_statement = new JButton("Mini Statement");
        mini_statement.setBounds(355,450,150,30);
        mini_statement.addActionListener(this);
        image.add(mini_statement);
        
        fast_cash = new JButton("Fast Cash");
        fast_cash.setBounds(170,520,150,30);
         fast_cash.addActionListener(this);
        image.add(fast_cash);
        
        pin_change = new JButton("Pin Change");
        pin_change.setBounds(355,520,150,30);
         pin_change.addActionListener(this);
        image.add(pin_change);
        
        balance_inquiry = new JButton("Balance Enquiry");
        balance_inquiry.setBounds(355,485,150,30);
         balance_inquiry.addActionListener(this);
        image.add(balance_inquiry);
        
         exit = new JButton("Exit");
        exit.setBounds(260,560,150,30);
         exit.addActionListener(this);
        image.add(exit);
        
         
        setSize(900, 900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
       
    }
     public void actionPerformed(ActionEvent ae) {
         if(ae.getSource()== exit){
             System.exit(0);
         } else if(ae.getSource() == deposit){
             setVisible(false);
             new Deposit(pin_number).setVisible(true);
         } else if(ae.getSource()== withdrawal){
             setVisible(false);
             new Withdrawal(pin_number).setVisible(true);
         }
     }
    
    public static void main(String args[]){
        new Transactions("");
    }
    
}
