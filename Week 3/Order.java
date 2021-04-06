import javax.swing.JOptionPane;
public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private int count = 0;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public void addDigitalVideoDisc(DigitalVideoDisc element){
        if(count <= MAX_NUMBERS_ORDERED){
        itemsOrdered[count] = element;
        count++;
        //JOptionPane.showMessageDialog(null,"Add succeses");
        }
        else{
            JOptionPane.showMessageDialog(null, "Album is full");
        }
    }
    public void showOrdered(){
        String s = "";
        ///JOptionPane.showMessageDialog(null, count);
        //System.out.println(itemsOrdered[0].getDirector());
        for(int i = 0; i<count; ++i){
            s += i+1 + ". " ;
            s += itemsOrdered[i].getTitle();
            s += "\n";
            //JOptionPane.showMessageDialog(null, "oke");
        }
        JOptionPane.showMessageDialog(null, s, "List of Order",JOptionPane.INFORMATION_MESSAGE);
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc  element){
        int pos = 0;
        for(DigitalVideoDisc ls: itemsOrdered){
            if(ls == element)
            break;
            pos++;
        }
        for(int i = pos; i < count-1;++i){
            itemsOrdered[i] = itemsOrdered[i+1];
        }
        count--;
        JOptionPane.showMessageDialog(null, "Xoa thanh cong");
    }
    public float totalcost(){
        float sum = 0;
        for(int i = 0; i< count; ++i){
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }
}
