package General;

public class ConstructorDemo {
    public int ab;
    public ConstructorDemo() {
        System.out.println("I am a constructor");
    }
    public ConstructorDemo( int a) {
        System.out.println("I am an Overloaded constructor");
        ab = a;
        System.out.println(ab);

    }
     public void getAB(){
         System.out.println(ab);
     }

    public static void main(String[] args) {
        ConstructorDemo cd = new ConstructorDemo();
        int a =5;
        ConstructorDemo cd1 = new ConstructorDemo(a);
        cd1.getAB();

    }
}


