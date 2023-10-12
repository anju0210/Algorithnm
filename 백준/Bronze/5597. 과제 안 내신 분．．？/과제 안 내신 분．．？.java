import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a;
        int n[] = new int[31];
        for(int i=1; i<=28; i++){
            a = sc.nextInt();
            n[a] = 1;
        }
        for(int i=1; i<n.length; i++){
            if(n[i] == 0){
                System.out.println(i);
            }
        }
    }
}