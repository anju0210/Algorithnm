import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[9][9];
        int max[] = new int[3];
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                a[i][j] = sc.nextInt();
                if(i==0&&j==0) max[0] = a[i][j];
                if(a[i][j]>=max[0]){
                    max[0] = a[i][j];
                    max[1] = i+1;
                    max[2] = j+1;
                }
            }
        }
        System.out.println(max[0]);
        System.out.println(max[1]+" "+max[2]);
    }
}