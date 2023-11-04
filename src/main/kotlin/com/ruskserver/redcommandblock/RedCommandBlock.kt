package com.ruskserver.redcommandblock

import org.bukkit.plugin.java.JavaPlugin

class RedCommandBlock : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("RedCommandBlock by RuskLabo")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("RedCommandblock shutdown")
    }
}
