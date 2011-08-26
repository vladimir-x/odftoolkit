/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.draw;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawDisplayNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawStyleAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawDots1Attribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawDots1LengthAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawDots2Attribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawDots2LengthAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawDistanceAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element draw:stroke-dash}.
 *
 */
public class DrawStrokeDashElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.DRAW, "stroke-dash" );

	/**
	 * The value set of {@odf.attribute draw:style}.
	 */
	 public enum DrawStyleAttributeValue {
	 
	 RECT( DrawStyleAttribute.Value.RECT.toString() ), ROUND( DrawStyleAttribute.Value.ROUND.toString() );
              
		private String mValue;
	 	
		DrawStyleAttributeValue( String value )
		{
			mValue = value;
		}
		
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static DrawStyleAttributeValue enumValueOf( String value )
	    {
	        for( DrawStyleAttributeValue aIter : values() )
	        {
	            if( value.equals( aIter.toString() ) )
	            {
	                return aIter;
	            }
	        }
	        return null;
	    }
	}

	/**
	 * Create the instance of <code>DrawStrokeDashElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DrawStrokeDashElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element draw:stroke-dash}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  DrawStrokeDashElement}
	 *
     * @param drawNameAttributeValue  The mandatory attribute {@odf.attribute  draw:name}"
     *
	 */
	public void init(String drawNameAttributeValue)
	{
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawNameAttribute</code> , See {@odf.attribute draw:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawNameAttribute()
	{
		DrawNameAttribute attr = (DrawNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawNameAttribute</code> , See {@odf.attribute draw:name}
	 *
	 * @param drawNameValue   The type is <code>String</code>
	 */
	public void setDrawNameAttribute( String drawNameValue )
	{
		DrawNameAttribute attr =  new DrawNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawDisplayNameAttribute</code> , See {@odf.attribute draw:display-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawDisplayNameAttribute()
	{
		DrawDisplayNameAttribute attr = (DrawDisplayNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "display-name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawDisplayNameAttribute</code> , See {@odf.attribute draw:display-name}
	 *
	 * @param drawDisplayNameValue   The type is <code>String</code>
	 */
	public void setDrawDisplayNameAttribute( String drawDisplayNameValue )
	{
		DrawDisplayNameAttribute attr =  new DrawDisplayNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawDisplayNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawStyleAttribute</code> , See {@odf.attribute draw:style}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawStyleAttribute()
	{
		DrawStyleAttribute attr = (DrawStyleAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "style" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawStyleAttribute</code> , See {@odf.attribute draw:style}
	 *
	 * @param drawStyleValue   The type is <code>String</code>
	 */
	public void setDrawStyleAttribute( String drawStyleValue )
	{
		DrawStyleAttribute attr =  new DrawStyleAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawStyleValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawDots1Attribute</code> , See {@odf.attribute draw:dots1}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getDrawDots1Attribute()
	{
		DrawDots1Attribute attr = (DrawDots1Attribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "dots1" ) );
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawDots1Attribute</code> , See {@odf.attribute draw:dots1}
	 *
	 * @param drawDots1Value   The type is <code>Integer</code>
	 */
	public void setDrawDots1Attribute( Integer drawDots1Value )
	{
		DrawDots1Attribute attr =  new DrawDots1Attribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( drawDots1Value.intValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawDots1LengthAttribute</code> , See {@odf.attribute draw:dots1-length}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawDots1LengthAttribute()
	{
		DrawDots1LengthAttribute attr = (DrawDots1LengthAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "dots1-length" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawDots1LengthAttribute</code> , See {@odf.attribute draw:dots1-length}
	 *
	 * @param drawDots1LengthValue   The type is <code>String</code>
	 */
	public void setDrawDots1LengthAttribute( String drawDots1LengthValue )
	{
		DrawDots1LengthAttribute attr =  new DrawDots1LengthAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawDots1LengthValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawDots2Attribute</code> , See {@odf.attribute draw:dots2}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getDrawDots2Attribute()
	{
		DrawDots2Attribute attr = (DrawDots2Attribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "dots2" ) );
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawDots2Attribute</code> , See {@odf.attribute draw:dots2}
	 *
	 * @param drawDots2Value   The type is <code>Integer</code>
	 */
	public void setDrawDots2Attribute( Integer drawDots2Value )
	{
		DrawDots2Attribute attr =  new DrawDots2Attribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( drawDots2Value.intValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawDots2LengthAttribute</code> , See {@odf.attribute draw:dots2-length}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawDots2LengthAttribute()
	{
		DrawDots2LengthAttribute attr = (DrawDots2LengthAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "dots2-length" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawDots2LengthAttribute</code> , See {@odf.attribute draw:dots2-length}
	 *
	 * @param drawDots2LengthValue   The type is <code>String</code>
	 */
	public void setDrawDots2LengthAttribute( String drawDots2LengthValue )
	{
		DrawDots2LengthAttribute attr =  new DrawDots2LengthAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawDots2LengthValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawDistanceAttribute</code> , See {@odf.attribute draw:distance}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawDistanceAttribute()
	{
		DrawDistanceAttribute attr = (DrawDistanceAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "distance" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawDistanceAttribute</code> , See {@odf.attribute draw:distance}
	 *
	 * @param drawDistanceValue   The type is <code>String</code>
	 */
	public void setDrawDistanceAttribute( String drawDistanceValue )
	{
		DrawDistanceAttribute attr =  new DrawDistanceAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawDistanceValue );
	}

}
