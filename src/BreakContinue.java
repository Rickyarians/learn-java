public class BreakContinue {

    public static void main(String[] args) {
        //break unuk menghentikan case dalam switch

        // sama dengan perulangan break juga digunakan untuk menghentikan perulangan


        var counter = 1;

        while (true) {
            System.out.println("Perulangan" + counter);
            counter++;


            if(counter > 10) {
                break;
            }
        }

        System.out.println("Perulangan Berhenti");
    }
}
