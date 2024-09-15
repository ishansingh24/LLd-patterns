public class client {
    public static void main(String[] args) {
        RealService service = new RealService();
        proxyService sProxyService = new proxyService(service);
        sProxyService.processRequest();
    }
    
}
