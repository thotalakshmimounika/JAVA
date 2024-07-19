package Basics;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
        //stores 5 int values
        int[] numbers =new int[10];
        //stores 5 String values
        String[] val = new String[5];
        // data of 5 students
        int[] rolno = new int[5];
        String[] names = new String[5];
        float[] marks = new float[5];

        //If we need a all these properties/ data as One datatype/Entity - We create class
        //class - It is group of properties and functions

       // Student[] students = new Student[5];
//        Student kunal;
//        System.out.println(Arrays.toString(students));
        Student Mounika = new Student(1,"Mounika Thota",87.9f);
        Student Sai = new Student();
        Mounika.greetings();
        Sai.name =" Shiva Sai";
        //Sai.greetings();

        Student rahul = new Student();
        Student satya = new Student(12,"Satya",56.8f);
        System.out.println(rahul.name);
        rahul.greetings();
    }
    //create a class
    static class Student{
        int rollno;
        String name;
        float marks;

        Student(){
            // we can also call other constructor
            this(25,"Random Person",100f);
        }
        Student(int rollno, String name, float marks){
            this.rollno=rollno;
            this.name= name;
            this.marks=marks;
        }
        void greetings(){
            System.out.println("Hello my name is : "+this.name);
        }
    }
}
