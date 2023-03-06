package blake_jh.vboost;

import blake_jh.vboost.commands.Boost;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Vboost extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("boost").setExecutor(new Boost());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
