package dev.lpa;


import java.util.Arrays;

public abstract class Line implements Mappable{
    private double[][] locations;


    // varargs, variable number of arguments, it is essentially a array.
    public Line (String... locations){
        // The number of newArray rows is 'locations.length'
        double[][] newArray = new double[locations.length][];
        for (int i = 0; i < locations.length; i++){
            newArray[i] = Mappable.stringToLatLon(locations[i]);
        }
        this.locations = newArray;
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as LINE (" + locations() + ")");
    }

    private String locations(){
        return Arrays.deepToString(locations);
    }

}
