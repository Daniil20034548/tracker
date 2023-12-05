package ru.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = 0; i < products.length; i++) {
            if (i == index) {
                for (int j = index + 1; j <= products.length - 1; j++) {
                    products[index] = products[j];
                    index++;
                }
                products[index] = null;
            }
        }
        return products;
    }
}
