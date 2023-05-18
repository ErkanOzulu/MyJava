package day05_Concatenation;

public class PhoneNumber {
    public static void main(String[] args) {

        int countryCode = 1,
                areaCode = 703,
                localNumber = 4512625;
        String phoneNumber = "+" + countryCode + "("+areaCode+")"+"-"+localNumber;
        System.out.println(phoneNumber);

    }

}
