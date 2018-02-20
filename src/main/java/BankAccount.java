import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,
        /**
         *
         */
        SAVINGS,
        /**
         *
         */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }
    /**
     *
     */
    private int accountNumber;
    /**
     *
     */
    private BankAccountType accountType;
    /**
     *
     */
    private double accountBalance;
    /**
     *
     */
    private String ownerName;
    /**
     *
     */
    private double interestRate;
    /**
     *
     */
    private double interestEarned;
    /**
     *@param name account name
     *@param accountCategory type of bank account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        if (name.equals(ownerName) && accountCategory.equals(accountType)) {

        }

    }
    /**
     *
     * @return
     */
    public BankAccountType getAccountType() {
        return accountType;
    }
    /**
     *@setAccountNumber of the account
     */
    public BankAccountType setAccountType(final BankAccountType setAccountType) {
        BankAccountType accountType = setAccountType;
        return accountType;
    }
    /**
     *
     */
    public BankAccountType getAmount() {
        return accountType;
    }
    /**
     *@setAmount of money the account has
     */
    public double setAmount(final double setAmount) {
        double amount = setAmount;
        return amount;
    }

    /**
     *
     * @return
     */
    public double getAccountNumber() {
        return accountBalance;
    }
    /**
     *@setAccountNumber of the account
     */
    public double setAccountNumber(final double setAccountNumber) {
        double accountNumber = setAccountNumber;
        return accountNumber;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}