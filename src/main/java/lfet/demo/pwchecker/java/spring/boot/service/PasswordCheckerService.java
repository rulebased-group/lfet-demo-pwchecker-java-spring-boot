package lfet.demo.pwchecker.java.spring.boot.service;

import lfet.demo.pwchecker.java.spring.boot.common.IDecisionTableModelTraceable;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
class PasswordCheckerService implements PasswordCheckerUseCase, PwChecker_iFace<PasswordCheckerService.Model> {

    final PwChecker_rulesEngine rulesEngine;

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
        return arg0.isInSymbolInterval(model.getMatchingCharactersInPassword(arg0.getCAText()).length());
    }

    @Override
    public boolean _is(AnzahlVerschiedeneZiffern arg0, Model model) {
        return arg0.isInSymbolInterval(model.getMatchingCharactersInPassword(arg0.getCAText()).length());
    }
    @Override
    public boolean _is(AnzahlVerschiedeneGrossbuchstaben arg0, Model model) {
        return arg0.isInSymbolInterval(model.getMatchingCharactersInPassword(arg0.getCAText()).length());
    }

    @Override
    public boolean _is(AnzahlVerschiedeneSonderzeichen arg0, Model model) {
        return arg0.isInSymbolInterval(model.getMatchingCharactersInPassword(arg0.getCAText()).length());
    }

    @Override
    public void _do(AnforderungNichtErfuellt arg0, Model model) {
        model.checksNotOK.add(arg0.name());
    }

    @ToString
    static class Model implements IDecisionTableModelTraceable {
        final List<String> checksNotOK = new ArrayList<>();
        final String password;

        Model(String password) {
            this.password = password != null ? password : "";
        }

        @Override
        public String traceBeforeRule() {
            return toString();
        }

        @Override
        public String traceAfterRule() {
            return toString();
        }

        private String getMatchingCharactersInPassword(String expectedCharacters) {
            StringBuilder result = new StringBuilder();

            this.password.chars().distinct().mapToObj(c -> (char) c).forEach(c -> {
                if (expectedCharacters.indexOf(c) >= 0) result.append(c);
            });

            return result.toString();
        }
    }
}
