package main.java.com.chapter06.introducingclasses.BoxDemo7;

class Box {

    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {

        width = w;
        height = h;
        depth = d;

    }

    double vol () {
        return width * height * depth;

    }

}
