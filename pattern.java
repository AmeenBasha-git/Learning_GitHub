import java.util.Scanner;
public class pattern{
    public static void main( String[] j)
    {
        Scanner s = new Scanner(System.in);
        int num=4;
        System.out.println("===================");
        for (int row=4;row>0;row--)
        {
            for (int col=0;col<row;col++)
            {
                System.out.print(1+" ");
            }
            for (int col1=0;col1<2*(num-row);col1++)
            {
                System.out.print("  ");
            }
            for (int col2=0;col2<row;col2++)
            {
                System.out.print("1"+" ");
            }
            System.out.println();
        }
    

        for (int row=1;row<=num;row++)
        {
            for (int col=0;col<row;col++)
            {
                System.out.print("1"+" ");
            }
            for (int col1=0;col1<2*(num-row);col1++)
            {
                System.out.print("  ");
            }
            for (int col2=row;col2>0;col2--)
            {
                System.out.print("1"+" ");
            }
            System.out.println();
        }

    }  
}