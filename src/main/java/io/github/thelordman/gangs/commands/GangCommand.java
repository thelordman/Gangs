package io.github.thelordman.gangs.commands;

import io.github.thelordman.gangs.utilities.GangUtil;
import io.github.thelordman.gangs.utilities.Util;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.util.StringUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GangCommand implements TabExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        return switch (args.length) {
            case 1 -> StringUtil.copyPartialMatches(args[0], List.of("info", "top", "join", "leave", "invite", "chat"), new ArrayList<>());
            case 2 -> switch (args[0]) {
                case "info", "join" -> StringUtil.copyPartialMatches(args[0], GangUtil.gangNames(), new ArrayList<>());
                case "top" -> StringUtil.copyPartialMatches(args[0], List.of("kills", "deaths", "blocks", "playtime", "members"), new ArrayList<>());
                case "invite" -> null;
                default -> Collections.emptyList();
            };
            case 3 -> args[0].equals("top") && Util.contains(new String[]{"kills", "deaths", "blocks", "playtime", "members"}, args[1]) ?
                    StringUtil.copyPartialMatches(args[2], List.of("global", "gang"), new ArrayList<>()) : Collections.emptyList();
            default -> Collections.emptyList();
        };
    }
}