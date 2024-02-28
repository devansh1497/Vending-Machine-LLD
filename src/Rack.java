public class Rack {
    
    private int number;
    private boolean isOccupied;
    private Item item;

    public Rack(int number) {
        this.number = number;
    }

    public void empty() {
        this.isOccupied = false;
        this.item = null;
    }
    
    public boolean isOccupied() {
        return this.isOccupied;
    }
    
    public void putItem(Item item) {
        if(isOccupied) throw new IllegalStateException("Rack "+number+" is already full!");
        this.item = item;
        this.isOccupied = true;
    }

    public int getNumber() {
        return number;
    }

    public Item getItem() {
        return item;
    }
}
