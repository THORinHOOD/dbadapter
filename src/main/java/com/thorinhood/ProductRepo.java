package com.thorinhood;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/**
 * @author Evgeny Borisov
 */
public class ProductRepo {

    private List<Supplier<? extends Costable>> products = List.of(Chair::new, Table::new);

    public Costable getProduct() {
        Random rand = new Random();
        return products.get(rand.nextInt(products.size())).get();
    }
}
