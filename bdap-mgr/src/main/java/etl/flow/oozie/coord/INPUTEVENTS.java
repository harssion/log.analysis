//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.21 at 03:56:46 PM PDT 
//


package etl.flow.oozie.coord;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INPUTEVENTS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INPUTEVENTS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="and" type="{uri:oozie:coordinator:0.5}LOGICALAND" minOccurs="0"/>
 *         &lt;element name="or" type="{uri:oozie:coordinator:0.5}LOGICALOR" minOccurs="0"/>
 *         &lt;element name="data-in" type="{uri:oozie:coordinator:0.5}DATAIN" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INPUTEVENTS", propOrder = {
    "and",
    "or",
    "dataIn"
})
public class INPUTEVENTS {

    protected LOGICALAND and;
    protected LOGICALOR or;
    @XmlElement(name = "data-in")
    protected List<DATAIN> dataIn;

    /**
     * Gets the value of the and property.
     * 
     * @return
     *     possible object is
     *     {@link LOGICALAND }
     *     
     */
    public LOGICALAND getAnd() {
        return and;
    }

    /**
     * Sets the value of the and property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOGICALAND }
     *     
     */
    public void setAnd(LOGICALAND value) {
        this.and = value;
    }

    /**
     * Gets the value of the or property.
     * 
     * @return
     *     possible object is
     *     {@link LOGICALOR }
     *     
     */
    public LOGICALOR getOr() {
        return or;
    }

    /**
     * Sets the value of the or property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOGICALOR }
     *     
     */
    public void setOr(LOGICALOR value) {
        this.or = value;
    }

    /**
     * Gets the value of the dataIn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataIn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataIn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DATAIN }
     * 
     * 
     */
    public List<DATAIN> getDataIn() {
        if (dataIn == null) {
            dataIn = new ArrayList<DATAIN>();
        }
        return this.dataIn;
    }

}
