package javaProStanislav.lesson23_07062023.mockito2.ui;

import javaProStanislav.lesson23_07062023.mockito2.developerNumber1.BankServiceDB;
import javaProStanislav.lesson23_07062023.mockito2.developerNumber2.BankServiceCommertzBank;

public class UserMakePayment {
    public void userPayment(){

        String employeeCity = "Berlin";
        if (employeeCity == "Berlin") {
            BankServiceDB bankServiceDB = new BankServiceDB();

            //PayRoll payRoll = new PayRoll(bankServiceDB)
        }
        if (employeeCity == "Vienna") {
            BankServiceCommertzBank serviceCommertzBank = new BankServiceCommertzBank();

            //PayRoll payRoll = new PayRoll(serviceCommertzBank)
        }
    }
}
