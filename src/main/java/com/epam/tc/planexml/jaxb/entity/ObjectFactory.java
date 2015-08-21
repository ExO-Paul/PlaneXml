
package com.epam.tc.planexml.jaxb.entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epam.tc.planexml.jaxb.entity package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Plane_QNAME = new QName("http://www.tc.epam.com/Plane", "Plane");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epam.tc.planexml.jaxb.entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RootPlane }
     * 
     */
    public RootPlane createRootPlaneType() {
        return new RootPlane();
    }

    /**
     * Create an instance of {@link Characteristics }
     * 
     */
    public Characteristics createCharacteristicsType() {
        return new Characteristics();
    }

    /**
     * Create an instance of {@link Measurements }
     * 
     */
    public Measurements createMeasurementsType() {
        return new Measurements();
    }

    /**
     * Create an instance of {@link Price }
     * 
     */
    public Price createPriceType() {
        return new Price();
    }

    /**
     * Create an instance of {@link PlaneElement }
     * 
     */
    public PlaneElement createPlaneElementType() {
        return new PlaneElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RootPlane }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tc.epam.com/Plane", name = "Plane")
    public JAXBElement<RootPlane> createPlane(RootPlane value) {
        return new JAXBElement<RootPlane>(_Plane_QNAME, RootPlane.class, null, value);
    }

}
