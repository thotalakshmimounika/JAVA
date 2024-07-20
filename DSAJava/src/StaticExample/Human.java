package StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    static long population;

    //Static - It is only declared at classes level and no object creation is required for these static variables.
    // It will be common across the all the objects and available at class level

    static void message(){
        System.out.println("Hello andi");
        //System.out.println(this.age);// we cannot access age beacuse it needs an instance of object
    }

    Human(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population +=1;
    }
}
