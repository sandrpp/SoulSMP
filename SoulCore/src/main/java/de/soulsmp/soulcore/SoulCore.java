package de.soulsmp.soulcore;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoulCore implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("soulcore");

    @Override
    public void onInitialize() {
        LOGGER.info("SoulCore initialized!");
    }
}
