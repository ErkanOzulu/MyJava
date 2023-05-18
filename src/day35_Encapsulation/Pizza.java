package day35_Encapsulation;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setSize(String size) {

        if (!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large"))) {
            return;

        }
        this.size = size;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping < 0 || (size.equalsIgnoreCase("small") && numberOfCheeseTopping > 3) || (size.equalsIgnoreCase("medium") && numberOfCheeseTopping > 4) || (size.equalsIgnoreCase("large") && numberOfCheeseTopping > 5)) {
            return;
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (numberOfPepperoniTopping < 0 || (size.equalsIgnoreCase("small") && numberOfPepperoniTopping > 4) || (size.equalsIgnoreCase("medium") && numberOfPepperoniTopping > 5) || (size.equalsIgnoreCase("large") && numberOfPepperoniTopping > 6)) {

            return;
        }
        this.numberOfPepperoniTopping=numberOfPepperoniTopping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", pizza cost=" +calcCost()+
                '}';
    }

    public int calcCost(){
        return (size.equalsIgnoreCase("small"))?10+(2*(numberOfCheeseTopping+numberOfPepperoniTopping)):(size.equalsIgnoreCase("medium"))?12+(2*(numberOfCheeseTopping+numberOfPepperoniTopping)):14+(2*(numberOfCheeseTopping+numberOfPepperoniTopping));
    }
}
