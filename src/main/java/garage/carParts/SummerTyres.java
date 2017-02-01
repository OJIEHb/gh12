package garage.carParts;

import org.springframework.stereotype.Component;

/**
 * Created by andrey on 29z.01.17.
 */
public class SummerTyres extends Tyres {
    public void init() {
        setName("SummerTyres");
        setSize(17);
    }
}
