import java.util.Arrays;
import java.util.Scanner;
public class Grid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        task(n);
    }
    public static void task(int n){
        int [][] arr=new int [n][n];
        int range=(19-2)+1;         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int data=(int)((Math.random()*range)+2);
                arr[i][j]= data%2==0?data:data+1;
            }
        }
        for(int i=0;i<n;i++){
            if(i==0) {
                int tempj = 0;
                for (int p = 0; p < n; p++) {
                    if(p==0) System.out.print("   ");
                    System.out.print("  " + i + "" + (tempj++));

                }
                System.out.println();
                for (int q = 0; q < n; q++) {
                    if (q == 0) System.out.print("    ");
                    System.out.print("+----");
                }
                System.out.println("+");
            }

            for(int j=0;j<n;j++){


                    if(j==0) System.out.print(j+""+i+" ");
                    if(arr[i][j]/10==0 )System.out.print(" |  "+(arr[i][j]));
                    else System.out.print(" | "+(arr[i][j]));

            }
                System.out.println(" |");
                for (int q = 0; q < n; q++) {
                    if (q == 0) System.out.print("    ");
                    System.out.print("+----");
                }
                System.out.println("+");

        }
    }
}