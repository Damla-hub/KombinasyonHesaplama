import java.util.Scanner;
public class KombinasyonHesaplama {
    public static void main(String[] args) {
        int factorialThree=1,factorialOne=1,factorialTwo=1,numberOfElements,subset;
        Scanner input=new Scanner(System.in);
        System.out.print("Küme eleman saysıını giriniz : ");
        numberOfElements=input.nextInt();
        System.out.print("Alt küme eleman saysını giriniz : ");
        subset=input.nextInt();
        int n=numberOfElements-subset;
        for(int i=1;i<=numberOfElements;i++){
            factorialOne=factorialOne*i;
        }
        for(int i =1;i<=subset;i++){
            factorialTwo*=i;
        }
        for (int i=1;i<=n;i++){
            factorialThree*=i;
        }
        double combination = factorialOne/(factorialTwo*factorialThree);
        System.out.print("C("+numberOfElements+","+subset+")="+combination);
    }
}
