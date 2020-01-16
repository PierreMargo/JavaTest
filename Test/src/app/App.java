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


public static double TestPricing2(String asset,double a,double b, double c){
    if(asset=="Equity")
    return a-b;
    if(asset=="Future")
    return a/b-c;
    return 6;
    }
    public  double TestPricing3(String asset,double a,double b, double c){
        if(asset=="ETF")
        return a-b;
        return 7;

}
}
