
package atm.simulator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
    JButton login,clear,sign_up;
    JTextField  card_no;
    JPasswordField pin_no;
    Login(){
        setTitle("ATM SIMULATOR");
        setLayout(null);
        
        ImageIcon logo1 = new ImageIcon(ClassLoader.getSystemResource("atm/simulator/bank.png"));
       Image logo2 = logo1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
       ImageIcon logo3 = new ImageIcon(logo2);
       JLabel label = new JLabel(logo3);
       label.setBounds(70, 10, 100, 100);
        add(label);
        
        JLabel text_title = new JLabel("Welcome to ATM SIMULATOR");
     text_title.setFont(new Font("Osward", Font.BOLD, 25));
        text_title.setBounds(200, 40, 500, 40);
        add(text_title);
        
        JLabel text_card = new JLabel("Card No: ");
     text_card.setFont(new Font("Railway", Font.BOLD, 20));
        text_card.setBounds(200, 100, 200, 40);
        add(text_card);
        
         card_no = new JTextField();
        card_no.setBounds(300, 100, 250, 40);
        card_no.setFont(new Font("Arial", Font.BOLD, 15));
        add(card_no);
        
        JLabel text_pin = new JLabel("Pin No: ");
     text_pin.setFont(new Font("Railway", Font.BOLD, 20));
        text_pin.setBounds(200, 150, 200, 40);
        add(text_pin);
        
         pin_no = new JPasswordField();
        pin_no.setBounds(300, 150, 250, 40);
        add(pin_no);
        
      login = new JButton("Sign In");
        login.setBounds(300, 200, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("Clear");
        clear.setBounds(450, 200, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
         sign_up = new JButton("Sign Up");
        sign_up.setBounds(300, 250, 250, 30);
        sign_up.setBackground(Color.BLACK);
        sign_up.setForeground(Color.WHITE);
        sign_up.addActionListener(this);
        add(sign_up);
        
        getContentPane().setBackground(Color.white);
       setSize(800, 500);
       setVisible(true);
       setLocation(350 , 200);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== clear){
            card_no.setText("");
            pin_no.setText("");
        } else if(ae.getSource()== login) {
            
        } else if(ae.getSource()== sign_up) {
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    public static void main(String args[]){
        new Login();
    }
}
