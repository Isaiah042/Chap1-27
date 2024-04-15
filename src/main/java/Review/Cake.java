package Review;

public class Cake implements CakePans {


    public void cakesIngredients(){
        System.out.println("I use butter");
    }


    public double cookingTime(){
        return 0;
    }


    @Override
    public void measurementsOfCakePans() {
        System.out.println("My pan is 10 by 20");
    }




}
