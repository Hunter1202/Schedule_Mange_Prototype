import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        JFrame login = new login("ĐĂNG NHẬP");
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setSize(500,300);
        login.setVisible(true);
    }
}