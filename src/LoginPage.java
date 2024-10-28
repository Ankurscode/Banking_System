import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.BorderLayout;

public class  LoginPage extends JFrame implements ActionListener {
    private static JLabel bankname,bankAddress,alertMag;
    private JLabel accountNo,password;
    private JTextField accountNoInput;
    private JPasswordField passwordInput;
    private JButton LogIn, signUp;

  
   
    LoginPage()  {
        //Bank name
        bankname = new JLabel("Nabil Bank");
        bankname.setForeground(Color.WHITE);
        bankname.setFont(new Font("Monotype Corsiva", Font.ITALIC, 55));
        bankname.setBounds(360,20,1000,80);
        add(bankname);


        //Bank Address
        bankAddress = new JLabel("Kathmandu,Nepal");
        bankAddress.setForeground(Color.LIGHT_GRAY);
        bankAddress.setFont(new Font("Arial",Font.PLAIN, 18));
        bankAddress.setBounds(520,85,850,50);
        add(bankAddress);

        //Account No
        accountNo = new JLabel("Account No: ");
        accountNo.setForeground(Color.WHITE);
        accountNo.setFont(new Font("Arial", Font.BOLD, 19));
        accountNo.setBounds(495, 200, 200, 30);
        add(accountNo);

        //Aleart message
        alertMag=new JLabel("");
        alertMag.setFont(new Font("Monotype Corsiva", Font.ITALIC, 16));
        alertMag.setForeground(Color.RED);
        alertMag.setBounds(650, 250, 300, 30);
        add(alertMag);



        //Input of account number
        accountNoInput=new JTextField(16);
        accountNoInput.setBounds(630, 200, 325, 30);
        accountNoInput.setFont(new Font("Arial", Font.PLAIN, 20));
        add(accountNoInput);

        //Password
        password = new JLabel("Password:");
        password.setForeground(Color.WHITE);
        password.setFont(new Font("Arial", Font.BOLD, 19));
        password.setBounds(515, 250, 200, 30);
        add(password);

        //Input of password
        passwordInput =new JPasswordField(35);
        passwordInput.setFont(new Font("Arial", Font.PLAIN, 14));
        passwordInput.setBounds(630,255,300,30);
        add(passwordInput);

        //Login button
        LogIn = new JButton("Log In");
        LogIn.setForeground(Color.BLACK);
        LogIn.setBackground(Color.RED);
        LogIn.setBorder(null);
        // LogIn.addActionListener(this);
        LogIn.setBounds(670, 300, 100, 40);
        add(LogIn);

        //SignUp button
        signUp =new JButton("Sign Up");
        signUp.setForeground(Color.BLACK);
        signUp.setBackground(Color.RED);
        signUp.setBorder(null);
        // signUp.addActionListener(this);
        signUp.setBounds(800,300,100,40);
        add(signUp);



        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/bankingImage.jpg"));
        Image image=imageIcon.getImage().getScaledInstance(1010,650,Image.SCALE_DEFAULT );
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel lables=new JLabel(imageIcon1);
        lables.setBounds(0,0,1010,650);
        add(lables);





       setLayout(null);
        setSize(1010,650);
        setLocation(380,150);
        setVisible(true);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
         @Override
        public void actionPerformed(ActionEvent e){
             try {
                 if (e.getSource() == LogIn) {
                      String accountNum=accountNoInput.getText();
                      String password = passwordInput.getText();

                if(accountNum.isBlank()|| password.isBlank()){
                        alertMag.setText("Fill up the container");
                }
                else {
                    JOptionPane.showMessageDialog(null,"Invalid Account Number or Pin Number!");
                }


            } else if (e.getSource()==signUp) {
                     new SignUp();
                    setVisible(false);
                 }

             }
        catch (Exception ex){
            ex.printStackTrace();

        }
    }




      public static void main(String[] args) {

        new LoginPage();
      }
    


}