// Adapter Class
class LegacyPortAdapter implements USB {
    private LegacyPort legacyPort;

    public LegacyPortAdapter(LegacyPort legacyPort) {
        this.legacyPort = legacyPort;
    }

    @Override
    public void connect() {
        legacyPort.connectWithLegacyPort();
    }
}
