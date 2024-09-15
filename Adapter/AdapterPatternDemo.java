public class AdapterPatternDemo {
    public static void main(String[] args) {
        LegacyPort legacyPort = new LegacyPort();
        USB usbAdapter = new LegacyPortAdapter(legacyPort);

        // Client code interacts with USB interface
        usbAdapter.connect();
    }
}
