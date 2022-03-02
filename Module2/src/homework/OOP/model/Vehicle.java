package homework.OOP.model;

import java.util.Scanner;

public class Vehicle {
    private int ID;
    private String Name;
    private long Capacity;
    private double priceBy;

    public Vehicle() {
    }

    public Vehicle(int ID, String name, long capacity, double priceBy) {
        this.ID = ID;
        Name = name;
        Capacity = capacity;
        this.priceBy = priceBy;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getCapacity() {
        return Capacity;
    }

    public void setCapacity(long capacity) {
        Capacity = capacity;
    }

    public double getPriceBy() {
        return priceBy;
    }

    public void setPriceBy(double priceBy) {
        this.priceBy = priceBy;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Capacity=" + Capacity +
                ", priceBy=" + priceBy +
                '}';
    }
}
