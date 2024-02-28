public class HasMoneyState implements State {
    private VendingMachine machine;
    public HasMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney(double amount) {
        this.machine.setAmount(this.machine.getAmount() + amount);
        System.out.println("Current balance: " + this.machine.getAmount());
    }

    @Override
    public double dispense(int rackNumber) {
        Rack rack = this.machine.getRacks().stream().filter(r -> r.getNumber() == rackNumber).findFirst().get();
        if (rack.getItem().getAmount() > this.machine.getAmount()) {
            throw new IllegalStateException("Insufficient money!");
        }
        this.machine.setCurrentState(new HasNoMoneyState(machine));
        double balance = this.machine.getAmount() - rack.getItem().getAmount();
        System.out.println("Dispensed item at rackNumber: "+ rackNumber + " and returned balance amount: "+balance);
        rack.empty();
        return balance;
    }
}
