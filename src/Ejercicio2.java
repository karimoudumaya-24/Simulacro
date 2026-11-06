public class Ejercicio2 {
    public static void main(String[] args) {
        double p1 = 7;
        double p2 = 4;
        double n = 2;
        double m = calcular(p1, p2, n);
        System.out.println("Media de puntos por partido: " + m);
        int largo = 8;
        int ancho = 3;
        int area = medir(ancho, largo);
        System.out.println("Area del campo: " + area);
    }
    public static double calcular(double a, double b, double c) {
        double s = a + b;
        double r = s / c;
        return r;
    }
    public static int medir(int x, int y) {
        return x * y;
    }
}