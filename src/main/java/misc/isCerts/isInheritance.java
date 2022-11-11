package misc.isCerts;

/**
 *
 */
public class isInheritance {

}

/*class Loan {
    int tenure;
    double principal;
    float interestRate;
    String accountNumber;
    public double calculateEMI(){
        double simpleInterest = (principal*interestRate*tenure)/100;
        return (simpleInterest+principal)/tenure;
    }
}
class HomeLoan extends Loan {
    HomeLoan() {
        tenure = 5; //reusing super class member variables
        principal = 20000;
        interestRate = 8.5f;
        accountNumber = "Acc12345";
    }

    public static void main(String[] args) {
        HomeLoan hloan = new HomeLoan();
        double amount = hloan.calculateEMI();   // sub class Object
        // invoking super class method
        System.out.println("emi per year..." + amount);
    }
}*/

/*
class Loan {
    public double calculateEMI(double principal) {
        double simpleInterest = (principal*8.5*5) / 100;
        double emi = (simpleInterest+principal)/5;
        return emi;
    }
}

class HomeLoan extends Loan {
    public double calculateEMI(double principal) {
        int additionaltax = 200;
        double emi = super.calculateEMI(principal);      //calling super class method
        return emi + additionaltax;
    }
}

class ExecuteLoan {
    public static void main(String[] args) {
        Loan loan = null;
        loan =  new HomeLoan();                 // Runtime polymorphism
        double hloan = loan.calculateEMI(2000000);
        System.out.println("Home loan emi per year..."+ hloan);
    }
}*/


//====

/*class Loan{
    Loan(){
        System.out.println("Request for loan");
    }
}
class HomeLoan extends Loan{
    public static void main(String[] args){
        HomeLoan obh=new HomeLoan();
    }
}*/
// request for loan

/*class Loan{
    Loan(int x){
        System.out.println("Request for loan");
    }
}

class HomeLoan extends Loan{
    HomeLoan(){
        System.out.println("Request for HomeLoan");
    }
    public static void main(String[] args){
        HomeLoan obh=new HomeLoan();
    }
}*/
// runtime exception

