/*
 * GENERATED FILE
 * Created on Tue Mar 14 16:56:31 AEST 2017
 *
 */
package org.nrg.xdat.bean;
import org.apache.log4j.Logger;
import org.nrg.xdat.bean.base.BaseElement;

import java.util.*;

/**
 * @author XDAT
 *
 *//*
 ******************************** 
 * DO NOT MODIFY THIS FILE 
 *
 ********************************/
@SuppressWarnings({"unchecked","rawtypes"})
public class Irc5BlooddataBean extends XnatSubjectassessordataBean implements java.io.Serializable, org.nrg.xdat.model.Irc5BlooddataI {
	public static final Logger logger = Logger.getLogger(Irc5BlooddataBean.class);
	public static final String SCHEMA_ELEMENT_NAME="irc5:bloodData";

	public String getSchemaElementName(){
		return "bloodData";
	}

	public String getFullSchemaElementName(){
		return "irc5:bloodData";
	}

	//FIELD

	private Date _DateAnalysed=null;

	/**
	 * @return Returns the date_analysed.
	 */
	public Date getDateAnalysed(){
		return _DateAnalysed;
	}

	/**
	 * Sets the value for date_analysed.
	 * @param v Value to Set.
	 */
	public void setDateAnalysed(Date v){
		_DateAnalysed=v;
	}

	/**
	 * Sets the value for date_analysed.
	 * @param v Value to Set.
	 */
	public void setDateAnalysed(Object v){
		throw new IllegalArgumentException();
	}

	/**
	 * Sets the value for date_analysed.
	 * @param v Value to Set.
	 */
	public void setDateAnalysed(String v)  {
		_DateAnalysed=formatDate(v);
	}

	//FIELD

	private String _Summary=null;

	/**
	 * @return Returns the summary.
	 */
	public String getSummary(){
		return _Summary;
	}

	/**
	 * Sets the value for summary.
	 * @param v Value to Set.
	 */
	public void setSummary(String v){
		_Summary=v;
	}

	//FIELD

	private String _Comments=null;

	/**
	 * @return Returns the comments.
	 */
	public String getComments(){
		return _Comments;
	}

	/**
	 * Sets the value for comments.
	 * @param v Value to Set.
	 */
	public void setComments(String v){
		_Comments=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("date_analysed")){
			setDateAnalysed(v);
		}else if (xmlPath.equals("summary")){
			setSummary(v);
		}else if (xmlPath.equals("comments")){
			setComments(v);
		}
		else{
			super.setDataField(xmlPath,v);
		}
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setReferenceField(String xmlPath,BaseElement v) throws BaseElement.UnknownFieldException{
			super.setReferenceField(xmlPath,v);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public Object getDataFieldValue(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("date_analysed")){
			return getDateAnalysed();
		}else if (xmlPath.equals("summary")){
			return getSummary();
		}else if (xmlPath.equals("comments")){
			return getComments();
		}
		else{
			return super.getDataFieldValue(xmlPath);
		}
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public Object getReferenceField(String xmlPath) throws BaseElement.UnknownFieldException{
			return super.getReferenceField(xmlPath);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public String getReferenceFieldName(String xmlPath) throws BaseElement.UnknownFieldException{
			return super.getReferenceFieldName(xmlPath);
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("date_analysed")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("summary")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("comments")){
			return BaseElement.field_LONG_DATA;
		}
		else{
			return super.getFieldType(xmlPath);
		}
	}

	/**
	 * Returns arraylist of all fields
	 */
	public ArrayList getAllFields() {
		ArrayList all_fields=new ArrayList();
		all_fields.add("date_analysed");
		all_fields.add("summary");
		all_fields.add("comments");
		all_fields.addAll(super.getAllFields());
		return all_fields;
	}


	public String toString(){
		java.io.StringWriter sw = new java.io.StringWriter();
		try{this.toXML(sw,true);}catch(java.io.IOException e){}
		return sw.toString();
	}


	public void toXML(java.io.Writer writer,boolean prettyPrint) throws java.io.IOException{
		writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		writer.write("\n<irc5:BLOOD");
		TreeMap map = new TreeMap();
		map.putAll(getXMLAtts());
		map.put("xmlns:arc","http://nrg.wustl.edu/arc");
		map.put("xmlns:cat","http://nrg.wustl.edu/catalog");
		map.put("xmlns:irc5","http://qbi.uq.edu.au/irc5");
		map.put("xmlns:pipe","http://nrg.wustl.edu/pipe");
		map.put("xmlns:prov","http://www.nbirn.net/prov");
		map.put("xmlns:scr","http://nrg.wustl.edu/scr");
		map.put("xmlns:val","http://nrg.wustl.edu/val");
		map.put("xmlns:wrk","http://nrg.wustl.edu/workflow");
		map.put("xmlns:xdat","http://nrg.wustl.edu/security");
		map.put("xmlns:xnat","http://nrg.wustl.edu/xnat");
		map.put("xmlns:xnat_a","http://nrg.wustl.edu/xnat_assessments");
		map.put("xmlns:xsi","http://www.w3.org/2001/XMLSchema-instance");
		java.util.Iterator iter =map.keySet().iterator();
		while(iter.hasNext()){
			String key = (String)iter.next();
			writer.write(" " + key + "=\"" + map.get(key) + "\"");
		}
		int header = 0;
		if (prettyPrint)header++;
		writer.write(">");
		addXMLBody(writer,header);
		if (prettyPrint)header--;
		writer.write("\n</irc5:BLOOD>");
	}


	protected void addXMLAtts(java.io.Writer writer) throws java.io.IOException{
		TreeMap map = this.getXMLAtts();
		java.util.Iterator iter =map.keySet().iterator();
		while(iter.hasNext()){
			String key = (String)iter.next();
			writer.write(" " + key + "=\"" + map.get(key) + "\"");
		}
	}


	protected TreeMap getXMLAtts() {
		TreeMap map = super.getXMLAtts();
		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		//REFERENCE FROM bloodData -> subjectAssessorData
		if (_DateAnalysed!=null){
			writer.write("\n" + createHeader(header++) + "<irc5:date_analysed");
			writer.write(">");
			writer.write(ValueParser(_DateAnalysed,"date"));
			writer.write("</irc5:date_analysed>");
			header--;
		}
		if (_Summary!=null){
			writer.write("\n" + createHeader(header++) + "<irc5:summary");
			writer.write(">");
			writer.write(ValueParser(_Summary,"string"));
			writer.write("</irc5:summary>");
			header--;
		}
		if (_Comments!=null){
			writer.write("\n" + createHeader(header++) + "<irc5:comments");
			writer.write(">");
			writer.write(ValueParser(_Comments,"string"));
			writer.write("</irc5:comments>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_DateAnalysed!=null) return true;
		if (_Summary!=null) return true;
		if (_Comments!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
