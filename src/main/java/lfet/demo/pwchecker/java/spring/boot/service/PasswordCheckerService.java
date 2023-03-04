package lfet.demo.pwchecker.java.spring.boot.service;

import lfet.demo.pwchecker.java.spring.boot.common.DecisionTableLoggingFacade;
import lfet.demo.pwchecker.java.spring.boot.common.DecisionTableTraceableModel;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
class PasswordCheckerService implements PasswordCheckerUseCase, PwChecker_iFace<PasswordCheckerService.Model> {

    final PwChecker_rulesEngine rulesEngine;

    final DecisionTableLoggingFacade decisionTableLoggingFacade;

    @Override
    public List<String> check(String password) {
        Model model = new Model(password);
        rulesEngine.execute(this, model);
        return model.checksNotOK;
    }

    @Override
    public boolean _is(AnzahlZeichen arg0, Model model) {
        return arg0.isInSymbolInterval(model.password.length());
    }

    @Override
    public boolean _is(AnzahlVerschiedeneKleinbuchstaben arg0, Model model) {
        return arg0.isInSymbolInterval(model.onlyLowerLetter.chars().distinct().count());
    }

    @Override
    public boolean _is(AnzahlVerschiedeneGrossbuchstaben arg0, Model model) {
        return arg0.isInSymbolInterval(model.onlyUpperLetter.chars().distinct().count());
    }

    @Override
    public void _do(AnforderungNichtErfuellt arg0, Model model) {
        model.checksNotOK.add(arg0.name());
    }

    @Override
    public void _doTrace(String dtName, String version, int rules, int rule, Model model) {
        decisionTableLoggingFacade.traceBeforeRule(dtName, version, rules, rule, model);
    }

    @ToString
    static class Model implements DecisionTableTraceableModel {
        final List<String> checksNotOK = new ArrayList<>();
        final String password;
        final String onlyUpperLetter;
        final String onlyLowerLetter;

        Model(String password) {
            this.password = password;
            this.onlyLowerLetter = password.replaceAll("[A-Z]*", "");
            this.onlyUpperLetter = password.replaceAll("[a-z]*", "");
        }

        @Override
        public String traceBeforeRule() {
            return toString();
        }

        @Override
        public String traceAfterRule() {
            return toString();
        }
    }
}
