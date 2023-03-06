package blake_jh.vboost;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Vboost extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Hello World");
        // Remove once done coding.

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Shutting Down");
    }
}
