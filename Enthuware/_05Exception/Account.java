class LowBalanceException extends WithdrawalException {
    public LowBalanceException(String mString) {
        super(mString);
    }
}

class WithdrawalException extends Exception {
    public WithdrawalException(String mString){
        super(mString);
    }
}
public class Account {
    double balance;
    
    public void withdraw(double amount) throws WithdrawalException { 
        // withdraw method declares throwing WithdrawalException
        // ---> exceptions that can come out of this method are only WithdrawalExceptions !!! <-----
        try {
            throw new RuntimeException("Not implemented");
            // try block throws a RTE ---> will be caught by catch(Exception )...
        } catch (Exception exception) {
            throw new LowBalanceException(exception.getMessage());
            // ... but the catch block throws a LowBalanceException, which is not caught
            // ---> LowBalanceException MUST either throw RTE, or WithdrawalException to satisfy throws clause
            // in the method declaration !!!
        }
    }

    public static void main(String[] args) {
        try {
            Account a = new Account();
            a.withdraw(100.0); 
            // withdraw is enclosed within a try block with catch(Exception )
            // while main NOT throws a clause ...
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            // ... ---> WithdrawalException MUST either throw Exception or RTE !!!
        }
    }
}
