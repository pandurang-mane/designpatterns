package com.pandurang.patterns.iterator;

public class Test {
    public static void main(String[] args) {
        ProductCollection products = new ProductCollection();
        products.addProduct(new Product("Iphone"));
        products.addProduct(new Product("Samsung"));
        products.addProduct(new Product("MacBook"));

        Iterator iterator = products.createIterator();
        while (iterator.hasNext()) {
            Product product = (Product) iterator.next();
            System.out.println(product.getName());
        }
    }
}
