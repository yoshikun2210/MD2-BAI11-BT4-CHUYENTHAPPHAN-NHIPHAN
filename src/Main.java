import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thập phân :");
        int number = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        while (number != 0){
            int a = number % 2;
            stack.push(a);
            number /= 2;
        }
        int[] a = new int [stack.size()];
        for (int i = 0; i < a.length; i++){
            a[i] = stack.pop();
        }
        System.out.println(Arrays.toString(a));
    }
}
