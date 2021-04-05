package main.java.com.chapter3.datatypesandarrays;

import java.util.Arrays;
import java.util.Objects;


    public class ArrayStorage {
        private Resume[] storage = new Resume[10000];
        private int size;

        void clear() {
            Arrays.fill(storage,0, size - 1, null);
            size = 0;
        }

        void save(Resume r) {
            storage[size] = r;
            size++;
        }
}
