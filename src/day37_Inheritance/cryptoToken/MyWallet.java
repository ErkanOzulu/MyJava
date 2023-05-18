package day37_Inheritance.cryptoToken;

import day35_Encapsulation.Candy;
import day37_Inheritance.animalTask.Dog;

public class MyWallet {

    public static void main(String[] args) {
        Bitcoin bitcoin=new Bitcoin(1.5,3,15,123422,13000,true);
        Cardano cardano=new Cardano(2,2,30,123422,13000,false);
        Doge doge=new Doge(4,3,4,232231,2000,true);
        Ethereum ethereum=new Ethereum(20,3,50,222222,1000,false);
        XRP xrp=new XRP(5,3,3,987654,2000,true);

        System.out.println(bitcoin);
        System.out.println(cardano);
        System.out.println(doge);
        System.out.println(ethereum);
        System.out.println(xrp);
        System.out.println("Total assest: "+bitcoin.totalPrice() + cardano.totalPrice() + doge.totalPrice() + ethereum.totalPrice() + xrp.totalPrice());

    }
}
