public class ifexam {
    public static void main(String[] args) {

        // 2 > 1             // 참
        // 1 == 2            // 거짓
        // 3 % 2 == 1        // 참 (3을 2로 나눈 나머지는 1이므로 참이다.)
        // "3".equals("2")   // 거짓 (문자 자체를 비교할때)

        // int base = 180;
        // int height = 185;
        // boolean isTall = height > base;

        // if (isTall) {
        //     System.out.println("키가 크다");
        // }

        // 문자열의 값을 비교할 때에는 반드시 .equals()를 사용
        String a = "hello";
        String b = "java";
        String c = "hello";
        String d = new String("hello");  // new가 붙으면 문자는 같지만 주소가 다르다
        System.out.println(a.equals(b)); // false
        System.out.println(a.equals(c)); // true
        System.out.println(a == c);      // true
        System.out.println(a == d);      // flase
        System.out.println(a.equals(d)); // true
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));
    }
}