package Review;


public class Person {
    String name;


    int age;




    void speak(){
        System.out.println("Name: " + name + ", Im " + age + " years old");
    }


    void imFrom(){
        System.out.println("I'm " + name + ", and I'm from New York");
    }


    int returnYearsLeftBeforeRetirement(){
        int yearsLeft = 65 - age;
        return yearsLeft;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    String getName(){
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name).append(" ").append(age);
        return builder.toString();
    }
}

