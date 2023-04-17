package com.pds.view;

import com.pds.factories.EnterpriseCustomerVehicleFactory;
import com.pds.factories.IndividualCustomerVehicleFactory;
import com.pds.models.Customer;
import com.pds.models.Vehicle;

public class MainAbstractFactory {

    public static void main(String[] args) {

        System.out.println("Enterprise");

        EnterpriseCustomerVehicleFactory enterpriseFactory = new EnterpriseCustomerVehicleFactory();

        Customer enterpriseCustomer = enterpriseFactory.createCustomer("Humberto");

        System.out.println(enterpriseCustomer.toString());

        Vehicle enterpriseVehicle = enterpriseFactory.createVehicle("Uno", "João");

        System.out.println(enterpriseVehicle.toString());

        System.out.println("Individual");

        IndividualCustomerVehicleFactory individualFactory = new IndividualCustomerVehicleFactory();

        Customer individualCustomer = individualFactory.createCustomer("Humberto");

        System.out.println(individualCustomer.toString());

        Vehicle individualVehicle = individualFactory.createVehicle("Gol", "Bruno");

        System.out.println(individualVehicle.toString());

    }

}
