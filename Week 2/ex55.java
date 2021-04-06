import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ex55 {
    static int Month(String strMonth) {
		int month = 0;
		if(strMonth.equals("Jan") || strMonth.equals("Jan.") || strMonth.equals("January") || strMonth.equals("1")) month = 1;
		else if(strMonth.equals("Feb") || strMonth.equals("Feb.") || strMonth.equals("February") || strMonth.equals("2")) month = 2;
		else if(strMonth.equals("Mar") || strMonth.equals("Mar.") || strMonth.equals("March") || strMonth.equals("3")) month = 3;
		else if(strMonth.equals("Apr") || strMonth.equals("Apr.") || strMonth.equals("April") || strMonth.equals("4")) month = 4;
		else if(strMonth.equals("May") || strMonth.equals("May.") || strMonth.equals("5")) month = 5;
		else if(strMonth.equals("Jun") || strMonth.equals("Jun.") || strMonth.equals("June") || strMonth.equals("6")) month = 6;
		else if(strMonth.equals("Jul") || strMonth.equals("Jul.") || strMonth.equals("July") || strMonth.equals("7")) month = 7;
		else if(strMonth.equals("Aug") || strMonth.equals("Aug.") || strMonth.equals("August") || strMonth.equals("8")) month = 8;
		else if(strMonth.equals("Sep") || strMonth.equals("Sep.") || strMonth.equals("September") || strMonth.equals("9")) month = 9;
		else if(strMonth.equals("Oct") || strMonth.equals("Oct.") || strMonth.equals("Octorber") || strMonth.equals("10")) month = 10;
		else if(strMonth.equals("Nov") || strMonth.equals("Nov.") || strMonth.equals("November") || strMonth.equals("11")) month = 11;
		else if(strMonth.equals("Dec") || strMonth.equals("Dec.") || strMonth.equals("December") || strMonth.equals("12")) month = 12;
		else month = 0;
		return month;
	}
    static int Year(String strYear) {
		int year = Integer.parseInt(strYear);
		return year;
	}
    static int DayOfMonth1(int iMonth, int iYear) {
		switch(iMonth) {
		case 0: return 0;
		case 1: return 31;
		case 3: return 31;
		case 5: return 31;
		case 7: return 31;
		case 8: return 31;
		case 10: return 31;
		case 12: return 31;
		case 2:
            if(iYear % 400 == 0) {
                return 29;
            }
            else if(iYear % 100 == 0) {
                return 28;
            }
            else if (iYear % 4 == 0){
                return 29;
            }
            else
                return 28;
		default:
			return 30;
		}
	}
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JTextField monthField = new JTextField(5);
        JTextField yearField = new JTextField(5);
        panel.add(new JLabel("Month = "));
        panel.add(monthField);
        panel.add(new JLabel("Year = "));
        panel.add(yearField);
        JOptionPane.showMessageDialog(null, panel, "Enter Moth and Year", JOptionPane.INFORMATION_MESSAGE);
        int a = Month(monthField.getText());
        int b = Year(yearField.getText());
        JOptionPane.showMessageDialog(null, "Date: " + DayOfMonth1(a, b) + "/" + a + "/" + b, "Day", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
