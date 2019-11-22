package ru.itpark;

import ru.itpark.model.Product;
import ru.itpark.service.ProductService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        service.addAll(
                new Product(1, "Xiaomi Redmi GO", "Изящный дизайн + приятный на ощупь металлический корпус, выглядящий просто потрясающе. Четкий и яркий 5-дюймовый HD дисплей с соотношением сторон 16:9 и разрешением 1280 x 720 идеально подойдет для игр.", 5550, 5, "Синий", "https://www.ulmart.ru/goods/4491129", true),
                new Product(2, "Samsung Galaxy A30s", "Смартфон Galaxy A30s эффектно смотрится и отличается тонким дизайном. Благодаря эргономичной форме телефон комфортно ощущается в руке, что существенно облегчает навигацию по экрану.", 15990, 0, "Белый", "https://www.ulmart.ru/goods/4584639", true),
                new Product(2, "Redmi Note 7", "Смартфон Xiaomi Redmi Note 7 - ультрасовременный гаджет для тех, кто идет в ногу со временем. Мощный процессор Qualcomm Snapdragon 660 откроет поистине безграничные возможности.", 13990, 4, "Чёрный", "https://www.ulmart.ru/goods/4514995", true),
                new Product(2, "Prestigio Muze X5", "Трендовый дизайн, прочный корпус, производительная начинка, поддержка 4G - всё, что необходимо для современного смартфона.", 3590, 5, "Чёрный", "https://www.ulmart.ru/goods/4422104", true)
        );

        List<Product> results = service.searchByName();
        System.out.println(results);


    }



}
