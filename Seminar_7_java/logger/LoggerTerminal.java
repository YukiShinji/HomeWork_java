package Seminar_7_java.logger;

import java.time.LocalDateTime;

public class LoggerTerminal implements LoggerAble {

    @Override
    public void logg(String msg) {
        System.out.println(LocalDateTime.now() + msg);
    }

}
