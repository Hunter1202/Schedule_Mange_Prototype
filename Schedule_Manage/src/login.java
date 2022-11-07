import javax.swing.*;
import java.awt.event.*;

public class login extends JFrame {
    private JPanel mainPanel;
    private JPanel loginPanel;
    private JTextField usernameTextField;
    private JButton loginButton;
    private JPasswordField passwordField;
    private JPanel rightPanel;
    private JPanel leftPanel;
    private JLabel titletLabel;
    private JPanel topPanel;
    private JPanel botPanel;
    private JLabel dialogLabel;

    public login(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameTextField.getText();
                String password = String.valueOf(passwordField.getPassword());

                if(username.equals("") || password.equals((""))) {
                    dialogLabel.setText("User name or password is empty\n");
                } else if(username.equals("admin") && password.equals(("admin"))){
                    dispose();
                    JFrame GiaoVuKhoa = new GiaoVuKhoa("GIÁO VỤ KHOA");
                    GiaoVuKhoa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    GiaoVuKhoa.setSize(500,300);
                    GiaoVuKhoa.setVisible(true);
                }
                else if (username.equals("giangvien") && password.equals("1")){
                    dispose();
                    JFrame GiangVien = new GiangVien("THỜI KHÓA BIỂU CỦA GIẢNG VIÊN");
                    GiangVien.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    GiangVien.setSize(400,200);
                    GiangVien.setVisible(true);
                }
                else if (username.equals("sinhvien") && password.equals("1")){
                    dispose();
                    JFrame SinhVien = new SinhVien("THỜI KHÓA BIỂU CỦA SINH VIÊN");
                    SinhVien.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    SinhVien.setSize(400,200);
                    SinhVien.setVisible(true);
                }
                else
                    dialogLabel.setText("Sai tên đăng nhập hoặc mật khẩu\n");
            }
        });
    }
}
