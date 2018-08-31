import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    private JTextField txtUserLogin;
    private JPasswordField pwdUserPassword;
    private JButton btnSummit;
    private JButton btnClear;
    private JPanel mainPanel;


    public login() {
        btnSummit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,txtUserLogin.getText()+" "+new String (pwdUserPassword.getPassword()));
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUserLogin.setText("");
                pwdUserPassword.setText("");
            }
        });
    }

    public JPanel getMainPanel () {
        return mainPanel;
    }


}
