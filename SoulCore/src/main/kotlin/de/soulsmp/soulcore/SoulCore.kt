package de.soulsmp.soulcore

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class SoulCore : ModInitializer {
    override fun onInitialize() {
        LOGGER.info("SoulCore initialized!")
    }

    companion object {
        val LOGGER: Logger = LoggerFactory.getLogger("SoulCore")
    }
}
