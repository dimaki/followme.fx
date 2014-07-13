package com.airhacks.followme;

import javafx.application.Application;
import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.foundation.NSDictionary;
import org.robovm.apple.uikit.UIApplication;
import org.robovm.apple.uikit.UIApplicationDelegateAdapter;

public class RoboVMJFXLauncher extends UIApplicationDelegateAdapter {

    @Override
    public boolean didFinishLaunching(UIApplication application, NSDictionary launchOptions) {

        Thread launchThread = new Thread() {
            @Override
            public void run() {
                Application.launch(App.class);
            }
        };
        launchThread.setDaemon(true);
        launchThread.start();

        return true;
    }

    public static void main(String[] args) throws Exception {
        System.setProperty("glass.platform", "ios");
        System.setProperty("prism.text", "native");

        NSAutoreleasePool pool = new NSAutoreleasePool();
        UIApplication.main(args, null, RoboVMJFXLauncher.class);
        pool.drain();
    }
}
