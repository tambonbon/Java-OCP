package Enthuware._05Exception;
public class Account2 {
    class LowBalanceException extends WithdrawalException {
        public LowBalanceException(String mString) { super(mString); }
    }
    
    class WithdrawalException extends RuntimeException {
        public WithdrawalException(String mString) { super(mString); }
    }
    double balance;
    public void withdraw(double amount) {
        // Here, withdraw method NOT declare (throws) any exception
        // ----> ONLY UNCHECKED EXCEPTIONS CAN COME OUT OF THIS METHOD !!! <---- ...
        try {
            // ... Thus, LowBalanceException MUST either be: unchecked, 
            // or MUST extend WithdrawalException
            throw new LowBalanceException("Not implemented");
        } catch (WithdrawalException exception) {
            throw new RuntimeException(exception.getMessage());
            // Actually, from here we can only infer WithdrawalException extends Exception..
        }
    }

    public static void main(String[] args) {
        try {
            Account2 account2 = new Account2();
            account2.withdraw(100.0);
        } catch (WithdrawalException e) {
            // ... but it NOT compiled bc the next catch is Exception again
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

