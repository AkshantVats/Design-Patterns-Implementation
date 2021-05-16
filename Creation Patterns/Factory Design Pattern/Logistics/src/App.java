import Factory.LogisticsFactory;
import Factory.RoadTransport;
import Factory.SeaTransport;
import Transport.ITransport;
import Transport.Truck;

public class App {
    public static void main(String[] args) throws Exception {
        LogisticsFactory lg = new RoadTransport();
        lg.planDelivery();
    }
    
}
