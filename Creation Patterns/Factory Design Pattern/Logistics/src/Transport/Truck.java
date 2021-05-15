package Transport;

public class Truck implements ITransport {

    @Override
    public void deliver() {
        // TODO Auto-generated method stub
        try {
            System.out.println("Truck Delivered!");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
