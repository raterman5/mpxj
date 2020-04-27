//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2018.07.12 at 04:42:45 PM BST
//

package net.sf.mpxj.conceptdraw.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Callout" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OffsetX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="OffsetY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="SizeDX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="SizeDY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "", propOrder =
{
   "callout"
}) @XmlRootElement(name = "Callouts") public class Callouts
{

   @XmlElement(name = "Callout") protected List<Callouts.Callout> callout;

   /**
    * Gets the value of the callout property.
    *
    * <p>
    * This accessor method returns a reference to the live list,
    * not a snapshot. Therefore any modification you make to the
    * returned list will be present inside the JAXB object.
    * This is why there is not a <CODE>set</CODE> method for the callout property.
    *
    * <p>
    * For example, to add a new item, do as follows:
    * <pre>
    *    getCallout().add(newItem);
    * </pre>
    *
    *
    * <p>
    * Objects of the following type(s) are allowed in the list
    * {@link Callouts.Callout }
    *
    *
    */
   public List<Callouts.Callout> getCallout()
   {
      if (callout == null)
      {
         callout = new ArrayList<>();
      }
      return this.callout;
   }

   /**
    * <p>Java class for anonymous complex type.
    *
    * <p>The following schema fragment specifies the expected content contained within this class.
    *
    * <pre>
    * &lt;complexType>
    *   &lt;complexContent>
    *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
    *       &lt;all>
    *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
    *         &lt;element name="OffsetX" type="{http://www.w3.org/2001/XMLSchema}int"/>
    *         &lt;element name="OffsetY" type="{http://www.w3.org/2001/XMLSchema}int"/>
    *         &lt;element name="SizeDX" type="{http://www.w3.org/2001/XMLSchema}int"/>
    *         &lt;element name="SizeDY" type="{http://www.w3.org/2001/XMLSchema}int"/>
    *       &lt;/all>
    *     &lt;/restriction>
    *   &lt;/complexContent>
    * &lt;/complexType>
    * </pre>
    *
    *
    */
   @XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "", propOrder = {

   }) public static class Callout
   {

      @XmlElement(name = "Name", required = true) protected String name;
      @XmlElement(name = "OffsetX", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter5.class) @XmlSchemaType(name = "int") protected Integer offsetX;
      @XmlElement(name = "OffsetY", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter5.class) @XmlSchemaType(name = "int") protected Integer offsetY;
      @XmlElement(name = "SizeDX", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter5.class) @XmlSchemaType(name = "int") protected Integer sizeDX;
      @XmlElement(name = "SizeDY", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter5.class) @XmlSchemaType(name = "int") protected Integer sizeDY;

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
         return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
         this.name = value;
      }

      /**
       * Gets the value of the offsetX property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public Integer getOffsetX()
      {
         return offsetX;
      }

      /**
       * Sets the value of the offsetX property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setOffsetX(Integer value)
      {
         this.offsetX = value;
      }

      /**
       * Gets the value of the offsetY property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public Integer getOffsetY()
      {
         return offsetY;
      }

      /**
       * Sets the value of the offsetY property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setOffsetY(Integer value)
      {
         this.offsetY = value;
      }

      /**
       * Gets the value of the sizeDX property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public Integer getSizeDX()
      {
         return sizeDX;
      }

      /**
       * Sets the value of the sizeDX property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setSizeDX(Integer value)
      {
         this.sizeDX = value;
      }

      /**
       * Gets the value of the sizeDY property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public Integer getSizeDY()
      {
         return sizeDY;
      }

      /**
       * Sets the value of the sizeDY property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setSizeDY(Integer value)
      {
         this.sizeDY = value;
      }

   }

}
