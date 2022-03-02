package org.zerock;

public class Menu {
    String name;
    int cost;

    public Menu(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
