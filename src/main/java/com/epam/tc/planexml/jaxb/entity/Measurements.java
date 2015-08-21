
package com.epam.tc.planexml.jaxb.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for measurements_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="measurements_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="height" use="required" type="{http://www.tc.epam.com/Plane}measurement_type" />
 *       &lt;attribute name="width" use="required" type="{http://www.tc.epam.com/Plane}measurement_type" />
 *       &lt;attribute name="length" use="required" type="{http://www.tc.epam.com/Plane}measurement_type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "measurements_type", namespace = "http://www.tc.epam.com/Plane")
public class Measurements {

    @XmlAttribute(name = "height", required = true)
    protected double height;
    @XmlAttribute(name = "width", required = true)
    protected double width;
    @XmlAttribute(name = "length", required = true)
    protected double length;

    /**
     * Gets the value of the height property.
     * 
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(double value) {
        this.height = value;
    }

    /**
     * Gets the value of the width property.
     * 
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(double value) {
        this.width = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(double value) {
        this.length = value;
    }

	@Override
	public String toString() {
		return "Measurements [height=" + height + ", width=" + width + ", length=" + length + "]";
	}
    
    

}
