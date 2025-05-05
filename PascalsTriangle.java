import java.util.*;
class  PascalsTriangle{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<=n; i++) {
            int count = 1;

            for(int j=0; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print( count+ " ");
                count = count * (i - j) / (j + 1);
             }
             System.out.println();
        }
        
    }
}