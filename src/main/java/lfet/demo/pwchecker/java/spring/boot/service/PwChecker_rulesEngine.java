// *** WARNING: DO NOT MODIFY *** This is a generated Java source code!
//
// Generated by LF-ET 2.3.0 (240312a), https://www.lohrfink.de/lfet
// From decision table
// "D:/LF/Projekte/lfet-demo-pwchecker-java-spring-boot/src/main/resources/lfet/pwchecker/PwChecker.lfet"
// 13.03.2024 09:55
//

// Prolog Standard ---->
// profile LFET.Java.Prolog.Standard.Interface.Dt.ini not found
// used LF-ET 2.3.0 (240312a) build in default

package lfet.demo.pwchecker.java.spring.boot.service;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;

@Generated("LF-ET")
@Component
@RequiredArgsConstructor
class PwChecker_rulesEngine
{
    final lfet.demo.pwchecker.java.spring.boot.common.DecisionTableLoggingFacade decisionTableLoggingFacade;

    <T extends lfet.demo.pwchecker.java.spring.boot.common.IDecisionTableModelTraceable> void execute(PwChecker_iFace<T> iFace, T model)
    {

        // Prolog Standard <----

        if ( iFace._is(PwChecker_iFace.AnzahlZeichen.$LESSEQUAL7, model) /* <= 7 - weniger oder gleich 7 Zeichen */ )
        {
            // Rule R01 ---->

            // logging beforeRule
            // PwChecker - Moin Hamburg
            decisionTableLoggingFacade.traceBeforeRule("PwChecker","20240313.095514",1,7,model);

            iFace._do(PwChecker_iFace.AnforderungNichtErfuellt.$LENLESS8, model); // Len<8 - Das Passwort ist zu kurz, es muss 8 bis 20 Zeichen lang sein

            decisionTableLoggingFacade.traceAfterRule("PwChecker","20240313.095514",1,7,model);

            // Rule R01 <----
        }
        else if ( iFace._is(PwChecker_iFace.AnzahlZeichen.$820, model) /* 8 - 20 - 8 bis 20 Zeichen */ )
        {
            if ( iFace._is(PwChecker_iFace.AnzahlVerschiedeneKleinbuchstaben.$LESS2, model) /* < 2 - weniger als 2 */ )
            {
                // Rule R02 ---->

                // logging beforeRule
                // PwChecker - Moin Hamburg
                decisionTableLoggingFacade.traceBeforeRule("PwChecker","20240313.095514",2,7,model);

                iFace._do(PwChecker_iFace.AnforderungNichtErfuellt.$KB2, model); // KB2 - Das Passwort muss mindestens 2 verschiedene Kleinbuchstaben enthalten

                decisionTableLoggingFacade.traceAfterRule("PwChecker","20240313.095514",2,7,model);

                // Rule R02 <----
            }
            else // Anzahl verschiedene Kleinbuchstaben? >= 2 - 2 oder mehr
            {
                if ( iFace._is(PwChecker_iFace.AnzahlVerschiedeneGrossbuchstaben.$LESS2, model) /* < 2 - weniger als 2 */ )
                {
                    // Rule R03 ---->

                    // logging beforeRule
                    // PwChecker - Moin Hamburg
                    decisionTableLoggingFacade.traceBeforeRule("PwChecker","20240313.095514",3,7,model);

                    iFace._do(PwChecker_iFace.AnforderungNichtErfuellt.$GB2, model); // GB2 - Das Passwort muss mindestens 2 verschiedene Grossbuchstaben enthalten

                    decisionTableLoggingFacade.traceAfterRule("PwChecker","20240313.095514",3,7,model);

                    // Rule R03 <----
                }
                else // Anzahl verschiedene Grossbuchstaben? >= 2 - 2 oder mehr
                {
                    if ( iFace._is(PwChecker_iFace.AnzahlVerschiedeneZiffern.$LESS2, model) /* < 2 - weniger als 2 */ )
                    {
                        if ( iFace._is(PwChecker_iFace.AnzahlVerschiedeneSonderzeichen.$LESS2, model) /* < 2 - weniger als 2 */ )
                        {
                            // Rule R04 ---->

                            // logging beforeRule
                            // PwChecker - Moin Hamburg
                            decisionTableLoggingFacade.traceBeforeRule("PwChecker","20240313.095514",4,7,model);

                            iFace._do(PwChecker_iFace.AnforderungNichtErfuellt.$SZ2, model); // SZ2 - Das Passwort muss mindestens 2 verschiedene Ziffern oder Sonderzeichen enthalten

                            decisionTableLoggingFacade.traceAfterRule("PwChecker","20240313.095514",4,7,model);

                            // Rule R04 <----
                        }
                        else // Anzahl verschiedene Sonderzeichen? >= 2 - 2 oder mehr
                        {
                            // Rule R05 ---->

                            // logging beforeRule
                            // PwChecker - Moin Hamburg
                            decisionTableLoggingFacade.traceBeforeRule("PwChecker","20240313.095514",5,7,model);

                            iFace._do(PwChecker_iFace.PasswortOK.$OK, model); // ok - alle Anforderungen sind erfüllt

                            decisionTableLoggingFacade.traceAfterRule("PwChecker","20240313.095514",5,7,model);

                            // Rule R05 <----
                        }
                    }
                    else // Anzahl verschiedene Ziffern? >= 2 - 2 oder mehr
                    {
                        // Rule R06 ---->

                        // logging beforeRule
                        // PwChecker - Moin Hamburg
                        decisionTableLoggingFacade.traceBeforeRule("PwChecker","20240313.095514",6,7,model);

                        iFace._do(PwChecker_iFace.PasswortOK.$OK, model); // ok - alle Anforderungen sind erfüllt

                        decisionTableLoggingFacade.traceAfterRule("PwChecker","20240313.095514",6,7,model);

                        // Rule R06 <----
                    }
                }
            }
        }
        else // Anzahl Zeichen? > 20 - mehr als 20 Zeichen
        {
            // Rule R07 ---->

            // logging beforeRule
            // PwChecker - Moin Hamburg
            decisionTableLoggingFacade.traceBeforeRule("PwChecker","20240313.095514",7,7,model);

            iFace._do(PwChecker_iFace.AnforderungNichtErfuellt.$LENGREATER20, model); // Len>20 - Das Passwort ist zu lang, es muss 9 bis 20 Zeichen lang sein

            decisionTableLoggingFacade.traceAfterRule("PwChecker","20240313.095514",7,7,model);

            // Rule R07 <----
        }

        // Epilog Standard ---->
        // profile LFET.Java.Epilog.Standard.Interface.Dt.ini not found
        // used LF-ET 2.3.0 (240312a) build in default

    }

}

// Epilog Standard <----

// End of generated Java source code
// Generated by LF-ET 2.3.0 (240312a), https://www.lohrfink.de/lfet
