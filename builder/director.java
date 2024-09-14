public class director {
   public carBuilder carBuilder;

    public director(carBuilder carBuilder)
    {
        this.carBuilder = carBuilder;
    }

    public void  construct() {
        carBuilder.WithAc(new Ac());
        carBuilder.WithGare(new Gare());
        carBuilder.withTyre(new Tyre());
        carBuilder.withBodyShell(new BodyShell());
        carBuilder.withEngine(new engine());
        carBuilder.withAirSusupension(new AirSusupension());
    }
}
