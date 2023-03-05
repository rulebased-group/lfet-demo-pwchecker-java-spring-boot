package lfet.demo.pwchecker.java.spring.boot.common;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
class DecisionTableLoggingFacadeSlf4 implements DecisionTableLoggingFacade {

    @Override
    public void traceAfterRule(String dtName, String version, int rules, int rule, IDecisionTableModelTraceable model) {
        String additionalLoggingContent = model.traceAfterRule();
        if (additionalLoggingContent != null && !additionalLoggingContent.isBlank()) {
            LoggerFactory.getLogger("decision.table." + dtName).trace("{}[{}] - {}/{} - {}", dtName, version, rule, rules, additionalLoggingContent);
        } else {
            LoggerFactory.getLogger("decision.table." + dtName).trace("{}[{}] - {}/{}", dtName, version, rule, rules);
        }
    }

    @Override
    public void traceBeforeRule(String dtName, String version, int rules, int rule, IDecisionTableModelTraceable model) {
        String additionalLoggingContent = model.traceBeforeRule();
        if (additionalLoggingContent != null && !additionalLoggingContent.isBlank()) {
            LoggerFactory.getLogger("decision.table." + dtName).trace("{}[{}] - {}/{} - {}", dtName, version, rule, rules, additionalLoggingContent);
        } else {
            LoggerFactory.getLogger("decision.table." + dtName).trace("{}[{}] - {}/{}", dtName, version, rule, rules);
        }
    }
}
