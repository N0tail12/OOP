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
    public void swap(getObj el1, getObj el2){
        DigitalVideoDisc tmp = el1.element;
        el1.element = el2.element;
        el2.element = tmp;  
    }
    public void addDigitalVideoDisc(DigitalVideoDisc list[]){
        for(DigitalVideoDisc ls: list){
            if(ls != null){
                count++;
            }
        }
        if(count >= MAX_NUMBERS_ORDERED){
            JOptionPane.showMessageDialog(null, "Deteced more than 10 ordered", "Warning", JOptionPane.ERROR_MESSAGE);
        }
        else{
        //JOptionPane.showMessageDialog(null, count);
        for(int i = 0;i<count;++i){
            itemsOrdered[i] = list[i];
        }
    }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
        String s = "";
        if(count >= MAX_NUMBERS_ORDERED){
            JOptionPane.showMessageDialog(null, "Order is full", "Error", JOptionPane.ERROR_MESSAGE);
            s+= "1." + dvd1.getTitle() + "\n";
            s+= "\tCategory: " + dvd1.getCategory() + "\n";
            s+= "\tDirector " + dvd1.getDirector() + "\n";
            s+= "\tLength " + dvd1.getLength() + "\n";
            s+= "\tCost " + dvd1.getCost() + "\n";
            s+= "2." + dvd2.getTitle() + "\n";
            s+= "\tCategory: " + dvd2.getCategory() + "\n";
            s+= "\tDirector " + dvd2.getDirector() + "\n";
            s+= "\tLength " + dvd2.getLength() + "\n";
            s+= "\tCost " + dvd2.getCost() + "\n";
            JOptionPane.showMessageDialog(null, s, "List", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            itemsOrdered[count] = dvd1;
            count++;
            if(count >= MAX_NUMBERS_ORDERED){
                JOptionPane.showMessageDialog(null, "Order is full", "Error", JOptionPane.ERROR_MESSAGE);
                s+= "1." + dvd2.getTitle() + "\n";
                s+= "\tCategory: " + dvd2.getCategory() + "\n";
                s+= "\tDirector " + dvd2.getDirector() + "\n";
                s+= "\tLength " + dvd2.getLength() + "\n";
                s+= "\tCost " + dvd2.getCost() + "\n";
                JOptionPane.showMessageDialog(null, s, "List", JOptionPane.INFORMATION_MESSAGE);
        }
            else{
                itemsOrdered[count] = dvd2;
                count++;
            }
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
