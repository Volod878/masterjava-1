
package ru.javaops.masterjava.xml.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for groupFlagType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="groupFlagType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="registering"/>
 *     &lt;enumeration value="current"/>
 *     &lt;enumeration value="finished"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "groupFlagType", namespace = "http://javaops.ru")
@XmlEnum
public enum GroupFlagType {

    @XmlEnumValue("registering")
    REGISTERING("registering"),
    @XmlEnumValue("current")
    CURRENT("current"),
    @XmlEnumValue("finished")
    FINISHED("finished");
    private final String value;

    GroupFlagType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupFlagType fromValue(String v) {
        for (GroupFlagType c: GroupFlagType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
