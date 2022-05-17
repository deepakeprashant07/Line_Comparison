import java.util.Scanner;

public class LineLength {
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter X1 Coordinate Value ");
        int x1 = scan.nextInt();
        System.out.print("Enter X2 Coordinate Value ");
        int x2 = scan.nextInt();
        System.out.print("Enter Y1 Coordinate Value ");
        int y1 = scan.nextInt();
        System.out.print("Enter Y2 Coordinate Value ");
        int y2 = scan.nextInt();
        System.out.println("Both Line Length is = " + Math.round(lenth(x1, x2, y1, y2) * 100000.0 / 100000.0));
    }

    static double lenth(int x1, int x2, int y1, int y2) {
        double X = Math.pow((x1 - x2), 2);
        double Y = Math.pow((y1 - y2), 2);
        return Math.sqrt(X + Y);
    }
}
