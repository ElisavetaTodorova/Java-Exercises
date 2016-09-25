package exesices.StaticMethods.p04BeerCounter;

/**
 * Created by ELISAV on 3.9.2016 г..
 */
public class BeerCounter {
    static private Integer beerInStock;
    static  private Integer beersDrankCount;

    public BeerCounter() {
        beerInStock=0;
        beersDrankCount=0;
    }
    public static void BuyBeer(int bottlesCount){
        beerInStock+=bottlesCount;
    }
    public static void DrinkBeer(int bottlesCount){
        beersDrankCount+=bottlesCount;
    }

    @Override
    public String toString() {
        return String.format("%d %d",beerInStock-beersDrankCount,beersDrankCount);
    }
}
