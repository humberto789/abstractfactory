package com.pds.models;

public abstract class Vehicle {

    private String name;

    private Customer customer;

    public Vehicle(){
    }

    public Vehicle(String name, Customer customer){
        this.name = name;
        this.customer = customer;
    }

    public String getType(){
        return "Default";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Name: " + name + "; Type: " + getType() + " ; Customer: ( " + customer.toString() + " )";
    }
}
