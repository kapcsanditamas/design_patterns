package decorator;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addAdditionalOperation();
    }

    private void addAdditionalOperation() {
        System.out.println("Additional operation added by ConcreteDecorator");
    }
}
