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
    }

    static void output(String s, int y) {
        System.out.println("вывожу строку "+s+" несколько раз");
        for (int i = 0; i < y; i++) {
            System.out.print(s);
        }
        System.out.println();
    }
}
