package com.ulbora.device;
import android.webkit.JavascriptInterface;

/**
 * Created by ken Williamson on 5/29/16.
 */
public class Device {

    @JavascriptInterface
    public String getModel() {
        String model = android.os.Build.MODEL;
        return model;
    }

    @JavascriptInterface
    public String getProductName() {
        String productname = android.os.Build.PRODUCT;
        return productname;
    }

    @JavascriptInterface
    public String getManufacturer() {
        String manufacturer = android.os.Build.MANUFACTURER;
        return manufacturer;
    }

    @JavascriptInterface
    public String getSerialNumber() {
        String serial = android.os.Build.SERIAL;
        return serial;
    }

    @JavascriptInterface
    public String getOSVersion() {
        String osversion = android.os.Build.VERSION.RELEASE;
        return osversion;
    }


    @JavascriptInterface
    public String getPlatform() {
        String platform = "Android";
        return platform;
    }
}
