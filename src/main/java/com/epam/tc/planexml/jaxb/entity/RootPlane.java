
package com.epam.tc.planexml.jaxb.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for root_plane_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="root_plane_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aircraft" type="{http://www.tc.epam.com/Plane}plane_element_type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "root_plane_type", namespace = "http://www.tc.epam.com/Plane", propOrder = {
    "aircraft"
})
public class RootPlane {

    @XmlElement(namespace = "http://www.tc.epam.com/Plane", required = true)
    protected List<PlaneElement> aircraft;

    /**
     * Gets the value of the aircraft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aircraft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAircraft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlaneElement }
     * 
     * 
     */
    public List<PlaneElement> getAircraft() {
        if (aircraft == null) {
            aircraft = new ArrayList<PlaneElement>();
        }
        return this.aircraft;
    }

	@Override
	public String toString() {
		return "RootPlane [aircraft=" + aircraft + "]";
	}

    
}
