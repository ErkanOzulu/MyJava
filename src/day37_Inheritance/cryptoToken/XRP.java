package day37_Inheritance.cryptoToken;

public class XRP extends CryptoToken{
    public XRP(double price, double volume, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        super(price, volume, quantity, marketCap, circulatingSupply, isMineable);
    }
}
