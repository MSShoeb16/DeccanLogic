import java.util.*;
 
class Problem3 {
    static float squareRoot(int num, int precision)
    {
        int start = 0, end = num;
        int mid;
        double ans = 0.0;
        while (start <= end) {
            mid = (start + end) / 2;
 
            if (mid * mid == num) {
                ans = mid;
                break;
            }
            if (mid * mid < num) {
                start = mid + 1;
                ans = mid;
            }
            else {
                end = mid - 1;
            }
        }
        double increment = 0.1;
        for (int i = 0; i < precision; i++) {
            while (ans * ans <= num) {
                ans += increment;
            }
 
            ans = ans - increment;
            increment = increment / 10;
        }
        return (float)ans;
    }

    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter No: ");
        int no= sc.nextInt();
       System.out.println("Enter precision: ");
        int prec= sc.nextInt();
          System.out.println(squareRoot(no,prec));
    }
}
 