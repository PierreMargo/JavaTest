package app;

public class App {

    public static void main(String[] args) {
    Double s = TestPricing("Equity",true,5,6,8);
    System.out.print(s.toString());
}



public static Double TestPricing(String asset,Boolean testDerivativePricing,Double a,Double b, Double c){
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


public static Double TestPricing2(String asset,Double a,Double b, Double c){
    if(asset=="Equity")
    return a-b;
    if(asset=="Future")
    return a/b-c;
    return 6;
    }
    public  Double TestPricing3(String asset,Double a,Double b, Double c){
        if(asset=="ETF")
        return a-b;
        return 7;

}
}
