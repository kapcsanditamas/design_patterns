package adapter;
//
// The Adapter pattern allows incompatible interfaces to work together by providing a wrapper that
// converts the interface of a class into another interface that a client expects.
//
public class Adapter implements Target {
    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
