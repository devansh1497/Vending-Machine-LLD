import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rack r1 = new Rack(1);
        Rack r2 = new Rack(2);
        Rack r3 = new Rack(3);
        Rack r4 = new Rack(4);
        Rack r5 = new Rack(5);
        Rack r6 = new Rack(6);

        Item i1 = new Item("item1", 3.5);
        Item i2 = new Item("item2", 13.5);
        Item i3 = new Item("item3", 11);
        Item i4 = new Item("item4", 5);
        Item i5 = new Item("item5", 1);
        Item i6 = new Item("item6", 7.5);

        r1.putItem(i1);
        r2.putItem(i2);
        r3.putItem(i3);
        r4.putItem(i4);
        r5.putItem(i5);
        r6.putItem(i6);

        VendingMachine vendingMachine = new VendingMachine(Arrays.asList(r1, r2, r3, r4, r5, r6));

        vendingMachine.insertMoney(10);
        vendingMachine.insertMoney(1);
        vendingMachine.dispense(1);
    }
}