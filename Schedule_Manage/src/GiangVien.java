import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GiangVien extends JFrame{
    private JPanel mainPanel;
    private JTextArea tkbTextArea;
    private JPanel bottomPannel;
    private JButton watchButton;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JButton logoutButton;

    public GiangVien(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        watchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame Schedule = new Schedule("THỜI KHÓA BIỂU TOÀN TRƯỜNG");
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
