package factory;
//
// The Factory pattern is used to create objects without exposing the instantiation logic to the client and
// refers to the newly created object using a common interface.
//
public class Factory {
    public static ConcreteFactoryProduct createProduct() {
        return new ConcreteFactoryProduct();
    }
}
