package dev.lpa;


import java.util.Arrays;

public abstract class Point implements Mappable{
    private double[] location = new double[2];

    // The constructor on abstract class used by subclass.
    public Point (String location){
        this.location = Mappable.stringToLatLon(location);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as POINT (" + location() + ")");
    }

    // Change the location to String for printing out.
    private String location(){
        return Arrays.toString(location);
    }

}
