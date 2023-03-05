package lfet.demo.pwchecker.java.spring.boot.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lfet.demo.pwchecker.java.spring.boot.common.IDecisionTableModelTraceable;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
class PasswordValidator implements ConstraintValidator<StrongPassword, String>, PwChecker_iFace<PasswordValidator.Model> {

    final PwChecker_rulesEngine rulesEngine;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        Model model = new Model(value);
        rulesEngine.execute(this, model);
        return model.checksNotOK.isEmpty();
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
