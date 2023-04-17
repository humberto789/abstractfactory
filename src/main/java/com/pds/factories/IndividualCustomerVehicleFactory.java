package com.pds.factories;

import com.pds.models.Customer;
import com.pds.models.IndividualCustomer;
import com.pds.models.IndividualVehicle;
import com.pds.models.Vehicle;

public class IndividualCustomerVehicleFactory implements CustomerVehicleFactory{
    @Override
    public Customer createCustomer(String customerName) {
        return new IndividualCustomer(customerName);
    }

    @Override
    public Vehicle createVehicle(String vehicleName, String customerName) {
        Customer customer = this.createCustomer(customerName);
        return new IndividualVehicle(vehicleName, customer);
    }
}
