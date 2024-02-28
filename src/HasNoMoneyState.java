public class HasNoMoneyState extends State {
    public HasNoMoneyState(VendingMachine machine) {
        super(machine);
    }

    @Override
    void insertMoney(double amount) {
        this.machine.setAmount(amount);
        this.machine.setCurrentState(new HasMoneyState(machine));
        System.out.println("Current balance: " + this.machine.getAmount());
    }

    @Override
    double dispense(int rackNumber) {
        throw new IllegalStateException("No money!");
    }
}
