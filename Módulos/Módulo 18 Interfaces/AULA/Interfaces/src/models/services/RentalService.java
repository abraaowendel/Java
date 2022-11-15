package models.services;

import java.time.Duration;

import models.entities.CarRental;
import models.entities.Invoice;

public class RentalService {

    private double pricePerHour;
    private double pricePerDay;

    private TaxService taxService;

    public RentalService(double pricePerHour, double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice (CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60 ;

        double basicPayments;

        if(hours <= 12.0){
            basicPayments = pricePerHour * Math.ceil(hours);
        }
        else{
            basicPayments = pricePerDay * Math.ceil(hours / 24);
        }


        double tax = taxService.tax(basicPayments);

        carRental.setInvoice(new Invoice(basicPayments, tax));

    }
}
