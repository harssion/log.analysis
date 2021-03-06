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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DATASETS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DATASETS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="include" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="dataset" type="{uri:oozie:coordinator:0.5}SYNCDATASET" minOccurs="0"/>
 *           &lt;element name="async-dataset" type="{uri:oozie:coordinator:0.5}ASYNCDATASET" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DATASETS", propOrder = {
    "include",
    "datasetOrAsyncDataset"
})
public class DATASETS {

    protected List<String> include;
    @XmlElements({
        @XmlElement(name = "dataset", type = SYNCDATASET.class),
        @XmlElement(name = "async-dataset", type = ASYNCDATASET.class)
    })
    protected List<Object> datasetOrAsyncDataset;

    /**
     * Gets the value of the include property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the include property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInclude() {
        if (include == null) {
            include = new ArrayList<String>();
        }
        return this.include;
    }

    /**
     * Gets the value of the datasetOrAsyncDataset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datasetOrAsyncDataset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatasetOrAsyncDataset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYNCDATASET }
     * {@link ASYNCDATASET }
     * 
     * 
     */
    public List<Object> getDatasetOrAsyncDataset() {
        if (datasetOrAsyncDataset == null) {
            datasetOrAsyncDataset = new ArrayList<Object>();
        }
        return this.datasetOrAsyncDataset;
    }

}
