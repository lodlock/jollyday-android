//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.05 at 12:42:28 AM MEZ 
//


package de.jollyday.config;

/**
 * <p>Java class for Month.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Month">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="JANUARY"/>
 *     &lt;enumeration value="FEBRUARY"/>
 *     &lt;enumeration value="MARCH"/>
 *     &lt;enumeration value="MAY"/>
 *     &lt;enumeration value="JUNE"/>
 *     &lt;enumeration value="JULY"/>
 *     &lt;enumeration value="AUGUST"/>
 *     &lt;enumeration value="SEPTEMBER"/>
 *     &lt;enumeration value="OCTOBER"/>
 *     &lt;enumeration value="NOVEMBER"/>
 *     &lt;enumeration value="DECEMBER"/>
 *     &lt;enumeration value="APRIL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
public enum Month {

    JANUARY,
    FEBRUARY,
    MARCH,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER,
    APRIL;

    public String value() {
        return name();
    }

    public static Month fromValue(String v) {
        return valueOf(v);
    }

}
