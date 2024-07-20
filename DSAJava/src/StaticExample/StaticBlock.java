package StaticExample;

public class StaticBlock {
    static int a =10;
    static int b;

    static{ // this will only run once at the intial stage of initialisation
        System.out.println("static block");
        b=a*4;
    }

    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();
        System.out.println(a+" "+b);
        b=b+3;
        StaticBlock obj2 = new StaticBlock();
        System.out.println(a+" "+b);
    }

}
