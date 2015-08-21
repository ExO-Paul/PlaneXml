
package com.epam.tc.planexml.jaxb.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for plane_type_enum_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="plane_type_enum_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Support"/>
 *     &lt;enumeration value="Escort"/>
 *     &lt;enumeration value="Fighter"/>
 *     &lt;enumeration value="Interceptor"/>
 *     &lt;enumeration value="Recon"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "plane_type_enum_type", namespace = "http://www.tc.epam.com/Plane")
@XmlEnum
public enum PlaneType {

    @XmlEnumValue("Support")
    SUPPORT("Support"),
    @XmlEnumValue("Escort")
    ESCORT("Escort"),
    @XmlEnumValue("Fighter")
    FIGHTER("Fighter"),
    @XmlEnumValue("Interceptor")
    INTERCEPTOR("Interceptor"),
    @XmlEnumValue("Recon")
    RECON("Recon");
    private final String value;

    PlaneType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlaneType fromValue(String v) {
        for (PlaneType c: PlaneType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
