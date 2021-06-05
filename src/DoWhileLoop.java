public class DoWhileLoop {

    public static void main(String[] args) {

        // mirip dengan while
        // perbedaan pengecekan kondisi
        // do while loop pengecekan di akhir
        // perulangan minimal dilakukan sekali


        var counter = 1;

        do {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        } while (counter <= 10);
    }
}
