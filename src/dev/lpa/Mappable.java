package dev.lpa;


public interface Mappable {

    void render();

    static double[] stringToLatLon(String location){
        // 这可能是用来插入新lat lon的，输入的总是string，然后把string拆为Lat和Lon

        var splits = location.split(",");
        // Convert String to Double, then unboxing;
        double lat = Double.parseDouble(splits[0]);
        double lon = Double.parseDouble(splits[1]);

        return new double[]{lat, lon};
    };

}
