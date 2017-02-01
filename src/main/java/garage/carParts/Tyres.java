package garage.carParts;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

/**
 * Created by andrey on 29.01.17.
 */
public class Tyres {
    protected String name;
    protected  int size;

    public void init() {
        setName("Tyres");
        setSize(16);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString(){
        return "Tyres:\n   Name: "+getName()+"\n   Size: "+getSize()+"\n";
    }
}
