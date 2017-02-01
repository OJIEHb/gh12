package garage.carParts;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

/**
 * Created by andrey on 29.01.17.
 */
@Component
public class Tyres {
    protected String name;
    protected  int size;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    @Required
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString(){
        return "Tyres:\n   Name: "+getName()+"\n   Size: "+getSize()+"\n";
    }
}
