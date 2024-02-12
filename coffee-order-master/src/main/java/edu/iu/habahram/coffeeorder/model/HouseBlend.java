package edu.iu.habahram.coffeeorder.model;

public class HouseBlend extends CondimentDecorator{
    public HouseBlend(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Houseblend";
    }
    @Override
    public float cost() {
        return 2.99F;
    }

}
