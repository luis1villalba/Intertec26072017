
package com.interctec.java.webpage.ws.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserServicesWs", targetNamespace = "http://services.webservices.java.interctec.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserServicesWs {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.interctec.java.webpage.ws.services.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "agregarUserNameRestricted", targetNamespace = "http://services.webservices.java.interctec.com/", className = "com.interctec.java.webpage.ws.services.AgregarUserNameRestricted")
    @ResponseWrapper(localName = "agregarUserNameRestrictedResponse", targetNamespace = "http://services.webservices.java.interctec.com/", className = "com.interctec.java.webpage.ws.services.AgregarUserNameRestrictedResponse")
    @Action(input = "http://services.webservices.java.interctec.com/UserServicesWs/agregarUserNameRestrictedRequest", output = "http://services.webservices.java.interctec.com/UserServicesWs/agregarUserNameRestrictedResponse")
    public RespuestaDTO agregarUserNameRestricted(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.interctec.java.webpage.ws.services.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validarUserName", targetNamespace = "http://services.webservices.java.interctec.com/", className = "com.interctec.java.webpage.ws.services.ValidarUserName")
    @ResponseWrapper(localName = "validarUserNameResponse", targetNamespace = "http://services.webservices.java.interctec.com/", className = "com.interctec.java.webpage.ws.services.ValidarUserNameResponse")
    @Action(input = "http://services.webservices.java.interctec.com/UserServicesWs/validarUserNameRequest", output = "http://services.webservices.java.interctec.com/UserServicesWs/validarUserNameResponse")
    public RespuestaDTO validarUserName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
