package remotes;

import UsableDevices.UsableDevice;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(UsableDevice device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}