import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {

        // # 3
        // System.out.print("첫 자바프로그램입니다.");
        // System.out.print("화면에 출력하고 있습니다.");

        // # 4 (줄 바꾸기) 2가지 방법
        // System.out.println("홍");
        // System.out.println("길");
        // System.out.println("동");
        // System.out.println("홍\n길\n동");

        // # 5 (빈 줄 추가하기) 2가지 방법
        // System.out.println("홍");
        // System.out.println("");
        // System.out.println("길");
        // System.out.println("동");
        // System.out.println("홍\n\n길\n동");

        // # 2-1 (합과 차를 구하기) 다양한 방법
        // System.out.println("82 + 17 = " + (82 + 17));
        // System.out.println("82 - 17 = " + (82 - 17));

        // # 2-2 (두 변수의 합과 평균)
        // int x = 63;
        // int y = 18;
        // System.out.println("x값은 " + x + "입니다.");
        // System.out.println("y값은 " + y + "입니다.");
        // System.out.println("합계는 " + (x + y) + "입니다.");
        // System.out.println("평균은 " + (x + y)/2 + "입니다.");

        // # 2-3 (2-2에서 실숫값을 대입)
        // double x = 63.4;
        // double y = 18.3;
        // System.out.println("x값은 " + x + "입니다.");
        // System.out.println("y값은 " + y + "입니다.");
        // System.out.println("합계는 " + (x + y) + "입니다.");
        // System.out.println("평균은 " + (x + y)/2 + "입니다.");

        // # 2-4 (3개 변수에 합계와 평균)
        // int x = 63;
        // int y = 18;
        // int z = 52;
        // int sum = x + y + z;
        // System.out.println("x값은 " + x + "입니다.");
        // System.out.println("y값은 " + y + "입니다.");
        // System.out.println("z값은 " + z + "입니다.");
        // System.out.println("합계는 " + sum + "입니다.");
        // System.out.println("평균은 " + sum/3 + "입니다.");

        // # 2-5 (입력한 정숫값을 표시)
        // import java.util.Scanner;
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수값 :");
        // int n = sc.nextInt();

        // System.out.println(n + "(을)를 입력했습니다.");

        // # 2-6 (입력한 정숫값에 10을 더하고 뺀 값)
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수값 :");
        // int a = sc.nextInt();

        // System.out.println("10을 더한 값은 " + (a + 10) + "입니다.");
        // System.out.println("10을 뺀 값은 " + (a - 10) + "입니다.");

        // # 2-7 (입력한 정숫값에서 마지막 자리를 제외한 값과 그 값)
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수값 :");
        // // String n = sc.next();
        // int n = sc.nextInt();

        // // System.out.println(n.substring(0, n.length()-1));
        // // System.out.println(n.substring(n.length()-1, n.length()));
        // System.out.println("마지막 자릿수를 제외한 값은 " + (n / 10) + "입니다.");
        // System.out.println("마지막 자릿수를 제외한 값은 " + (n % 10) + "입니다.");

        // # 2-9 (삼각형 밑변과 높이를 입력받아 넓이 구하기)
        // Scanner sc = new Scanner(System.in);

        // System.out.println("삼각형의 넓이를 구합니다.");
        // System.out.print("밑변 :");
        // Double x = sc.nextDouble();

        // System.out.print("높이 :");
        // Double y = sc.nextDouble();

        // System.out.println("넓이는 " + (x * y / 2) + "입니다.");

        // # 2-10 (구의 겉넓이와 부피)
        // Scanner sc = new Scanner(System.in);

        // System.out.println("구의 겉넓이와 부피를 구합니다.");
        // Double r = sc.nextDouble();

        // final double PI = 3.1416;

        // System.out.println("겉넓이는 " + (4 * PI * r * r) + "입니다.");
        // System.out.println("부피는 " + (4 / 3.0 * PI * (r * r * r)) + "입니다.");

        // # 2-11
        // import java.util.Random;
        // Random rand = new Random();

        // int x = 1 + rand.nextInt(9); // 0~9미만 + 1
        // int y = -1 - rand.nextInt(9); // -9~0미만 - 1
        // int z = 10 + rand.nextInt(90); // 0 ~ 90미만 + 10

        // System.out.println("3개의 난수를 생성했습니다.");
        // System.out.println("한 자리 양의 정수 :" + x);
        // System.out.println("한 자리 음의 정수 :" + y);
        // System.out.println("두 자리 양의 정수 :" + z);

        // # 2-12
        // Scanner sc = new Scanner(System.in);
        // Random rand = new Random();
        // int x = sc.nextInt();

        // System.out.println("입력 값의 +-5의 범위의 난수를 생성했습니다.");
        // System.out.println("값은 " + (x - 5 + rand.nextInt(11)) + "입니다.");
        // //                입력한 값(10) - 5 = 5 / 0~11미만의 임의의 수 + 5

        // # 2-14
        // Scanner sc = new Scanner(System.in);
        // System.out.print("성 :");
        // String x = sc.next(); // .next() = 글자를 입력 받음
        // System.out.print("이름 :");
        // String y = sc.next();

        // System.out.print("안녕하세요." + x + y + " 씨");

        // # 2-16
        // String s1 = "ABC"; // 초기화
        // String s2 = "XYZ"; // 초기화

        // System.out.println("문자열 s1은 " + s1 + "입니다.");
        // System.out.println("문자열 s2은 " + s2 + "입니다.");

        // s1 = "FBI"; // 대입(값을 변경)

        // System.out.println("문자열 s1은 " + s1 + "입니다.");
        // System.out.println("문자열 s2은 " + s2 + "입니다.");

        // # 3-1
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수값 :");
        // int x = sc.nextInt();

        // if(x < 0) {
        //     System.out.println("이 값은 음의 값입니다.");

        // # 3-2
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수값 :");
        // int x = sc.nextInt();

        // if(x < 0) {
        //     System.out.println("절댓값은 " + (-x) + "입니다.");
        // } else {
        //     System.out.println("절댓값은 " + x + "입니다.");
        // }

        // # 3-3
        // Scanner sc = new Scanner(System.in);

        // System.out.print("변수 A :");
        // int x = sc.nextInt();
        // System.out.print("변수 B :");
        // int y = sc.nextInt();

        // if(x % y == 0) {
        //     System.out.println("B는 A의 약수입니다.");
        // }

        // # 3-4
        // Scanner sc = new Scanner(System.in);

        // System.out.print("변수 A :");
        // int x = sc.nextInt();
        // System.out.print("변수 B :");
        // int y = sc.nextInt();

        // if(x % y != 0) {
        //     System.out.println("B는 A의 약수가 아닙니다.");
        // }

        // # 3-5
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수값 :");
        // int x = sc.nextInt();

        // if(x == 0) {
        //     System.out.println("값이 0입니다.");
        // } else if(x > 0) {
        //     System.out.println("값이 양수입니다.");
        // } else {
        //     System.out.println("값이 음수입니다.");
        // }

        // # 3-7
        // Scanner sc = new Scanner(System.in);

        // System.out.print("변수 a:");
        // int a = sc.nextInt();
        // System.out.print("변수 b:");
        // int b = sc.nextInt();

        // if(a > b) {
        //     System.out.println("a가 크다.");
        // } else if(b > a) {
        //     System.out.println("b가 크다.");
        // } else {
        //     System.out.println("a와 b가 같다.");
        // }

        // # 3-9
        // Scanner sc = new Scanner(System.in);

        // System.out.print("변수 a:");
        // int a = sc.nextInt();

        // if(a <= 0) {
        //     System.out.println("양수를 입력해 주세요.");
        // } else if(a % 10 == 0) {
        //     System.out.println("이 값은 10의 배수입니다.");
        // } else {
        //     System.out.println("이 값은 10의 배수가 아닙니다.");
        // }

        // # 3-11
        // Scanner sc = new Scanner(System.in);

        // System.out.print("점수 :");
        // int a = sc.nextInt();

        // if(a > 100) {
        //     System.out.println("잘못된 점수입니다.");
        // } else if(a >= 90) {
        //     System.out.println("수");
        // } else if(a >= 80) {
        //     System.out.println("우");
        // } else if(a >= 70) {
        //     System.out.println("미");
        // } else if(a >= 60) {
        //     System.out.println("양");
        // } else if(a >= 0) {
        //     System.out.println("가");
        // } else {
        //     System.out.println("잘못된 점수입니다.");
        // }

        // # 3-13
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수 a:");
        // int a = sc.nextInt();
        // System.out.print("정수 b:");
        // int b = sc.nextInt();
        // int c = a - b;

        // if(c < 0) {
        //     System.out.println("두 값의 차는 " + -c + "입니다.");
        // } else {
        //     System.out.println("두 값의 차는 " + c + "입니다.");
        // }
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수 a:");
        // int a = sc.nextInt();
        // System.out.print("정수 b:");
        // int b = sc.nextInt();

        // if(a > b) {
        //     System.out.println("두 값의 차는 " + (a - b) + "입니다.");
        // } else {
        //     System.out.println("두 값의 차는 " + (b - a) + "입니다.");
        // }
        
        // # 문제
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수 a:");
        // int a = sc.nextInt();
        // System.out.print("정수 b:");
        // int b = sc.nextInt();
        // int minus;

        // minus = (a > b) ? a - b : b - a;
        // System.out.println("두 값의 차는 " + minus + "입니다.");

        // # 3-13
        // import java.util.Scanner;

        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수 a:");
        // int a = sc.nextInt();
        // System.out.print("정수 b:");
        // int b = sc.nextInt();
        // System.out.print("정수 c:");
        // int c = sc.nextInt();

        // int min = a;
        // if (b < min) min = b;
        // if (c < min) min = c;

        // System.out.println("최솟값은 " + min + "입니다.");

        // # 3-16
        // import java.util.Scanner;

        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수 a:");
        // int a = sc.nextInt();
        // System.out.print("정수 b:");
        // int b = sc.nextInt();
        // System.out.print("정수 c:");
        // int c = sc.nextInt();

        // int mid = 0;

        // if((b >= a && c <= a) || (b <= a && c >= a)) {
        //     mid = a; // b > a > c || c > a > b
        // } else if ((a >= b && b >= c) || (c >= b && b >= a)) {
        //     mid = b; // a > b > c || c > b > a
        // } else {
        //     mid = c;
        // }

        // System.out.println("중앙값은 " + mid + "입니다.");

        // # 3-17
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수 a:");
        // int a = sc.nextInt();
        // System.out.print("정수 b:");
        // int b = sc.nextInt();

        // if(a < b) {
        //     int t = a;
        //     a = b;
        //     b = t;
        // }
        // System.out.println("a >= b가 되도록 정렬했습니다.");
        // System.out.println("변수 a는 " + a + "입니다.");
        // System.out.println("변수 b는 " + b + "입니다.");

        // # 3-18
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a:");
        int a = sc.nextInt();
        System.out.print("정수 b:");
        int b = sc.nextInt();
        System.out.print("정수 c:");
        int c = sc.nextInt();

        int t = 0;

        if(a > b) {
            t = a; a = b; b = t;
        }

        if(b > c) {
            t = b; b = c; c = t;
        }
        if(a > b) {
            t = a; a = b; b = t;
        }
        
        System.out.println("a <= b <= c가 되도록 정렬했습니다.");
        System.out.println("변수 a는 " + a + "입니다.");
        System.out.println("변수 b는 " + b + "입니다.");
        System.out.println("변수 c는 " + c + "입니다.");
    }
}