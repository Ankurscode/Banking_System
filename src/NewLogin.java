import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class NewLogin extends JFrame  {
      private static JLabel bankname,bankAddress,alertMag;
    private JLabel accountNo,password;
    private JTextField accountNoInput,passwordInput;
    private JButton LogIn, signUp;
    JPanel container = new JPanel();
       

NewLogin(){
    container.setLayout(null); // Keeping null layout for custom positioning
    container.setBounds(520, 0, 500, 400); // Adjust size according to frame
    container.setBackground(Color.LIGHT_GRAY);
    //Bank name
    bankname = new JLabel("Nabil Bank");
    bankname.setForeground(Color.BLACK);
    bankname.setFont(new Font("Monotype Corsiva", Font.ITALIC, 55));
    bankname.setBounds(540, 200, 200, 30);
    add(bankname);


    //Bank Address
    bankAddress = new JLabel("Kathmandu,Nepal");
    bankAddress.setForeground(Color.LIGHT_GRAY);
    bankAddress.setFont(new Font("Arial",Font.PLAIN, 18));
    bankAddress.setBounds(520,85,850,50);
    add(bankAddress);

    JLabel accountNo = new JLabel("Email Id:");
    accountNo.setForeground(Color.BLACK);
    accountNo.setFont(new Font("Arial", Font.PLAIN, 19));
    accountNo.setBounds(540, 200, 200, 30);
    container.add(accountNo);




      add(container);
       setLayout(null);
        setSize(1010,650);
        setLocation(380,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}



public static void main(String[] args) {
    new NewLogin();
  }
}
