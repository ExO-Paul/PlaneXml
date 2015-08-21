
package com.epam.tc.planexml.jaxb.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for characteristics_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="characteristics_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.tc.epam.com/Plane}plane_type_enum_type"/>
 *         &lt;element name="crew" type="{http://www.tc.epam.com/Plane}crew_type"/>
 *         &lt;element name="loadout" type="{http://www.tc.epam.com/Plane}loadout_type" minOccurs="0"/>
 *         &lt;element name="radar" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "characteristics_type", namespace = "http://www.tc.epam.com/Plane", propOrder = {
    "type",
    "crew",
    "loadout",
    "radar"
})
public class Characteristics {

    @XmlElement(namespace = "http://www.tc.epam.com/Plane", required = true)
    @XmlSchemaType(name = "string")
    protected PlaneType type;
    @XmlElement(namespace = "http://www.tc.epam.com/Plane")
    @XmlSchemaType(name = "positiveInteger")
    protected int crew;
    @XmlElement(namespace = "http://www.tc.epam.com/Plane")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer loadout;
    @XmlElement(namespace = "http://www.tc.epam.com/Plane", defaultValue = "false")
    protected boolean radar;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneType }
     *     
     */
    public PlaneType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneType }
     *     
     */
    public void setType(PlaneType value) {
        this.type = value;
    }

    /**
     * Gets the value of the crew property.
     * 
     */
    public int getCrew() {
        return crew;
    }

    /**
     * Sets the value of the crew property.
     * 
     */
    public void setCrew(int value) {
        this.crew = value;
    }

    /**
     * Gets the value of the loadout property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoadout() {
        return loadout;
    }

    /**
     * Sets the value of the loadout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoadout(Integer value) {
        this.loadout = value;
    }

    /**
     * Gets the value of the radar property.
     * 
     */
    public boolean isRadar() {
        return radar;
    }

    /**
     * Sets the value of the radar property.
     * 
     */
    public void setRadar(boolean value) {
        this.radar = value;
    }

	@Override
	public String toString() {
		return "Characteristics [type=" + type + ", crew=" + crew + ", loadout=" + loadout + ", radar=" + radar
				+ "]";
	}

    
}
