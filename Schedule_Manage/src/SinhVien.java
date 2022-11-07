import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SinhVien extends JFrame {
    private JTextArea scheduleTextArea;
    private JPanel mainPanel;
    private JButton watchButton;
    private JPanel bottomPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JButton logoutButton;

    public SinhVien(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        watchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame Schedule = new Schedule("THỜI KHÓA BIỂU TOÀN TRƯỜNG");
                Schedule.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Schedule.setSize(400,200);
                Schedule.setVisible(true);
            }
        });
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                JFrame login = new login("ĐĂNG NHẬP");
                login.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                login.setSize(500,300);
                login.setVisible(true);
            }
        });
    }
}

