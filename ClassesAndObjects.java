
class Car{
    String model;
    String color;
    String type;
    int year;

    public void start(){
        System.out.println(model+" is starting");
    }

    public void drive(){
        System.out.println(model+" is driving");
    }

    public void stop(){
        System.out.println(model+" is stopped");
    }

    public void description(){
        System.out.println("Name: "+model);
        System.out.println("Color: "+color);
        System.out.println("Type: "+type);
        System.out.println("Manufacturing Year: "+year);
    }
}

public class ClassesAndObjects{
    public static void main(String args[])
    {
        Car tata = new Car(); // Creating new object of class Car
        
        tata.model = "Harrier";
        tata.color = "Black";
        tata.type = "SUV";
        tata.year = 2024;

        tata.description();
        tata.start();
        tata.drive();
        tata.stop();

    }
}