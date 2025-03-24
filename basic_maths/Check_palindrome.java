import java.util.Scanner;
class Method{

        public boolean Check(int num)
        {
            int tmp = num;
            int sum = 0;
            while(tmp>0)
            {
                int r = tmp%10;
                sum = (sum*10)+r;
                tmp = tmp/10;
            }
            if(sum==num)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
}
public class Check_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Method m = new Method();
        System.out.println("Enter any Number : ");
        int num = sc.nextInt();
        if(m.Check(num))
        {
            System.out.println(num+" is Palindrome");
        }
        else
        {
            System.out.println(num+" is not Palindrome");
        }
        sc.close();
    }
}
