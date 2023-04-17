package com.pds.models;

public class EnterpriseCustomer extends Customer {

    public EnterpriseCustomer() {
    }

    public EnterpriseCustomer(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Enterprise";
    }
}
