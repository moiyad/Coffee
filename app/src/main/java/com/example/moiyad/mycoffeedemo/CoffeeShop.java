package com.example.moiyad.mycoffeedemo;

/**
 * Created by moiyad on 10/10/2017.
 */


public class CoffeeShop {
    private String shopName;
    private int shopImage = noimage;
    private static final int noimage=-1;

    public CoffeeShop(String shopName) {
        this.shopName = shopName ;

    }

  public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setShopImage(int shopImage) {
        this.shopImage = shopImage;
    }

    public static int getNoimage() {
        return noimage;
    }
    public int getShopImage() {
        return shopImage;
    }
}