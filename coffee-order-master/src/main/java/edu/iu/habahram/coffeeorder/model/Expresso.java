package edu.iu.habahram.coffeeorder.model;

public class Expresso extends CondimentDecorator{
    public Expresso(Beverage beverage) {
        this.beverage = beverage;
    }
        @Override
        public String getDescription() {
            return "Expresso";
        }
        @Override
        public float cost() {
            return 3.99F;
        }

    }

}
