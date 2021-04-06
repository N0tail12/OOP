import javax.swing.JOptionPane;

public class Aims {
    
    public static void main(String[] args) {
        Order anOrder = new Order();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Lion Ling");
        DigitalVideoDisc list[] = new DigitalVideoDisc[10];
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        list[0] = dvd1;
        //anOrder.addDigitalVideoDisc(dvd1);
     
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);
        list[1] = dvd2;
        //anOrder.addDigitalVideoDisc(dvd2);

        //swap test
        getObj ob1 = new getObj(dvd1);
        getObj ob2 = new getObj(dvd2);
        anOrder.swap(ob1, ob2);
        ob1.element.prin_title();
        ob2.element.prin_title();
        //System.out.print(s);
        //System.out.print(ob2.element.getTitle());
        //end tets

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99f);
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);
        //anOrder.addDigitalVideoDisc(dvd3);
        list[2] = dvd3;
        anOrder.addDigitalVideoDisc(list);
        anOrder.showOrdered();
        //anOrder.removeDigitalVideoDisc(dvd2);
        //anOrder.showOrdered();
        JOptionPane.showMessageDialog(null, "The total cost is: " + anOrder.totalcost(), "Price", JOptionPane.INFORMATION_MESSAGE);
    }
}