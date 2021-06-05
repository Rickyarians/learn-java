public class MethodReturnValue {


    public static void main(String[] args) {


        var a = 100;
        var b = 200;
        var c = sum(a, b);

        System.out.println(c);

    }


    static int sum(int a, int b) {
        var total = a + b;

        return total;
    }
}
