package dev.lpa;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Park standrewsPark = new Park("St Andrews Park", "0.53, 45.22");
        Park edinburghPark = new Park("Edinburgh Park", "0.12, 43.17");

        River scotlandRiver = new River("Scotland River", "15.33, 32.31", "16.15, 33.34", "17.01, 33.22");


        Park[] ukParks = new Park[]{standrewsPark, edinburghPark};
        River[] ukRiver = new River[]{scotlandRiver};

        Layer<Park> parkLayer = new Layer<>(ukParks);
        Layer<River> riverLayer = new Layer<>(ukRiver);

        parkLayer.renderLayer();

        riverLayer.renderLayer();
    }
}