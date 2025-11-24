import java.text.NumberFormat;
import java.util.*;



public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale bdLocale = Locale.of("en","BD");
        NumberFormat currencyFormatter=NumberFormat.getCurrencyInstance(bdLocale);
        System.out.println("===Bangladesh Mortgage Calculator(BDT)===");
       
       
        double salary =0;
        while (true) {
            System.out.print("Enter your monthly salary (BDT): ");
            if (sc.hasNextDouble()) {
                salary = sc.nextDouble();
                if (salary > 0){
                     break;
                 } 
                else {
                    System.out.println("Salary must be positive.");
                }
            } else {
                System.out.println("Please enter a valid number for salary.");
                sc.next();
                
            }
        }
            
    
    
        
        int creditScore = 0;
      while (true){
        System.out.print("Enter your credit score (0-500): ");
        if(sc.hasNextInt()){
            creditScore=sc.nextInt();
            if(creditScore>0  && creditScore<=500){
                break;
            }else{
                System.out.println("Credit score must be between 0 and 500");
            }
        }else{
            System.out.println("Plase enter a valid number for credit score ");
            sc.next();
        }
      }
      boolean criminalRecord=false;
      while(true){
        System.out.print("Do you have any criminal record ?(True/False) : ");
        if(sc.hasNextBoolean()){
            criminalRecord = sc.nextBoolean();
            break;
        }else{
            System.out.println("Plase enter true or false");
            sc.next();

        }
      }
     boolean eligible=(creditScore>=300)&&!criminalRecord;
         if(!eligible){
            System.out.println("Sorry you are not eligible for loan eligibility");
           sc.close();
          return;
         }
double loanAmount = 0;
while(true){
    System.out.print("Enter your desired loan amount :");
    if (sc.hasNextDouble()){
       loanAmount=sc.nextDouble();
        if(loanAmount<=2*salary){
            break;
        }else{
            System.out.println("Loan must be under 2 times your salary");
        }
    }else{
        System.out.println("Invalid input.Please enter numeric value");
        
    }
}


         
       
        
        System.out.print("Enter annual interest rate(e.g., 8.5 for 8.5%) :");
         float annualInterestRate = sc.nextFloat();
        System.out.print("Enter loan period(in years) :");
         int loanPeriod = sc.nextInt();
         double monthlyInterestRate=annualInterestRate/100/12;
         int numberOfPayments=loanPeriod*12;
         double mortgagePayment=loanAmount*(monthlyInterestRate *Math.pow(1+monthlyInterestRate,numberOfPayments))
         /(Math.pow(1+monthlyInterestRate,numberOfPayments)-1);

         double totalPayment=mortgagePayment*numberOfPayments;
         double totalInterest=totalPayment-loanAmount;
         
         



        System.out.println("===Mortgage Summary==");
        System.out.println("Loan Amonut :"+currencyFormatter.format(loanAmount));
        System.out.println("Monthly Payment :"+currencyFormatter.format(mortgagePayment));
        System.out.println("Total Payment :"+currencyFormatter.format(totalPayment));
        System.out.println("Total Interest :"+currencyFormatter.format(totalInterest));


     
       sc.close();

}


}