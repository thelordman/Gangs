package io.github.thelordman.gangs.utilities;

import io.github.thelordman.gangs.data.Data;

import java.util.ArrayList;
import java.util.List;

public class GangUtil {
    public static List<String> gangNames() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < Data.getGangAmount(); i++) {
            list.add(Data.getGang(i).getName());
        }
        return list;
    }
}
