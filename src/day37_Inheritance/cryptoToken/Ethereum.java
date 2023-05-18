package day37_Inheritance.cryptoToken;

public class Ethereum extends CryptoToken{
    public Ethereum(double price, double volume, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        super(price, volume, quantity, marketCap, circulatingSupply, isMineable);
    }
}
