package garage.carParts;

/**
 * Created by andrey on 29.01.17.
 */
public class Engine {
    private int engineCapacity;

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

