public class proxyService implements service{
    private RealService service;

    public proxyService(RealService service)
    {
        this.service = service;
    }
    @Override
    public void processRequest() {
        System.out.println("trying to process the request through proxy");
        service.processRequest();
        System.out.println("completing the process");
        
    }
}
