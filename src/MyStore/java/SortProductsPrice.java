package MyStore.java;

import java.util.Comparator;

public class SortProductsPrice implements Comparator<Products> {
    @Override
    public int compare(Products o1, Products o2) {
        if (o1.getPrice()>o2.getPrice()){
            return -1;
        }
        return 1;
    }
}
