package OOPSinJAVA;
import java.util.Scanner;
public class StudentClass {


    static class Student{
        String name;
        int rno;
        double percent;
    } 
    public static void change(Student s1){
        s1.name="Rohan";
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student s1 = new Student();

        s1.name="Ayush";
        s1.rno=1;
        s1.percent= 78.8;
        System.out.println(s1.name);
        s1.name="Bapu";
        System.out.println(s1.name);

        Student s2 = new Student();
        s2.name = "Sheetal";
        s2.rno= 95;
        s2.percent=9.3;
        int x=5; 
        System.out.println(s1.name);
        change(s1);
        System.out.println(s1.name);       
    }
}
