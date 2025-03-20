import java.util.Scanner;

public class Matrix 
{
    public static void main(String[] args) 
    {
        int[][] a = new int [2][2];
        int[][] b = new int [2][2];
        int[][] c = new int [2][2];

        Scanner s = new Scanner(System.in);
        System.out.println("Matrix A");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.println("Enter value of A:");
                a[i][j] = s.nextInt();
            }
            System.out.println();
        }
        System.out.println("Matrix B");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.println("Enter value of B:");
                b[i][j] = s.nextInt();
            }
            System.out.println();
        }
        System.out.println("Additon of Matrix");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Subtraction of Matrix");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                c[i][j] = a[i][j] - b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
