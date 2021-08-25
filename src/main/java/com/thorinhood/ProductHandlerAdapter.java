package com.thorinhood;

public class ProductHandlerAdapter {

    private ProductHandler productHandler;

    public ProductHandlerAdapter(ProductHandler productHandler) {
        this.productHandler = productHandler;
    }

    public void handle(Costable costable) {
        productHandler.handle(costable::cost);
    }

}
