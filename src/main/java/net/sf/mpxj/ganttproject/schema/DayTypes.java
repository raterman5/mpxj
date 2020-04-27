//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.12.28 at 05:49:44 PM GMT
//

package net.sf.mpxj.ganttproject.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for day-types complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="day-types">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="day-type" type="{}day-type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="default-week" type="{}default-week"/>
 *         &lt;element name="only-show-weekends" type="{}only-show-weekends"/>
 *         &lt;element name="overriden-day-types" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="days" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "day-types", propOrder =
{
   "dayType",
   "defaultWeek",
   "onlyShowWeekends",
   "overridenDayTypes",
   "days"
}) public class DayTypes
{

   @XmlElement(name = "day-type") protected List<DayType> dayType;
   @XmlElement(name = "default-week", required = true) protected DefaultWeek defaultWeek;
   @XmlElement(name = "only-show-weekends", required = true) protected OnlyShowWeekends onlyShowWeekends;
   @XmlElement(name = "overriden-day-types", required = true) protected String overridenDayTypes;
   @XmlElement(required = true) protected String days;

   /**
    * Gets the value of the dayType property.
    *
    * <p>
    * This accessor method returns a reference to the live list,
    * not a snapshot. Therefore any modification you make to the
    * returned list will be present inside the JAXB object.
    * This is why there is not a <CODE>set</CODE> method for the dayType property.
    *
    * <p>
    * For example, to add a new item, do as follows:
    * <pre>
    *    getDayType().add(newItem);
    * </pre>
    *
    *
    * <p>
    * Objects of the following type(s) are allowed in the list
    * {@link DayType }
    *
    *
    */
   public List<DayType> getDayType()
   {
      if (dayType == null)
      {
         dayType = new ArrayList<>();
      }
      return this.dayType;
   }

   /**
    * Gets the value of the defaultWeek property.
    *
    * @return
    *     possible object is
    *     {@link DefaultWeek }
    *
    */
   public DefaultWeek getDefaultWeek()
   {
      return defaultWeek;
   }

   /**
    * Sets the value of the defaultWeek property.
    *
    * @param value
    *     allowed object is
    *     {@link DefaultWeek }
    *
    */
   public void setDefaultWeek(DefaultWeek value)
   {
      this.defaultWeek = value;
   }

   /**
    * Gets the value of the onlyShowWeekends property.
    *
    * @return
    *     possible object is
    *     {@link OnlyShowWeekends }
    *
    */
   public OnlyShowWeekends getOnlyShowWeekends()
   {
      return onlyShowWeekends;
   }

   /**
    * Sets the value of the onlyShowWeekends property.
    *
    * @param value
    *     allowed object is
    *     {@link OnlyShowWeekends }
    *
    */
   public void setOnlyShowWeekends(OnlyShowWeekends value)
   {
      this.onlyShowWeekends = value;
   }

   /**
    * Gets the value of the overridenDayTypes property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getOverridenDayTypes()
   {
      return overridenDayTypes;
   }

   /**
    * Sets the value of the overridenDayTypes property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setOverridenDayTypes(String value)
   {
      this.overridenDayTypes = value;
   }

   /**
    * Gets the value of the days property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getDays()
   {
      return days;
   }

   /**
    * Sets the value of the days property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDays(String value)
   {
      this.days = value;
   }

}
