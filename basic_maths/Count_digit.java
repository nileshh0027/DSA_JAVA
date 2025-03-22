import java.util.Scanner;

class Method{
    int digits(int num)
    {
        int count = 0;
        while(num>0)
        {
            num = num/10;
            count++;
        }
        return count;

    }
}

class Count_digit{
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        Method m = new Method();
        System.out.println("Enter Any Number : ");
        num = sc.nextInt();
        System.out.println("There is "+m.digits(num)+" Digits in "+num);
    }
}