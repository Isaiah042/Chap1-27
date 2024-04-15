package Review;


public class Things {
    protected String thingName;
    protected static String thingsWords;


    protected final double minimumWage = 13.25;


    public static int counter = 0;


    public int id;




    public Things(){
        id = counter;
        counter++;
    }




    public void showThing(){
        System.out.println("I am a " + thingName + " my unique ID is: " + id + " my description " + thingsWords);
    }


    public static void printsSomethingThatWontChange(){
        System.out.println(thingsWords);
    }


    public double getMinimumWage(){
        return minimumWage;
    }


    public String getThingName() {
        return thingName;
    }


    public static String getThingsWords() {
        return thingsWords;
    }
}


