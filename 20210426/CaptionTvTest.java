class Tv1 {
    boolean power;
    int channel;

    void power()         { power = !power; }
    void channelUp()     { ++channel; }
    void channelDown()   { --channel; }

}
class CaptionTv extends Tv {
    boolean caption;
    void displayCaprion(String text) {
        if(caption) {
            System.out.print(text);
        }
    }
}
class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaprion("Hello, World");
        ctv.caption = true;
        ctv.displayCaprion("Hello, World");
    }
}