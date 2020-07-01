public class AppHelloWorld {
    public static void main(String[] args) {
        System.out.println(greetMates());
        int a = 5;
        int b = 10;
        System.out.println(sum(a,b));

    }
    public static String greetMates(){return "Hello mates!";}
    public static int sum(int a, int b) {
        return a + b;
    }
}
