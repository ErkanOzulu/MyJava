package day37_Inheritance.cryptoToken;

public class Doge extends CryptoToken{
    public Doge(double price, double volume, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        super(price, volume, quantity, marketCap, circulatingSupply, isMineable);
    }
}
