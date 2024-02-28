abstract class State {

    VendingMachine machine;

    public State(VendingMachine machine) {
        this.machine = machine;
    }

    abstract void insertMoney(double amount);

    abstract double dispense(int rackNumber);
}
