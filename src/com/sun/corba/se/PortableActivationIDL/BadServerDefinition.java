package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/BadServerDefinition.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u291/1294/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Friday, April 9, 2021 12:03:37 AM PDT
*/

public final class BadServerDefinition extends org.omg.CORBA.UserException
{
  public String reason = null;

  public BadServerDefinition ()
  {
    super(BadServerDefinitionHelper.id());
  } // ctor

  public BadServerDefinition (String _reason)
  {
    super(BadServerDefinitionHelper.id());
    reason = _reason;
  } // ctor


  public BadServerDefinition (String $reason, String _reason)
  {
    super(BadServerDefinitionHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class BadServerDefinition
