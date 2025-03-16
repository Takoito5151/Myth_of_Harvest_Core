package com.takoito.myth_of_harvest_core;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class Config {

    public static boolean isMH;
    public static String greeting = "Hello World";

    public static void synchronizeConfiguration(File configFile) {
        Configuration configuration = new Configuration(configFile);

        isMH = configuration.getBoolean("ismyth_of_harvest","modpack",false,"is myth of harvest pack?");
        greeting = configuration.getString("greeting", Configuration.CATEGORY_GENERAL, greeting, "How shall I greet?");

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}
