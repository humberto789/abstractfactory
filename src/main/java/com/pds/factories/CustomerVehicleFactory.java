package com.pds.factories;

import com.pds.models.Customer;
import com.pds.models.Vehicle;

public interface CustomerVehicleFactory {

    public Customer createCustomer(String customerName);
    public Vehicle createVehicle(String vehicleName, String customerName);

}
