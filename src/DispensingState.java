public class DispensingState implements State {
    private VendingMachine machine;
    public DispensingState(VendingMachine machine) {
        this.machine = machine;
    }
    @Override
    public void insertMoney(double amount) {
        throw new IllegalStateException("Already in dispense state. Cannot insert money right now");
    }

    @Override
    public double dispense(int rackNumber) {
        throw new IllegalStateException("Already dispensing an item!");
    }
}
