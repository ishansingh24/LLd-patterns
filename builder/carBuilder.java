public interface carBuilder {
    public carBuilder withTyre(Tyre withTyre);
    public carBuilder withEngine(engine withEngine);
    public carBuilder withAirSusupension(AirSusupension airSusupension);
    public carBuilder WithAc(Ac ac);
    public carBuilder WithGare(Gare gare);
    public carBuilder withBodyShell(BodyShell bodyShell);
    public Icar Build();
}
