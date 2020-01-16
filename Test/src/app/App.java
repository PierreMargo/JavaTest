package app;

public class App {

    public static void main(String[] args) {
    Double s = TestPricing("Equity",true,5,6,8);
    System.out.print(s.toString());
}



public static double TestPricing(String asset,Boolean testDerivativePricing,double a,double b, double c){
    switch (asset) {
    case "RateSwap":
        return a+b;
    case "Equity":
        if (testDerivativePricing)
            return b-c;
        return 3*a+b+c;
        
    case "IRS":
        return b;
    default : 
    return a-b+c;
    }

}
}
