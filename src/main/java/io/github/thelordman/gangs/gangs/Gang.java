package io.github.thelordman.gangs.gangs;

import io.github.thelordman.gangs.data.Data;
import io.github.thelordman.gangs.utilities.DateUtil;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Gang implements Serializable {
    @Serial
    private static final long serialVersionUID = 2691134797141863802L;

    private final int ID;
    private final int creation;
    private final UUID founder;

    private final HashMap<UUID, Map.Entry<Integer, Rank>> members = new HashMap<>();

    private String name;

    public Gang(UUID founder, String name) {
        Data.incrementGangAmount();
        ID = Data.getGangAmount();
        creation = DateUtil.now();
        this.founder = founder;

        members.put(founder, Map.entry(DateUtil.now(), Rank.OWNER));

        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public int getCreation() {
        return creation;
    }

    public UUID getFounder() {
        return founder;
    }

    public HashMap<UUID, Map.Entry<Integer, Rank>> getMembers() {
        return members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}