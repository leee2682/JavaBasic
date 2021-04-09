import java.util.Calendar;

class Main {
    public static void main(String[] args) {
        int a = 5;
        String num;

        num = (a == 1) ? "1st" :
              (a == 2) ? "2nd" :
              (a == 3) ? "3rd" :
              (a == 4) ? "4th" : "1~4까지 입력하세요.";
        
        System.out.println(num);
    }
}