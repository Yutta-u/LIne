import java.util.Scanner;

public class LIne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = scan.nextInt();
        double y = scan.nextInt();
        double x1 = scan.nextInt();
        double y1 = scan.nextInt();

        double z = ((x - x1) * (x - x1)) + ((y - y1) * (y - y1));
        double z1 = () Math.sqrt(z);
        System.out.println(z1);
    }
}
