package Transport;

public class Ship implements ITransport {

    @Override
    public void deliver() {
        // TODO Auto-generated method stub
        try {
            System.out.println("Ship Delivered!");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
