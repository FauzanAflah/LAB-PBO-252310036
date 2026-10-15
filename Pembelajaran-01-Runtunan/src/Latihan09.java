import java.util.Scanner;

public class Latihan09 {
    Students09 myBio = new Students09();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Students09 s = new Latihan09().myBio;

        System.out.print("NPM: ");
        s.getNPM(in.nextInt());
        in.nextLine();
        System.out.print("Nama Lengkap: ");
        s.getFullname(in.nextLine());
        System.out.print("Nama Kelas: ");
        s.getClassName(in.nextLine());
        System.out.print("Semester: ");
        s.getSemester(in.nextInt());
        System.out.print("IPK: ");
        s.getGPA(in.nextFloat());

        System.out.println();
        System.out.println("NPM          : " + s.NPM);
        System.out.println("Nama Lengkap : " + s.Fullname);
        System.out.println("Nama Kelas   : " + s.ClassName);
        System.out.println("Semester     : " + s.Semester);
        System.out.println("IPK          : " + s.GPA);
    }
}