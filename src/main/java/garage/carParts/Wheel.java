package garage.carParts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by andrey on 29.01.17.
 */
public class Wheel {
    private Tyres tyres;

    public Wheel(Tyres tyres) {
        this.tyres = tyres;
    }

    public String toString(){
        return "Wheel:\n  "+tyres;
    }
}
