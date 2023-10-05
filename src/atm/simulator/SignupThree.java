
package atm.simulator;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class SignupThree extends JFrame implements ActionListener {
    
    JRadioButton SB,RD,CB,FD;
    JCheckBox statement, CB_card, DB_card , Cheque_book, Internet_banking, sms_alert, terms_condition;
    JButton submit, cancel;
    String formno;
    
    SignupThree(String form_no){
        this.formno = form_no;
         setLayout(null);
        
        
        
        
        
        JLabel account_details = new JLabel("Section- C : Account Details");
        account_details.setFont(new Font("Raleway", Font.BOLD, 20));
        account_details.setBounds(250, 40, 600, 30);
        add(account_details);
        
        
        JLabel account_type = new JLabel("Section- C : Account Type");
        account_type.setFont(new Font("Raleway", Font.BOLD, 20));
        account_type.setBounds(100, 100, 600, 30);
        add(account_type);
        
        SB = new JRadioButton("Saving Accounts");
        SB.setFont(new Font("Raleway", Font.BOLD, 15));
        SB.setBackground(Color.WHITE);
        SB.setBounds(100, 150, 200, 30);
        add(SB);
        
        RD = new JRadioButton("Reccuring Deposit");
        RD.setFont(new Font("Raleway", Font.BOLD, 15));
        RD.setBackground(Color.WHITE);
        RD.setBounds(350, 150, 200, 30);
        add(RD);
        
        FD = new JRadioButton("Fixed Deposit");
        FD .setFont(new Font("Raleway", Font.BOLD, 15));
        FD .setBackground(Color.WHITE);
        FD .setBounds(100, 190, 200, 30);
        add(FD );
        
        CB = new JRadioButton("Current Accounts");
        CB.setFont(new Font("Raleway", Font.BOLD, 15));
        CB.setBackground(Color.WHITE);
        CB.setBounds(350, 190, 200, 30);
        add(CB);
        
        ButtonGroup account_group = new ButtonGroup();
        account_group.add(SB);
        account_group.add(RD);
        account_group.add(FD);
        account_group.add(CB);
        
        
        JLabel card_no = new JLabel("Card Number: ");
        card_no.setFont(new Font("Raleway", Font.BOLD, 20));
        card_no.setBounds(100, 250, 600, 30);
        add(card_no);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-7865");
        number.setFont(new Font("Raleway", Font.BOLD, 20));
        number.setBounds(300, 250, 600, 30);
        add(number);
        
        JLabel CARD_INFO = new JLabel("(Your 16 digit card no)");
        CARD_INFO.setFont(new Font("Raleway", Font.BOLD, 12));
        CARD_INFO.setBounds(100, 280, 600, 30);
        add(CARD_INFO);
        
        JLabel pin_no = new JLabel("Pin Number: ");
        pin_no.setFont(new Font("Raleway", Font.BOLD, 20));
        pin_no.setBounds(100, 320, 600, 30);
        add(pin_no);
        
        JLabel pin_number = new JLabel("XXXX");
        pin_number.setFont(new Font("Raleway", Font.BOLD, 20));
        pin_number.setBounds(300, 320, 600, 30);
        add(pin_number);
        
        JLabel pin_info = new JLabel("(Your 4 digit pin no)");
        pin_info.setFont(new Font("Raleway", Font.BOLD, 12));
        pin_info.setBounds(100, 350, 600, 30);
        add(pin_info);
        
        JLabel services_req = new JLabel("Services Required");
        services_req.setFont(new Font("Raleway", Font.BOLD, 20));
        services_req.setBounds(100, 400, 600, 30);
        add(services_req);
        
        
        // JCheckBox DB_card, CB_card, Cheque_book, Internet_banking;
        DB_card = new JCheckBox("Debit Card");
        DB_card .setBackground(Color.white);
        DB_card .setFont(new Font("Raleway", Font.BOLD, 15));
        DB_card .setBounds(100, 450, 200, 30);
        add(DB_card );
        
        CB_card = new JCheckBox("Credit Card");
        CB_card.setBackground(Color.white);
        CB_card.setFont(new Font("Raleway", Font.BOLD, 15));
        CB_card.setBounds(100, 500, 200, 30);
        add(CB_card);
        
        statement = new JCheckBox("E-Statement");
        statement.setBackground(Color.white);
        statement.setFont(new Font("Raleway", Font.BOLD, 15));
        statement.setBounds(300, 450, 200, 30);
        add(statement);
        
        sms_alert = new JCheckBox("SMS Alert");
        sms_alert.setBackground(Color.white);
        sms_alert.setFont(new Font("Raleway", Font.BOLD, 15));
        sms_alert.setBounds(300, 500, 200, 30);
        add(sms_alert);
        
        Cheque_book = new JCheckBox("Cheque Book");
        Cheque_book.setBackground(Color.white);
        Cheque_book.setFont(new Font("Raleway", Font.BOLD, 15));
        Cheque_book.setBounds(500, 500, 200, 30);
        add(Cheque_book);
        
        Internet_banking = new JCheckBox("Internet Banking");
        Internet_banking.setBackground(Color.white);
        Internet_banking.setFont(new Font("Raleway", Font.BOLD, 15));
        Internet_banking.setBounds(500, 450, 200, 30);
        add(Internet_banking);
        
        
        JLabel declaration = new JLabel("Self Declaration:- ");
        declaration.setFont(new Font("Raleway", Font.BOLD, 20));
        declaration.setBounds(100, 550, 600, 30);
        add(declaration);
        
        terms_condition = new JCheckBox("I hereby declare that above information is true and correct to best of my knowledge and belief.");
        terms_condition.setBackground(Color.white);
        terms_condition.setFont(new Font("Raleway", Font.BOLD, 12));
        terms_condition.setBounds(100, 600, 1000, 30);
        add(terms_condition);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Raleway" , Font.BOLD, 15));
        submit.setBounds(600, 700, 200, 30);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Raleway" , Font.BOLD, 15));
        cancel.setBounds(100, 700, 200, 30);
        add(cancel);
        
        
        
        
                
        
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(1000, 1000);
        setLocation(350,10);
        setVisible(true);
    }
    // JRadioButton SB,RD,CB,FD;
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==submit){
            String account_type_db = null;
            if(SB.isSelected()){
                account_type_db = "Saving Account";
            } else if(RD.isSelected()){
                account_type_db = "Reccuring Deposit";
            } else if(CB.isSelected()){
                account_type_db = "Current Account";
            } else if(FD.isSelected()){
                account_type_db = "Fixed Deposit";
            }
            
            Random random = new Random();
            String card_number_db = ""+ Math.abs((random.nextLong() % 90000000L) + 6080436300000000L);
            
            String pin_number_db = ""+ Math.abs((random.nextLong()% 9000L) + 1000L);
            String form_no = "";
            
            String facility_db = "";
            //  JCheckBox statement, CB_card, DB_card , Cheque_book, Internet_banking, sms_alert, terms_condition;
            if(statement.isSelected()){
                facility_db = facility_db + "E-Statement";
            }else if(sms_alert.isSelected()){
                facility_db = facility_db + "SMS Alert";
            }else if(CB_card.isSelected()){
                facility_db = facility_db + "Credit Card";
            }else if(DB_card.isSelected()){
                facility_db = facility_db + "Debit Card";
            }else if(Cheque_book.isSelected()){
                facility_db = facility_db + "Cheque Book";
            }else if(Internet_banking.isSelected()){
                facility_db = facility_db + "Internet Banking";
            }else if(sms_alert.isSelected()){
                facility_db = facility_db + "SMS Alert";
            }
            
            try{
               
                   
                
                    Conn connection = new Conn();
                   String query1 = "insert into signupthree values ('"+form_no+"', '"+account_type_db+"', '"+card_number_db+"',"
                         + " '"+pin_number_db+"', '"+facility_db+"')";
                   String query2 = "insert into login values ('"+form_no+"', '"+card_number_db+"','"+pin_number_db+"')";
                  connection.s.executeUpdate(query1);
                  connection.s.executeUpdate(query2);
                  
                  JOptionPane.showMessageDialog(null, "Card Number: " + card_number_db + "\n Pin: " + pin_number_db  );
                
                
            } catch(Exception e){
                System.out.println(e);
            }
            
        } else if(ae.getSource()==cancel){
            
        }
    }
    
    public static void main(String args[]){
        new SignupThree("");
    }
    
}
