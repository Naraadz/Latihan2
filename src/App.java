import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int umur = 20;
        double IPK = 4.0;
        char inisial = 'N';
        String nama = "Nara";

        System.out.println("Nama :" + nama + "Umur :" + umur + "IPK :" + IPK + "inisial :" + inisial);

        byte nomorByte = -127;
        short nomorShort = 32767;
        long nomorLong = 100000000;
        float phi = 3_14F;

        System.out.println("Byte : " + nomorByte + "\nShort : " + nomorShort + "\nLong : " + nomorLong + "\nFloat : " + phi);

        boolean isJavaFun = true;

        System.err.println(isJavaFun);

        char var1 = 65;
        System.out.println(var1);

        String firstName = "Gavin";
        String lastName = "Kim";

        String fullName = firstName + firstName + " " + lastName;
        System.out.println(fullName);

        System.out.print("Masukkan nama Anda: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Masukkan umur Anda: ");
        int age = input.nextInt();
        System.out.print("Masukkan tinggi badan Anda: ");
        double height = input.nextDouble();

        System.out.println("\nData yang Anda masukkan:");
        System.out.println("Nama Anda: " + name);
        System.out.println("Umur Anda: " + age);
        System.out.println("Tinggi badan Anda: " + height);

        input.close();

    }
}
