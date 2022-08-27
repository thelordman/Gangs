package io.github.thelordman.gangs.utilities;

public class Util {
    public static boolean contains(String[] array, String string) {
        for (String str : array) {
            if (str.equals(string)) return true;
        }
        return false;
    }
}