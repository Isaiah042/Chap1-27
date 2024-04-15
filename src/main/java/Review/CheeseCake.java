package Review;


import Review.Cake;
import Review.CakePans;


public class CheeseCake extends Cake implements CakePans {


    public void cheeseCakeCrust(){
    }


    @Override
    public double cookingTime() {
        return super.cookingTime();
    }


    @Override
    public void cakesIngredients() {
        System.out.println("I have different ingredients");


    }


    @Override
    public void measurementsOfCakePans() {
        System.out.println("My measurements are 5 by 8");
    }
}

