package garage;

import garage.carParts.Engine;
import garage.carParts.Wheel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by andrey on 29.01.17.
 */
public class Car {
    private Wheel wheel;
    private Engine engine;

    public Car(Wheel wheel, Engine engine) {
        this.wheel = wheel;
        this.engine = engine;
    }
    @Override
    public String toString(){
        return "Car:\n "+wheel+engine;
    }

}
