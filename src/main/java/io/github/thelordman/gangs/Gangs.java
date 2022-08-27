package io.github.thelordman.gangs;

import io.github.thelordman.gangs.commands.GangCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Gangs extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("gang").setExecutor(new GangCommand());
    }
}