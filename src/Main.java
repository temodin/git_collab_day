public class Main {
    static Balint balint = new Balint();

    public static void main(String[] args) {

        Dorka dorka = new Dorka();
        Cheer cheer = new Cheer();
        System.out.println("Hello Dorka, csa Zoli");
        balint.printName();
<<<<<<< HEAD
        dorka.count("param1", "param2");
        cheer.cheer("Szia Világ!");
=======

        dorka.count();

        cheer.cheer("Szia Világ!", "Szia Mindenki!");

>>>>>>> zoli-twoparam
    }
}
