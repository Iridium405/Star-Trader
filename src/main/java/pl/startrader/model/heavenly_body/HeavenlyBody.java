package pl.startrader.model.heavenly_body;

public abstract class HeavenlyBody {

    public abstract String getName();
    public abstract String getType();
    public abstract int getSize();

    @Override
    public String toString() {
        return this.getType() + ": " + this.getName() + " (size: " + this.getSize() + ") created.";
    }
}