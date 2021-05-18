import UsableDevices.Radio;
import UsableDevices.Tv;
import UsableDevices.UsableDevice;
import remotes.AdvancedRemote;
import remotes.BasicRemote;

public class App {
    public static void main(String[] args) throws Exception {

        testDevice(new Tv());
        testDevice(new Radio());
        //System.out.println("Hello, World!");
    }

    public static void testDevice(UsableDevice device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
