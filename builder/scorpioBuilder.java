public class scorpioBuilder implements carBuilder{
    public Ac             WithAc;
    public Gare           WithGare;
    public Tyre           withTyre;
    public BodyShell      withBodyShell;
    public engine         withEngine;
    public AirSusupension withAirSusupension;


    @Override
    public carBuilder withTyre(Tyre withTyre)
    {
        this.withTyre = withTyre;
        System.out.println("fortuner tyre is assembled");
        return this;
    }
    @Override
    public carBuilder withEngine(engine withEngine)
    {
        this.withEngine = withEngine;
        System.out.println("fortuner Engine is assembled");
        return this;
    }
    @Override
    public carBuilder withAirSusupension(AirSusupension airSusupension)
    {
        this.withAirSusupension = airSusupension;
        System.out.println("fortuner AirSusupension is assembled");
        return this;
    }
    @Override
    public carBuilder WithAc(Ac ac)
    {
        this.WithAc = ac;
        System.out.println("fortuner AC is assembled");
        return this;
    }
    @Override
    public carBuilder WithGare(Gare gare)
    {
        this.WithGare = gare;
        System.out.println("fortuner Gare is assembled");
        return this;
    }
    @Override
    public carBuilder withBodyShell(BodyShell bodyShell)
    {
        this.withBodyShell = bodyShell;
        System.out.println("fortuner BodyShell is assembled");
        return this;
    }
    @Override
    public Icar Build()
    {
        return new Scorpio(this);
    }  
}
