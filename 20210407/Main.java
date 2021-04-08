class Updater {
    // public void update(int count) {
        // count++;    // 0 -> 1
    public void update(Main counter) { // 객체 자체를 전달 받음
        counter.count++;
    }
}

public class Main {
    int count = 0;
    public static void main(String[] args) {        
        Main myCounter = new Main();        
        System.out.println("before update:"+myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
        System.out.println("after update:"+myCounter.count); // 0 출력 -> 1출력

        // 변수로 전달 -> 객체로 전달 (값을 유지할 수 있다.)
    }
}
