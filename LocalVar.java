
public class LocalVar {
    public static void main(String[] args) {
        int x = 10;               // x is a local variable


        String message = "Hello, world!";// message is also a local

        System.out.println("x = " + x);
        System.out.println("message = " + message);

        if (x > 5) {
            String result = "x is greater than 5"; //result is loacl varible
            System.out.println(result);
        }


        for (int i = 0; i < 3; i++) {
            String loopMsg = "Iteration " + i; // loopMeg is a local variable
            System.out.println(loopMsg);
        }

    }

}