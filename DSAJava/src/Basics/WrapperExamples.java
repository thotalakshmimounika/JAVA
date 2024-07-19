package Basics;

public class WrapperExamples {
    public static void main(String[] args) {
        int a =10;
        int b=20;
        Integer num1 = 56;
        Integer num2 = 5;
        //non-static method swap1(int,int) cannot be referenced from a static context
        //swap1(a,b);
        swap2(num1,num2);
        final int x=10; // variable that has final keyword should be given the value at the time //of initialisation.This cannot be changed later


        final A mounika = new A("Mounika");
        mounika.name="XYS"; // Here I can change the details

        A obj;
        for(long i=0;i<1000000000;i++){
            obj = new A("new Obj");
        }

    }
    //cannot pass values by reference. Java is always Pass by Value
    void swap1(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
    static void swap2(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
    static class A{
        String name;
        int age;
        A(String name){
            this.name = name;
        }
         protected void finalise() throws Throwable{
            System.out.println("finalise, Object is destroyed");
         }
    }
}
