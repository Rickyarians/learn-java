public class IfStatement {

    // dalam java if adalah salah satu kunci digunakan untuk percabangan
    // percabangan artinya kita mengeksekusi program tertentu ketika suatu kondisi terpenuhi
    // hampir di semua bahasa pemrograman mendukung if expression

    public static void main(String[] args) {


        var nilai = 70;
        var absen = 90;


        if(nilai >= 75 && absen >= 75){


            System.out.println("Anda Lulus");
        } else {

            System.out.println("Anda tidak lulus");
        }

    }
}
