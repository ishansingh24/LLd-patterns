import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class clinet {
    public static void main(String[] args) {
        viechleFactory vf = new defenderFactory();
        viechleFactory vf2 = new scorpioFactory();

        car c  = new car(vf);
        car c2 = new car(vf2);

        List<car>list = new ArrayList<>();
        list.add(c);
        list.add(c2);

        for(car x : list)
        {
            x.driveCar();
        }
    }
    
}
