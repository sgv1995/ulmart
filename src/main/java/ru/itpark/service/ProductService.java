package ru.itpark.service;

import ru.itpark.comparator.ProductByPriceAscComparator;
import ru.itpark.model.Product;

import java.util.*;


public class ProductService {
    private List<Product> items = new ArrayList<>();




    public void addAll(Product... items) {
        Collections.addAll(this.items, items);
    }

    public List<Product> searchByName() {
        return searchByName(new ProductByPriceAscComparator());
    }
    public List<Product> searchByName(Comparator<Product> comparator) {
        List<Product> result = new ArrayList<>();
        for (Product product : items) {
            if(product.getName()=="Xiaomi"){
                result.add(product);

            }
        }
        Collections.sort(result, comparator);
        return result;

    }


}
