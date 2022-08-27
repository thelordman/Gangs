package io.github.thelordman.gangs.data;

import io.github.thelordman.gangs.gangs.Gang;
import org.bukkit.OfflinePlayer;

import java.util.HashMap;

public class Data {
    // HashMap with all the gangs
    public static final HashMap<Integer, Gang> gangs = new HashMap<>();

    public static Gang getGang(int ID) {
        return gangs.get(ID);
    }
    public static Gang getGang(OfflinePlayer player) {
        for (int i = 0; i < getGangAmount(); i++) {
            if (gangs.get(i).getMembers().containsKey(player.getUniqueId())) return gangs.get(i);
        }
        return null;
    }

    // Global data
    private static GlobalData globalData = new GlobalData();

    public static int getGangAmount() {
        return globalData.gangAmount;
    }
    public static void incrementGangAmount() {
        globalData.gangAmount++;
    }
}