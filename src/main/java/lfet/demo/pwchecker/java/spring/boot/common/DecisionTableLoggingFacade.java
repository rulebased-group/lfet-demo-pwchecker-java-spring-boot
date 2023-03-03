package lfet.demo.pwchecker.java.spring.boot.common;

public interface DecisionTableLoggingFacade {

    void traceAfterRule(String dtName, String version, int rules, int rule, DecisionTableTraceableModel model);
    void traceAfterBefore(String dtName, String version, int rules, int rule, DecisionTableTraceableModel model);
}
