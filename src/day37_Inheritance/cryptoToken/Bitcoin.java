package day37_Inheritance.cryptoToken;

public class Bitcoin extends CryptoToken{
    public Bitcoin(double price, double volume, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        super(price, volume, quantity, marketCap, circulatingSupply, isMineable);
    }
}
