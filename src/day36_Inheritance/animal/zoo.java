package day36_Inheritance.animal;

public class zoo {
    public static void main(String[] args) {
        Dog dog=new Dog();
      dog.setInfo("Max","Husky",'M',2,"Small","White");


        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        //dog.hunt(); it is method of tiger .There isn't any relation between tiger
        //dog.scratch();

        System.out.println(dog);

        Cat cat=new Cat();
        cat.setInfo("Tarcin","British",'M',3,"Small","Brown");
        cat.eat();
        cat.sleep();
        cat.move();
        //cat.bark();
        //cat.hunt();
        cat.scratch();
        System.out.println(cat);

        Tiger tiger=new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'M',4,"Large","Orange");
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();

        tiger.hunt();
        tiger.roar();

        System.out.println(tiger);


    }
}
