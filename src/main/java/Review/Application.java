package Review;
import java.util.Scanner;


import Ghost.Helper;
import Guardian.Titan;
import Guardian.Hunter;
import Guardian.Warlock;

public class Application {

    public static void main(String[] args) {


        //Part 1
        System.out.println("Getting out of group c");
        //Part 2
//        int myNum = 0;
//        short myShort = 0;
//        long myLong = 1000000000L;
//
//        double myDouble = 10.003;
//        float myFloat = 85.2F;
//
//        char myChar = 'z';
//        boolean myBoolean = true;
//
//        byte myByte = 127;
//
//        System.out.println(myNum);
//        System.out.println(myShort);
//        System.out.println(myLong);
//        System.out.println(myDouble);
//        System.out.println(myFloat);
//        System.out.println(myChar);
//        System.out.println(myBoolean);
//        System.out.println(myByte);
//        //Part 3
//        String myText = "This is boring";
//        String nothing = " ";
//        String myWords = "get me out";
//
//        String mySentence = myText + nothing + myWords;
//        System.out.println(mySentence);
//
//        System.out.println("Hola" + " " + "Isaiah");
//
//        System.out.println("My int is " + myNum);
//        System.out.println("My double is " + myDouble + " also hi");
//        //Part 4
//        boolean true1 = true;
//        boolean false1 = 4 < 3;
//
//        while (myNum <= 11 ){
//            System.out.println("While Loop " + myNum);
//            myNum = myNum + 1;
//        }
//        //Part 5
//        for (int i = 1; i <= 3; i++){
//            System.out.println("For Loop " + i);
//        }
//        //Part6
//        if (myDouble == 42){
//            System.out.println("They are equal");
//        }else if (myDouble > 11){
//            System.out.println("My number is greater");
//        }else {
//            System.out.println("Your number doesn't fit the conditions");
//        }
//
//        int myNewNum = 1;
//        while (true){
//            System.out.println("This number is: " + myNewNum);
//            if (myNewNum == 5){
//                break;
//            }
//            myNewNum++;
//            System.out.println("I will print until I equal a certain number in my if statement" );
//        }
//        //Part 7
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter something");
//        String input = scanner.nextLine();
//        System.out.println("Entered: " + input);
//
//        System.out.println("Enter number");
//        double inputNum = scanner.nextInt();
//        System.out.println("Entered: " + inputNum);
//        //Part 8
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter num 4");
//        double num = scan.nextDouble();
//
//        while (num != 4 ){
//            System.out.println("Please put 4");
//            num = scan.nextDouble();
//        }
//        //Part8
//        int myNewNum2;
//        do {
//            System.out.println("Enter num less than 4");
//             myNewNum2 = scan.nextInt();
//        }while (myNewNum2 > 3);
//        System.out.println("Congrats");
        //Part9
//        System.out.println("Please enter some word");
//        String input2 = scanner.nextLine();
//        switch (input2.toLowerCase()){
//            case "my":
//                System.out.println("My code worked");
//                break;
//            case "it":
//                System.out.println("My code still worked");
//                break;
//            default:
//                System.out.println("Put My or It ONLY");
//        }
        //Part10
//        double[] numbers;
//        numbers = new double[5];
//        System.out.println(numbers[0]);
//        numbers[0] =5;
//        numbers[1] =10;
//        numbers[2] =15;
//
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//
//        for (double i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[1]);
//        }
//        double[] mySecondSetNumber = {10.00, 205.00, 18.00};
//        for (int i = 0; i < mySecondSetNumber.length; i++) {
//            System.out.println(mySecondSetNumber[i]);
//        }
//        //Part11
//        String[] someWords = new String[3];
//        someWords[0] = "Hola";
//        someWords[1] = "para";
//        someWords[2] = "tu";
//
//        System.out.println(someWords[0]);
//
//        String[] cars = {"Lambo", "Ferrari", "Bentley"};
//        for (String myCars: cars){
//            System.out.println(myCars);
//        }
//        String text = null;
//        System.out.println(text);
//
//        String[] texts = new String[2];
//        texts[0] = "one element";
//        System.out.println(texts[0]);
        //Part12


//        int[][] multiArray = {
//                {5, 20, 10},
//                {1, 2, 3}
//        };
//        System.out.println(multiArray[0][1]);
//        String[][] muiltWordString = new String[2][3];
//
//        muiltWordString[0][1] = "Hola";
//        System.out.println(muiltWordString[0][1]);
//
//        for (int row = 0; row < multiArray.length; row++ ){
//            for (int column = 0; column < multiArray[row].length; column++) {
//                System.out.println(multiArray[row][column] + "\t");
//            }
//        }
//        String[][] newWords = new String[2][];
//        System.out.println(0);
//        newWords[0] = new String[3];
//        newWords[0][1] = "What's Good";
//        System.out.println(newWords[0][1]);
        //Part13/21
//        Review.Person p1 = new Review.Person();
//        p1.name = "Isaiah";
//        p1.age = 18;
//
//        Review.Person p2 = new Review.Person();
//        p2.name = "Nelson";
//        p2.age = 20;
//
//        System.out.println(p1.toString());
//        System.out.println(p2.toString());
//        p1.speak();
//        p2.imFrom();
//
//        double years = p2.returnYearsLeftBeforeRetirement();
//        System.out.println("Year's left: " + years);
//
//        int age = p1.getAge();
//        String name = p1.getName();
//        System.out.println("Im years old: " + age + "\n" + "My name is: " + name + " "
//        + "and I have " + p1.returnYearsLeftBeforeRetirement() + " years left until retirement");
        //Part14/17/18
//            Review.Animal animal = new Review.Animal();
//            animal.setAnimal("Dog");
//            animal.setAge(2);
//        System.out.println("Review.Animal: " + animal.getAnimal() + ", Years old: " + animal.getAge());
        //Part15/16
//        Review.Car car1 = new Review.Car();
//        System.out.println();
//        Review.Car car2 = new Review.Car("Acura");
//        System.out.println();
//        Review.Car car3 = new Review.Car("Honda", 140000);
        //Part19
//        Review.Things.thingsWords = "my description cannot change because its static";
//
//        Review.Things t1 = new Review.Things();
//        System.out.println(t1.id);
//        Review.Things t2 = new Review.Things();
//        System.out.println(t2.id);
//
//
//        t1.thingName = "Cat";
//        t2.thingName = "Dog";
//        t1.showThing();
//
//        System.out.println();
//
//        Review.Things.printsSomethingThatWontChange();
//        Review.Things t3 = new Review.Things();
//        t3.thingName = "hourly pay";
//        System.out.println("Current minimum wage: " + t3.getMinimumWage());
//        System.out.println(t3.id);
//        System.out.println(t1.id);
        //Part20
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("Let this be over ");
//            stringBuilder.append("");
//            stringBuilder.append("Help");
//        System.out.println(stringBuilder.toString());
        //Part22
//        Cake cake = new Cake();
//        cake.cakesIngredients();
//        CheeseCake cheeseC = new CheeseCake();
//        cheeseC.cakesIngredients();
//        //Part23
//        CakePans pan = new CheeseCake();
//        pan.measurementsOfCakePans();
//        CakePans pan2 = new Cake();
//        pan2.measurementsOfCakePans();
        //Part24
//        Titan guardian = new Titan();
//        Hunter guardian2 = new Hunter();
//        Warlock guardian3 = new Warlock();
//        Helper ghost = new Helper();
        //Part25/27
//          Animal rat = new Animal();
//          rat.setAnimal("rat");
//          rat.setAge(4);
//          rat.fur = "rough";
//            System.out.println(rat.getAnimal() + " " + rat.getAge() + " " + rat.fur);
        //Part26
        Engine engine = new Engine();
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        Engine engine1 = car;

        engine.startEngine();
        engine1.turnOffEngine();
        motorcycle.startEngine();

    }
}