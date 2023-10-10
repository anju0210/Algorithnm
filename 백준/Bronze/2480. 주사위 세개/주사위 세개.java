import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        int money=0, max;
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();
        if((d1==d2)&&(d2==d3)){
            money = (d1*1000)+10000;
        }
        else if((d1==d2)||(d1==d3)){
            money = (d1*100)+1000;
        }
        else if(d2==d3){
            money = (d2*100)+1000;
        }
        else if(d1!=d2&&d2!=d3){
                if(d1>d2&&d1>d3) max = d1;
                else if(d2>d1&&d2>d3) max = d2;
                else max = d3;
            money = max*100;
        }
        System.out.println(money);
    }
}