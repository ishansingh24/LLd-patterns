import java.util.ArrayList;
import java.util.List;

class client{
    public static void main(String[] args) {
        List<scorpio>list = new ArrayList<>();
        scorpio sc1 = new scorpio();
        scorpio sc2 = new ScorpioN();
        scorpio sc3 = new Scorpioclassic();

        list.add(sc1);
        list.add(sc2);
        list.add(sc3);

        for(scorpio sc : list)
        {
            sc.driveCar();
        }

    }
}