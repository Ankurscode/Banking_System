import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SignUp extends JFrame  {
    JLabel top, lineLabel;
   JLabel personalDetails,Name,FathName,Mothername,lableDOB,lableGender,labelMarries,lableAddress,lableEmail,lableState;
   JTextField nameInput,fathNameInput,MothNameInput,dateOfBirth,emailInput,addressInput,stateInput;
   JRadioButton maleButton,femaleButton,marriedButton,unmarriedButton,otherButton;
   JButton submitButton,cancelButton;



    SignUp() {
        super("User Details");
        //Form number
        top = new JLabel("Form No:");
        top.setForeground(Color.BLACK);
        top.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
        top.setBounds(750, 40, 500, 30);
        add(top);
        //Application heading
        top = new JLabel("Application Form");
        top.setForeground(Color.BLACK);
        top.setFont(new Font("Monotype Corsiva", Font.BOLD, 38));
        top.setBounds(315,28,500,50);
        add(top);
        //Underline
        lineLabel=new JLabel("*_______________________________________________*");
        lineLabel.setForeground(Color.BLACK);
        lineLabel.setFont(new Font("Arial", Font.BOLD, 16));
        lineLabel.setBounds(300,37,500,50);
        add(lineLabel);

        //FormFill up heading
        personalDetails =new JLabel("Personal Details: ");
        personalDetails.setForeground(Color.BLACK);
        personalDetails.setFont(new Font("Arial",Font.BOLD,18));
        personalDetails.setBounds(180,120,200,30);
        add(personalDetails);

        //Name of user
        Name=new JLabel("Name:");
        Name.setForeground(Color.BLACK);
        Name.setFont(new Font("Arial",Font.PLAIN,20));
        Name.setBounds(100,180,200,30);
        add(Name);

        //User NameInut Box
        nameInput =new JTextField(35);
        nameInput.setFont(new Font("Arial", Font.BOLD, 16));
        nameInput.setBounds(170,180,300,30);
        add(nameInput);

        //Father Name
        FathName = new JLabel("Father's Name: ");
        FathName.setForeground(Color.BLACK);
        FathName.setFont(new Font("Arial",Font.PLAIN,20));
        FathName.setBounds(10,220,200,30);
        add(FathName);

        //Father's InputBox
        fathNameInput= new JTextField(35);
        fathNameInput.setFont(new Font("Arial", Font.BOLD, 16));
        fathNameInput.setBounds(170,220,300,30);
        add(fathNameInput);

        //Mother's Name
        Mothername =new JLabel("Mother's Name:");
        Mothername.setForeground(Color.BLACK);
        Mothername.setFont(new Font("Arial",Font.PLAIN,20));
        Mothername.setBounds(8,260,200,30);
        add(Mothername);

        //Mother's InputBox
        MothNameInput =new JTextField(35);
        MothNameInput.setForeground(Color.BLACK);
        MothNameInput.setFont(new Font("Arial",Font.BOLD,2));
        MothNameInput.setBounds(170,260,300,30);
        add(MothNameInput);

        lableDOB = new JLabel("Date Of Borth:");
        lableDOB.setForeground(Color.BLACK);
        lableDOB.setFont(new Font("Arial",Font.PLAIN,20));
        lableDOB.setBounds(19,300,200,30);
        add(lableDOB);

        lableGender =new JLabel("Gender:");
        lableGender.setForeground(Color.BLACK);
        lableGender.setFont(new Font("Arial", Font.PLAIN, 20));
        lableGender.setBounds(78,340,200,30);
        add(lableGender);

        maleButton =new JRadioButton("Male");
        maleButton.setOpaque(false);
        maleButton.setFont(new Font("Arial", Font.PLAIN, 18));
        maleButton.setBounds(175,342,300,30);
        add(maleButton);

        femaleButton =new JRadioButton("Female");
        femaleButton.setOpaque(false);
        femaleButton.setFont(new Font("Arial", Font.PLAIN, 18));
        femaleButton.setBounds(250,342,300,30);
        add(femaleButton);

        otherButton =new JRadioButton("other");
        otherButton.setOpaque(false);
        otherButton.setFont(new Font("Arial", Font.PLAIN, 18));
        otherButton.setBounds(350,342,300,30);
        add(otherButton);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(maleButton);
        buttonGroup.add(femaleButton);
        buttonGroup.add(otherButton);

       labelMarries =new JLabel("Married:");
       labelMarries.setForeground(Color.BLACK);
       labelMarries.setFont(new Font("Arial",Font.PLAIN,20));
       labelMarries.setBounds(75,372,300,30);
       add(labelMarries);


       marriedButton =new JRadioButton("Married");
       marriedButton.setOpaque(false);
       marriedButton.setFont(new Font("Arial", Font.PLAIN, 18));
       marriedButton.setBounds(175,372,300,30);
       add(marriedButton);

       unmarriedButton =new JRadioButton("Unmarried");
       unmarriedButton.setOpaque(false);
       unmarriedButton.setFont(new Font("Arial", Font.PLAIN, 18));
       unmarriedButton.setBounds(290,372,300,30);
       add(unmarriedButton);

       submitButton =new JButton("Submit");
       submitButton.setFont(new Font("Arial",Font.PLAIN,20));
       submitButton.setBounds(250,530,180,30);
       add(submitButton);

       cancelButton =new JButton("Cancel");
       cancelButton.setFont(new Font("Arial",Font.PLAIN,20));
       cancelButton.setBounds(480,530,180,30);
       add(cancelButton);

       lableEmail =new JLabel("Email:");
       lableEmail.setFont(new Font("Arial",Font.PLAIN,20));
       lableEmail.setBounds(550,180,300,30);
       add(lableEmail);

        emailInput =new JTextField(50);
        emailInput.setFont(new Font("Arial",Font.PLAIN,20));
        emailInput.setBounds(620,180,300,30);
        add(emailInput);

        lableAddress =new JLabel("Address:");
        lableAddress.setFont(new Font("Arial",Font.PLAIN,20));
        lableAddress.setBounds(529,220,300,30);
        add(lableAddress);

        addressInput =new JTextField(35);
        addressInput.setFont(new Font("Arial",Font.PLAIN,20));
        addressInput.setBounds(620,220,300,30);
        add(addressInput);

        lableState =new JLabel("State:");
        lableState.setFont(new Font("Arial",Font.PLAIN,20));
        lableState.setBounds(550,260,300,30);
        add(lableState);

        stateInput =new JTextField(35);
        stateInput.setFont(new Font("Arial",Font.PLAIN,20));
        stateInput.setBounds(620,260,300,30);
        add(stateInput);

        ImageIcon imageIC=new ImageIcon(ClassLoader.getSystemResource("icon/imageses.jpg"));
        Image image=imageIC.getImage().getScaledInstance(1010, 650,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
      JLabel lables=new JLabel(imageIcon1);
      lables.setBounds(0,0,1010,650);
      add(lables);











        setLayout(null);
        setSize(1010, 650);
        setLocation(380, 150);
        setVisible(true);

    }




    public static void main(String[] args) {
        new SignUp();
    }
}