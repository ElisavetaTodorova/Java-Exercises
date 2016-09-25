package exesices.StaticMethods.p04BeerCounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ELISAV on 3.9.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        BeerCounter counter=new BeerCounter();
        String line=reader.readLine();
        while (!line.equals("End")){
            String[]beers=line.split("\\s+");
            Integer boughtBeers=Integer.parseInt(beers[0]);
            Integer drankBeers=Integer.parseInt(beers[1]);
            BeerCounter.BuyBeer(boughtBeers);
            BeerCounter.DrinkBeer(drankBeers);
            line=reader.readLine();
        }
        System.out.println(counter.toString());
    }

}
