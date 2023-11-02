import java.util.Scanner;

public class LuasKerucut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari kerucut: ");
        double radius = input.nextDouble();

        System.out.print("Masukkan tinggi kerucut: ");
        double height = input.nextDouble();

        double slantHeight = Math.sqrt(radius * radius + height * height);

        double luasPermukaan = Math.PI * radius * (radius + slantHeight);

        System.out.println("Luas permukaan kerucut adalah: " + luasPermukaan);

        input.close();
    }
}
