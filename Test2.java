public class Test2 {

    int a;

    public void vartest(Test2 test) {
        test.a++;
    }

    public static void main(String[] args) {
        Test2 myTest = new Test2();
        myTest.a = 1;

        myTest.vartest(myTest);
        System.out.println(myTest.a);
    }
}