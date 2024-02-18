package decorator;
//
// The Decorator pattern allows behavior to be added to individual objects dynamically without affecting the behavior
// of other objects from the same class.
//
public class Decorator implements Component {
    private final Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
