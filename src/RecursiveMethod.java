public class RecursiveMethod {

    public static void main(String[] args) {

        System.out.println(factorialLoop(5));

        System.out.println(factorialRecursiv(5));
    }



    static int factorialLoop(int value) {
        var result = 1;


        for(var counter = 1; counter <= value; counter++) {
           result *= counter;
        }


        return result;

    }

    static int factorialRecursiv(int value){
        if(value == 1){
            return 1;
        } else {
            return value * factorialRecursiv(value-1);
        }
    }
}
