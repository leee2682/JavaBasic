public class Bouncer {
    public void barkAnimal(Barkable animal) {
        animal.bark();
    }

    public static void main(String[] arge) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}
