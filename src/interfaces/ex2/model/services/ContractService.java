package interfaces.ex2.model.services;

import java.time.LocalDate;

import interfaces.ex2.model.entities.Contract;
import interfaces.ex2.model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;


	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {

		double basicQuota = contract.getTotalValue() / months;
		
		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			double interest = onlinePaymentService.interest(basicQuota, i); // juros
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);      // taxa
			double quota = basicQuota + interest + fee;
			
			contract.getInstallments().add(new Installment(dueDate, quota));
		}
		
	}

}
