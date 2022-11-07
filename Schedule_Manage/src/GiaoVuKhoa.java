import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GiaoVuKhoa extends JFrame {
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JButton insertButton;
    private JPanel mainPanel;
    private JButton editButton;
    private JButton deleteButton;
    private JButton watchButton;
    private JButton logoutButton;

    public GiaoVuKhoa(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                JFrame edit = new ChooseSchedule("ĐIỀU CHỈNH THỜI KHÓA BIỂU");
                edit.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                edit.setSize(500,200);
                edit.setVisible(true);
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                JFrame delete = new ChooseSchedule("ĐIỀU CHỈNH THỜI KHÓA BIỂU");
                delete.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                delete.setSize(500,200);
                delete.setVisible(true);
            }
        });
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
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                JFrame NhapTKB = new NhapTKB("NHẬP THỜI KHÓA BIỂU");
                NhapTKB.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                NhapTKB.setSize(500,300);
                NhapTKB.setVisible(true);
            }
        });
    }
}
