package problems.atm;

import java.math.BigDecimal;

public class ATMValidator {

    public static boolean isValid(int amount) {
        boolean isValid = true;

        //if(amount > Constants.WITHDRAW_LIMIT )


        if (amount % Constants.FIVE == 0) {
            if (Constants.ACCOUNT_BALANCE.intValue() > (amount + Constants.FEES_PER_TRANSACTION)) {
                new ATMOperation().withdraw(BigDecimal.valueOf(amount));
                ATMDisplay.display(ATMEnum.SUCCESSFULL_TRANSACTION.toString());
            } else {
                isValid = false;
                ATMDisplay.display(ATMEnum.INSUFFICIENT_FUNDS.toString());
            }
        } else {
            isValid = false;
            ATMDisplay.display(ATMEnum.INCORRECT_WITHDRAWL_AMOUNT.toString());
        }
        return isValid;
    }
}
