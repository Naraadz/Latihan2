import java.util.Scanner;

public class LatihanSoalJava {
    public static void main(String[] args) throws Exception {
            Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String name = input.nextLine();

        System.out.print("Masukkan NIM Anda: ");
        int nim = input.nextInt();

        System.out.print("Masukkan usia Anda: ");
        int age = input.nextInt();

        System.out.print("Masukkan tinggi badan Anda: ");
        double height = input.nextDouble();

        System.out.println("\nData yang Anda masukkan");
        System.out.println("Nama Anda: " + name);
        System.out.println("NIM Anda: " + nim);
        System.out.println("Usia Anda: " + age);
        System.out.println("Tinggi Badan Anda: " + height);

        input.close();

        double hasilAritmatika = (age * 2) + 10 / 5.0 - 3;
        System.out.println("Hasil operasi aritmatika: " + hasilAritmatika);

        boolean Upto18 = age > 18;
        System.out.println ("Apakah usia lebih dari 18? " + Upto18);

        boolean UsiaUpto18DanHeightUpto160 = (age > 18) && (height > 160);
        System.out.println("Apakah usia lebih besar dari 18 dan tinggi badan lebih dari 160? " + UsiaUpto18DanHeightUpto160);

        double usiaDouble = (double) age;
        int TinggiBadanInt = (int) height;

        System.out.println("Usia dalam double: " + usiaDouble);
        System.out.println("Tinggi Badan dalam int: " + TinggiBadanInt);

        input.close();

    }
}