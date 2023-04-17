package com.pds.models;

public abstract class Customer {

    private String name;

    public Customer(){
    }
    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getType() {
        return "Default";
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " , Type: " + getType();
    }
}
