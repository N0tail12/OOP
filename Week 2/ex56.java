

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class ex56 {
    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
        }
    }
    public static void main(String[] args) {
        String strnum;
        int num = 0;
        do{
        strnum = JOptionPane.showInputDialog(null,"Nhap do dai cua mang: ", "Chieu dai mang",JOptionPane.INFORMATION_MESSAGE);
        num = Integer.parseInt(strnum);
        if (num<0){
            JOptionPane.showMessageDialog(null, "So nhap k hop le", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        }while(num < 0);
        int[] arr = new int[num];
        JPanel newPanel = new JPanel();
        
        int value;
        for(int i = 0; i < num; ++i){
                JTextField numTextField = new JTextField(5);
                newPanel.add(new JLabel("a[" + i + "] = "));
                newPanel.add(numTextField);
                JOptionPane.showMessageDialog(null, newPanel, "Nhap", JOptionPane.INFORMATION_MESSAGE);
                value = Integer.parseInt(numTextField.getText());
                arr[i] = value;
        }
        //prtArr(arr);
        //JOptionPane.showMessageDialog(null,newPanel,"yo", JOptionPane.INFORMATION_MESSAGE);
        String result = "Before: ";
        for(int i = 0; i < arr.length; ++i){
                result += arr[i] + ", ";
        }
        result += "\n";
        bubbleSort(arr);
        result += "After: ";
        for(int i = 0; i < arr.length; ++i){
            result += arr[i] + ", ";
        }
        JOptionPane.showMessageDialog(null,result,"Result", JOptionPane.INFORMATION_MESSAGE);
    }
}