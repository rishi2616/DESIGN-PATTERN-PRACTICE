package com.kingshuk.designpatterns.structuralpattern.decoratorpattern.headfirstexample;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description="Dark Roast";
    }

    @Override
    public Double cost() {
        return 4.99;
    }
}
