package garage.carParts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by andrey on 29.01.17.
 */
@Component
public class Wheel {
    private Tyres tyres;

    @Autowired
    public Wheel(Tyres tyres) {
        this.tyres = tyres;
    }

    @Override
    public String toString(){
        return "Wheel:\n  "+tyres;
    }
}
