package Factory;

import Transport.ITransport;
import Transport.Truck;

public class RoadTransport extends LogisticsFactory {


    @Override
    public ITransport createTransport() {
        // TODO Auto-generated method stub
        return new Truck();
    }
    
}
