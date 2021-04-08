import java.io.*;
// 사용하기 편하지만 사용하지 않는까지 모두 가져와서 정답은 아니다.

// import java.io.FileOutputStream;      // 파일 생성
// import java.io.IOException;           // 예외 처리
// import java.io.FileWriter;
// import java.io.PrintWriter;

// public class FileWrite {
//     public static void main(String[] args) throws IOException {
//         FileOutputStream output = new FileOutputStream("c:/Users/leee2/Documents/javabasic/20210408/out.txt");
//         FileWriter fw = new FileWriter("out.txt");
//         PrintWriter pw = new PrintWriter("out.txt");
//         for (int i = 1; i < 11; i++) {
//             String data = i + "번째 줄입니다. \r\n" ;
//             output.write(data);
//             fw.write(data);
//             pw.write(data);
//         }
//         output.close()
//         fw.close();
//         pw.close();

//         FileWriter fw2 = new FileWriter("out.txt", true); // 파일명, 추가모드구분
//         for (int i = 11; i < 21; i++) {
//             String data = i + "번째 줄입니다. \r\n" ;
//             fw2.write(data);
//         }
//         fw2.close();

//         PrintWriter pw2 = new PrintWriter(new FileWriter("out.txt", true));
//         for (int i = 11; i < 21; i++) {
//             String data = i + "번째 줄입니다. \r\n" ;
//             pw2.write(data);
//         }
//         pw2.close();
//     }
// }

// 1부터 100까지의 수 중 홀수만 odd.txt로 저장하세요.

public class FileWrite {
    public static void main(String[] args) throws IOException {
        PrintWriter fw = new PrintWriter("odd.txt");
        for (int i = 1; i < 101; i += 2) {
            fw.println(i);
        }
        fw.close();;
    }
}