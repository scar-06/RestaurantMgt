package org.example.restaurant.resources;

import org.example.restaurant.enums.Roles;

import java.math.BigDecimal;
import java.util.List;

public abstract class Equipment {
    private String name;
    private String function;
    private BigDecimal price;
    public List<Roles> handlers;
    private String maintenanceCycle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<Roles> getHandlers() {
        return handlers;
    }

    public void setHandlers(List<Roles> handlers) {
        this.handlers = handlers;
    }

    public String getMaintenanceCycle() {
        return maintenanceCycle;
    }

    public void setMaintenanceCycle(String maintenanceCycle) {
        this.maintenanceCycle = maintenanceCycle;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "name='" + name + '\'' +
                ", function='" + function + '\'' +
                ", price=" + price +
                ", handlers=" + handlers +
                ", maintenanceCycle='" + maintenanceCycle + '\'' +
                '}';
    }
}
