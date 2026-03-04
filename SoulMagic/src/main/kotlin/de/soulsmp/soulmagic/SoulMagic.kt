package de.soulsmp.soulmagic

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class SoulMagic : ModInitializer {
    override fun onInitialize() {
        LOGGER.info("SoulMagic initialized!")
    }

    companion object {
        val LOGGER: Logger = LoggerFactory.getLogger("SoulMagic")
    }
}
