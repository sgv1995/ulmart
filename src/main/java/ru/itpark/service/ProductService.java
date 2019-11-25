package ru.itpark.service;

import ru.itpark.comparator.SortByNameAscComparator;
import ru.itpark.category.Product;
import ru.itpark.comparator.SortByPriceAscComparator;
import ru.itpark.comparator.SortByRatingDescComparator;

import java.util.*;


public class ProductService {
    private List<Product> items = new ArrayList<>();

    public void add(Product item) {
        items.add(item);
    }

    public List<Product> searchByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product product : items) {
            if (product.getName().contains(name)) {
                result.add(product);

            }
        }
        result.sort(new SortByNameAscComparator());
        return result;

    }

    public List<Product> searchByCategory(String category) {
        List<Product> result = new ArrayList<>();
        for (Product product : items) {
            if (product.getCategory().equals(category)) {
                result.add(product);

            }
        }
        result.sort(new SortByNameAscComparator());
        return result;

    }

    public List<Product> sortByName() {
        List<Product> result = new ArrayList<>(items);
        result.sort(new SortByNameAscComparator());
        return result;
    }

    public List<Product> sortByRating() {
        List<Product> result = new ArrayList<>(items);
        result.sort(new SortByRatingDescComparator());
        return result;
    }

    public List<Product> sortByPrice() {
        List<Product> result = new ArrayList<>(items);
        result.sort(new SortByPriceAscComparator());
        return result;
    }
}
