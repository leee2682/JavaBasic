import java.util.Arrays;

public class Divisible {
    public int[] divisible(int[] array, int divisor) {
        int num = 0; // 배열의 개수를 미리 파악해야만 배열을 생성할 수 있다.

        for(int i = 0; i < array.length; i++) {
            if(array[i] % divisor == 0) { // 조건에 만족하는지 검사
                num++; // 조건에 만족하는 갯수 증가
            }
        }
    
        int[] narray = new int[num];
        int index = 0;

        for(int j = 0; j < array.length; j++) {
            if(array[j] % divisor == 0) {
                narray[index++] = array[j];
            }
        }
        return narray;
    }
    // 아래는 테스트로 출력해보기 위한 코드입니다.
    public static void main(String[] args) {
        Divisible div = new Divisible();
        int[] array = {5, 9, 7, 10};
        System.out.println(Arrays.toString(div.divisible(array, 5)));
    }
}