package day37_Inheritance.cryptoToken;

public class CryptoToken {
    private double price, volume;
    private int quantity;
    private long marketCap;
    private long circulatingSupply;
    private boolean isMineable;

    public CryptoToken(double price, double volume, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
       setPrice(price);
        setVolume(volume);
        setQuantity(quantity);
        setMarketCap(marketCap);
        setCirculatingSupply(circulatingSupply);
        setMineable(isMineable);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }

    public void setCirculatingSupply(long circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }

    public double getPrice() {
        return price;
    }

    public double getVolume() {
        return volume;
    }

    public int getQuantity() {
        return quantity;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public long getCirculatingSupply() {
        return circulatingSupply;
    }

    public boolean isMineable() {
        return isMineable;
    }
    public double totalPrice(){
        return price * quantity;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "price=" + price +
                ", volume=" + volume +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                '}';
    }
}
