package day37_Inheritance.cryptoToken;

public class Cardano extends CryptoToken{
    public Cardano(double price, double volume, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        super(price, volume, quantity, marketCap, circulatingSupply, isMineable);
    }
}
