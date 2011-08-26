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

package org.odftoolkit.odfdom.dom.element.style;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.dom.element.OdfStyleBase;
import org.odftoolkit.odfdom.dom.attribute.style.StyleFamilyAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element style:default-style}.
 *
 */
public class StyleDefaultStyleElement extends OdfStyleBase
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.STYLE, "default-style" );


	/**
	 * Create the instance of <code>StyleDefaultStyleElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public StyleDefaultStyleElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element style:default-style}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  StyleDefaultStyleElement}
	 *
     * @param styleFamilyAttributeValue  The mandatory attribute {@odf.attribute  style:family}"
     *
	 */
	public void init(String styleFamilyAttributeValue)
	{
		setStyleFamilyAttribute( styleFamilyAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleFamilyAttribute</code> , See {@odf.attribute style:family}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleFamilyAttribute()
	{
		StyleFamilyAttribute attr = (StyleFamilyAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "family" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleFamilyAttribute</code> , See {@odf.attribute style:family}
	 *
	 * @param styleFamilyValue   The type is <code>String</code>
	 */
	public void setStyleFamilyAttribute( String styleFamilyValue )
	{
		StyleFamilyAttribute attr =  new StyleFamilyAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleFamilyValue );
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
    
	/**
	 * Create child element {@odf.element style:paragraph-properties}.
	 *
	 * @return   return  the element {@odf.element style:paragraph-properties}
	 * DifferentQName 
	 */
	public StyleParagraphPropertiesElement newStyleParagraphPropertiesElement()
	{
		StyleParagraphPropertiesElement  styleParagraphProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleParagraphPropertiesElement.class);
		this.appendChild( styleParagraphProperties);
		return  styleParagraphProperties;
	}                   
               
	/**
	 * Create child element {@odf.element style:section-properties}.
	 *
	 * @return   return  the element {@odf.element style:section-properties}
	 * DifferentQName 
	 */
	public StyleSectionPropertiesElement newStyleSectionPropertiesElement()
	{
		StyleSectionPropertiesElement  styleSectionProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleSectionPropertiesElement.class);
		this.appendChild( styleSectionProperties);
		return  styleSectionProperties;
	}                   
               
	/**
	 * Create child element {@odf.element style:ruby-properties}.
	 *
	 * @return   return  the element {@odf.element style:ruby-properties}
	 * DifferentQName 
	 */
	public StyleRubyPropertiesElement newStyleRubyPropertiesElement()
	{
		StyleRubyPropertiesElement  styleRubyProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleRubyPropertiesElement.class);
		this.appendChild( styleRubyProperties);
		return  styleRubyProperties;
	}                   
               
	/**
	 * Create child element {@odf.element style:table-properties}.
	 *
	 * @return   return  the element {@odf.element style:table-properties}
	 * DifferentQName 
	 */
	public StyleTablePropertiesElement newStyleTablePropertiesElement()
	{
		StyleTablePropertiesElement  styleTableProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleTablePropertiesElement.class);
		this.appendChild( styleTableProperties);
		return  styleTableProperties;
	}                   
               
	/**
	 * Create child element {@odf.element style:table-column-properties}.
	 *
	 * @return   return  the element {@odf.element style:table-column-properties}
	 * DifferentQName 
	 */
	public StyleTableColumnPropertiesElement newStyleTableColumnPropertiesElement()
	{
		StyleTableColumnPropertiesElement  styleTableColumnProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleTableColumnPropertiesElement.class);
		this.appendChild( styleTableColumnProperties);
		return  styleTableColumnProperties;
	}                   
               
	/**
	 * Create child element {@odf.element style:table-row-properties}.
	 *
	 * @return   return  the element {@odf.element style:table-row-properties}
	 * DifferentQName 
	 */
	public StyleTableRowPropertiesElement newStyleTableRowPropertiesElement()
	{
		StyleTableRowPropertiesElement  styleTableRowProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleTableRowPropertiesElement.class);
		this.appendChild( styleTableRowProperties);
		return  styleTableRowProperties;
	}                   
               
	/**
	 * Create child element {@odf.element style:table-cell-properties}.
	 *
	 * @return   return  the element {@odf.element style:table-cell-properties}
	 * DifferentQName 
	 */
	public StyleTableCellPropertiesElement newStyleTableCellPropertiesElement()
	{
		StyleTableCellPropertiesElement  styleTableCellProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleTableCellPropertiesElement.class);
		this.appendChild( styleTableCellProperties);
		return  styleTableCellProperties;
	}                   
               
	/**
	 * Create child element {@odf.element style:graphic-properties}.
	 *
	 * @return   return  the element {@odf.element style:graphic-properties}
	 * DifferentQName 
	 */
	public StyleGraphicPropertiesElement newStyleGraphicPropertiesElement()
	{
		StyleGraphicPropertiesElement  styleGraphicProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleGraphicPropertiesElement.class);
		this.appendChild( styleGraphicProperties);
		return  styleGraphicProperties;
	}                   
               
	/**
	 * Create child element {@odf.element style:drawing-page-properties}.
	 *
	 * @return   return  the element {@odf.element style:drawing-page-properties}
	 * DifferentQName 
	 */
	public StyleDrawingPagePropertiesElement newStyleDrawingPagePropertiesElement()
	{
		StyleDrawingPagePropertiesElement  styleDrawingPageProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleDrawingPagePropertiesElement.class);
		this.appendChild( styleDrawingPageProperties);
		return  styleDrawingPageProperties;
	}                   
               
	/**
	 * Create child element {@odf.element style:chart-properties}.
	 *
     * @param chartSymbolTypeAttributeValue  the <code>String</code> value of <code>ChartSymbolTypeAttribute</code>, see {@odf.attribute  chart:symbol-type} at specification
	 * @return   return  the element {@odf.element style:chart-properties}
	 * DifferentQName 
	 */
    
	public StyleChartPropertiesElement newStyleChartPropertiesElement(String chartSymbolTypeAttributeValue)
	{
		StyleChartPropertiesElement  styleChartProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleChartPropertiesElement.class);
		styleChartProperties.setChartSymbolTypeAttribute( chartSymbolTypeAttributeValue );
		this.appendChild( styleChartProperties);
		return  styleChartProperties;      
	}
    
	/**
	 * Create child element {@odf.element style:chart-properties}.
	 *
     * @param chartSymbolNameAttributeValue  the <code>String</code> value of <code>ChartSymbolNameAttribute</code>, see {@odf.attribute  chart:symbol-name} at specification
	 * @param chartSymbolTypeAttributeValue  the <code>String</code> value of <code>ChartSymbolTypeAttribute</code>, see {@odf.attribute  chart:symbol-type} at specification
	 * @return   return  the element {@odf.element style:chart-properties}
	 * DifferentQName 
	 */
    
	public StyleChartPropertiesElement newStyleChartPropertiesElement(String chartSymbolNameAttributeValue, String chartSymbolTypeAttributeValue)
	{
		StyleChartPropertiesElement  styleChartProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleChartPropertiesElement.class);
		styleChartProperties.setChartSymbolNameAttribute( chartSymbolNameAttributeValue );
		styleChartProperties.setChartSymbolTypeAttribute( chartSymbolTypeAttributeValue );
		this.appendChild( styleChartProperties);
		return  styleChartProperties;      
	}
    
}
