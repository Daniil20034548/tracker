package ru.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = index + 1; i <= products.length - 1; i++, index++) {
            products[index] = products[i];
        }
        products[index] = null;
        return products;
    }
}
