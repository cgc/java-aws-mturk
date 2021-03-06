/**
 * EventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class EventType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EventType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AssignmentAccepted = "AssignmentAccepted";
    public static final java.lang.String _AssignmentAbandoned = "AssignmentAbandoned";
    public static final java.lang.String _AssignmentReturned = "AssignmentReturned";
    public static final java.lang.String _AssignmentSubmitted = "AssignmentSubmitted";
    public static final java.lang.String _AssignmentAutoApproved = "AssignmentAutoApproved";
    public static final java.lang.String _HITReviewable = "HITReviewable";
    public static final java.lang.String _HITExpired = "HITExpired";
    public static final EventType AssignmentAccepted = new EventType(_AssignmentAccepted);
    public static final EventType AssignmentAbandoned = new EventType(_AssignmentAbandoned);
    public static final EventType AssignmentReturned = new EventType(_AssignmentReturned);
    public static final EventType AssignmentSubmitted = new EventType(_AssignmentSubmitted);
    public static final EventType AssignmentAutoApproved = new EventType(_AssignmentAutoApproved);
    public static final EventType HITReviewable = new EventType(_HITReviewable);
    public static final EventType HITExpired = new EventType(_HITExpired);
    public java.lang.String getValue() { return _value_;}
    public static EventType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EventType enumeration = (EventType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EventType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "EventType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
