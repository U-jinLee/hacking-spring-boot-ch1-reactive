package com.greglturnquist.hackingspringboot.reactive;

public class Dish {
    private String description;
    private boolean delivered = false;

    public static Dish deliver(Dish dish) {
        Dish deliveredDish = new Dish(dish.description);
        deliveredDish.delivered = true;
        return deliveredDish;
    }

    public Dish(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "description='" + description + '\'' +
                ", delivered=" + delivered +
                '}';
    }
}
