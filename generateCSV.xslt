<!--
Author: Liz Cooper-Williams, QBI
Filename: generateReport_labels.xslt
Input: xsd
Created: 2017-07-03
Purpose: Generate table rows for XNAT reports with annotation labels
-->
<xsl:stylesheet version="2.0" 
     xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
     xmlns:xs="http://www.w3.org/2001/XMLSchema" 
     xmlns:fn="http://www.w3.org/2005/xpath-functions" 
     exclude-result-prefixes="xs fn xsl">

<xsl:output method="text" encoding="utf-8" omit-xml-declaration="yes"/>
<xsl:variable name="expt">
	<xsl:value-of select="//xs:complexType[1]/@name"/> 
</xsl:variable>
<xsl:variable name="desc">
	<xsl:value-of select="//xs:complexType[1]/xs:annotation/xs:documentation"/> 
</xsl:variable>
<xsl:variable name='newline'><xsl:text>
</xsl:text></xsl:variable>
<xsl:template match="/">expt,expt_desc,field,description,type,min,max,<xsl:value-of select="$newline"/>
	<xsl:for-each select="//xs:complexType/xs:complexContent/xs:extension/xs:sequence/xs:element"><xsl:call-template name="field"/>
	</xsl:for-each>

</xsl:template>

<xsl:template name="field">
<!-- Exclude top 5 elements -->
<xsl:if test="position() > 5">
<xsl:value-of select="$expt"/>,<xsl:value-of select="$desc"/>,<xsl:value-of select='@name' />,<xsl:value-of select="xs:annotation/xs:documentation" />,<xsl:value-of select="xs:simpleType/xs:restriction/@base"/>,<xsl:value-of select="xs:simpleType/xs:restriction/xs:minInclusive/@value"/>,<xsl:value-of select="xs:simpleType/xs:restriction/xs:maxInclusive/@value"/>,<xsl:value-of select="$newline"/>
</xsl:if>
</xsl:template>


</xsl:stylesheet>
