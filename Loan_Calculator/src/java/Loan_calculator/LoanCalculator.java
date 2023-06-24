/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loan_calculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
/**
 *
 * @author 逐星i
 */


@Path("/loan")
public class LoanCalculator{

    @GET
    @Path("/monthly-payment/{amount}/{interestRate}/{months}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response calculateMonthlyPayment(@PathParam("amount") double amount,
                                             @PathParam("interestRate") double interestRate,
                                             @PathParam("months") int months) {
        double monthlyIR = (interestRate / 100) / 12; // convert annual interest rate to monthly interest rate
        double discountFactor = Math.pow(1 + monthlyIR, -months);
        double monthlyPayment = (amount * monthlyIR) / (1 - discountFactor);
        return Response.ok().entity(monthlyPayment).build();
    }

    @GET
    @Path("/total-repayment/{amount}/{interestRate}/{months}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response calculateTotalRepayment(@PathParam("amount") double amount,
                                             @PathParam("interestRate") double interestRate,
                                             @PathParam("months") int months) {
        double monthlyIR = (interestRate / 100) / 12; // convert annual interest rate to monthly interest rate
        double discountFactor = Math.pow(1 + monthlyIR, -months);
        double monthlyPayment = (amount * monthlyIR) / (1 - discountFactor);
        double totalRepayment = monthlyPayment * months;
        return Response.ok().entity(totalRepayment).build();
    }
}
