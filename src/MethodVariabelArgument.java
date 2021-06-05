public class MethodVariabelArgument {

    public static void main(String[] args) {

        int[] values = {80, 65, 65, 56, 76, 80, 90};
        sayCongrats("Ricky", values);
        sayCongratsCoba("Liki", 80, 65, 65, 56, 76, 80, 90);

    }

    static void sayCongrats(String name, int[] values) {

        var total = 0;

        for (var value : values){
            total += value;
        }

        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }


    static void sayCongratsCoba(String name, int... values) {

        var total = 0;

        for (var value : values){
            total += value;
        }

        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
