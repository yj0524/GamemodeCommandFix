package com.yj0524;

import com.yj0524.commands.Gm;
import com.yj0524.tabcom.GmTabCom;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Plugin Enabled");

        getCommand("gm").setExecutor(new Gm());
        getCommand("gm").setTabCompleter(new GmTabCom());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin Disabled");
    }
}
