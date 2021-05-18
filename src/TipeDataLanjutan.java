public class TipeDataLanjutan {

    public static void main(String[] args) {


        // tipe data bukan primitif

        Integer iniInteger = 100;
        Long iniLong = 1000L;

        Byte iniByte = null;


        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        int iniInt = 100;
        Integer iniInteger2 = iniInt;

        System.out.println(iniInteger2);

        short iniShort = iniInteger2.shortValue();
        long iniLong2 = iniInteger2.longValue();

        System.out.println(iniShort);
        System.out.println(iniLong2);
    }
}
