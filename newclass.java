import java.util.Scanner;

public class newclass {
    String name;
    int d;
    int salary;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        newclass m=new newclass();
        System.out.println("Enter the value ");
        m.name=s.nextLine();
        m.d=s.nextInt();
        m.salary=s.nextInt();
        System.out.println(m.d*m.salary);

    }
}
