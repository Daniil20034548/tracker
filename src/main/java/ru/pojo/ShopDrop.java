package ru.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i <= products.length - 1; ++i) {
            if (i == index + 1) {
                    products[index] = products[i];
                    index++;
            }
            products[index] = null;
        }
        return products;
    }
}
