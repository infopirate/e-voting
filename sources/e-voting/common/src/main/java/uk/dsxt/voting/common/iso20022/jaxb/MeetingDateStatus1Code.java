//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 03:58:45 PM GMT+03:00 
//


package uk.dsxt.voting.common.iso20022.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingDateStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeetingDateStatus1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TNTA"/>
 *     &lt;enumeration value="CNFR"/>
 *     &lt;enumeration value="CANC"/>
 *     &lt;enumeration value="NOQO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeetingDateStatus1Code")
@XmlEnum
public enum MeetingDateStatus1Code {

    TNTA,
    CNFR,
    CANC,
    NOQO;

    public String value() {
        return name();
    }

    public static MeetingDateStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
