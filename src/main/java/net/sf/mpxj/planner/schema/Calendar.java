//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2010.08.02 at 09:18:52 PM BST
//

package net.sf.mpxj.planner.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "", propOrder =
{
   "defaultWeek",
   "overriddenDayTypes",
   "days",
   "calendar"
}) @XmlRootElement(name = "calendar") public class Calendar
{

   @XmlAttribute(required = true) @XmlJavaTypeAdapter(NormalizedStringAdapter.class) protected String name;
   @XmlAttribute(required = true) @XmlJavaTypeAdapter(NormalizedStringAdapter.class) protected String id;
   @XmlElement(name = "default-week", required = true) protected DefaultWeek defaultWeek;
   @XmlElement(name = "overridden-day-types") protected OverriddenDayTypes overriddenDayTypes;
   protected Days days;
   protected List<Calendar> calendar;

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
    * Gets the value of the id property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getId()
   {
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
   public void setId(String value)
   {
      this.id = value;
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
    * Gets the value of the overriddenDayTypes property.
    *
    * @return
    *     possible object is
    *     {@link OverriddenDayTypes }
    *
    */
   public OverriddenDayTypes getOverriddenDayTypes()
   {
      return overriddenDayTypes;
   }

   /**
    * Sets the value of the overriddenDayTypes property.
    *
    * @param value
    *     allowed object is
    *     {@link OverriddenDayTypes }
    *
    */
   public void setOverriddenDayTypes(OverriddenDayTypes value)
   {
      this.overriddenDayTypes = value;
   }

   /**
    * Gets the value of the days property.
    *
    * @return
    *     possible object is
    *     {@link Days }
    *
    */
   public Days getDays()
   {
      return days;
   }

   /**
    * Sets the value of the days property.
    *
    * @param value
    *     allowed object is
    *     {@link Days }
    *
    */
   public void setDays(Days value)
   {
      this.days = value;
   }

   /**
    * Gets the value of the calendar property.
    *
    * <p>
    * This accessor method returns a reference to the live list,
    * not a snapshot. Therefore any modification you make to the
    * returned list will be present inside the JAXB object.
    * This is why there is not a <CODE>set</CODE> method for the calendar property.
    *
    * <p>
    * For example, to add a new item, do as follows:
    * <pre>
    *    getCalendar().add(newItem);
    * </pre>
    *
    *
    * <p>
    * Objects of the following type(s) are allowed in the list
    * {@link Calendar }
    *
    *
    */
   public List<Calendar> getCalendar()
   {
      if (calendar == null)
      {
         calendar = new ArrayList<>();
      }
      return this.calendar;
   }

}
