public class LoanTest {
    public static void main(String[] args) {
        System.out.println("Running Loan tests...");

        testValidLoan();
        testInvalidAnnualInterestRate();
        testInvalidNumberOfYears();
        testInvalidLoanAmount();

        System.out.println("Loan tests completed.");
    }

    private static void testValidLoan() {
        Loan loan = new Loan(5.0, 10, 10000);
        System.out.println("Valid loan created: "
                + "rate=" + loan.getAnnualInterestRate()
                + ", years=" + loan.getNumberOfYears()
                + ", amount=" + loan.getLoanAmount());
    }

    private static void testInvalidAnnualInterestRate() {
        try {
            new Loan(0, 10, 10000);
            System.out.println("ERROR: expected IllegalArgumentException for annual interest rate");
        } catch (IllegalArgumentException ex) {
            System.out.println("Passed: invalid annual interest rate threw exception: " + ex.getMessage());
        }
    }

    private static void testInvalidNumberOfYears() {
        try {
            new Loan(5.0, 0, 10000);
            System.out.println("ERROR: expected IllegalArgumentException for number of years");
        } catch (IllegalArgumentException ex) {
            System.out.println("Passed: invalid number of years threw exception: " + ex.getMessage());
        }
    }

    private static void testInvalidLoanAmount() {
        try {
            new Loan(5.0, 10, 0);
            System.out.println("ERROR: expected IllegalArgumentException for loan amount");
        } catch (IllegalArgumentException ex) {
            System.out.println("Passed: invalid loan amount threw exception: " + ex.getMessage());
        }
    }
}
