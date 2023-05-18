package day39_Recap.shapeTask;

public class Shape {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            System.err.println("name can not be null");
            System.exit(1);//exit(1):something went wrong
        }

        //""---> empty string also an object but "null" doesn't mean an object

        if (name.isBlank()||name.isEmpty()){
            System.err.println("Invalid name");
            System.exit(1);//exit(0):Nothing went wrong
        }

        this.name = name;
    }

    public Shape(String name) {
        setName(name);
    }

    public double area(){

        return 0;
    }

    public double perimeter(){
        return 0;
        }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
Shape:
	variables:
			name

	Encapsulate the field

	Add a constructor to set the filed

	Methods:
		area(){}
		perimeter(){}

 */