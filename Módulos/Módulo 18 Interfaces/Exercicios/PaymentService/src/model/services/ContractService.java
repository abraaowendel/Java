package model.services;

import java.time.LocalDate;

import model.entitites.Contract;
import model.entitites.Installment;

public class ContractService {

    OnlinePaymentService paymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, Integer months){
        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {

            LocalDate dueDate = contract.getDate().plusMonths(i);
            Double interest = paymentService.interest(basicQuota, i);
            Double fee = paymentService.paymentFee(basicQuota + interest);
            Double quota = interest + fee + basicQuota;
            contract.getInstallment().add(new Installment(dueDate, quota));
        }
    }
}
