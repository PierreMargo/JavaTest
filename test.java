public class App {


    public static double TestPricing(String asset,Boolean testDerivativePricing){
        switch (asset) {
        case "RateSwap":
            return 1;
        case "Equity":
            if (testDerivativePricing)
                return 2;
            return 3;
            
        case "IRS":
            return 4;
        default : 
        return 0;
        }

    }
}
