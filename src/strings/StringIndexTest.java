package strings;

public class StringIndexTest {
    public static void main(String[] args) {
        String msg = "Hello World!";
        String newMsg = msg.substring(6,12) + msg.substring(12,6);
        System.out.println(newMsg);
    }

}

