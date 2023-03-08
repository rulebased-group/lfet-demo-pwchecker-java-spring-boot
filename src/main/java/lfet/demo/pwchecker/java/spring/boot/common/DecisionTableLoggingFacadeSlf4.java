package lfet.demo.pwchecker.java.spring.boot.common;

import org.springframework.stereotype.Component;

@Component
class DecisionTableLoggingFacadeSlf4 implements DecisionTableLoggingFacade {

    @Override
    public void traceAfterRule(String dtName, String version, int rules, int rule, DecisionTableTraceableModel model) {
        String additionalLoggingContent = model.traceAfterRule();
        if (additionalLoggingContent != null && !additionalLoggingContent.isBlank()) {
            org.slf4j.LoggerFactory.getLogger("decision.table." + dtName).trace("{}[{}] - {}/{} - {}", dtName, version, rule, rules, additionalLoggingContent);
        } else {
            org.slf4j.LoggerFactory.getLogger("decision.table." + dtName).trace("{}[{}] - {}/{}", dtName, version, rule, rules);
        }
    }

    @Override
    public void traceBeforeRule(String dtName, String version, int rules, int rule, DecisionTableTraceableModel model) {
        String additionalLoggingContent = model.traceBeforeRule();
        if (additionalLoggingContent != null && !additionalLoggingContent.isBlank()) {
            org.slf4j.LoggerFactory.getLogger("decision.table." + dtName).trace("{}[{}] - {}/{} - {}", dtName, version, rule, rules, additionalLoggingContent);
        } else {
            org.slf4j.LoggerFactory.getLogger("decision.table." + dtName).trace("{}[{}] - {}/{}", dtName, version, rule, rules);
        }
    }
}
