public class SwitchYield {

    public static void main(String[] args) {


        var nilai = "A";
        String ucapan;



        switch (nilai){
            case "A" -> {
                ucapan = "Anda Lulus Dengan Baik";
            }
            case "B", "C" -> {
                ucapan = "Nilai anda cukup baik";
            }
            case "D" -> {
                ucapan = "Anda tidak lulus";
            }
            default -> {
                ucapan = "Mungkin Anda Salah Jurusan";
            }

        }

        System.out.println(ucapan);


       }
}
