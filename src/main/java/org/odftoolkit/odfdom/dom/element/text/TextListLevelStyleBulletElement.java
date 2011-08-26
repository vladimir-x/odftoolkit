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

package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.dom.attribute.text.TextStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextBulletCharAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNumPrefixAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNumSuffixAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextBulletRelativeSizeAttribute;

import org.odftoolkit.odfdom.dom.element.style.StyleListLevelPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleTextPropertiesElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element text:list-level-style-bullet}.
 *
 */
public class TextListLevelStyleBulletElement extends TextListLevelStyleElementBase
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.TEXT, "list-level-style-bullet" );


	/**
	 * Create the instance of <code>TextListLevelStyleBulletElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextListLevelStyleBulletElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:list-level-style-bullet}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TextListLevelStyleBulletElement}
	 *
     * @param textBulletCharAttributeValue  The mandatory attribute {@odf.attribute  text:bullet-char}"
     ** @param textLevelAttributeValue  The mandatory attribute {@odf.attribute  text:level}"
     *
	 */
	public void init(String textBulletCharAttributeValue, int textLevelAttributeValue)
	{
		setTextBulletCharAttribute( textBulletCharAttributeValue );		super.init( textLevelAttributeValue );

	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextStyleNameAttribute</code> , See {@odf.attribute text:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextStyleNameAttribute()
	{
		TextStyleNameAttribute attr = (TextStyleNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "style-name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextStyleNameAttribute</code> , See {@odf.attribute text:style-name}
	 *
	 * @param textStyleNameValue   The type is <code>String</code>
	 */
	public void setTextStyleNameAttribute( String textStyleNameValue )
	{
		TextStyleNameAttribute attr =  new TextStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textStyleNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextBulletCharAttribute</code> , See {@odf.attribute text:bullet-char}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextBulletCharAttribute()
	{
		TextBulletCharAttribute attr = (TextBulletCharAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "bullet-char" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextBulletCharAttribute</code> , See {@odf.attribute text:bullet-char}
	 *
	 * @param textBulletCharValue   The type is <code>String</code>
	 */
	public void setTextBulletCharAttribute( String textBulletCharValue )
	{
		TextBulletCharAttribute attr =  new TextBulletCharAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textBulletCharValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleNumPrefixAttribute</code> , See {@odf.attribute style:num-prefix}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleNumPrefixAttribute()
	{
		StyleNumPrefixAttribute attr = (StyleNumPrefixAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "num-prefix" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleNumPrefixAttribute</code> , See {@odf.attribute style:num-prefix}
	 *
	 * @param styleNumPrefixValue   The type is <code>String</code>
	 */
	public void setStyleNumPrefixAttribute( String styleNumPrefixValue )
	{
		StyleNumPrefixAttribute attr =  new StyleNumPrefixAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleNumPrefixValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleNumSuffixAttribute</code> , See {@odf.attribute style:num-suffix}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleNumSuffixAttribute()
	{
		StyleNumSuffixAttribute attr = (StyleNumSuffixAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "num-suffix" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleNumSuffixAttribute</code> , See {@odf.attribute style:num-suffix}
	 *
	 * @param styleNumSuffixValue   The type is <code>String</code>
	 */
	public void setStyleNumSuffixAttribute( String styleNumSuffixValue )
	{
		StyleNumSuffixAttribute attr =  new StyleNumSuffixAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleNumSuffixValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextBulletRelativeSizeAttribute</code> , See {@odf.attribute text:bullet-relative-size}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextBulletRelativeSizeAttribute()
	{
		TextBulletRelativeSizeAttribute attr = (TextBulletRelativeSizeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "bullet-relative-size" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextBulletRelativeSizeAttribute</code> , See {@odf.attribute text:bullet-relative-size}
	 *
	 * @param textBulletRelativeSizeValue   The type is <code>String</code>
	 */
	public void setTextBulletRelativeSizeAttribute( String textBulletRelativeSizeValue )
	{
		TextBulletRelativeSizeAttribute attr =  new TextBulletRelativeSizeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textBulletRelativeSizeValue );
	}

	/**
	 * Create child element {@odf.element style:list-level-properties}.
	 *
	 * @return   return  the element {@odf.element style:list-level-properties}
	 * DifferentQName 
	 */
	public StyleListLevelPropertiesElement newStyleListLevelPropertiesElement()
	{
		StyleListLevelPropertiesElement  styleListLevelProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleListLevelPropertiesElement.class);
		this.appendChild( styleListLevelProperties);
		return  styleListLevelProperties;
	}                   
               
	/**
	 * Create child element {@odf.element style:text-properties}.
	 *
     * @param textDisplayAttributeValue  the <code>String</code> value of <code>TextDisplayAttribute</code>, see {@odf.attribute  text:display} at specification
	 * @return   return  the element {@odf.element style:text-properties}
	 * DifferentQName 
	 */
    
	public StyleTextPropertiesElement newStyleTextPropertiesElement(String textDisplayAttributeValue)
	{
		StyleTextPropertiesElement  styleTextProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleTextPropertiesElement.class);
		styleTextProperties.setTextDisplayAttribute( textDisplayAttributeValue );
		this.appendChild( styleTextProperties);
		return  styleTextProperties;      
	}
    
	/**
	 * Create child element {@odf.element style:text-properties}.
	 *
     * @param textConditionAttributeValue  the <code>String</code> value of <code>TextConditionAttribute</code>, see {@odf.attribute  text:condition} at specification
	 * @param textDisplayAttributeValue  the <code>String</code> value of <code>TextDisplayAttribute</code>, see {@odf.attribute  text:display} at specification
	 * @return   return  the element {@odf.element style:text-properties}
	 * DifferentQName 
	 */
    
	public StyleTextPropertiesElement newStyleTextPropertiesElement(String textConditionAttributeValue, String textDisplayAttributeValue)
	{
		StyleTextPropertiesElement  styleTextProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleTextPropertiesElement.class);
		styleTextProperties.setTextConditionAttribute( textConditionAttributeValue );
		styleTextProperties.setTextDisplayAttribute( textDisplayAttributeValue );
		this.appendChild( styleTextProperties);
		return  styleTextProperties;      
	}
    
}
