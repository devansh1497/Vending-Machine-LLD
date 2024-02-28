public class HasNoMoneyState implements State {
    private VendingMachine machine;
    public HasNoMoneyState(VendingMachine machine) {
        this.machine = machine;
    }
    @Override
    public void insertMoney(double amount) {
        this.machine.setAmount(amount);
        this.machine.setCurrentState(new HasMoneyState(machine));
        System.out.println("Current balance: " + this.machine.getAmount());
    }

    @Override
    public double dispense(int rackNumber) {
        throw new IllegalStateException("No money!");
    }
}
