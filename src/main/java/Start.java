import java.util.Scanner;
public class Start {

    public static void main (String[] args) {
        //some micro change to create a pull request

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты первого вектора:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double z1 = scanner.nextDouble();
        System.out.println("Введите координаты второго вектора:");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double z2 = scanner.nextDouble();



        Vector vector1 = new Vector(x1,y1,z1);
        Vector vector2 = new Vector(x2,y2,z2);
        System.out.println("Длина первого вектора:");
        System.out.println(vector1.getModule());

        System.out.println("Длина второго вектора:");
        System.out.println(vector2.getModule());

        System.out.println("Сумма векторов:");
        System.out.println(vector2.getAddition(vector1));

        System.out.println("Разность первого и второго векторов:");
        System.out.println(vector1.getSubtraction(vector2));

        System.out.println("Векторное произведение:");
        System.out.println(vector1.getVector(vector2));

        System.out.println("Скалярное произведение:");
        System.out.println(vector1.getScalar(vector2));

        System.out.println("Косинус угла:");
        System.out.println(vector1.angle(vector2));





    }

}
