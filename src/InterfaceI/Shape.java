package InterfaceI;

public interface Shape {

    double area();
    double perimeter();

    default double fuck() {
        return 0;
    }
}
