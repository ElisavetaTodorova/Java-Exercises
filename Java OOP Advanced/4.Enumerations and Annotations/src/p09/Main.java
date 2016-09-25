package p09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TrafficLights[] trafficLights = TrafficLights.values();
        String []input=reader.readLine().split("\\s+");
        TrafficLights firstLight=TrafficLights.valueOf(input[0].toUpperCase());
        TrafficLights secondLight=TrafficLights.valueOf(input[1].toUpperCase());
        TrafficLights thirdLight=TrafficLights.valueOf(input[2].toUpperCase());
        int first=firstLight.ordinal();
        int second=secondLight.ordinal();
        int third=thirdLight.ordinal();
        int n=Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            System.out.printf("%s %s %s%n",trafficLights[(++first)%3].name(),
                                            trafficLights[(++second)%3].name(),
                                            trafficLights[(++third)%3].name());
        }




    }

}
