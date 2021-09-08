package com.elevenst.intellij.autocomplete;

public class Child implements Parent{
    //ctrl+I implements method

    @Override
    public void sell(Long amount) {

    }

    @Override
    public int buy(Long amount) {
        return 0;
    }

    @Override
    public boolean wishList() {
        return false;
    }
}
