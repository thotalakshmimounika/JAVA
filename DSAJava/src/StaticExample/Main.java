package StaticExample;

public class Main {
    public static void main(String[] args) { // this static mentod is not dependent on object
        Human human = new Human(21,"Mounika",10000);
        Human human1 = new Human(22,"Sai",19000);

        System.out.println(human1.population);
        System.out.println(human.population);
        //greetings1();// static method connot access the not static data. So this method should come either from a static methos or a object dependent class
        //else we can also do this

        Main obj = new Main();
        obj.greetings1(); // explicity creating a obj for reference

        greetings();// Or by making the method static
    }

    void fun(){
        greetings1();
    }// this can possible because void is also a non static method calling another non static method.
    //So, here a fun will ask main to create a object for this. Using that instance fun will call greetings1

    void greetings1(){// beacuse this is dependednt on object
        System.out.println("Hi Mounika.");
    }
        static void greetings(){// beacuse this is dependednt on object
            System.out.println("Hellowww");
        }
}

// Note : Static method can only access another static/instance of object menthods
