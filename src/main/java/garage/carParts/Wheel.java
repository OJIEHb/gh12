package garage.carParts;

/**
 * Created by andrey on 29.01.17.
 */
public class Wheel {
    private Tyres tyres;

    public Wheel(Tyres tyres) {
        this.tyres = tyres;
    }

    @Override
    public String toString(){
        return "Wheel:\n  "+tyres;
    }
}
