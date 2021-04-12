public class CarExam {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";

        String str3 = new String("hello");
        String str4 = new String("hello");
        
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
    }
}
        
        // str1 str2 without NEW keyword
        // str3 str4 with NEW keyword

        // str1 ~ str4 모든 주소 출력