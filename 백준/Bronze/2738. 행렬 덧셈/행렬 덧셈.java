import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int a[][] = new int[n][m];
        int ip;
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                ip = sc.nextInt();
                a[i][j] += ip;
            }
        }
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}