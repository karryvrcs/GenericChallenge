package dev.lpa;



// Create two specific classes that extend the Point and Line
public class River extends Line{
    private String name;

    public River(String name, String... locations) {
        super(locations);
        this.name = name;
    }

    @Override
    public String toString(){
        return name + " River";
    }
}
