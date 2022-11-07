import javax.swing.*;

public class Schedule extends JFrame {
    private JPanel mainPanel;
    private JLabel tkbText;
    private JTextPane tkbTextPanel;

    public Schedule(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }
}
