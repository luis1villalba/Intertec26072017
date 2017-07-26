
package com.interctec.java.webpage.ws.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoRespuestaOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="restricted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="userNameToAddExist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="userNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="valid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaDTO", propOrder = {
    "codigoRespuestaOperacion",
    "restricted",
    "userNameToAddExist",
    "userNames",
    "valid"
})
public class RespuestaDTO {

    protected String codigoRespuestaOperacion;
    protected Boolean restricted;
    protected Boolean userNameToAddExist;
    @XmlElement(nillable = true)
    protected List<String> userNames;
    protected Boolean valid;

    /**
     * Obtiene el valor de la propiedad codigoRespuestaOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRespuestaOperacion() {
        return codigoRespuestaOperacion;
    }

    /**
     * Define el valor de la propiedad codigoRespuestaOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRespuestaOperacion(String value) {
        this.codigoRespuestaOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad restricted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestricted() {
        return restricted;
    }

    /**
     * Define el valor de la propiedad restricted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestricted(Boolean value) {
        this.restricted = value;
    }

    /**
     * Obtiene el valor de la propiedad userNameToAddExist.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserNameToAddExist() {
        return userNameToAddExist;
    }

    /**
     * Define el valor de la propiedad userNameToAddExist.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserNameToAddExist(Boolean value) {
        this.userNameToAddExist = value;
    }

    /**
     * Gets the value of the userNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUserNames() {
        if (userNames == null) {
            userNames = new ArrayList<String>();
        }
        return this.userNames;
    }

    /**
     * Obtiene el valor de la propiedad valid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValid() {
        return valid;
    }

    /**
     * Define el valor de la propiedad valid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValid(Boolean value) {
        this.valid = value;
    }

}
