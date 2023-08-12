package com.ruskserver.quark_tool

import org.bukkit.plugin.java.JavaPlugin

class Quark_tool : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("RedCommandBlock by RuskLabo")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("RedCommandblock shutdown")
    }
}
