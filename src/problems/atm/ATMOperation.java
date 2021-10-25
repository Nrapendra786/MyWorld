package problems.atm;

import java.awt.*;
import java.math.BigDecimal;

public class ATMOperation {

    public void withdraw(BigDecimal amount) {
       double balance =  Constants.ACCOUNT_BALANCE.doubleValue();
       balance = balance - amount.doubleValue() - Constants.FEES_PER_TRANSACTION;
       new ATMDisplay().display(String.valueOf(balance));
    }

}
