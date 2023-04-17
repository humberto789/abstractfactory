package com.pds.factories;

import com.pds.models.Customer;
import com.pds.models.EnterpriseCustomer;
import com.pds.models.EnterpriseVehicle;
import com.pds.models.Vehicle;

public class EnterpriseCustomerVehicleFactory implements CustomerVehicleFactory{
    @Override
    public Customer createCustomer(String customerName) {
        return new EnterpriseCustomer(customerName);
    }

    @Override
    public Vehicle createVehicle(String vehicleName, String customerName) {
        Customer customer =  this.createCustomer(customerName);

        return new EnterpriseVehicle(vehicleName, customer);
    }
}
