import javax.swing.*;
import java.lang.Math;
import java.awt.GridLayout;
public class test {
    public static void main(String[] args) {
        String[] choices = new String[]{
            "The first degree equation with one variable",
            "The first degree equation with two variables",
            "The second degree equation with one variable"
        };
        Object selected = JOptionPane.showInputDialog(null, "Select:", "Selection", JOptionPane.DEFAULT_OPTION, null, choices, null);
        if (selected == null) System.exit(0);

        if (selected == choices[0]) {
            JTextField aField = new JTextField(3);
            JTextField bField = new JTextField(3);
            JPanel newJpPanel = new JPanel();
            newJpPanel.add(aField);
            newJpPanel.add(new JLabel(" *x  = "));
            newJpPanel.add(bField);
            int result = JOptionPane.showConfirmDialog(null, newJpPanel, "Enter Number: ", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION){
                Double a = Double.parseDouble(aField.getText()); 
                Double b = Double.parseDouble(bField.getText());
                if (a == 0){
                    JOptionPane.showMessageDialog(null,"No Sovlution");
                    System.exit(0);
                }
                JOptionPane.showMessageDialog(null, "X = " + (b/a));
            }
        } else if (selected == choices[1]) {
            JTextField a1Field = new JTextField(3);
            JTextField b1Field = new JTextField(3);
            JTextField c1Field = new JTextField(3);
            JTextField a2Field = new JTextField(3);
            JTextField b2Field = new JTextField(3);
            JTextField c2Field = new JTextField(3);
            JPanel newJPanel = new JPanel();
            newJPanel.setLayout(new GridLayout(2,5));
            newJPanel.add(a1Field);
            newJPanel.add(new JLabel(" *x + "));
            newJPanel.add(b1Field);
            newJPanel.add(new JLabel(" *y = "));
            newJPanel.add(c1Field);
            newJPanel.setLayout(new GridLayout(2,5));
            newJPanel.add(a2Field);
            newJPanel.add(new JLabel(" *x + "));
            newJPanel.add(b2Field);
            newJPanel.add(new JLabel(" *y = "));
            newJPanel.add(c2Field);
            int result = JOptionPane.showConfirmDialog(null, newJPanel, "Ente numbers", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION){
                int a1 = Integer.parseInt(a1Field.getText()); 
                int b1 = Integer.parseInt(b1Field.getText());
                int c1 = Integer.parseInt(c1Field.getText());
                int a2 = Integer.parseInt(a2Field.getText());
                int b2 = Integer.parseInt(b2Field.getText());
                int c2 = Integer.parseInt(c2Field.getText());
                int d = a1*b2 - a2*b1;
                int d1 = c1*b2 - c2*b1;
                int d2 = a1*c2 - a2*c1;
                if(d != 0) {
                    JOptionPane.showMessageDialog(null,"Only solution: (x1, x2) = (" + (double)d1/d + ";" + (double)d2/d + ")");
                }
                else if(d1 == d2 && d1 == 0) {
                    JOptionPane.showMessageDialog(null,"Infinity solution!");
                }
                else {
                    JOptionPane.showMessageDialog(null,"No sulution!");
            }
        }
     } else {
        JTextField aField = new JTextField(3);
        JTextField bField = new JTextField(3);
        JTextField cField = new JTextField(3);
        JPanel newJPanel = new JPanel();
        newJPanel.add(aField);
        newJPanel.add(new JLabel(" *x^2  + "));
        newJPanel.add(bField);
        newJPanel.add(new JLabel(" *x  + "));
        newJPanel.add(cField);
        newJPanel.add(new JLabel(" = 0"));
        int result = JOptionPane.showConfirmDialog(null, newJPanel, "Enter numbers", JOptionPane.OK_CANCEL_OPTION);
         if (result == JOptionPane.OK_OPTION){
             Double a = Double.parseDouble(aField.getText());
             Double b = Double.parseDouble(bField.getText());
             Double c = Double.parseDouble(cField.getText());
             double d = b*b - 4*a*c;
             if(d > 0) {
                 double del = Math.sqrt(d);
                 JOptionPane.showMessageDialog(null,"Two distinct roots: x1 =" + (-b+del)/(2*a) + "; x2 =" + (-b-del)/(2*a));
             }
             else if(d == 0) {
                JOptionPane.showMessageDialog(null,"Double root: " + -b/(2*a));
             }
             else {
                 JOptionPane.showMessageDialog(null,"No sulution!");
             } 
             }
         }
    
        System.exit(0);
    }
}
    