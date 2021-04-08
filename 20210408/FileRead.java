import java.io.*;

// import java.io.FileInputStream;
// import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("out.txt"));
        while(true) {
            String line = br.readLine();    // 한줄씩 읽어 오다가
            if (line==null) break;          // null을 만나면 종료
            System.out.println(line);       // 읽어온것을 출력
        }
        br.close();
    }
}