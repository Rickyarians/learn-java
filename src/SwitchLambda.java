public class SwitchLambda {

    public static void main(String[] args) {


        var nilai = "A";

        switch (nilai){
            case "A" -> {
                System.out.println("Anda Lulus Dengan Baik");
            }
            case "B", "C" -> {
                System.out.println("Nilai anda cukup baik");
                }
                case "D" -> {
                System.out.println("Anda tidak lulus");
                }
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }

            }
        }
    }
