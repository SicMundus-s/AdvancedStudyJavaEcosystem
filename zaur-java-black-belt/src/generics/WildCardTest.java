package generics;

import java.util.ArrayList;

public class WildCardTest {

    public <T extends Number> void wildmethod(T value){
        System.out.println(value);
    }
}
