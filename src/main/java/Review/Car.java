package Review;


public class Car extends Engine {
    private String carName;
    private double carMiles ;


    public Car(){
        this("Audi", 0);
        System.out.println("My first constructor for the car");
        carName = "Audi";
    }


    public Car(String onlyCarName){


        System.out.println("My second Constructor for car");
        this.carName = onlyCarName;
    }


    public Car(String carName, double miles){
        System.out.println("My third constructor for the car");
        this.carName = carName;
        this.carMiles = miles;
    }


    @Override
    public void startEngine() {
        super.startEngine();
    }


    @Override
    public void turnOffEngine() {
        super.turnOffEngine();
    }
}

