package garage.carParts;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

/**
 * Created by andrey on 29.01.17.
 */
public class Engine {
    private int engineCapacity;

    public void init() {
        setEngineCapacity(70);
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString(){
        return " Engine:\n  Engine Capacity: "+getEngineCapacity();
    }
}

