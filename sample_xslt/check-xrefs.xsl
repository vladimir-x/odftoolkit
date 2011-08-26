<?xml version="1.0" encoding="UTF-8" ?><!--  DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER  Copyright 2008 Sun Microsystems, Inc. All rights reserved.  Use is subject to license terms.  Licensed under the Apache License, Version 2.0 (the "License"); you may not  use this file except in compliance with the License. You may obtain a copy  of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also  obtain a copy of the License at http://odftoolkit.org/docs/license.txt  Unless required by applicable law or agreed to in writing, software  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the License for the specific language governing permissions and  limitations under the License.--><xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"                                 xmlns:rng="http://relaxng.org/ns/structure/1.0"                                xmlns:office="urn:oasis:names:tc:opendocument:xmlns:office:1.0"                xmlns:text="urn:oasis:names:tc:opendocument:xmlns:text:1.0"                exclude-result-prefixes="xsl"                version="1.0">        <xsl:output method="text"/>        <xsl:key name="ref" match="text:reference-mark|text:reference-mark-start" use="@text:name"/>    <xsl:template match="office:document-content">        <xsl:apply-templates select="//text:reference-ref"/>    </xsl:template>    <xsl:template match="text:reference-ref">        <xsl:variable name="ref-name" select="@text:ref-name"/>        <xsl:variable name="ref" select="key('ref',$ref-name)"/>        <xsl:if test="not($ref)">            <xsl:text>Unresolvable reference </xsl:text><xsl:value-of select="$ref-name"/><xsl:text> in </xsl:text>            <xsl:call-template name="print-heading"/>        </xsl:if>        <xsl:if test="ancestor::text:p[not(@text:style-name='Attribute_20_List')] and starts-with($ref-name,'attribute') and key('ref', concat('property',substring($ref-name,10)))">            <xsl:text>Possibly ambiguous reference </xsl:text><xsl:value-of select="$ref-name"/><xsl:text> in </xsl:text>            <xsl:call-template name="print-heading"/>        </xsl:if>    </xsl:template>    <!-- default: copy everything. -->    <!-- xsl:template match="@*|node()"/ -->    <xsl:template name="print-heading">        <xsl:apply-templates select="preceding::text:h[1]" mode="print-heading"/>        <xsl:text></xsl:text>    </xsl:template>    <xsl:template match="text:h" mode="print-heading">        <xsl:variable name="level" select="@text:outline-level"/>        <xsl:if test="$level > 1">            <xsl:apply-templates select="preceding::text:h[@text:outline-level=($level - 1)][1]" mode="print-heading"/>            <xsl:text>/</xsl:text>        </xsl:if>        <xsl:value-of select="."/><xsl:text>(</xsl:text><xsl:value-of select="$level"/><xsl:text>)</xsl:text>    </xsl:template>    </xsl:stylesheet>