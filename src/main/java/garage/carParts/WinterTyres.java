package garage.carParts;

import org.springframework.stereotype.Component;

/**
 * Created by andrey on 29.01.17.
 */
public class WinterTyres extends Tyres {
    public void init() {
        setName("WinterTyres");
        setSize(15);
    }
}
