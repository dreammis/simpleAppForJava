package com.old.time.InterfaceI;

public interface Shape {

    double area();
    double perimeter();

    default double fuck() {
        return 0;
    }
}
