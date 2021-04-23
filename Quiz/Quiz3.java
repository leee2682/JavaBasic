import java.lang.reflect.Array;
import java.util.*;

public class Quiz3 {
    public static void main(String[] args) {
        // 5-4
        // boolean b1 = true;
        // boolean b2 = false;

        // System.out.println("b1 = " + b1);
        // System.out.println("b2 = " + b2);

        // 5-5
        // Scanner sc = new Scanner(System.in);
        // System.out.println("정숫값 x, y, z의 평균을 구합니다.");

        // System.out.print("x값 :");
        // int x = sc.nextInt();
        // System.out.print("y값 :");
        // int y = sc.nextInt();
        // System.out.print("z값 :");
        // int z = sc.nextInt();

        // double avg = (x + y + z) / 3;

        // System.out.print("x, y, z의 평균은 " + avg + "입니다.");

        // 5-6
        // Scanner sc = new Scanner(System.in);
        // System.out.println("정숫값 x, y, z의 평균을 구합니다.");

        // System.out.print("x값 :");
        // int x = sc.nextInt();
        // System.out.print("y값 :");
        // int y = sc.nextInt();
        // System.out.print("z값 :");
        // int z = sc.nextInt();

        // double avg = (x + y + z) / 3.0;

        // System.out.print("x, y, z의 평균은 " + avg + "입니다.");

        // 5-7
        // int a;

        // a = (int) 10.0;

        // System.out.println("a = " + a);

        // 5-8
        // System.out.println("float          int");
        // System.out.println("------------------");

        // float x = 0.0F;

        // for(int i = 0; i <= 1000; i++, x += 0.001F) {
        //     System.out.printf("%f %f%n", x, (float) i / 1000);
        // }

        // 5-9
        // System.out.println("float          int");
        // System.out.println("------------------");

        // float x = 0.0F;

        // for(int i = 0; i <= 1000; i++, x += 0.001F) {
        //     System.out.printf("%.3f %.7f%n", x, x * x);
        // }

        // 6-1
        // double[] a = new double[5];

        // for(int i = 0; i < a.length; i++) {
        //     System.out.println("a[" + i + "] = " + a[i]);
        // }

        // 6-2
        // int[] a = new int[5];

        // for(int i = 0; i < a.length; i++) {
        //     a[i] = 5 - i;
        // }
        // for(int j = 0; j < a.length; j++) {
        //     System.out.println("a[" + j + "] = " + a[j]);
        // }

        // 6-6
        // Scanner sc = new Scanner(System.in);

        // System.out.print("요소 수:");
        // int n = sc.nextInt();
        // int[] a = new int[n];

        // for(int i = 0; i < n; i++) {
        //     System.out.print("a[" + i + "] = ");
        //     a[i] = sc.nextInt();
        // }
        // System.out.print("a = {");
        // for(int j = 0; j < n - 1; j++) {
        //     System.out.print(a[j] + ", ");
        // }
        // System.out.print(a[n - 1] + "}");

        // 6-7
        // Scanner sc = new Scanner(System.in);

        // System.out.print("사람 수:");
        // int n = sc.nextInt();
        // int[] a = new int[n];
        // double sum = 0;

        // System.out.println("점수를 입력하세요.");

        // for(int i = 0; i < n; i++) {
        //     System.out.print((i + 1) + "번의 점수:");
        //     a[i] = sc.nextInt();
        //     sum += a[i];
        // }

        // int max = a[0];
        // int min = a[0];

        // for(int j = 1; j < n; j++) {
        //     if(a[j] > max) max = a[j];
        //     if(a[j] < min) min = a[j];
        // }

        // // Arrays.sort(a);

        // System.out.println("합계는 " + sum + "점입니다.");
        // System.out.println("평균은 " + (sum / n) + "점입니다.");
        // // System.out.println("최고점은 " + a[n - 1] + "점입니다.");
        // // System.out.println("최소점은 " + a[0] + "점입니다.");
        // System.out.println("최고점은 " + max + "점입니다.");
        // System.out.println("최소점은 " + min + "점입니다.");

        // 6-8
        // Scanner sc = new Scanner(System.in);
        // System.out.print("요소 수:");
        // int n = sc.nextInt();
        // int[] a = new int[n];

        // for(int i = 0; i < n; i++) {
        //     System.out.println("a[" + i + "] = ");
        //     a[i] = sc.nextInt();
        // }

        // System.out.print("찾는 숫자:");
        // int s = sc.nextInt();

        // for(int j = 0; j < n; j++) {
        //     if(a[j] = a) {
        //         System.out.print("그 값은 a[" + j + "] = ");
        //     }
        // }

        // 6-10
        // Random rand = new Random();
        // Scanner sc = new Scanner(System.in);
        // System.out.print("요소 수:");
        // int n = sc.nextInt();
        // int[] a = new int[n];

        // for (int i = 0; i < n; i++){
        //     a[i]= 1+ rand.nextInt(10);
        // }
      
        // for (int j = 0; j < n; j++){
        //     System.out.println("a["+j+"] = " + a[j]);
        // }
        
        // 6-13
        // Random rand = new Random();
        // Scanner sc = new Scanner(System.in);
        // System.out.print("요소 수:");
        // int n = sc.nextInt();
        // int[] a = new int[n];

        // for (int i = 0; i < n; i++){
        //     System.out.print("a[" + i + "] = ");
        //     a[i] = sc.nextInt();
        // }
        
        // System.out.println("요소를 섞었습니다.");

        // for (int j = 0 ; j < n ; j++) {
        //     int x = rand.nextInt(n);
        //     int y = rand.nextInt(n);
        //     int t = a[x];
        //     a[x] = a[y];
        //     a[y] = t;
        // }    
      
        // for (int k = 0; k < n; k++){
        //     System.out.println("a["+ k +"] = " + a[k]);
        // }

        // 6-14
        // Random rand = new Random();
        // Scanner sc = new Scanner(System.in);
        // System.out.print("요소 수:");
        // int n = sc.nextInt();
        // int[] a = new int[n];
        // int[] b = new int[n];
        // for (int j = 0; j < n ; j++){
        //     System.out.print("a["+j+"] = ");
        //     a[j]= sc.nextInt();
        // }

        // for (int i = 0; i < n ; i++){
        //     b[i] = a[n-i-1]; 
        // }

        // for (int j = 0; j < n ; j++){
        //     System.out.println("b["+j+"] = " + b[j]);
        // }

        // 6-15
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                           "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int re = 0;
        System.out.println("해당월의 영어 단어를 입력하시오.\n세 글자로 짧게 첫 글자는 대문자, 나머지는 소문자로 입력하세요.");

        do {
            int month = 1 + rand.nextInt(12);

            while(true) {
                System.out.print(month + "월 :");
                String s = sc.next();

                if(s.equals(months[month - 1])) break;
                System.out.println("틀렸습니다.");
            }
            System.out.println("정답입니다.");
            System.out.print("다시 한번?1...Yes/0...No:");
            re = sc.nextInt();
        } while (re == 1);
    }
}