import java.util.Scanner;

public class Functions {

    static void output(int x) {
        System.out.println("вывожу число, равное " + x);
    }

    static void output(double x) {
        System.out.println("вывожу вещественное число, равное " + x);
    }

    static void output(double x, double y) {
        System.out.println("вывожу пару чисел (" + x+", "+y+")");
    }


    public static void main(String[] args) {
        output(556);
        int x = 12;
        int y = 130;
        output(x + 2 * y);
        output((int) 36.6);
        output(73.2);

        output(14, 15.7);
        output("Семь",3);
        A.output("просто строка");
        // пошли сложные объекты
        Point pointOne = new Point();
        pointOne.x = pointOne.y = 12;
        output(pointOne);

        pointOne = inputPoint("введите координаты новой точки");
        output(pointOne);

        //
        double z = 1;
        for (int i = 0; i < 4; i++) {
            move(z, 13.5);
        }

        for (int i = 0; i < 3; i++) {
            move(pointOne, 2.5);
        }

        Double z2 = z;
        for (int i = 0; i < 4; i++) {
            move(z2, 10);
        }
    }

    static void move(Point pp, double distance)
    {
        pp.x = pp.x+distance;
        output(pp);
    }

    static void move(Double x, double distance)
    {
        x =  x+distance;
        output(x);
    }
    static void move(double x, double distance)
    {
        x = x+distance;
        output(x);
    }
    static void output(String s, int y) {
        System.out.println("вывожу строку "+s+" несколько раз");
        for (int i = 0; i < y; i++) {
            System.out.print(s);
        }
        System.out.println();
    }

    static void output(Point p) {
        System.out.println("вывожу точку (" + p.x+", "+p.y+")");
       // output(p.x, p.y);
    }

    static Point inputPoint(String s){
        Point p = new Point();
        Scanner scan = new Scanner(System.in);
        System.out.println(s);
        p.x = scan.nextDouble();
        p.y = scan.nextDouble();
        return p;
    }



}

class A{
    static void output(String s) {
        System.out.println("A.output выводит: "+s);
    }
}


class Point{
    double x;
    double y;
}