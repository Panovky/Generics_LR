package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Comparator;

class filterException extends Exception {

    filterException() {
        super("Ошибка: указаны некорректные параметры для сортировки!");
    }
}

class searchException extends Exception {

    searchException() {
        super("Ошибка: указан некорректный параметр для поиска!");
    }
}

public class DataProcessor<T extends Product> {
    private ArrayList<T> products;

    DataProcessor(ArrayList<T> products) {
        this.products = products;
    }

    public List<T> filter(int max, int min) throws filterException {

        if (max < min || max < 0 || min < 0) {
            throw new filterException();
        } else {
            return products.stream()
                    .filter(element -> max >= element.getPrice() && element.getPrice() >= min)
                    .sorted(Comparator.comparingInt(T::getPrice))
                    .limit(2)
                    .collect(Collectors.toList());
        }
    }

    public List<T> search(int price) throws searchException {

        if (price < 0) {
            throw new searchException();
        } else {
            return products.stream()
                    .filter(element -> element.getPrice() == price)
                    .collect(Collectors.toList());
        }
    }
}
