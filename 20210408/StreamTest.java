import java.util.Scanner;

public class StreamTest {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        
        if (b == 1)
            System.out.println("One");
        else if (b == 2)
            System.out.println("Two");
        else if (b == 3)
            System.out.println("Three");
    }
}

// 입력을 받아서 1이면 one 2면 two 3이면 three