import java.util.Objects;
import java.util.Scanner;

public class LineEquality {
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
        System.out.print("Enter p1 Coordinate Value ");
        int p1 = scan.nextInt();
        System.out.print("Enter p2 Coordinate Value ");
        int p2 = scan.nextInt();
        System.out.print("Enter q1 Coordinate Value ");
        int q1 = scan.nextInt();
        System.out.print("Enter q2 Coordinate Value ");
        int q2 = scan.nextInt();
        double line1=lenth(x1, x2, y1, y2);
        double line2=lenth2(p1, p2, q1, q2);
        if (Objects.equals(line1,line2)){
            System.out.println("The Line Are Equal");
            System.out.println("Line One Value " +line1+ " Line Two Value "+line2);
        }
        else {
            System.out.println("The Are Not Equal");
            System.out.println("Line One Value " +line1+ " Line Two Value "+line2);
        }
    }

    static double lenth(int x1, int x2, int y1, int y2) {
        double X = Math.pow((x1 - x2), 2);
        double Y = Math.pow((y1 - y2), 2);
        return Math.sqrt(X + Y);
    }
    static double lenth2(int p1, int p2, int q1, int q2) {
        double A = Math.pow((p1 - p2), 2);
        double B = Math.pow((q1 - q2), 2);
        return Math.sqrt(A + B);
    }
}
