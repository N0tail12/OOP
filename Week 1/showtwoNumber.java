import javax.swing.JOptionPane;
public class showtwoNumber {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You're just entered: ";
        strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ","Input first number",JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null,"Please input the second number: ","Input second number",JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;
        JOptionPane.showMessageDialog(null, strNotification,"Show tow numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }
}
