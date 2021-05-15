package Factory;

import Transport.ITransport;
import Transport.Ship;

public class SeaTransport extends LogisticsFactory {

    @Override
    public ITransport createTransport() {
        // TODO Auto-generated method stub
        return new Ship();
    }
    
}
