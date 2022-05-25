package net.thunder;

import net.fabricmc.api.ModInitializer;

public class ThunderInitializer implements ModInitializer {
    public static String name = "ThunderClient", version = "1";

    @Override
    public void onInitialize() {
        System.out.println("Starting " + name + " " + version);
    }
}
