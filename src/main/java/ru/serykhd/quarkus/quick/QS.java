package ru.serykhd.quarkus.quick;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class QS {

    public static void main(String[] args) {
        Quarkus.run(QSApp.class, args);
    }
}
