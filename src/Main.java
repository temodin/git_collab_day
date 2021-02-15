public class Main {
    static Balint balint = new Balint();

    public static void main(String[] args) {

        Dorka dorka = new Dorka();
        Cheer cheer = new Cheer();
        System.out.println("Hello Dorka, csa Zoli");
        balint.printName();
        dorka.count(5);
        cheer.cheer();
    }
}
