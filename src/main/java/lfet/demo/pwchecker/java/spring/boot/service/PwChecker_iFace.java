// *** WARNING: DO NOT MODIFY *** This is a generated Java source code!
//
// Generated by LF-ET 2.2.1 (230211b), https://www.lohrfink.de/lfet
// From decision table
// "/opt/data/github/rulebased-group/lfet-demo-pwchecker-java-spring-boot/src/main/resources/lfet/pwchecker/PwChecker.lfet"
// 03.03.2023 09:01
//
// Prolog Standard ---->
// profile LFET.Java.Prolog.Standard.Interface.ini not found
// used LF-ET 2.2.1 (230211b) build in default

package lfet.demo.pwchecker.java.spring.boot.service;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated("LF-ET")
@Component
interface PwChecker_iFace<T>
{

    // Prolog Standard <----

    /**
    * <b>B02: Anzahl Zeichen?</b><br>
    * <br>
    * <b>B02, Java Prolog:</b><br>
    * <br>
    * $$InterfaceEnum.0020<br>
    * <br>
    * The enum generation has been triggered in project.ini by:<br>
    * - <b>ide.Java.InterfaceEnum.0020</b>: includeTagsSource=$$InterfaceEnum.0020; Symbol=Interval<br>
    * - <b>ide.Java.InterfaceEnum.default</b>: MethodName=Prefix; EnumValueName=Symbol, UpperCase, Prefix$
    */
    boolean _is(PwChecker_iFace.AnzahlZeichen arg0, T model);

    /**
    * <b>B03: Anzahl verschiedene Kleinbuchstaben?</b><br>
    * <br>
    * abcdefghijklmnopqrstuvwxyz<br>
    * <br>
    * <b>B03, Java Prolog:</b><br>
    * <br>
    * $$InterfaceEnum.0022<br>
    * <br>
    * The enum generation has been triggered in project.ini by:<br>
    * - <b>ide.Java.InterfaceEnum.0022</b>: includeTagsSource=$$InterfaceEnum.0022; Symbol=Interval; CA=Text<br>
    * - <b>ide.Java.InterfaceEnum.default</b>: MethodName=Prefix; EnumValueName=Symbol, UpperCase, Prefix$
    */
    boolean _is(PwChecker_iFace.AnzahlVerschiedeneKleinbuchstaben arg0, T model);

    /**
    * <b>B04: Anzahl verschiedene Grossbuchstaben?</b><br>
    * <br>
    * ABCDEFGHIJKLMNOPQRSTUVWXYZ<br>
    * <br>
    * <b>B04, Java Prolog:</b><br>
    * <br>
    * $$InterfaceEnum.0022<br>
    * <br>
    * The enum generation has been triggered in project.ini by:<br>
    * - <b>ide.Java.InterfaceEnum.0022</b>: includeTagsSource=$$InterfaceEnum.0022; Symbol=Interval; CA=Text<br>
    * - <b>ide.Java.InterfaceEnum.default</b>: MethodName=Prefix; EnumValueName=Symbol, UpperCase, Prefix$
    */
    boolean _is(PwChecker_iFace.AnzahlVerschiedeneGrossbuchstaben arg0, T model);

    /**
    * <b>A01: Anforderung nicht erf??llt</b><br>
    * <br>
    * <b>A01/01, Java StmtSeq:</b><br>
    * <br>
    * $$InterfaceEnum.0030<br>
    * <br>
    * The enum generation has been triggered in project.ini by:<br>
    * - <b>ide.Java.InterfaceEnum.0030</b>: includeTagsSource=$$InterfaceEnum.0030; Title<br>
    * - <b>ide.Java.InterfaceEnum.default</b>: MethodName=Prefix; EnumValueName=Symbol, UpperCase, Prefix$
    */
    void _do(PwChecker_iFace.AnforderungNichtErfuellt arg0, T model);

    void _doTrace(java.lang.String dtName, java.lang.String version, int rules, int rule, T model);

    /**
    * <b>B02: Anzahl Zeichen?</b><br>
    * <br>
    * <b>B02, Java Prolog:</b><br>
    * <br>
    * $$InterfaceEnum.0020<br>
    * <br>
    * The enum generation has been triggered in project.ini by:<br>
    * - <b>ide.Java.InterfaceEnum.0020</b>: includeTagsSource=$$InterfaceEnum.0020; Symbol=Interval<br>
    * - <b>ide.Java.InterfaceEnum.default</b>: MethodName=Prefix; EnumValueName=Symbol, UpperCase, Prefix$
    */
    enum AnzahlZeichen
    {
        /**
        * <b>B02: Anzahl Zeichen?</b><br>
        * <br>
        * <b>B02/01: < 8 - weniger als 8 Zeichen</b><br>
        * <br>
        * <b>B02, Java Prolog:</b><br>
        * <br>
        * $$InterfaceEnum.0020
        */
        $LESS8("< 8", Double.NEGATIVE_INFINITY, 7.0),

        /**
        * <b>B02: Anzahl Zeichen?</b><br>
        * <br>
        * <b>B02/02: 8 - 20 - 8 bis 20 Zeichen</b><br>
        * <br>
        * <b>B02, Java Prolog:</b><br>
        * <br>
        * $$InterfaceEnum.0020
        */
        $820("8 - 20", 8.0, 20.0);

        private final String symbol;
        private final double symbolMin;
        private final double symbolMax;

        AnzahlZeichen(String symbol, double symbolMin, double symbolMax)
        {
            this.symbol = symbol;
            this.symbolMin = symbolMin;
            this.symbolMax = symbolMax;
        }

        public String getSymbol()
        {
            return symbol;
        }

        public double getSymbolMin()
        {
            return symbolMin;
        }

        public double getSymbolMax()
        {
            return symbolMax;
        }

        public boolean isInSymbolInterval(double d)
        {
            return d >= symbolMin && d <= symbolMax;
        }

        public boolean isInSymbolInterval(int i)
        {
            return i >= symbolMin && i <= symbolMax;
        }
    }

    final String c03Text = "abcdefghijklmnopqrstuvwxyz";

    /**
    * <b>B03: Anzahl verschiedene Kleinbuchstaben?</b><br>
    * <br>
    * abcdefghijklmnopqrstuvwxyz<br>
    * <br>
    * <b>B03, Java Prolog:</b><br>
    * <br>
    * $$InterfaceEnum.0022<br>
    * <br>
    * The enum generation has been triggered in project.ini by:<br>
    * - <b>ide.Java.InterfaceEnum.0022</b>: includeTagsSource=$$InterfaceEnum.0022; Symbol=Interval; CA=Text<br>
    * - <b>ide.Java.InterfaceEnum.default</b>: MethodName=Prefix; EnumValueName=Symbol, UpperCase, Prefix$
    */
    enum AnzahlVerschiedeneKleinbuchstaben
    {
        /**
        * <b>B03: Anzahl verschiedene Kleinbuchstaben?</b><br>
        * <br>
        * abcdefghijklmnopqrstuvwxyz<br>
        * <br>
        * <b>B03/01: < 2 - weniger als 2</b><br>
        * <br>
        * <b>B03, Java Prolog:</b><br>
        * <br>
        * $$InterfaceEnum.0022
        */
        $LESS2("< 2", Double.NEGATIVE_INFINITY, 1.0);

        private final String symbol;
        private final double symbolMin;
        private final double symbolMax;

        AnzahlVerschiedeneKleinbuchstaben(String symbol, double symbolMin, double symbolMax)
        {
            this.symbol = symbol;
            this.symbolMin = symbolMin;
            this.symbolMax = symbolMax;
        }

        public String getSymbol()
        {
            return symbol;
        }

        public double getSymbolMin()
        {
            return symbolMin;
        }

        public double getSymbolMax()
        {
            return symbolMax;
        }

        public boolean isInSymbolInterval(double d)
        {
            return d >= symbolMin && d <= symbolMax;
        }

        public boolean isInSymbolInterval(int i)
        {
            return i >= symbolMin && i <= symbolMax;
        }

        public String getCAText()
        {
            return c03Text;
        }
    }

    final String c04Text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
    * <b>B04: Anzahl verschiedene Grossbuchstaben?</b><br>
    * <br>
    * ABCDEFGHIJKLMNOPQRSTUVWXYZ<br>
    * <br>
    * <b>B04, Java Prolog:</b><br>
    * <br>
    * $$InterfaceEnum.0022<br>
    * <br>
    * The enum generation has been triggered in project.ini by:<br>
    * - <b>ide.Java.InterfaceEnum.0022</b>: includeTagsSource=$$InterfaceEnum.0022; Symbol=Interval; CA=Text<br>
    * - <b>ide.Java.InterfaceEnum.default</b>: MethodName=Prefix; EnumValueName=Symbol, UpperCase, Prefix$
    */
    enum AnzahlVerschiedeneGrossbuchstaben
    {
        /**
        * <b>B04: Anzahl verschiedene Grossbuchstaben?</b><br>
        * <br>
        * ABCDEFGHIJKLMNOPQRSTUVWXYZ<br>
        * <br>
        * <b>B04/01: < 2 - weniger als 2</b><br>
        * <br>
        * <b>B04, Java Prolog:</b><br>
        * <br>
        * $$InterfaceEnum.0022
        */
        $LESS2("< 2", Double.NEGATIVE_INFINITY, 1.0);

        private final String symbol;
        private final double symbolMin;
        private final double symbolMax;

        AnzahlVerschiedeneGrossbuchstaben(String symbol, double symbolMin, double symbolMax)
        {
            this.symbol = symbol;
            this.symbolMin = symbolMin;
            this.symbolMax = symbolMax;
        }

        public String getSymbol()
        {
            return symbol;
        }

        public double getSymbolMin()
        {
            return symbolMin;
        }

        public double getSymbolMax()
        {
            return symbolMax;
        }

        public boolean isInSymbolInterval(double d)
        {
            return d >= symbolMin && d <= symbolMax;
        }

        public boolean isInSymbolInterval(int i)
        {
            return i >= symbolMin && i <= symbolMax;
        }

        public String getCAText()
        {
            return c04Text;
        }
    }

    /**
    * <b>A01: Anforderung nicht erf??llt</b><br>
    * <br>
    * <b>A01/01, Java StmtSeq:</b><br>
    * <br>
    * $$InterfaceEnum.0030<br>
    * <br>
    * The enum generation has been triggered in project.ini by:<br>
    * - <b>ide.Java.InterfaceEnum.0030</b>: includeTagsSource=$$InterfaceEnum.0030; Title<br>
    * - <b>ide.Java.InterfaceEnum.default</b>: MethodName=Prefix; EnumValueName=Symbol, UpperCase, Prefix$
    */
    enum AnforderungNichtErfuellt
    {
        /**
        * <b>A01: Anforderung nicht erf??llt</b><br>
        * <br>
        * <b>A01/01: Len<8 - Das Passwort ist zu kurz, es muss 8 bis 20 Zeichen lang sein</b><br>
        * <br>
        * <b>A01/01, Java StmtSeq:</b><br>
        * <br>
        * $$InterfaceEnum.0030
        */
        $LENLESS8("Das Passwort ist zu kurz, es muss 8 bis 20 Zeichen lang sein"),

        /**
        * <b>A01: Anforderung nicht erf??llt</b><br>
        * <br>
        * <b>A01/02: Len8-20 - Das Passwort muss 8 bis 20 Zeichen lang sein</b>
        */
        $LEN820("Das Passwort muss 8 bis 20 Zeichen lang sein"),

        /**
        * <b>A01: Anforderung nicht erf??llt</b><br>
        * <br>
        * <b>A01/03: Len>20 - Das Passwort ist zu lang, es muss 8 bis 20 Zeichen lang sein</b>
        */
        $LENGREATER20("Das Passwort ist zu lang, es muss 8 bis 20 Zeichen lang sein"),

        /**
        * <b>A01: Anforderung nicht erf??llt</b><br>
        * <br>
        * <b>A01/04: KB2 - Das Passwort muss mindestens 2 verschiedene Kleinbuchstaben enthalten</b>
        */
        $KB2("Das Passwort muss mindestens 2 verschiedene Kleinbuchstaben enthalten"),

        /**
        * <b>A01: Anforderung nicht erf??llt</b><br>
        * <br>
        * <b>A01/05: GB2 - Das Passwort muss mindestens 2 verschiedene Grossbuchstaben enthalten</b>
        */
        $GB2("Das Passwort muss mindestens 2 verschiedene Grossbuchstaben enthalten");

        private final String title;

        AnforderungNichtErfuellt(String title)
        {
            this.title = title;
        }

        public String getTitle()
        {
            return title;
        }
    }

    // Epilog Standard ---->
    // profile LFET.Java.Epilog.Standard.Interface.ini not found
    // used LF-ET 2.2.1 (230211b) build in default

}

// Epilog Standard <----

// End of generated Java source code
// Generated by LF-ET 2.2.1 (230211b), https://www.lohrfink.de/lfet

