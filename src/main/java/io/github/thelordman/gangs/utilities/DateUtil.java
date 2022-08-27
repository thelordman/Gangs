package io.github.thelordman.gangs.utilities;

import java.time.Instant;

public class DateUtil {
    public static int now() {
        return (int) Instant.now().getEpochSecond();
    }
}