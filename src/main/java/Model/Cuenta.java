package Model;

public class Cuenta {

    private String id;
    private boolean activeCard;
    private double availableLimit;

    public Cuenta(String id, boolean activeCard, double availableLimit) {
        this.id = id;
        this.activeCard = activeCard;
        this.availableLimit = availableLimit;
    }

    public String getId() {
        return id;
    }

    public boolean isActiveCard() {
        return activeCard;
    }

    public double getAvailableLimit() {
        return availableLimit;
    }
}
