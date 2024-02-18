package factory;

public class ConcreteFactoryProduct implements FactoryProduct {
    @Override
    public void operation() {
        System.out.println("ConcreteProduct operation");
    }
}
