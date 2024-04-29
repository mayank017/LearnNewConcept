package JavaRevisionTopics.Generics;

public class Box<T> {
    T container;

    public T getContainer() {
        return container;
    }

    public Box(T container) {
        this.container = container;
    }

}
