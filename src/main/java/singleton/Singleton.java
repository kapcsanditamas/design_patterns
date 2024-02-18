package singleton;
//
// The Singleton pattern ensures that a class has only one instance and
// provides a global point of access to that instance.
//
public class Singleton {
    private static Singleton instance;

    private int number = 0;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int getNumber() {
        return this.number;
    }

    public void add(int num) {
        this.number += num;
    }
}
