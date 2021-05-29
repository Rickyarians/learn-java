public class ArrayInitializer {

    public static void main(String[] args) {


        int[] arrayInt = new int[]{
                10, 20, 30, 40, 50
        };


        long[] arrayLong = {
                10, 20, 30, 40, 50
        };


        String[] namaNama = {
                "Ricky", "Ariansyah", "Achmad", "Sugandi"
        };

        System.out.println(namaNama[0]);
        System.out.println(namaNama.length);


        // delete array -> tidak ada penghapusan
        namaNama[0] = null;

        System.out.println(namaNama[0]);

    }
}
