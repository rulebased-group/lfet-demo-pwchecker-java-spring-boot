package lfet.demo.pwchecker.java.spring.boot.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
class DecisionTableLoggingFacadeSlf4 implements DecisionTableLoggingFacade {

    @Override
    public void traceAfterRule(String dtName, String version, int rules, int rule, DecisionTableTraceableModel model) {
        String additionalLoggingContent = model.traceAfterRule();
        if (additionalLoggingContent != null && !additionalLoggingContent.isBlank()) {
            log.trace("{}[{}] - {}/{} - {}", dtName, version, rule, rules, additionalLoggingContent);
        } else {
            log.trace("{}[{}] - {}/{}", dtName, version, rule, rules);
        }
    }

    @Override
    public void traceBeforeRule(String dtName, String version, int rules, int rule, DecisionTableTraceableModel model) {
        String additionalLoggingContent = model.traceBeforeRule();
        if (additionalLoggingContent != null && !additionalLoggingContent.isBlank()) {
            log.trace("{}[{}] - {}/{} - {}", dtName, version, rule, rules, additionalLoggingContent);
        } else {
            log.trace("{}[{}] - {}/{}", dtName, version, rule, rules);
        }
    }
}
