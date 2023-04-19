package lfet.demo.pwchecker.java.spring.boot.common;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
class DecisionTableLoggingFacadeSlf4Facade implements DecisionTableLoggingFacade<IDecisionTableModelTraceable> {

    @Override
    public void traceBeforeRule(String decisionTable, String version, int currentRule, int maxRules, IDecisionTableModelTraceable model) {
        LoggerFactory.getLogger("decision.table." + decisionTable).trace("{}[{}] - {} / {} - {}", decisionTable, version, currentRule, maxRules, model.traceBeforeRule());
    }

    @Override
    public void traceAfterRule(String decisionTable, String version, int currentRule, int maxRules, IDecisionTableModelTraceable model) {
        LoggerFactory.getLogger("decision.table." + decisionTable).trace("{}[{}] - {} / {} - {}", decisionTable, version, currentRule, maxRules, model.traceAfterRule());
    }
}
