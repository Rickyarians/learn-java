public class SwitchYieldAnother {

    public static void main(String[] args) {

        var nilai2 = "A";


        String ucapan = switch (nilai2) {
            case "A" -> {
                yield "Wow, anda lulus";
            }
            default -> {
                yield "Kocak";
            }
        };

        System.out.println(ucapan);
    }
}
