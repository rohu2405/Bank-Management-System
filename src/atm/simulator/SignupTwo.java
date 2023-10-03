
package atm.simulator;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class SignupTwo extends JFrame implements ActionListener  {
    
    
    JTextField pannumber, aadharnumber;
    JRadioButton yes , no, YES, NO;
    JButton next;
    JComboBox religion_dropdown, category_dropdown, income_dropdown, education_dropdown, occupation_dropdown;
    
     String formno;
    SignupTwo(String form_no){
        this.formno = form_no;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - SECTION B");
        
        
        
        JLabel additional_details = new JLabel("Section- B : Additional Details");
        additional_details.setFont(new Font("Railway", Font.BOLD, 20));
        additional_details.setBounds(230, 80, 600, 30);
        add(additional_details);
        
         JLabel religion = new JLabel("Religion: ");
        religion.setFont(new Font("Railway", Font.BOLD, 15));
        religion.setBounds(100, 150, 600, 30);
        add(religion);
        
        String[] val_religion = {"Hindu", "Muslim", "Christian", "Jainism", "Buddhism", "Other"};
        religion_dropdown = new JComboBox(val_religion);
        religion_dropdown.setFont(new Font("Railway", Font.BOLD, 15));
        religion_dropdown.setBounds(250, 150, 400, 30);
        religion_dropdown.setBackground(Color.WHITE);
        add(religion_dropdown);
        
        
         JLabel category = new JLabel("Category: ");
        category.setFont(new Font("Railway", Font.BOLD, 15));
        category.setBounds(100, 190, 600, 30);
        add(category);
        
        String[] val_category = {"General", "OBC-NCL", "SC", "ST"};
         category_dropdown = new JComboBox(val_category);
        category_dropdown.setFont(new Font("Railway", Font.BOLD, 15));
        category_dropdown.setBounds(250, 190, 400, 30);
        category_dropdown.setBackground(Color.WHITE);
        add(category_dropdown);
        
        
         JLabel income = new JLabel("Income: ");
        income.setFont(new Font("Railway", Font.BOLD, 15));
        income.setBounds(100, 230, 600, 30);
        add(income);
        
        String[] val_income = {"Nill", "Less than 2.5L", "Less than 8L", "Greater than 8L"};
         income_dropdown = new JComboBox(val_income);
        income_dropdown.setFont(new Font("Railway", Font.BOLD, 15));
        income_dropdown.setBounds(250, 230, 400, 30);
        income_dropdown.setBackground(Color.WHITE);
        add(income_dropdown);
        
        
         JLabel education_qualification = new JLabel("<html>Educational<br>Qualification:</html>");
        education_qualification.setFont(new Font("Railway", Font.BOLD, 15));
        education_qualification.setBounds(100, 270, 600, 50);
        add(education_qualification);
        
        String[] val_education = {"Matriculation (10th pass)", "Intermediate(10+2)", "Graduate", "Post Graduate", "PHD", "Other"};
        education_dropdown = new JComboBox(val_education);
        education_dropdown.setFont(new Font("Railway", Font.BOLD, 15));
        education_dropdown.setBounds(250, 280, 400, 30);
        education_dropdown.setBackground(Color.WHITE);
        add(education_dropdown);
        
         JLabel occupation = new JLabel("Occupation: ");
        occupation.setFont(new Font("Railway", Font.BOLD, 15));
        occupation.setBounds(100, 320, 600, 30);
        add(occupation);
        
        String[] val_occupation = {"Government Sector", "Private Sector", "Self Employed", "House Maker", "Student", "Other"};
        occupation_dropdown = new JComboBox(val_occupation);
        occupation_dropdown.setFont(new Font("Railway", Font.BOLD, 15));
        occupation_dropdown.setBounds(250, 320, 400, 30);
        occupation_dropdown.setBackground(Color.WHITE);
        add(occupation_dropdown);
        
        JLabel pan_number = new JLabel("PAN Number: ");
        pan_number.setFont(new Font("Railway", Font.BOLD, 15));
        pan_number.setBounds(100, 360, 600, 30);
        add(pan_number);
        
        pannumber = new JTextField();
        pannumber.setFont(new Font("Railway", Font.BOLD, 15));
        pannumber.setBounds(250, 360, 400, 30);
        add(pannumber);
        
        JLabel aadhar_number = new JLabel("Aadhar Number: ");
        aadhar_number.setFont(new Font("Railway", Font.BOLD, 15));
        aadhar_number.setBounds(100, 400, 600, 30);
        add(aadhar_number);
        
        aadharnumber = new JTextField();
        aadharnumber.setFont(new Font("Railway", Font.BOLD, 15));
        aadharnumber.setBounds(250, 400, 400, 30);
        add(aadharnumber);
        
        JLabel senior_citizen = new JLabel("Senior Citizen: ");
        senior_citizen.setFont(new Font("Railway", Font.BOLD, 15));
        senior_citizen.setBounds(100, 440, 600, 30);
        add(senior_citizen);
        
        
        
        yes = new JRadioButton("Yes");
        yes.setBounds(250, 440, 80, 30);
        yes.setBackground(Color.WHITE);
        add(yes);
        
        
        no = new JRadioButton("No");
        no.setBounds(350, 440, 80, 30);
        no.setBackground(Color.WHITE);
        add(no);
        
        ButtonGroup senior_group = new ButtonGroup();
        senior_group.add(yes);
        senior_group.add(no);
        
        JLabel existing_account = new JLabel("Existing Account: ");
        existing_account.setFont(new Font("Railway", Font.BOLD, 15));
        existing_account.setBounds(100, 480, 600, 30);
        add(existing_account);
        
        YES = new JRadioButton("Yes");
        YES.setBounds(250, 480, 80, 30);
        YES.setBackground(Color.WHITE);
        add(YES);
        
        
        NO = new JRadioButton("No");
        NO.setBounds(350, 480, 80, 30);
        NO.setBackground(Color.WHITE);
        add(NO);
        
        ButtonGroup existing_group = new ButtonGroup();
        existing_group.add(YES);
        existing_group.add(NO);
        
         next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        next.setFont(new Font("Raleway" , Font.BOLD, 15));
        next.setBounds(600, 550, 80, 30);
        
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String form_no = "";
        String religion_db = (String)religion_dropdown.getSelectedItem();
        String category_db = (String)category_dropdown.getSelectedItem();
        String income_db = (String)income_dropdown.getSelectedItem();
        String education_db = (String)education_dropdown.getSelectedItem();
        String occupation_db = (String)occupation_dropdown.getSelectedItem();
        String pannumber_db = pannumber.getText();
        String aadharnumber_db = aadharnumber.getText();
         String seniorcitizen_db = null;
        if(yes.isSelected()){
            seniorcitizen_db = "Yes";
        } else if(no.isSelected()){
            seniorcitizen_db = "No";
        }
        
         String existingaccount_db = null;
        if(YES.isSelected()){
            existingaccount_db = "Yes";
        } else if(NO.isSelected()){
            existingaccount_db = "No";
        }
        
         try{
             
                 Conn c = new Conn();
                
                 
                 String query = "insert into signuptwo values ('"+form_no+"', '"+religion_db+"', '"+category_db+"',"
                         + " '"+income_db+"', '"+education_db+"', '"+occupation_db+"', '"+ pannumber_db+"', '"+aadharnumber_db+"',"
                         + " '"+seniorcitizen_db+"', '"+existingaccount_db+"')";
                  c.s.executeUpdate(query);
                  
                  setVisible(false);
                  new SignupTwo(form_no).setVisible(true);
             
             
         } catch (Exception e){
             System.out.println(e);
             
         }
        
    }
    
    
    
     public static void main(String args[]){
        new SignupTwo("");
   }

}

