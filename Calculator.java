import java.util.Scanner;

public class Calculator {

    int a,b,c; 
    char op;

    static int sum(int a, int b){
        return a+b;
    }

    static int sub(int a, int b){
        return 1;
    }

    static int mul(int a, int b){
        return a*b;
    }

    static int div(int a, int b){
        return 1;
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter expression!");
        int a = sc.nextInt();
        char op = sc.next().charAt(0);
        int b = sc.nextInt();
        

        int result = 0;
        switch(op){
            case '+':
                result = sum(a,b);
                System.out.println(a + " + " + b + " = " + result);
                break;

            case '-':
                result = sub(a,b);
                System.out.println(a + " - " + b + " = " + result);
                break;

            case '*':
                result = mul(a,b);
                System.out.println(a + " * " + b + " = " + result);
                break;

             case '/':
                result = div(a,b);
                System.out.println(a + " / " + b + " = " + result);
                break;

    }
    }
}
