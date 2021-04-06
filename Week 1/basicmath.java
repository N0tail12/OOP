import javax.swing.JOptionPane;
public class basicmath {
    public static void main(String[] args) {
        String num1,num2;
        num1 = JOptionPane.showInputDialog(null, "Please enter first number", "Input first number",JOptionPane.INFORMATION_MESSAGE);
        num2 = JOptionPane.showInputDialog(null, "Please enter second number", "Input second number",JOptionPane.INFORMATION_MESSAGE);
        double dnum1 = Double.parseDouble(num1);
        double dnum2 = Double.parseDouble(num2);
        JOptionPane.showMessageDialog(null, "Sum: " + (dnum1 + dnum2), "Sum", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Different: " + Math.abs(dnum1 - dnum2), "Different", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Product: " + (dnum1 * dnum2), "Product", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Quotient: " + (dnum1 / dnum2), "Quotient", JOptionPane.INFORMATION_MESSAGE);
    }
}
