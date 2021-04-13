package main.java.com.chapter06.introducingclasses.BoxDemo6;

class Box {

    double width;
    double height;
    double depth;

    Box() {
        System.out.println("Коструируем объект");

        width =10;
        height = 10;
        depth = 10;

    }

    double vol () {
        return width * height * depth;

    }

}
