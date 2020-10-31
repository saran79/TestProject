package collections;

public class ArrayIteration {
    int a[] = { 1,2,3,4,5};

    public int test()
    {
        return a[2];

    }

    public static void main(String[] args) {
        ArrayIteration ai = new ArrayIteration();
        int b = ai.test();
        System.out.println(b);
    }

}
