package les1;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {

        quadraticEquation(1, 2, 3);
        quadraticEquation(3, 8, 3);
        quadraticEquation(2, -11, -21);
        quadraticEquation(-11.3, -25.8, 33.9);

    }

    public static void quadraticEquation(double a, double b, double c) {
        System.out.printf("Уравнение: %.1fx^2 %.1fx %.1f ", a, b, c);
        double discr = pow(b, 2) - 4 * a * c;
        double x1;
        double x2;
        if (discr < 0)
            System.out.println("==> корней не имеет");
        if (discr == 0){
            x1 = -b / (2 * a);
            System.out.printf(" ==> имеет корень: %f %n", x1);
        }
        if (discr > 0){
            x1 = (-b + sqrt(discr)) / (2 * a);
            x2 = (-b - sqrt(discr)) / (2 * a);;
            System.out.printf(" ==> имеет корни: %.2f; %.2f %n", x1, x2);
        }
    }


}
