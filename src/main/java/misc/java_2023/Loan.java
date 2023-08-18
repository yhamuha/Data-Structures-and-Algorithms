package misc.java_2023;

public class Loan {

    public static void main(String[] args) {
        int accountNumber = 1001;
        int customerBalance = 1000;
        int salary = 75000;
        String loanType = "Car";
        int loanAmountExpected = 300000;
        int emisExpected = 30;
        int eligibleLoan = 0;
        int emisEligible = 0;

        if (accountNumber < 1000 || customerBalance < 1000) {
            System.out.println("OR acc number <1000 OR <$1000 on account");
        } else {
            if (salary >= 25000 && salary <50000) {
                eligibleLoan = 500000;
                emisEligible = 36;
                System.out.println("elig loan: " + eligibleLoan + "\n" +
                        "EMIs expected: " + emisEligible );
            } else if (salary >=50000 && salary <75000) {
                eligibleLoan = 600000;
                emisEligible = 60;
                System.out.println("elig loan: " + eligibleLoan + "\n" +
                        "EMIs expected: " + emisEligible );
            } else if (salary >= 75000) {
                eligibleLoan = 750000;
                emisEligible = 84;
                System.out.println("elig loan: " + eligibleLoan + "\n" +
                        "EMIs expected: " + emisEligible );
            } else {
                System.out.println("not enough salary to get EMI's");
            }
        }
    }

}
