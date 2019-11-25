package ru.itpark;

import ru.itpark.category.AccumulatorBattery;
import ru.itpark.category.Microwave;
import ru.itpark.category.Product;
import ru.itpark.category.Smartphone;
import ru.itpark.service.ProductService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductService product = new ProductService();
        product.add(new Smartphone(1, "Смартфон", "Xiaomi Redmi GO", "Изящный дизайн + приятный на ощупь металлический корпус, выглядящий просто потрясающе. Четкий и яркий 5-дюймовый HD дисплей с соотношением сторон 16:9 и разрешением 1280 x 720 идеально подойдет для игр.", 5550, 5, "Синий", "https://www.ulmart.ru/goods/4491129", true, 16, "Android"));
        product.add(new Smartphone(2, "Смартфон", "Samsung Galaxy A30s", "Смартфон Galaxy A30s эффектно смотрится и отличается тонким дизайном. Благодаря эргономичной форме телефон комфортно ощущается в руке, что существенно облегчает навигацию по экрану.", 15990, 0, "Белый", "https://www.ulmart.ru/goods/4584639", true, 32, "Android"));
        product.add(new Smartphone(3, "Смартфон", "Redmi Note 7", "Смартфон Xiaomi Redmi Note 7 - ультрасовременный гаджет для тех, кто идет в ногу со временем. Мощный процессор Qualcomm Snapdragon 660 откроет поистине безграничные возможности.", 13990, 4, "Чёрный", "https://www.ulmart.ru/goods/4514995", true, 16, "Android"));
        product.add(new Smartphone(4, "Смартфон", "Prestigio Muze X5", "Трендовый дизайн, прочный корпус, производительная начинка, поддержка 4G - всё, что необходимо для современного смартфона.", 3590, 5, "Чёрный", "https://www.ulmart.ru/goods/4422104", true, 16, "Android"));
        product.add(new AccumulatorBattery(1, "Аккумулятор", "Bosch", "Аккумуляторная батарея повышенной емкости, предназначена для уверенного пуска двигателя и обеспечения энергией электрического оборудования легковых автомобилей бизнес-класса", 8950, 5, "серый", "https://www.ulmart.ru/goods/521049", true, 85, 800, "Euro"));
        product.add(new AccumulatorBattery(2, "Аккумулятор", "Русская Звезда", "Аккумуляторы Русская Звезда от отечественного производителя \"ООО Источник Тока Курский\" - это аккумуляторы эконом класса с рациональным соотношением цены, емкости и стартерного тока. Сконструированы таким образом, чтобы обеспечить эксплуатационную надежность.", 2190, 3, "чёрный", "https://www.ulmart.ru/goods/4508538", true, 60, 430, "Euro"));
        product.add(new Microwave(1, "Микроволновая печь", "V-HOME P70H20L-KH", "Микроволновая печь V-HOME P70H20L-KH имеет мощность микроволн 700 Вт и вместительный объем рабочей камеры, что обеспечивает быстрый разогрев даже большой порции пищи. Механический таймер позволяет установить желаемое время подогрева, а звуковой сигнал оповестит о готовности блюда.", 2930, 2, "белый", "https://www.ulmart.ru/goods/4457582", true, 700));


        System.out.println(product.searchByName("Redmi"));
        System.out.println(product.searchByCategory("Аккумулятор"));
        System.out.println(product.sortByPrice());
        System.out.println(product.sortByName());
        System.out.println(product.sortByRating());


    }


}
