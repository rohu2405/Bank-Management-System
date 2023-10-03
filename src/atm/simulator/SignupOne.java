package atm.simulator;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
public class SignupOne extends JFrame implements ActionListener {
    long random;
    JTextField FORM_NO, C_name, fname, mname ,marital, email ,dob, address_name , city_name, state_name , pin , gender;
    JButton next;
    JRadioButton male,female,other,married,single,nother;
    JDateChooser date_choose;
    SignupOne(){
        setLayout(null);
        Random random_no = new Random();
       random = (Math.abs(random_no.nextLong() % 9000L) + 1000L);
        JLabel formno = new JLabel("Application Form No. " + random);
        formno.setFont(new Font("Railway", Font.BOLD, 35));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        JLabel personal_detail = new JLabel("Section- A : Personal Details");
        personal_detail.setFont(new Font("Railway", Font.BOLD, 20));
        personal_detail.setBounds(230, 80, 600, 30);
        add(personal_detail);
        
         JLabel applicant_name = new JLabel("Applicant Name: ");
        applicant_name.setFont(new Font("Railway", Font.BOLD, 15));
        applicant_name.setBounds(100, 150, 600, 30);
        add(applicant_name);
        
        C_name = new JTextField();
        C_name.setFont(new Font("Railway", Font.BOLD, 15));
        C_name.setBounds(220, 150, 400, 30);
        add(C_name);
        
         JLabel father_name = new JLabel("Father's Name: ");
        father_name.setFont(new Font("Railway", Font.BOLD, 15));
        father_name.setBounds(100, 190, 600, 30);
        add(father_name);
        
        fname = new JTextField();
        fname.setFont(new Font("Railway", Font.BOLD, 15));
        fname.setBounds(220, 190, 400, 30);
        add(fname);
        
         JLabel mother_name = new JLabel("Mother's Name: ");
        mother_name.setFont(new Font("Railway", Font.BOLD, 15));
        mother_name.setBounds(100, 230, 600, 30);
        add(mother_name);
        
        mname = new JTextField();
        mname.setFont(new Font("Railway", Font.BOLD, 15));
        mname.setBounds(220, 230, 400, 30);
        add(mname);
        
         JLabel dateof_birth = new JLabel("Date of Birth: ");
        dateof_birth.setFont(new Font("Railway", Font.BOLD, 15));
        dateof_birth.setBounds(100, 270, 600, 30);
        add(dateof_birth);
        
        date_choose = new JDateChooser();
        date_choose.setBounds(220, 270, 200, 30);
        add(date_choose);
        
        
        
         JLabel gender_j = new JLabel("Gender: ");
        gender_j.setFont(new Font("Railway", Font.BOLD, 15));
        gender_j.setBounds(100, 310, 600, 30);
        add(gender_j);
        
        male = new JRadioButton("Male");
        male.setBounds(220, 310, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
        
         female = new JRadioButton("Female");
        female.setBounds(300, 310, 80, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        other = new JRadioButton("Other");
        other.setBounds(400, 310, 80, 30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup gender_group = new ButtonGroup();
        gender_group.add(male);
        gender_group.add(female);
        gender_group.add(other);
        
        
        JLabel email_address = new JLabel("Email Address: ");
        email_address.setFont(new Font("Railway", Font.BOLD, 15));
        email_address.setBounds(100, 350, 600, 30);
        add(email_address);
        
        email = new JTextField();
        email.setFont(new Font("Railway", Font.BOLD, 15));
        email.setBounds(220, 350, 400, 30);
        add(email);
        
        JLabel marital_status = new JLabel("Marital Status: ");
        marital_status.setFont(new Font("Railway", Font.BOLD, 15));
        marital_status.setBounds(100, 390, 600, 30);
        add(marital_status);
        
        married = new JRadioButton("Married");
        married.setBounds(220, 390, 80, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
        single = new JRadioButton("Unmarried");
        single.setBounds(300, 390, 100, 30);
        single.setBackground(Color.WHITE);
        add(single);
        
        nother = new JRadioButton("Other");
        nother.setBounds(400, 390, 100, 30);
        nother.setBackground(Color.WHITE);
        add(nother);
        
         ButtonGroup marital_group = new ButtonGroup();
        marital_group.add(married);
        marital_group.add(single);
        marital_group.add(nother);
        
        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Railway", Font.BOLD, 15));
        address.setBounds(100, 430, 600, 30);
        add(address);
        
        address_name = new JTextField();
        address_name.setFont(new Font("Railway", Font.BOLD, 15));
        address_name.setBounds(220, 430, 400, 30);
        add(address_name);
        
        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Railway", Font.BOLD, 15));
        city.setBounds(100, 470, 600, 30);
        add(city);
        
        city_name = new JTextField();
        city_name.setFont(new Font("Railway", Font.BOLD, 15));
        city_name.setBounds(220, 470, 400, 30);
        add(city_name);
        
        JLabel State = new JLabel("State: ");
        State.setFont(new Font("Railway", Font.BOLD, 15));
        State.setBounds(100, 510, 600, 30);
        add(State);
        
        state_name = new JTextField();
        state_name.setFont(new Font("Railway", Font.BOLD, 15));
        state_name.setBounds(220, 510, 400, 30);
        add(state_name);
        
        JLabel pin_code = new JLabel("Zip Code: ");
        pin_code.setFont(new Font("Railway", Font.BOLD, 15));
        pin_code.setBounds(100, 550, 600, 30);
        add(pin_code);
        
        pin = new JTextField();
        pin.setFont(new Font("Railway", Font.BOLD, 15));
        pin.setBounds(220, 550, 400, 30);
        add(pin);
        
        
         next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        next.setFont(new Font("Raleway" , Font.BOLD, 15));
        next.setBounds(600, 650, 80, 30);
        
        add(next);
        
        
       
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350,10);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        String form_no = "" + random;
        String name_db = C_name.getText();
        String fname_db = fname.getText();
        String mname_db = mname.getText();
        String d_o_b = ((JTextField)date_choose.getDateEditor().getUiComponent()).getText();
        String gender_db = null;
        if(male.isSelected()){
            gender_db = "Male";
        } else if(female.isSelected()){
            gender_db = "Female";
        } else if(other.isSelected()){
            gender_db = "Other";
        }
        
        String email_db = email.getText();
        String marital_db = null;
        
         if(married.isSelected()){
            marital_db = "Married";
        } else if(single.isSelected()){
            marital_db = "Single";
        } else if(nother.isSelected()){
            marital_db = "Other";
        }
         
         String address_db = address_name.getText();
         String city_db = city_name.getText();
         String state_db = state_name.getText();
         String pin_db = pin.getText();
         
         try{
             if("".equals(name_db)){
                 JOptionPane.showMessageDialog(null, "Name is Required");
                
             } else{
                 Conn c = new Conn();
                
                 
                 String query = "insert into signup values ('"+form_no+"', '"+name_db+"', '"+fname_db+"',"
                         + " '"+mname_db+"', '"+marital_db+"', '"+d_o_b+"', '"+ gender_db+"', '"+email_db+"',"
                         + " '"+address_db+"', '"+city_db+"', '"+state_db+"', '"+pin_db+"')";
                  c.s.executeUpdate(query);
                  
                  setVisible(false);
                  new SignupTwo(form_no).setVisible(true);
             }
             
         } catch (Exception e){
             System.out.println(e);
             
         }
         
     //  JTextField name, fname, mname , email ,dob, address_name , city_name, state_name , pin;   
        /* '" + random+"',"
                         + " '"+name+"', '"+fname+"', '"+mname+"', '"+dob+"',"
                         + " '"+gender+"', '"+address_name+"', '"+city_name+"', "
                         + "'"+state_name+"', '"+pin+"');*/
    }
    
//    "String '" + variable+"'String"
   public static void main(String args[]){
        new SignupOne();
   }
}