package dev.lpa;

import java.util.ArrayList;
import java.util.List;

// Generic class
// only allow Mappable elements as that type
public class Layer <T extends Mappable>{
    private List<T> layerElements;

    public Layer(T[] layerElements) {
        this.layerElements = new ArrayList<T>(List.of(layerElements));
    }

    // We can add many Point...
    public void addElements(T... elements){
        layerElements.addAll(List.of(elements));
    }


    public void renderLayer(){
        for (T element: layerElements){
            element.render();
        }
    }


}
