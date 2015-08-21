
package com.epam.tc.planexml.jaxb.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for plane_element_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="plane_element_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="characteristics" type="{http://www.tc.epam.com/Plane}characteristics_type"/>
 *         &lt;element name="measurements" type="{http://www.tc.epam.com/Plane}measurements_type"/>
 *         &lt;element name="price" type="{http://www.tc.epam.com/Plane}price_type"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.tc.epam.com/Plane}plane_id_type" />
 *       &lt;attribute name="model" use="required" type="{http://www.tc.epam.com/Plane}plane_model_type" />
 *       &lt;attribute name="origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plane_element_type", namespace = "http://www.tc.epam.com/Plane", propOrder = {
    "characteristics",
    "measurements",
    "price"
})
public class PlaneElement {

    @XmlElement(namespace = "http://www.tc.epam.com/Plane", required = true)
    protected Characteristics characteristics;
    @XmlElement(namespace = "http://www.tc.epam.com/Plane", required = true)
    protected Measurements measurements;
    @XmlElement(namespace = "http://www.tc.epam.com/Plane", required = true)
    protected Price price;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "model", required = true)
    protected String model;
    @XmlAttribute(name = "origin", required = true)
    protected String origin;

    /**
     * Gets the value of the characteristics property.
     * 
     * @return
     *     possible object is
     *     {@link Characteristics }
     *     
     */
    public Characteristics getCharacteristics() {
        return characteristics;
    }

    /**
     * Sets the value of the characteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Characteristics }
     *     
     */
    public void setCharacteristics(Characteristics value) {
        this.characteristics = value;
    }

    /**
     * Gets the value of the measurements property.
     * 
     * @return
     *     possible object is
     *     {@link Measurements }
     *     
     */
    public Measurements getMeasurements() {
        return measurements;
    }

    /**
     * Sets the value of the measurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Measurements }
     *     
     */
    public void setMeasurements(Measurements value) {
        this.measurements = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

	@Override
	public String toString() {
		return "PlaneElement [characteristics=" + characteristics + ", measurements=" + measurements + ", price="
				+ price + ", id=" + id + ", model=" + model + ", origin=" + origin + "]";
	}

}
