package com.ruskserver.redcommandblock

import org.bukkit.plugin.java.JavaPlugin

class RedCommandBlock : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("&c[RedCommandBlock]&7 by RuskLabo")
        saveDefaultConfig()
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("&c[RedCommandBlock]&7 shutdown")
        saveDefaultConfig()
    }
}
