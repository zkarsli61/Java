package day30exceptionsinterfacesiteratorscollections;

public interface Music {

    String system = "Surround";
    int price = 2000;

    static void volume() {
        System.out.println("Do not listen to the music with high volume...");
    }

    void sound();

    void tune();

    void eat();

}
