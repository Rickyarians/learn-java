public class SwitchStatement {

    public static void main(String[] args) {

        // kadang kita hanya menggunakan kondisi sedeherna menggunakan perbandingan ==
        // lebih sederhana
        // perbandingannya hanya  ==


        var nilai = "B";

        switch (nilai){
            case "A":
                System.out.println("Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Anda Tidak lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }


    }
}
