import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridLayout;
public class ex57 {
        /**
     *
     */

        public static void main(String[] args) {
            int n = 0, m = 0;
            JPanel panel = new JPanel();
            JTextField n1 = new JTextField(5);
            JTextField n2 = new JTextField(5);
            panel.add(new JLabel("n = "));
            panel.add(n1);
            panel.add(new JLabel(" m = "));
            panel.add(n2);
            JOptionPane.showMessageDialog(null, panel, "Nhap n va m", JOptionPane.INFORMATION_MESSAGE);
            n = Integer.parseInt(n1.getText());
            m = Integer.parseInt(n2.getText());
            JPanel panel1 = new JPanel();
            JPanel panel2 = new JPanel();
            JPanel panel3 = new JPanel();
            panel1.setLayout(new GridLayout(n,m));
            panel2.setLayout(new GridLayout(n,m));
            panel3.setLayout(new GridLayout(n,m));
            int[][] arr1 = new int[n][m];
            int[][] arr2 = new int[n][m];
            List<JTextField> list1 = new ArrayList<JTextField>();
            List<JTextField> list2 = new ArrayList<JTextField>();
            for(int i = 0; i < n; ++i){
                for(int j = 0; j< m; ++j){
                    JTextField numField = new JTextField();
                    panel1.add(numField);
                    list1.add(numField);
                }
            }
            for(int i = 0; i < n; ++i){
                for(int j = 0; j< m; ++j){
                    JTextField numField = new JTextField();
                    panel2.add(numField);
                    list2.add(numField);
                }
            }
            JOptionPane.showMessageDialog(null, panel1, "Matrix 1", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, panel2, "Matrix 2", JOptionPane.INFORMATION_MESSAGE);
            int j = 0, i = 0;          
            for(JTextField f : list1){
                if (j > m-1){
                    i++;
                    j = 0;
                }
                arr1[i][j] = Integer.parseInt(f.getText());
                j++;
            }
            j = 0;
            i = 0;
            for(JTextField f : list2){
                if (j > m-1){
                    i++;
                    j = 0;
                }
                arr2[i][j] = Integer.parseInt(f.getText());
                j++;
            }
            int sum;
            for(int h = 0; h < n; ++h){
                for( int k = 0; k< m; ++k){
                    sum = arr1[h][k] + arr2[h][k];
                    panel3.add(new JLabel(" " + sum));
                }
            }
            JOptionPane.showMessageDialog(null, panel3, "Result", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        
       
}
