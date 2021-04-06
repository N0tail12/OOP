import javax.swing.*;
import java.lang.Math;
import java.awt.GridLayout;
public class ex54 {
    public static void main(String[] args) {
        String strnum;
        int num = 0;
        do{
        strnum = JOptionPane.showInputDialog(null,"Nhap chieu cao cua tam giac: ", "Chieu cao tam giac",JOptionPane.INFORMATION_MESSAGE);
        num = Integer.parseInt(strnum);
        if (num<0){
            JOptionPane.showMessageDialog(null, "So nhap k hop le", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        }while(num < 0);
        JPanel newPanel = new JPanel();
        newPanel.setLayout(new GridLayout(5,9));
        //newJPanel.setLayout(new GridLayout(2,5));
        for(int i = 1; i<=num; ++i){
            for(int j=1; j<=num-i; ++j){
                newPanel.add(new JLabel(" "));
            }   
            for(int j=1;j<=2*i-1; ++j){
                newPanel.add(new JLabel("*"));
            }
            for(int j=1; j<=num-i; ++j){
                newPanel.add(new JLabel(" "));
            }  
        }
        JOptionPane.showMessageDialog(null, newPanel, "Tam giac", JOptionPane.INFORMATION_MESSAGE);
    }
}
