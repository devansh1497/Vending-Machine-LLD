import java.util.List;

public class VendingMachine {

    private State currentState;
    private double amount;

    private List<Rack> racks;



    public VendingMachine(List<Rack> racks) {
        this.racks = racks;
        this.currentState = new HasNoMoneyState(this);
        this.amount = 0.00;
    }

    public void setRacks(List<Rack> racks) {
        this.racks = racks;
    }

    public void insertMoney(double amount) {
        currentState.insertMoney(amount);
    }

    public void dispense(int rackNumber) {
        currentState.dispense(rackNumber);
    }

    public List<Rack> getRacks() {
        return racks;
    }

    public double getAmount() {
        return amount;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
