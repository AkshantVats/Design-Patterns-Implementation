package Factory;

import Transport.ITransport;

public abstract class LogisticsFactory {
    
    public void planDelivery()
    {
        ITransport t = createTransport();
        t.deliver();        
    }

    protected abstract ITransport createTransport();
    
}
