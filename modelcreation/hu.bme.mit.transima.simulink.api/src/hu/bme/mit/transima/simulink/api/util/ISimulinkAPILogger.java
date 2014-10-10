package hu.bme.mit.transima.simulink.api.util;

public interface ISimulinkAPILogger {

    void error(String message);

    void error(String message, Throwable cause);

    void warning(String message);

    void debug(String message);

    boolean isDebugging();
}
