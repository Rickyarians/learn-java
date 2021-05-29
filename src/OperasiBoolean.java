public class OperasiBoolean {

    public static void main(String[] args) {

        // operasi yang diperuntukkan sifatnya boolean

        var absen = 70;
        var nilaiAKhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilaiAkhir = nilaiAKhir >= 75;


        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);
    }
}
