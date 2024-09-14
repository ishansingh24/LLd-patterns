public class client {
    public static void main(String[] args) {
        carBuilder cb  = new scorpioBuilder();
        carBuilder builder = new fortunerBuilder();

        director director = new director(builder);
        director.construct();
        Icar fortuner = builder.Build();
        fortuner.driveCar();
        System.out.println("======================================================================");
        director director2 = new director(cb);
        director2.construct();
        Icar scorpio = cb. Build();
        scorpio.driveCar();
        System.out.println("==========================================================================");

    }
}
