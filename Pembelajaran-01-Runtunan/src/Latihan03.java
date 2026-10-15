public class Latihan03 {
    static double pi = 3.14;   
    
    static void layangLayang(double d1, double d2, double s1, double s2) {
        double luas = d1 * d2 / 2;         
        double keliling = 2 * (s1 + s2);
        System.out.println("Layang-layang");
        System.out.println("Luas     : " + luas);
        System.out.println("Keliling : " + keliling);
    }

    static void prismaSegitiga(double a, double t, double m, double tp) {
        double luasAlas = a * t / 2;        
        double luas = 2 * luasAlas + (a + t + m) * tp;
        double volume = luasAlas * tp;
        System.out.println("Prisma Segitiga");
        System.out.println("Luas Permukaan : " + luas);
        System.out.println("Volume         : " + volume);
    }

    public static void main(String[] args) {
        layangLayang(10, 8, 6, 5);
        System.out.println();
        prismaSegitiga(3, 4, 5, 10);
    }
}