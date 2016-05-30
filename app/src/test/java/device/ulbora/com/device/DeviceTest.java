package device.ulbora.com.device;

import com.ulbora.device.Device;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


/**
 * Created by ken on 5/29/16.
 */
public class DeviceTest {
    private Device dev = new Device();
    @Test
    public void getModel_test() {
        String model = dev.getModel();
        System.out.println("device " + model);
        assertNotEquals(model, "");
    }
    @Test
    public void getPlatform_test() {
        String platform = dev.getPlatform();
        System.out.println("platform " + platform);
        assertEquals(platform, "Android");
    }
}
