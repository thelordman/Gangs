package io.github.thelordman.gangs.utilities;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandUtil {
    public static boolean hasPermission(CommandSender sender, String permission) {
        if (sender instanceof Player player) return player.hasPermission(permission);
        return true;
    }
}