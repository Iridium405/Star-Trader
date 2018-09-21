package pl.startrader.model.heavenlyBody;

public abstract class HeavenlyBody {

    public abstract String getName();
    public abstract String getType();
    public abstract int getSize();

    @Override
    public String toString() {
        return this.getType() + ": " + this.getName() + " (size: " + this.getSize() + ") created.";
    }
}