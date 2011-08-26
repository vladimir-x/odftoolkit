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
import org.odftoolkit.odfdom.dom.attribute.draw.DrawHandleMirrorVerticalAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawHandleMirrorHorizontalAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawHandleSwitchedAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawHandlePositionAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawHandleRangeXMinimumAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawHandleRangeXMaximumAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawHandleRangeYMinimumAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawHandleRangeYMaximumAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawHandlePolarAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawHandleRadiusRangeMinimumAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawHandleRadiusRangeMaximumAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element draw:handle}.
 *
 */
public class DrawHandleElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.DRAW, "handle" );


	/**
	 * Create the instance of <code>DrawHandleElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DrawHandleElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element draw:handle}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  DrawHandleElement}
	 *
     * @param drawHandlePositionAttributeValue  The mandatory attribute {@odf.attribute  draw:handle-position}"
     *
	 */
	public void init(String drawHandlePositionAttributeValue)
	{
		setDrawHandlePositionAttribute( drawHandlePositionAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawHandleMirrorVerticalAttribute</code> , See {@odf.attribute draw:handle-mirror-vertical}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getDrawHandleMirrorVerticalAttribute()
	{
		DrawHandleMirrorVerticalAttribute attr = (DrawHandleMirrorVerticalAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "handle-mirror-vertical" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( DrawHandleMirrorVerticalAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawHandleMirrorVerticalAttribute</code> , See {@odf.attribute draw:handle-mirror-vertical}
	 *
	 * @param drawHandleMirrorVerticalValue   The type is <code>Boolean</code>
	 */
	public void setDrawHandleMirrorVerticalAttribute( Boolean drawHandleMirrorVerticalValue )
	{
		DrawHandleMirrorVerticalAttribute attr =  new DrawHandleMirrorVerticalAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( drawHandleMirrorVerticalValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawHandleMirrorHorizontalAttribute</code> , See {@odf.attribute draw:handle-mirror-horizontal}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getDrawHandleMirrorHorizontalAttribute()
	{
		DrawHandleMirrorHorizontalAttribute attr = (DrawHandleMirrorHorizontalAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "handle-mirror-horizontal" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( DrawHandleMirrorHorizontalAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawHandleMirrorHorizontalAttribute</code> , See {@odf.attribute draw:handle-mirror-horizontal}
	 *
	 * @param drawHandleMirrorHorizontalValue   The type is <code>Boolean</code>
	 */
	public void setDrawHandleMirrorHorizontalAttribute( Boolean drawHandleMirrorHorizontalValue )
	{
		DrawHandleMirrorHorizontalAttribute attr =  new DrawHandleMirrorHorizontalAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( drawHandleMirrorHorizontalValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawHandleSwitchedAttribute</code> , See {@odf.attribute draw:handle-switched}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getDrawHandleSwitchedAttribute()
	{
		DrawHandleSwitchedAttribute attr = (DrawHandleSwitchedAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "handle-switched" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( DrawHandleSwitchedAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawHandleSwitchedAttribute</code> , See {@odf.attribute draw:handle-switched}
	 *
	 * @param drawHandleSwitchedValue   The type is <code>Boolean</code>
	 */
	public void setDrawHandleSwitchedAttribute( Boolean drawHandleSwitchedValue )
	{
		DrawHandleSwitchedAttribute attr =  new DrawHandleSwitchedAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( drawHandleSwitchedValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawHandlePositionAttribute</code> , See {@odf.attribute draw:handle-position}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawHandlePositionAttribute()
	{
		DrawHandlePositionAttribute attr = (DrawHandlePositionAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "handle-position" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawHandlePositionAttribute</code> , See {@odf.attribute draw:handle-position}
	 *
	 * @param drawHandlePositionValue   The type is <code>String</code>
	 */
	public void setDrawHandlePositionAttribute( String drawHandlePositionValue )
	{
		DrawHandlePositionAttribute attr =  new DrawHandlePositionAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawHandlePositionValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawHandleRangeXMinimumAttribute</code> , See {@odf.attribute draw:handle-range-x-minimum}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawHandleRangeXMinimumAttribute()
	{
		DrawHandleRangeXMinimumAttribute attr = (DrawHandleRangeXMinimumAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "handle-range-x-minimum" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawHandleRangeXMinimumAttribute</code> , See {@odf.attribute draw:handle-range-x-minimum}
	 *
	 * @param drawHandleRangeXMinimumValue   The type is <code>String</code>
	 */
	public void setDrawHandleRangeXMinimumAttribute( String drawHandleRangeXMinimumValue )
	{
		DrawHandleRangeXMinimumAttribute attr =  new DrawHandleRangeXMinimumAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawHandleRangeXMinimumValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawHandleRangeXMaximumAttribute</code> , See {@odf.attribute draw:handle-range-x-maximum}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawHandleRangeXMaximumAttribute()
	{
		DrawHandleRangeXMaximumAttribute attr = (DrawHandleRangeXMaximumAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "handle-range-x-maximum" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawHandleRangeXMaximumAttribute</code> , See {@odf.attribute draw:handle-range-x-maximum}
	 *
	 * @param drawHandleRangeXMaximumValue   The type is <code>String</code>
	 */
	public void setDrawHandleRangeXMaximumAttribute( String drawHandleRangeXMaximumValue )
	{
		DrawHandleRangeXMaximumAttribute attr =  new DrawHandleRangeXMaximumAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawHandleRangeXMaximumValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawHandleRangeYMinimumAttribute</code> , See {@odf.attribute draw:handle-range-y-minimum}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawHandleRangeYMinimumAttribute()
	{
		DrawHandleRangeYMinimumAttribute attr = (DrawHandleRangeYMinimumAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "handle-range-y-minimum" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawHandleRangeYMinimumAttribute</code> , See {@odf.attribute draw:handle-range-y-minimum}
	 *
	 * @param drawHandleRangeYMinimumValue   The type is <code>String</code>
	 */
	public void setDrawHandleRangeYMinimumAttribute( String drawHandleRangeYMinimumValue )
	{
		DrawHandleRangeYMinimumAttribute attr =  new DrawHandleRangeYMinimumAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawHandleRangeYMinimumValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawHandleRangeYMaximumAttribute</code> , See {@odf.attribute draw:handle-range-y-maximum}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawHandleRangeYMaximumAttribute()
	{
		DrawHandleRangeYMaximumAttribute attr = (DrawHandleRangeYMaximumAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "handle-range-y-maximum" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawHandleRangeYMaximumAttribute</code> , See {@odf.attribute draw:handle-range-y-maximum}
	 *
	 * @param drawHandleRangeYMaximumValue   The type is <code>String</code>
	 */
	public void setDrawHandleRangeYMaximumAttribute( String drawHandleRangeYMaximumValue )
	{
		DrawHandleRangeYMaximumAttribute attr =  new DrawHandleRangeYMaximumAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawHandleRangeYMaximumValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawHandlePolarAttribute</code> , See {@odf.attribute draw:handle-polar}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawHandlePolarAttribute()
	{
		DrawHandlePolarAttribute attr = (DrawHandlePolarAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "handle-polar" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawHandlePolarAttribute</code> , See {@odf.attribute draw:handle-polar}
	 *
	 * @param drawHandlePolarValue   The type is <code>String</code>
	 */
	public void setDrawHandlePolarAttribute( String drawHandlePolarValue )
	{
		DrawHandlePolarAttribute attr =  new DrawHandlePolarAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawHandlePolarValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawHandleRadiusRangeMinimumAttribute</code> , See {@odf.attribute draw:handle-radius-range-minimum}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawHandleRadiusRangeMinimumAttribute()
	{
		DrawHandleRadiusRangeMinimumAttribute attr = (DrawHandleRadiusRangeMinimumAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "handle-radius-range-minimum" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawHandleRadiusRangeMinimumAttribute</code> , See {@odf.attribute draw:handle-radius-range-minimum}
	 *
	 * @param drawHandleRadiusRangeMinimumValue   The type is <code>String</code>
	 */
	public void setDrawHandleRadiusRangeMinimumAttribute( String drawHandleRadiusRangeMinimumValue )
	{
		DrawHandleRadiusRangeMinimumAttribute attr =  new DrawHandleRadiusRangeMinimumAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawHandleRadiusRangeMinimumValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawHandleRadiusRangeMaximumAttribute</code> , See {@odf.attribute draw:handle-radius-range-maximum}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawHandleRadiusRangeMaximumAttribute()
	{
		DrawHandleRadiusRangeMaximumAttribute attr = (DrawHandleRadiusRangeMaximumAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "handle-radius-range-maximum" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawHandleRadiusRangeMaximumAttribute</code> , See {@odf.attribute draw:handle-radius-range-maximum}
	 *
	 * @param drawHandleRadiusRangeMaximumValue   The type is <code>String</code>
	 */
	public void setDrawHandleRadiusRangeMaximumAttribute( String drawHandleRadiusRangeMaximumValue )
	{
		DrawHandleRadiusRangeMaximumAttribute attr =  new DrawHandleRadiusRangeMaximumAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawHandleRadiusRangeMaximumValue );
	}

}
