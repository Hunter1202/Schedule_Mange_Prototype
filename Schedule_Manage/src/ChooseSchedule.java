import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseSchedule extends JFrame  {
    private JPanel mainPanel;
    private JComboBox chooseTKB;
    private JTextField chooseTextfield;
    private JButton backButton;

    public ChooseSchedule(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                JFrame GiaoVuKhoa = new GiaoVuKhoa("GIÁO VỤ KHOA");
                GiaoVuKhoa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                GiaoVuKhoa.setSize(500,300);
                GiaoVuKhoa.setVisible(true);
            }
        });
    }
}
