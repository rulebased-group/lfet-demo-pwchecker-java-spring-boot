// *** WARNING: DO NOT MODIFY *** This is a generated Java source code!
//
// Generated by LF-ET 2.3.0 (240312a), https://www.lohrfink.de/lfet
// From decision table
// "D:/LF/Projekte/lfet-demo-pwchecker-java-spring-boot/src/main/resources/lfet/pwchecker/PwChecker.lfet"
// 13.03.2024 09:55
//

// Prolog Standard ---->
// profile LFET.Java.Prolog.Standard.Interface.ini not found
// used LF-ET 2.3.0 (240312a) build in default

package lfet.demo.pwchecker.java.spring.boot.service;

import javax.annotation.processing.Generated;

@Generated("LF-ET")
interface PwChecker_iFace<T extends lfet.demo.pwchecker.java.spring.boot.common.IDecisionTableModelTraceable>
{

    // Prolog Standard <----

    /**
    * <b>B01: Anzahl Zeichen?</b><br>
    * <br>
    * The enum generation has been triggered in project.ini by:<br>
    * - <b>IDE.Java.InterfaceEnum.10</b>: IncludeTagsTitle=Anzahl Zeichen; Symbol=Interval<br>
    * - <b>ide.Java.InterfaceEnum.default</b>: MethodName=Prefix; EnumValueName=Symbol, UpperCase, Prefix$
    */
    boolean _is(PwChecker_iFace.AnzahlZeichen arg0, T model);

    /**
    * <b>B02: Anzahl verschiedene Kleinbuchstaben?</b><br>
    * <br>
    * abcdefghijklmnopqrstuvwxyz<br>
    * <br>
    * The enum generation has been triggered in project.ini by:<br>
    * - <b>IDE.Java.InterfaceEnum.20</b>: IncludeTagsTitle=Anzahl verschiedene; Symbol=Interval; CA=Text<br>
    * - <b>ide.Java.InterfaceEnum.default</b>: MethodName=Prefix; EnumValueName=Symbol, UpperCase, Prefix$
    */
    boolean _is(PwChecker_iFace.AnzahlVerschiedeneKleinbuchstaben arg0, T model);

    /**
    * <b>B03: Anzahl verschiedene Grossbuchstaben?</b><br>
    * <br>
    * ABCDEFGHIJKLMNOPQRSTUVWXYZ<br>
    * <br>
    * The enum generation has been triggered in project.ini by:<br>
    * - <b>IDE.Java.InterfaceEnum.20</b>: IncludeTagsTitle=Anzahl verschiedene; Symbol=Interval; CA=Text<br>
    * - <b>ide.Java.InterfaceEnum.default</b>: MethodName=Prefix; EnumValueName=Symbol, UpperCase, Prefix$
    */
    boolean _is(PwChecker_iFace.AnzahlVerschiedeneGrossbuchstaben arg0, T model);

    /**
    * <b>B04: Anzahl verschiedene Ziffern?</b><br>
    * <br>
    * 0123456789<br>
    * <br>
    * The enum generation has been triggered in project.ini by:<br>
    * - <b>IDE.Java.InterfaceEnum.20</b>: IncludeTagsTitle=Anzahl verschiedene; Symbol=Interval; CA=Text<br>
    * - <b>ide.Java.InterfaceEnum.default</b>: MethodName=Prefix; EnumValueName=Symbol, UpperCase, Prefix$
    */
    boolean _is(PwChecker_iFace.AnzahlVerschiedeneZiffern arg0, T model);

    /**
    * <b>B05: Anzahl verschiedene Sonderzeichen?</b><br>
    * <br>
    * .,/?!|#*()[]{}&lt;&gt;&quot;\<br>
    * <br>
    * The enum generation has been triggered in project.ini by:<br>
    * - <b>IDE.Java.InterfaceEnum.20</b>: IncludeTagsTitle=Anzahl verschiedene; Symbol=Interval; CA=Text<br>
    * - <b>ide.Java.InterfaceEnum.default</b>: MethodName=Prefix; EnumValueName=Symbol, UpperCase, Prefix$
    */
    boolean _is(PwChecker_iFace.AnzahlVerschiedeneSonderzeichen arg0, T model);

    /**
    * <b>A01: Anforderung nicht erf&uuml;llt</b><br>
    * <br>
    * The enum generation has been triggered in project.ini by:<br>
    * - <b>IDE.Java.InterfaceEnum.30</b>: IncludeTagsTitle=Anforderung, Passwort; Title<br>
    * - <b>ide.Java.InterfaceEnum.default</b>: MethodName=Prefix; EnumValueName=Symbol, UpperCase, Prefix$
    */
    void _do(PwChecker_iFace.AnforderungNichtErfuellt arg0, T model);

    /**
    * <b>A02: Passwort o.k.</b><br>
    * <br>
    * The enum generation has been triggered in project.ini by:<br>
    * - <b>IDE.Java.InterfaceEnum.30</b>: IncludeTagsTitle=Anforderung, Passwort; Title<br>
    * - <b>ide.Java.InterfaceEnum.default</b>: MethodName=Prefix; EnumValueName=Symbol, UpperCase, Prefix$
    */
    void _do(PwChecker_iFace.PasswortOK arg0, T model);

    /**
    * <b>B01: Anzahl Zeichen?</b><br>
    * <br>
    * The enum generation has been triggered in project.ini by:<br>
    * - <b>IDE.Java.InterfaceEnum.10</b>: IncludeTagsTitle=Anzahl Zeichen; Symbol=Interval<br>
    * - <b>ide.Java.InterfaceEnum.default</b>: MethodName=Prefix; EnumValueName=Symbol, UpperCase, Prefix$
    */
    enum AnzahlZeichen
    {
        /**
        * <b>B01: Anzahl Zeichen?</b><br>
        * <br>
        * <b>B01/01: &lt;= 7 - weniger oder gleich 7 Zeichen</b>
        */
        $LESSEQUAL7("<= 7", Double.NEGATIVE_INFINITY, 7.0),

        /**
        * <b>B01: Anzahl Zeichen?</b><br>
        * <br>
        * <b>B01/02: 8 - 20 - 8 bis 20 Zeichen</b>
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

    /**
    * <b>B02: Anzahl verschiedene Kleinbuchstaben?</b><br>
    * <br>
    * abcdefghijklmnopqrstuvwxyz<br>
    * <br>
    * The enum generation has been triggered in project.ini by:<br>
    * - <b>IDE.Java.InterfaceEnum.20</b>: IncludeTagsTitle=Anzahl verschiedene; Symbol=Interval; CA=Text<br>
    * - <b>ide.Java.InterfaceEnum.default</b>: MethodName=Prefix; EnumValueName=Symbol, UpperCase, Prefix$
    */
    enum AnzahlVerschiedeneKleinbuchstaben
    {
        /**
        * <b>B02: Anzahl verschiedene Kleinbuchstaben?</b><br>
        * <br>
        * abcdefghijklmnopqrstuvwxyz<br>
        * <br>
        * <b>B02/01: &lt; 2 - weniger als 2</b>
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
            return "abcdefghijklmnopqrstuvwxyz";
        }
    }

    /**
    * <b>B03: Anzahl verschiedene Grossbuchstaben?</b><br>
    * <br>
    * ABCDEFGHIJKLMNOPQRSTUVWXYZ<br>
    * <br>
    * The enum generation has been triggered in project.ini by:<br>
    * - <b>IDE.Java.InterfaceEnum.20</b>: IncludeTagsTitle=Anzahl verschiedene; Symbol=Interval; CA=Text<br>
    * - <b>ide.Java.InterfaceEnum.default</b>: MethodName=Prefix; EnumValueName=Symbol, UpperCase, Prefix$
    */
    enum AnzahlVerschiedeneGrossbuchstaben
    {
        /**
        * <b>B03: Anzahl verschiedene Grossbuchstaben?</b><br>
        * <br>
        * ABCDEFGHIJKLMNOPQRSTUVWXYZ<br>
        * <br>
        * <b>B03/01: &lt; 2 - weniger als 2</b>
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
            return "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
    }

    /**
    * <b>B04: Anzahl verschiedene Ziffern?</b><br>
    * <br>
    * 0123456789<br>
    * <br>
    * The enum generation has been triggered in project.ini by:<br>
    * - <b>IDE.Java.InterfaceEnum.20</b>: IncludeTagsTitle=Anzahl verschiedene; Symbol=Interval; CA=Text<br>
    * - <b>ide.Java.InterfaceEnum.default</b>: MethodName=Prefix; EnumValueName=Symbol, UpperCase, Prefix$
    */
    enum AnzahlVerschiedeneZiffern
    {
        /**
        * <b>B04: Anzahl verschiedene Ziffern?</b><br>
        * <br>
        * 0123456789<br>
        * <br>
        * <b>B04/01: &lt; 2 - weniger als 2</b>
        */
        $LESS2("< 2", Double.NEGATIVE_INFINITY, 1.0);

        private final String symbol;
        private final double symbolMin;
        private final double symbolMax;

        AnzahlVerschiedeneZiffern(String symbol, double symbolMin, double symbolMax)
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
            return "0123456789";
        }
    }

    /**
    * <b>B05: Anzahl verschiedene Sonderzeichen?</b><br>
    * <br>
    * .,/?!|#*()[]{}&lt;&gt;&quot;\<br>
    * <br>
    * The enum generation has been triggered in project.ini by:<br>
    * - <b>IDE.Java.InterfaceEnum.20</b>: IncludeTagsTitle=Anzahl verschiedene; Symbol=Interval; CA=Text<br>
    * - <b>ide.Java.InterfaceEnum.default</b>: MethodName=Prefix; EnumValueName=Symbol, UpperCase, Prefix$
    */
    enum AnzahlVerschiedeneSonderzeichen
    {
        /**
        * <b>B05: Anzahl verschiedene Sonderzeichen?</b><br>
        * <br>
        * .,/?!|#*()[]{}&lt;&gt;&quot;\<br>
        * <br>
        * <b>B05/01: &lt; 2 - weniger als 2</b>
        */
        $LESS2("< 2", Double.NEGATIVE_INFINITY, 1.0);

        private final String symbol;
        private final double symbolMin;
        private final double symbolMax;

        AnzahlVerschiedeneSonderzeichen(String symbol, double symbolMin, double symbolMax)
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
            return ".,/?!|#*()[]{}<>\"\\";
        }
    }

    /**
    * <b>A01: Anforderung nicht erf&uuml;llt</b><br>
    * <br>
    * The enum generation has been triggered in project.ini by:<br>
    * - <b>IDE.Java.InterfaceEnum.30</b>: IncludeTagsTitle=Anforderung, Passwort; Title<br>
    * - <b>ide.Java.InterfaceEnum.default</b>: MethodName=Prefix; EnumValueName=Symbol, UpperCase, Prefix$
    */
    enum AnforderungNichtErfuellt
    {
        /**
        * <b>A01: Anforderung nicht erf&uuml;llt</b><br>
        * <br>
        * <b>A01/01: Len&lt;8 - Das Passwort ist zu kurz, es muss 8 bis 20 Zeichen lang sein</b>
        */
        $LENLESS8("Das Passwort ist zu kurz, es muss 8 bis 20 Zeichen lang sein"),

        /**
        * <b>A01: Anforderung nicht erf&uuml;llt</b><br>
        * <br>
        * <b>A01/02: Len8-20 - Das Passwort muss 9 bis 20 Zeichen lang sein</b>
        */
        $LEN820("Das Passwort muss 9 bis 20 Zeichen lang sein"),

        /**
        * <b>A01: Anforderung nicht erf&uuml;llt</b><br>
        * <br>
        * <b>A01/03: Len&gt;20 - Das Passwort ist zu lang, es muss 9 bis 20 Zeichen lang sein</b>
        */
        $LENGREATER20("Das Passwort ist zu lang, es muss 9 bis 20 Zeichen lang sein"),

        /**
        * <b>A01: Anforderung nicht erf&uuml;llt</b><br>
        * <br>
        * <b>A01/04: KB2 - Das Passwort muss mindestens 2 verschiedene Kleinbuchstaben enthalten</b>
        */
        $KB2("Das Passwort muss mindestens 2 verschiedene Kleinbuchstaben enthalten"),

        /**
        * <b>A01: Anforderung nicht erf&uuml;llt</b><br>
        * <br>
        * <b>A01/05: GB2 - Das Passwort muss mindestens 2 verschiedene Grossbuchstaben enthalten</b>
        */
        $GB2("Das Passwort muss mindestens 2 verschiedene Grossbuchstaben enthalten"),

        /**
        * <b>A01: Anforderung nicht erf&uuml;llt</b><br>
        * <br>
        * <b>A01/06: SZ2 - Das Passwort muss mindestens 2 verschiedene Ziffern oder Sonderzeichen enthalten</b>
        */
        $SZ2("Das Passwort muss mindestens 2 verschiedene Ziffern oder Sonderzeichen enthalten");

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

    /**
    * <b>A02: Passwort o.k.</b><br>
    * <br>
    * The enum generation has been triggered in project.ini by:<br>
    * - <b>IDE.Java.InterfaceEnum.30</b>: IncludeTagsTitle=Anforderung, Passwort; Title<br>
    * - <b>ide.Java.InterfaceEnum.default</b>: MethodName=Prefix; EnumValueName=Symbol, UpperCase, Prefix$
    */
    enum PasswortOK
    {
        /**
        * <b>A02: Passwort o.k.</b><br>
        * <br>
        * <b>A02/01: ok - alle Anforderungen sind erf&uuml;llt</b>
        */
        $OK("alle Anforderungen sind erfüllt");

        private final String title;

        PasswortOK(String title)
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
    // used LF-ET 2.3.0 (240312a) build in default

}

// Epilog Standard <----

// End of generated Java source code
// Generated by LF-ET 2.3.0 (240312a), https://www.lohrfink.de/lfet
