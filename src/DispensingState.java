public class DispensingState extends State {
    public DispensingState(VendingMachine machine) {
        super(machine);
    }

    @Override
    void insertMoney(double amount) {
        throw new IllegalStateException("Already in dispense state. Cannot insert money right now");
    }

    @Override
    double dispense(int rackNumber) {
        throw new IllegalStateException("Already dispensing an item!");
    }
}
