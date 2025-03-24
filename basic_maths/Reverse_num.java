import java.util.Scanner;
class Method{
        public int Reverse(int num)
        {
            int sum = 0;
            while(num>0)
            {
                int r = num%10;
                sum = (sum*10)+r;
                num = num/10;
            }
            return sum;



        }
}
public class Reverse_num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Method m = new Method();
        System.out.println("Enter Any Numbe : ");
        int num = sc.nextInt();
        System.out.println(num+" in Revese : "+m.Reverse(num));
        sc.close();
    }
}

