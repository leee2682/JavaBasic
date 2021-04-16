import java.util.Scanner;
import java.util.Random;

public class Quiz2 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int retry;

        // do {
        //     System.out.println("정숫값 :");
        //     int n = sc.nextInt();

        //     if (n > 0) {
        //         System.out.println("이 값은 양수입니다.");
        //     } else if (n < 0) {
        //         System.out.println("이 값은 음수입니다.");
        //     } else {
        //         System.out.println("이 값은 0 입니다.");
        //     }

        // System.out.println("다시 한번? 1-Yes / 0-No : ");
        // retry = sc.nextInt();
        // } while (retry == 1);

        // 4-2
        // Scanner sc = new Scanner(System.in);

        // int n;

        // do {
        //     System.out.print("세 자리의 정수값 : ");
        //     n = sc.nextInt();
        // } while (n < 100 || n > 999);

        // System.out.print("입력한 값은 " + n + "입니다.");

        // 4-3
        // Random rand = new Random();
        // Scanner sc = new Scanner(System.in);
        
        // int no = 10 + rand.nextInt(90); // 정답 생성

        // System.out.println("숫자 맞추기 게임 시작!");
        // System.out.println("10부터 99 사이의 숫자를 맞추세요.");

        // int x;

        // do {
        //     System.out.print("어떤 숫자일까? : ");
        //     x = sc.nextInt();

        //     if(x > no) {
        //         System.out.println("더 작은 숫자입니다.");
        //     } else if(x < no) {
        //         System.out.println("더 큰 숫자입니다.");
        //     } 
        // } while (x != no);

        // System.out.print("정답입니다.");

        // 4-4
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수 A :");
        // int a = sc.nextInt();

        // System.out.print("정수 B :");
        // int b = sc.nextInt();

        // 필요시 작은수에서 큰수로 위치 변환
        // if (a > b) {
        //     int t = a;
        //     a = b;
        //     b = t;
        // }
        
        // a와 b사이의 정수 출력
        // do {
        //     System.out.println(a + " ");
        //     a += 1;
        // } while (a <= b);

        // 4-5
        // Scanner sc = new Scanner(System.in);

        // System.out.println("카운트다운 합니다.");

        // int x;

        // do {
        //     System.out.print("양의 정수값 :");
        //     x = sc.nextInt();
        // } while (x <= 0);

        // while ( x >= 0)
        //     System.out.println(--x);
        
        // System.out.println("x의 값이 " + x + "이 됐습니다.");

        // 4-6
        // Scanner sc = new Scanner(System.in);

        // System.out.println("카운트다운 합니다.");

        // int x;

        // do {
        //     System.out.print("양의 정수값 :");
        //     x = sc.nextInt();
        // } while (x <= 0);

        // while ( x >= 0)
        //     System.out.println(--x);
        
        // System.out.println("x의 값이 " + x + "이 됐습니다.");

        // 4-7
        // Scanner sc = new Scanner(System.in);

        // System.out.print("몇 개를 표시할까요? :");

        // int x = sc.nextInt();
        // int i = 0;

        // while (i < x) {
        //     System.out.print("*");
        //     i++;
        // }
        // if (x >= 1)
        //     System.out.println();

        // 4-8
        // Scanner sc = new Scanner(System.in);

        // System.out.print("몇 개를 표시할까요? :");

        // int x = sc.nextInt();
        // int i = 0;

        // while (i < x) {
        //     if (i % 2 == 0)
        //         System.out.print("*");
        //     else
        //         System.out.print("+");
        //     i++;
        // }
        // if (x >= 1)
        //     System.out.println();

        // 4-9
        // Scanner sc = new Scanner(System.in);
        // System.out.println("양의 정숫값의 자릿수를 표시합니다.");
        // System.out.print("양의 정숫값: ");
        // int x = sc.nextInt();
        // int y = 0;

        // while (x > 0) {
        //     y++;
        //     x = x / 10; // 125.4    12.5    1.2    end
        // }
        // System.out.print("입력한 숫자는 " + y + "입니다.");

        // 4-11
        // Scanner sc = new Scanner(System.in);

        // System.out.print("양의 정숫값: ");
        // int x = sc.nextInt();
        // int y = 1;
        // int i = 1;

        // while (i <= x) {
        //     y = y * i;
        //     i++;
        // }
        // System.out.print("1부터 " + x + "까지의 곱은 " + y +"입니다.");

        // 4-14
        // Scanner sc = new Scanner(System.in);

        // System.out.print("1부터 n까지의 합을 구합니다. n의 값 : ");
        // int x = sc.nextInt();
        // int sum = 0;

        // for (int i = 1; i <= x; i++) {
        //     sum = sum + i;
        // }
        // System.out.print("1부터 " + x + "까지의 합은 " + sum +"입니다.");

        // 4-15
        // Scanner sc = new Scanner(System.in);

        // System.out.print("1부터 n까지의 합을 구합니다. \nn의 값 : ");
        // int x = sc.nextInt();
        // int sum = 0;

        // for (int i = 1; i <= x; i++) {
        //     sum = sum + i;
        //     System.out.print(i);
        //     if (i < x) {
        //         System.out.print(" + ");
        //     } else {
        //     System.out.print(" = " + sum);
        //     }
        // }
        // // // // // // // // // // // // // // // // // 
        // Scanner sc = new Scanner(System.in);

        // System.out.print("1부터 n까지의 합을 구합니다.\nn의 값: ");
        // int x = sc.nextInt();
        // int sum = 0;
 
        // for ( int i = 1 ; i < x ; i++) {
        //     sum = sum + i;
        //     System.out.print(i + " + ");
        // }
        // System.out.println(x + " = " + (sum + x));
        // }
        
        // 4-16
        // Scanner sc = new Scanner(System.in);

        // System.out.print("몇 cm부터 : ");
        // int x = sc.nextInt();
        // System.out.print("몇 cm까지 : ");
        // int y = sc.nextInt();
        // System.out.print("몇 cm 단위 : ");
        // int z = sc.nextInt();
        // System.out.println("싱장 표준 체중");
 
        // for (int i = x; i <= y; i += z) {
        //     x = i + z;
        //     Double n = (i - 100) * 0.9;
        //     System.out.println(i + " " + n);
        // }
        ///////////////////////////////////////////////
        // Scanner sc = new Scanner(System.in);

        // System.out.print("몇 cm부터: ");
        // int a = sc.nextInt();

        // System.out.print("몇 cm까지: ");
        // int b = sc.nextInt();

        // System.out.print("몇 cm단위: ");
        // int c = sc.nextInt();

        // System.out.println("신장  표준체중 ");
        // System.out.println("----------- ");

        // for (int i = a ; i <= b ; i = i + c ) {
        // System.out.println(i + " " + (i-100)*0.9);
        // }

        // 4-18
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정숫값 : ");
        // int x = sc.nextInt();
        // int n = 0;
 
        // for ( int i = 1 ; i <= x ; i++) {
        //     if (x % i == 0) {
        //         System.out.print(i + " ");
        //         n++;
        //     }
        // }
        // System.out.print("\n의 약수는 " + n + "개 입니다.");

        // 4-19
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정숫값 : ");
        // int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        //     System.out.println(i + "의 제곱은 " + (i * i) + "입니다.");
        // }

        // 4-20
        // Scanner sc = new Scanner(System.in);

        // System.out.println("계절을 찾습니다.");
        // int n = 0;
        // int m = 0;

        // do {
        //     do {
        //         System.out.print("몇 월입니까? : ");
        //         n = sc.nextInt();
        //     }
        //     while (n >= 13 || n < 1);

        //     if (n >= 3 && n <= 5) {
        //         System.out.println("봄입니다.");
        //     } else if (n >= 6 && n <= 8) {
        //         System.out.println("여름입니다.");
        //     } else if (n >= 9 && n <= 11) {
        //         System.out.println("가을입니다.");
        //     } else {
        //         System.out.println("겨울입니다.");
        //     }
        // System.out.print("다시 하겠습니까? 1...Yes/0...No :");
        // m = sc.nextInt();
        // }
        // while (m == 1);

        // 4-21
        // Scanner sc = new Scanner(System.in);

        // System.out.println("정방형을 표시합니다.");
        // System.out.print("단수는 :");
        // int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 4-22-1
        // Scanner sc = new Scanner(System.in);

        // System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        // System.out.print("단수는? :");
        // int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 4-22-2
        // Scanner sc = new Scanner(System.in);

        // System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        // System.out.print("단수는? :");
        // int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        //     for (int j = n; j >= i; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 4-22-3
        // Scanner sc = new Scanner(System.in);

        // System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        // System.out.print("단수는? :");
        // int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i - 1; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <= n - i + 1; k++) {
        //         System.out.print("*");
        //     }
        // System.out.println();
        // }

        // 4-23
        // Scanner sc = new Scanner(System.in);

        // System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        // System.out.print("단수는? :");
        // int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        // //     for (int j = 1; j < n - i + 1; j++) {
        // //         System.out.print(" ");
        //     for (int j = n - 1; j >= i; j--) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <= i * 2 - 1; k++) {
        //         System.out.print(i % 10);
        //     }
        // System.out.println();
        // }

        // 4-25
        // Scanner sc = new Scanner(System.in);

        // System.out.print("2이상의 정숫값 :");
        // int n = sc.nextInt();
        // int a = 0;

        // if(n >= 2) {
        //     for(int i = 2; i < n; i++) {
        //         if(n % i == 0) {
        //             a++;
        //         }
        //     }
        //     if(a == 0) {
        //         System.out.println("소수입니다.");
        //     } else {
        //         System.out.println("소수가 아닙니다.");
        //     }
        // }
        ////////////////////////////////////////////////////
        // Scanner sc = new Scanner(System.in);

        // System.out.print("2이상의 정숫값 :");
        // int n = sc.nextInt();
        // int i = 2;

        // if(n >= 2) {
        //     for(i = 2; i < n ; i++) {
        //         if(n % i == 0)
        //             break;
        //     }
        // if(i == n)
        //     System.out.println("소수입니다.");
        // else
        //     System.out.println("소수가 아닙니다.");
        // }

        // 4-26
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 더합니다.");
        System.out.print("몇개를 더할까요? :");

        int n = sc.nextInt();
        int a = 0;       // 개수를 세는 변수
        int b;           // 개수를 저장할 변수
        int sum = 0;     // 더한 값을 저장할 변수

        do {             // 반복
            System.out.print("정수(0으로 종료) :");
            b = sc.nextInt();
            sum = b + sum;
            if (b == 0) break;
            a++;
        } while(n > a);  // 입력한 개수와 입력받은 수의 개수가 동일해지면 종료
        System.out.println("합계는 " + sum + "입니다.");
        System.out.println("평균은 " + (sum / a) + "입니다.");
    }
}