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

package org.odftoolkit.odfdom.dom.element.office;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;

import org.odftoolkit.odfdom.dom.element.meta.MetaGeneratorElement;
import org.odftoolkit.odfdom.dom.element.dc.DcTitleElement;
import org.odftoolkit.odfdom.dom.element.dc.DcDescriptionElement;
import org.odftoolkit.odfdom.dom.element.dc.DcSubjectElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaKeywordElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaInitialCreatorElement;
import org.odftoolkit.odfdom.dom.element.dc.DcCreatorElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaPrintedByElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaCreationDateElement;
import org.odftoolkit.odfdom.dom.element.dc.DcDateElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaPrintDateElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaTemplateElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaAutoReloadElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaHyperlinkBehaviourElement;
import org.odftoolkit.odfdom.dom.element.dc.DcLanguageElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaEditingCyclesElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaEditingDurationElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaDocumentStatisticElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaUserDefinedElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element office:meta}.
 *
 */
public class OfficeMetaElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.OFFICE, "meta" );


	/**
	 * Create the instance of <code>OfficeMetaElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public OfficeMetaElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element office:meta}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}


	/**
	 * Create child element {@odf.element meta:generator}.
	 *
	 * @return   return  the element {@odf.element meta:generator}
	 * DifferentQName 
	 */
	public MetaGeneratorElement newMetaGeneratorElement()
	{
		MetaGeneratorElement  metaGenerator = ((OdfFileDom)this.ownerDocument).newOdfElement(MetaGeneratorElement.class);
		this.appendChild( metaGenerator);
		return  metaGenerator;
	}                   
               
	/**
	 * Create child element {@odf.element dc:title}.
	 *
	 * @return   return  the element {@odf.element dc:title}
	 * DifferentQName 
	 */
	public DcTitleElement newDcTitleElement()
	{
		DcTitleElement  dcTitle = ((OdfFileDom)this.ownerDocument).newOdfElement(DcTitleElement.class);
		this.appendChild( dcTitle);
		return  dcTitle;
	}                   
               
	/**
	 * Create child element {@odf.element dc:description}.
	 *
	 * @return   return  the element {@odf.element dc:description}
	 * DifferentQName 
	 */
	public DcDescriptionElement newDcDescriptionElement()
	{
		DcDescriptionElement  dcDescription = ((OdfFileDom)this.ownerDocument).newOdfElement(DcDescriptionElement.class);
		this.appendChild( dcDescription);
		return  dcDescription;
	}                   
               
	/**
	 * Create child element {@odf.element dc:subject}.
	 *
	 * @return   return  the element {@odf.element dc:subject}
	 * DifferentQName 
	 */
	public DcSubjectElement newDcSubjectElement()
	{
		DcSubjectElement  dcSubject = ((OdfFileDom)this.ownerDocument).newOdfElement(DcSubjectElement.class);
		this.appendChild( dcSubject);
		return  dcSubject;
	}                   
               
	/**
	 * Create child element {@odf.element meta:keyword}.
	 *
	 * @return   return  the element {@odf.element meta:keyword}
	 * DifferentQName 
	 */
	public MetaKeywordElement newMetaKeywordElement()
	{
		MetaKeywordElement  metaKeyword = ((OdfFileDom)this.ownerDocument).newOdfElement(MetaKeywordElement.class);
		this.appendChild( metaKeyword);
		return  metaKeyword;
	}                   
               
	/**
	 * Create child element {@odf.element meta:initial-creator}.
	 *
	 * @return   return  the element {@odf.element meta:initial-creator}
	 * DifferentQName 
	 */
	public MetaInitialCreatorElement newMetaInitialCreatorElement()
	{
		MetaInitialCreatorElement  metaInitialCreator = ((OdfFileDom)this.ownerDocument).newOdfElement(MetaInitialCreatorElement.class);
		this.appendChild( metaInitialCreator);
		return  metaInitialCreator;
	}                   
               
	/**
	 * Create child element {@odf.element dc:creator}.
	 *
	 * @return   return  the element {@odf.element dc:creator}
	 * DifferentQName 
	 */
	public DcCreatorElement newDcCreatorElement()
	{
		DcCreatorElement  dcCreator = ((OdfFileDom)this.ownerDocument).newOdfElement(DcCreatorElement.class);
		this.appendChild( dcCreator);
		return  dcCreator;
	}                   
               
	/**
	 * Create child element {@odf.element meta:printed-by}.
	 *
	 * @return   return  the element {@odf.element meta:printed-by}
	 * DifferentQName 
	 */
	public MetaPrintedByElement newMetaPrintedByElement()
	{
		MetaPrintedByElement  metaPrintedBy = ((OdfFileDom)this.ownerDocument).newOdfElement(MetaPrintedByElement.class);
		this.appendChild( metaPrintedBy);
		return  metaPrintedBy;
	}                   
               
	/**
	 * Create child element {@odf.element meta:creation-date}.
	 *
	 * @return   return  the element {@odf.element meta:creation-date}
	 * DifferentQName 
	 */
	public MetaCreationDateElement newMetaCreationDateElement()
	{
		MetaCreationDateElement  metaCreationDate = ((OdfFileDom)this.ownerDocument).newOdfElement(MetaCreationDateElement.class);
		this.appendChild( metaCreationDate);
		return  metaCreationDate;
	}                   
               
	/**
	 * Create child element {@odf.element dc:date}.
	 *
	 * @return   return  the element {@odf.element dc:date}
	 * DifferentQName 
	 */
	public DcDateElement newDcDateElement()
	{
		DcDateElement  dcDate = ((OdfFileDom)this.ownerDocument).newOdfElement(DcDateElement.class);
		this.appendChild( dcDate);
		return  dcDate;
	}                   
               
	/**
	 * Create child element {@odf.element meta:print-date}.
	 *
	 * @return   return  the element {@odf.element meta:print-date}
	 * DifferentQName 
	 */
	public MetaPrintDateElement newMetaPrintDateElement()
	{
		MetaPrintDateElement  metaPrintDate = ((OdfFileDom)this.ownerDocument).newOdfElement(MetaPrintDateElement.class);
		this.appendChild( metaPrintDate);
		return  metaPrintDate;
	}                   
               
	/**
	 * Create child element {@odf.element meta:template}.
	 *
     * @param xlinkHrefAttributeValue  the <code>String</code> value of <code>XlinkHrefAttribute</code>, see {@odf.attribute  xlink:href} at specification
	 * @param xlinkTypeAttributeValue  the <code>String</code> value of <code>XlinkTypeAttribute</code>, see {@odf.attribute  xlink:type} at specification
	 * @return   return  the element {@odf.element meta:template}
	 * DifferentQName 
	 */
    
	public MetaTemplateElement newMetaTemplateElement(String xlinkHrefAttributeValue, String xlinkTypeAttributeValue)
	{
		MetaTemplateElement  metaTemplate = ((OdfFileDom)this.ownerDocument).newOdfElement(MetaTemplateElement.class);
		metaTemplate.setXlinkHrefAttribute( xlinkHrefAttributeValue );
		metaTemplate.setXlinkTypeAttribute( xlinkTypeAttributeValue );
		this.appendChild( metaTemplate);
		return  metaTemplate;      
	}
    
	/**
	 * Create child element {@odf.element meta:auto-reload}.
	 *
	 * @return   return  the element {@odf.element meta:auto-reload}
	 * DifferentQName 
	 */
	public MetaAutoReloadElement newMetaAutoReloadElement()
	{
		MetaAutoReloadElement  metaAutoReload = ((OdfFileDom)this.ownerDocument).newOdfElement(MetaAutoReloadElement.class);
		this.appendChild( metaAutoReload);
		return  metaAutoReload;
	}                   
               
	/**
	 * Create child element {@odf.element meta:hyperlink-behaviour}.
	 *
	 * @return   return  the element {@odf.element meta:hyperlink-behaviour}
	 * DifferentQName 
	 */
	public MetaHyperlinkBehaviourElement newMetaHyperlinkBehaviourElement()
	{
		MetaHyperlinkBehaviourElement  metaHyperlinkBehaviour = ((OdfFileDom)this.ownerDocument).newOdfElement(MetaHyperlinkBehaviourElement.class);
		this.appendChild( metaHyperlinkBehaviour);
		return  metaHyperlinkBehaviour;
	}                   
               
	/**
	 * Create child element {@odf.element dc:language}.
	 *
	 * @return   return  the element {@odf.element dc:language}
	 * DifferentQName 
	 */
	public DcLanguageElement newDcLanguageElement()
	{
		DcLanguageElement  dcLanguage = ((OdfFileDom)this.ownerDocument).newOdfElement(DcLanguageElement.class);
		this.appendChild( dcLanguage);
		return  dcLanguage;
	}                   
               
	/**
	 * Create child element {@odf.element meta:editing-cycles}.
	 *
	 * @return   return  the element {@odf.element meta:editing-cycles}
	 * DifferentQName 
	 */
	public MetaEditingCyclesElement newMetaEditingCyclesElement()
	{
		MetaEditingCyclesElement  metaEditingCycles = ((OdfFileDom)this.ownerDocument).newOdfElement(MetaEditingCyclesElement.class);
		this.appendChild( metaEditingCycles);
		return  metaEditingCycles;
	}                   
               
	/**
	 * Create child element {@odf.element meta:editing-duration}.
	 *
	 * @return   return  the element {@odf.element meta:editing-duration}
	 * DifferentQName 
	 */
	public MetaEditingDurationElement newMetaEditingDurationElement()
	{
		MetaEditingDurationElement  metaEditingDuration = ((OdfFileDom)this.ownerDocument).newOdfElement(MetaEditingDurationElement.class);
		this.appendChild( metaEditingDuration);
		return  metaEditingDuration;
	}                   
               
	/**
	 * Create child element {@odf.element meta:document-statistic}.
	 *
	 * @return   return  the element {@odf.element meta:document-statistic}
	 * DifferentQName 
	 */
	public MetaDocumentStatisticElement newMetaDocumentStatisticElement()
	{
		MetaDocumentStatisticElement  metaDocumentStatistic = ((OdfFileDom)this.ownerDocument).newOdfElement(MetaDocumentStatisticElement.class);
		this.appendChild( metaDocumentStatistic);
		return  metaDocumentStatistic;
	}                   
               
	/**
	 * Create child element {@odf.element meta:user-defined}.
	 *
     * @param metaNameAttributeValue  the <code>String</code> value of <code>MetaNameAttribute</code>, see {@odf.attribute  meta:name} at specification
	 * @param metaValueTypeAttributeValue  the <code>String</code> value of <code>MetaValueTypeAttribute</code>, see {@odf.attribute  meta:value-type} at specification
	 * @return   return  the element {@odf.element meta:user-defined}
	 * DifferentQName 
	 */
    
	public MetaUserDefinedElement newMetaUserDefinedElement(String metaNameAttributeValue, String metaValueTypeAttributeValue)
	{
		MetaUserDefinedElement  metaUserDefined = ((OdfFileDom)this.ownerDocument).newOdfElement(MetaUserDefinedElement.class);
		metaUserDefined.setMetaNameAttribute( metaNameAttributeValue );
		metaUserDefined.setMetaValueTypeAttribute( metaValueTypeAttributeValue );
		this.appendChild( metaUserDefined);
		return  metaUserDefined;      
	}
    
}
