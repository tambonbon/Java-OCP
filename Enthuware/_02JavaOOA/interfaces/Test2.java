package Enthuware._02JavaOOA.interfaces;

public class Test2 {
    interface Account {
        public default String getId() {
            return "0000";
        }
    }

    interface PremiumAccount extends Account {
        // public String getId();
        @Override
        default String getId() {
            return Account.super.getId(); // Valid
            // return super.getId(); // NOT valid 
        }
    }
    
    static class BankAccount implements PremiumAccount {
        // BankAccount MUST either provide implementation for getID, or be marked abstract,
        
        @Override
        public String getId() {
            return PremiumAccount.super.getId();
            // return super.getId(); // NOT valid
        }

        public static void main(String[] args) {
            Account account = new BankAccount();
            System.out.println(account.getId());
        }
    }
    
}
