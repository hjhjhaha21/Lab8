//import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * Different types of bank accounts.
     */
    public enum BankAccountType {
        /**
         * Checking account.
         */
        CHECKINGS,
        /**
         * Savings account.
         */
        SAVINGS,
        /**
         * Student account.
         */
        STUDENT,
        /**
         * Work account.
         */
        WORKPLACE
    }

    /**
     * Account number.
     */
    private int accountNumber;
    /**
     * Account type.
     */
    @SuppressWarnings("checkstyle:visibilitymodifier")
    public BankAccountType accountType;
    /**
     * Account balance.
     */
    private double accountBalance;
    /**
     * Owner's name.
     */
    private String ownerName;
    /**
     * Interest rate.
     */
    @SuppressWarnings("checkstyle:visibilitymodifier")
    public double interestRate;
    /**
     * Interest money earned.
     */
    private double interestEarned;

    /**
     * Creating a bank account.
     * @param name owner's name
     * @param accountCategory bank account types
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        Bank.totalAccounts++;
    }

    /**
     *
     * @return account number
     */
    public int getAccNumber() {
        return accountNumber;
    }

    /**
     *
     * @return account balance
     */
    public double getBalance() {
        return accountBalance;
    }

    /**
     *
     * @return owner's name
     */
    public String getName() {
        return ownerName;
    }

    /**
     *
     * @return amount of money earned through interests
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     *
     * @param number new account number
     */
    public void setAccNumber(final int number) {
        accountNumber = number;
    }
    /**
     *
     * @param balance new account balance
     */
    public void setBalance(final double balance) {
        accountBalance = balance;
    }
    /**
     *
     * @param name new owner's name
     */
    public void setName(final String name) {
        ownerName = name;
    }
    /**
     *
     * @param intEarned new amount earned from interest
     */
    public void setInterestEarned(final double intEarned) {
        interestEarned = intEarned;
    }
}
