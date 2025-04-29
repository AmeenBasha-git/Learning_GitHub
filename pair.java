
import java.util.Scanner;

public class pair {
    public static void main(String[] args) {
        int n=5;
        Scanner s=new Scanner(System.in);
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int key=s.nextInt();
        //pair 
        int temp[]=new int[2];
        for (int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if (arr[i]+arr[j]==key)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
