// *** WARNING: DO NOT MODIFY *** This is a generated Java source code!
//
// Generated by LF-ET 2.2.1 (230211b), https://www.lohrfink.de/lfet
// From decision table
// "/opt/data/github/rulebased-group/lfet-demo-pwchecker-java-spring-boot/src/main/resources/lfet/pwchecker/PwChecker.lfet"
// 03.03.2023 09:02
//

// Prolog Standard ---->
// profile LFET.Java.Prolog.Standard.Interface.Dt.ini not found
// used LF-ET 2.2.1 (230211b) build in default

package lfet.demo.pwchecker.java.spring.boot.service;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated("LF-ET")
@Component
public class PwChecker_rulesEngine
{
    public <T> void execute(PwChecker_iFace<T> iFace, T model)
    {

        // Prolog Standard <----

        int ruleGroup = 1;
        boolean exit = false;

        while ( !exit )
        {
            exit = true;

            if ( ruleGroup == 1 ) // Prüfschritt? 1 - Prüfen: Die Passwortlänge
            {
                if ( iFace._is(PwChecker_iFace.AnzahlZeichen.$LESS8 /* < 8 */ , model) )
                {
                    // Rule R01 ---->

                    iFace._doTrace("PwChecker", "20230303.090207", 7, 1, model);

                    iFace._do(PwChecker_iFace.AnforderungNichtErfuellt.$LENLESS8 /* Len<8 */ , model);

                    ruleGroup = 2;
                    exit = false;

                    // Rule R01 <----
                }
                else if ( iFace._is(PwChecker_iFace.AnzahlZeichen.$820 /* 8 - 20 */ , model) )
                {
                    // Rule R02 ---->

                    iFace._doTrace("PwChecker", "20230303.090207", 7, 2, model);

                    ruleGroup = 2;
                    exit = false;

                    // Rule R02 <----
                }
                else // Anzahl Zeichen? > 20 - mehr als 20 Zeichen
                {
                    // Rule R03 ---->

                    iFace._doTrace("PwChecker", "20230303.090207", 7, 3, model);

                    iFace._do(PwChecker_iFace.AnforderungNichtErfuellt.$LENGREATER20 /* Len>20 */ , model);

                    ruleGroup = 2;
                    exit = false;

                    // Rule R03 <----
                }
            }
            else if ( ruleGroup == 2 ) // Prüfschritt? 2 - Prüfen: Die Anzahl verschiedener Kleinbuchstaben im Passwort
            {
                if ( iFace._is(PwChecker_iFace.AnzahlVerschiedeneKleinbuchstaben.$LESS2 /* < 2 */ , model) )
                {
                    // Rule R04 ---->

                    iFace._doTrace("PwChecker", "20230303.090207", 7, 4, model);

                    iFace._do(PwChecker_iFace.AnforderungNichtErfuellt.$KB2, model);

                    ruleGroup = 3;
                    exit = false;

                    // Rule R04 <----
                }
                else // Anzahl verschiedene Kleinbuchstaben? >= 2 - 2 oder mehr
                {
                    // Rule R05 ---->

                    iFace._doTrace("PwChecker", "20230303.090207", 7, 5, model);

                    ruleGroup = 3;
                    exit = false;

                    // Rule R05 <----
                }
            }
            else // Prüfschritt? 3 - Prüfen: Die Anzahl verschiedener Grossbuchstaben im Passwort
            {
                if ( iFace._is(PwChecker_iFace.AnzahlVerschiedeneGrossbuchstaben.$LESS2 /* < 2 */ , model) )
                {
                    // Rule R06 ---->

                    iFace._doTrace("PwChecker", "20230303.090207", 7, 6, model);

                    iFace._do(PwChecker_iFace.AnforderungNichtErfuellt.$GB2, model);

                    exit = true;

                    // Rule R06 <----
                }
                else // Anzahl verschiedene Grossbuchstaben? >= 2 - 2 oder mehr
                {
                    // Rule R07 ---->

                    iFace._doTrace("PwChecker", "20230303.090207", 7, 7, model);

                    exit = true;

                    // Rule R07 <----
                }
            }

        }

        // Epilog Standard ---->
        // profile LFET.Java.Epilog.Standard.Interface.Dt.ini not found
        // used LF-ET 2.2.1 (230211b) build in default

    }

}

// Epilog Standard <----

// End of generated Java source code
// Generated by LF-ET 2.2.1 (230211b), https://www.lohrfink.de/lfet
