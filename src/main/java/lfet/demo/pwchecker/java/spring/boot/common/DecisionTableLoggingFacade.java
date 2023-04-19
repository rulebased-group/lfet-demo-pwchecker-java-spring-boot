package lfet.demo.pwchecker.java.spring.boot.common;

public interface DecisionTableLoggingFacade<T extends IDecisionTableModelTraceable> {

    void traceBeforeRule(String decisionTable, String version, int currentRule, int maxRules, T model);

    void traceAfterRule(String decisionTable, String version, int currentRule, int maxRules, T model);
}
