package de.soulsmp.serverhelper

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ServerHelper : ModInitializer {
    override fun onInitialize() {
        LOGGER.info("ServerHelper initialized!")
        LOGGER.info("Note that this is a helper mod and will not be used outside of this testing environment.")
        LOGGER.info("Its sole purpose is to bring all the mods together as it automatically depends on all of them.")
    }

    companion object {
        val LOGGER: Logger = LoggerFactory.getLogger("ServerHelper")
    }
}
