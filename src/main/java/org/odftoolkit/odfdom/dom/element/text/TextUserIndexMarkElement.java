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
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.text.TextStringValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextOutlineLevelAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextIndexNameAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element text:user-index-mark}.
 *
 */
public class TextUserIndexMarkElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.TEXT, "user-index-mark" );


	/**
	 * Create the instance of <code>TextUserIndexMarkElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextUserIndexMarkElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:user-index-mark}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TextUserIndexMarkElement}
	 *
     * @param textStringValueAttributeValue  The mandatory attribute {@odf.attribute  text:string-value}"
     * @param textIndexNameAttributeValue  The mandatory attribute {@odf.attribute  text:index-name}"
     *
	 */
	public void init(String textStringValueAttributeValue, String textIndexNameAttributeValue)
	{
		setTextStringValueAttribute( textStringValueAttributeValue );
		setTextIndexNameAttribute( textIndexNameAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextStringValueAttribute</code> , See {@odf.attribute text:string-value}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextStringValueAttribute()
	{
		TextStringValueAttribute attr = (TextStringValueAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "string-value" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextStringValueAttribute</code> , See {@odf.attribute text:string-value}
	 *
	 * @param textStringValueValue   The type is <code>String</code>
	 */
	public void setTextStringValueAttribute( String textStringValueValue )
	{
		TextStringValueAttribute attr =  new TextStringValueAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textStringValueValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextOutlineLevelAttribute</code> , See {@odf.attribute text:outline-level}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextOutlineLevelAttribute()
	{
		TextOutlineLevelAttribute attr = (TextOutlineLevelAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "outline-level" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextOutlineLevelAttribute</code> , See {@odf.attribute text:outline-level}
	 *
	 * @param textOutlineLevelValue   The type is <code>String</code>
	 */
	public void setTextOutlineLevelAttribute( String textOutlineLevelValue )
	{
		TextOutlineLevelAttribute attr =  new TextOutlineLevelAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textOutlineLevelValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextIndexNameAttribute</code> , See {@odf.attribute text:index-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextIndexNameAttribute()
	{
		TextIndexNameAttribute attr = (TextIndexNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "index-name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextIndexNameAttribute</code> , See {@odf.attribute text:index-name}
	 *
	 * @param textIndexNameValue   The type is <code>String</code>
	 */
	public void setTextIndexNameAttribute( String textIndexNameValue )
	{
		TextIndexNameAttribute attr =  new TextIndexNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textIndexNameValue );
	}

}
