package app;

public class App {

    public static void main(String[] args) {
    Double s = TestPricing("Equity",true,5,6,8);
    System.out.print(s.toString());
}



public static double TestPricing(String asset,Boolean testDerivativePricing,double a,double b, double c){
    
    Double assetPrice = 0.0;
    
    switch (asset) {
    case "RateSwap":
        assetPrice = a+b;
    case "Equity":
        if (testDerivativePricing)
            assetPrice= b-c;
         else
        assetPrice= 3*a+b+c;
        
    case "IRS":
        assetPrice= b;
    default : 
    assetPrice= a-b+c;
    }
return assetPrice;
}


public static double TestPricing2(String asset,double a,double b, double c){
    Double assetPrice2 = 0.0;
    if(asset=="Equity")
    assetPrice2= a-b;
    if(asset=="Future")
    assetPrice2= a/b-c;
    
    return assetPrice2;
    }


    public  double TestPricing3(String asset,double a,double b, double c){
        if(asset=="ETF")
        return a-b;
        return 7;

}
}
