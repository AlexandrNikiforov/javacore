package main.java.com.chapter06.introducingclasses;

public class ThisKeyWord {
    private final String id;

    //There this keyword refers to ThisKeyWord(String id) constructor
    public ThisKeyWord() {
        this("Default id");
    }

    public ThisKeyWord(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ThisKeyWord{" +
                "id='" + id + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new ThisKeyWord());
        System.out.println("----");
        System.out.println(new ThisKeyWord("000111222"));
    }
}
