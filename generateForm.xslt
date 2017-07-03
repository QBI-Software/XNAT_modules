<!--
Author: Liz Cooper-Williams, QBI
Filename: generateForm_labels.xslt
Input: xsd
Created: 2017-07-03
Purpose: Generate table rows for XNAT forms with annotation labels 
-->
<xsl:stylesheet version="2.0" 
     xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
     xmlns:xs="http://www.w3.org/2001/XMLSchema" 
     xmlns:fn="http://www.w3.org/2005/xpath-functions" 
     exclude-result-prefixes="xs fn xsl">

<!--output format close to xquery<xs:element name="CANTABMOT" type="opex:cantabMOT"/>-->
<xsl:output method="xml" encoding="utf-8" omit-xml-declaration="yes"/>
<xsl:variable name="nspace">
	<xsl:value-of select="/*/xs:element[1]/@type"/> 
</xsl:variable>


<xsl:template match="/">
	<xsl:for-each select="//xs:element">
	   <xsl:call-template name="field"/>
	</xsl:for-each>

</xsl:template>

<xsl:template name="field">
	<tr>
		<td><xsl:value-of select="@name" /></td>
		<td>#xdatNumberBox("<xsl:copy-of select='$nspace' />/<xsl:value-of select='@name' />" $item "" $vr)</td>
    </tr>

</xsl:template>


</xsl:stylesheet>
