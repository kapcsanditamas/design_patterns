import adapter.Adaptee;
import adapter.Adapter;
import adapter.Target;
import builder.Builder;
import decorator.Component;
import decorator.ConcreteComponent;
import decorator.ConcreteDecorator;
import factory.FactoryProduct;
import builder.BuilderProduct;
import factory.Factory;
import observer.ConcreteObserver;
import observer.Observer;
import observer.Subject;
import singleton.Singleton;


public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator(component);
        component.operation();
    }

    public static void main_adapter(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);

        target.request();
    }

    public static void main_builder(String[] args) {
        BuilderProduct builderProduct = new Builder()
                .part1("Part 1")
                .part2("Part 2")
                .build();

        System.out.println("part 1: "+ builderProduct.getPart1() +", part 2: "+ builderProduct.getPart2());
    }

    public static void main_observer(String[] args) {
        Observer observer_01 = new ConcreteObserver();
        Observer observer_02 = new ConcreteObserver();

        Subject subject = new Subject();
        subject.attach(observer_01);
        subject.attach(observer_02);

        subject.notifyObservers();
    }

    public static void main_factory(String[] args) {
        FactoryProduct factoryProduct = Factory.createProduct();

        factoryProduct.operation();
    }

    public static void main_singleton(String[] args) {
        Singleton singleton_01 = Singleton.getInstance();
        Singleton singleton_02 = Singleton.getInstance();

        System.out.println("singleton 01 num: " + singleton_01.getNumber());
        System.out.println("singleton 02 num: " + singleton_02.getNumber());
        singleton_01.add(1);
        System.out.println("singleton 01 num: " + singleton_01.getNumber());
        System.out.println("singleton 02 num: " + singleton_02.getNumber());
        singleton_02.add(1);
        System.out.println("singleton 01 num: " + singleton_01.getNumber());
        System.out.println("singleton 02 num: " + singleton_02.getNumber());
    }
}
