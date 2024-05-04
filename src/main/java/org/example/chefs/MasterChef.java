package org.example.chefs;

import java.util.Objects;

public class MasterChef extends SeniorChef implements Chef {

    private final String name;
    private String lastname;

    public MasterChef(String name) {
        super(name);
        this.name = name;
    }

    public MasterChef(String name, String lastname) {
        super(name);
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public void giveOrders(){
        System.out.println("Give hella orders");
    }

    @Override
    public Integer createBurger() {
        return null;
    }

    @Override
    public void createSalad() {}

    @Override
    public String getRank() {
        return "Master";
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getRating() {
        return 0;
    }

    @Override
    public MasterChef promote() {
        return this;
    }

    @Override
    public String toString() {
        return "MasterChef{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MasterChef that = (MasterChef) o;
        return Objects.equals(name, that.name) && Objects.equals(lastname, that.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, lastname);
    }
}
