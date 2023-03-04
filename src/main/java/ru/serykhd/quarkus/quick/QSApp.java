package ru.serykhd.quarkus.quick;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import ru.serykhd.common.string.RomanUtil2;
import ru.serykhd.common.time.util.NanoTimer;

import java.net.InetAddress;
import java.util.Set;

public class QSApp implements QuarkusApplication {

    @Override
    public int run(String... args) throws Exception {
        NanoTimer nanoTimer = new NanoTimer();

        for (int i = 0; i < 100_000; i++) {
            RomanUtil2.intToRoman(14151);
        }


        nanoTimer.print();
        return 0;
    }
}
