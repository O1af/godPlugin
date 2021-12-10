package io.github.o1af.firstplugin.firstplugin;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class FirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("the plugin has started");
        Objects.requireNonNull(this.getCommand("help")).setExecutor(new CommandGod());
        getServer().getPluginManager().registerEvents(new HelpSwim(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("The plugin has ended");
    }
}
