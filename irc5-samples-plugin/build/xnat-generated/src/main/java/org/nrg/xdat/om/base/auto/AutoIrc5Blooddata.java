/*
 * GENERATED FILE
 * Created on Tue Mar 14 16:56:31 AEST 2017
 *
 */
package org.nrg.xdat.om.base.auto;
import org.apache.log4j.Logger;
import org.nrg.xft.*;
import org.nrg.xft.security.UserI;
import org.nrg.xdat.om.*;
import org.nrg.xft.utils.ResourceFile;
import org.nrg.xft.exception.*;

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
public abstract class AutoIrc5Blooddata extends XnatSubjectassessordata implements org.nrg.xdat.model.Irc5BlooddataI {
	public static final Logger logger = Logger.getLogger(AutoIrc5Blooddata.class);
	public static final String SCHEMA_ELEMENT_NAME="irc5:bloodData";

	public AutoIrc5Blooddata(ItemI item)
	{
		super(item);
	}

	public AutoIrc5Blooddata(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use AutoIrc5Blooddata(UserI user)
	 **/
	public AutoIrc5Blooddata(){}

	public AutoIrc5Blooddata(Hashtable properties,UserI user)
	{
		super(properties,user);
	}

	public String getSchemaElementName(){
		return "irc5:bloodData";
	}
	 private org.nrg.xdat.om.XnatSubjectassessordata _Subjectassessordata =null;

	/**
	 * subjectAssessorData
	 * @return org.nrg.xdat.om.XnatSubjectassessordata
	 */
	public org.nrg.xdat.om.XnatSubjectassessordata getSubjectassessordata() {
		try{
			if (_Subjectassessordata==null){
				_Subjectassessordata=((XnatSubjectassessordata)org.nrg.xdat.base.BaseElement.GetGeneratedItem((XFTItem)getProperty("subjectAssessorData")));
				return _Subjectassessordata;
			}else {
				return _Subjectassessordata;
			}
		} catch (Exception e1) {return null;}
	}

	/**
	 * Sets the value for subjectAssessorData.
	 * @param v Value to Set.
	 */
	public void setSubjectassessordata(ItemI v) throws Exception{
		_Subjectassessordata =null;
		try{
			if (v instanceof XFTItem)
			{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/subjectAssessorData",v,true);
			}else{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/subjectAssessorData",v.getItem(),true);
			}
		} catch (Exception e1) {logger.error(e1);throw e1;}
	}

	/**
	 * subjectAssessorData
	 * set org.nrg.xdat.model.XnatSubjectassessordataI
	 */
	public <A extends org.nrg.xdat.model.XnatSubjectassessordataI> void setSubjectassessordata(A item) throws Exception{
	setSubjectassessordata((ItemI)item);
	}

	/**
	 * Removes the subjectAssessorData.
	 * */
	public void removeSubjectassessordata() {
		_Subjectassessordata =null;
		try{
			getItem().removeChild(SCHEMA_ELEMENT_NAME + "/subjectAssessorData",0);
		} catch (FieldNotFoundException e1) {logger.error(e1);}
		catch (java.lang.IndexOutOfBoundsException e1) {logger.error(e1);}
	}

	//FIELD

	private Object _DateAnalysed=null;

	/**
	 * @return Returns the date_analysed.
	 */
	public Object getDateAnalysed(){
		try{
			if (_DateAnalysed==null){
				_DateAnalysed=getProperty("date_analysed");
				return _DateAnalysed;
			}else {
				return _DateAnalysed;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for date_analysed.
	 * @param v Value to Set.
	 */
	public void setDateAnalysed(Object v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/date_analysed",v);
		_DateAnalysed=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Summary=null;

	/**
	 * @return Returns the summary.
	 */
	public String getSummary(){
		try{
			if (_Summary==null){
				_Summary=getStringProperty("summary");
				return _Summary;
			}else {
				return _Summary;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for summary.
	 * @param v Value to Set.
	 */
	public void setSummary(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/summary",v);
		_Summary=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Comments=null;

	/**
	 * @return Returns the comments.
	 */
	public String getComments(){
		try{
			if (_Comments==null){
				_Comments=getStringProperty("comments");
				return _Comments;
			}else {
				return _Comments;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for comments.
	 * @param v Value to Set.
	 */
	public void setComments(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/comments",v);
		_Comments=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	public static ArrayList<org.nrg.xdat.om.Irc5Blooddata> getAllIrc5Blooddatas(org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.Irc5Blooddata> al = new ArrayList<org.nrg.xdat.om.Irc5Blooddata>();

		try{
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetAllItems(SCHEMA_ELEMENT_NAME,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.Irc5Blooddata> getIrc5BlooddatasByField(String xmlPath, Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.Irc5Blooddata> al = new ArrayList<org.nrg.xdat.om.Irc5Blooddata>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(xmlPath,value,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.Irc5Blooddata> getIrc5BlooddatasByField(org.nrg.xft.search.CriteriaCollection criteria, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.Irc5Blooddata> al = new ArrayList<org.nrg.xdat.om.Irc5Blooddata>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(criteria,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static Irc5Blooddata getIrc5BlooddatasById(Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems("irc5:bloodData/id",value,user,preLoad);
			ItemI match = items.getFirst();
			if (match!=null)
				return (Irc5Blooddata) org.nrg.xdat.base.BaseElement.GetGeneratedItem(match);
			else
				 return null;
		} catch (Exception e) {
			logger.error("",e);
		}

		return null;
	}

	public static ArrayList wrapItems(ArrayList items)
	{
		ArrayList al = new ArrayList();
		al = org.nrg.xdat.base.BaseElement.WrapItems(items);
		al.trimToSize();
		return al;
	}

	public static ArrayList wrapItems(org.nrg.xft.collections.ItemCollection items)
	{
		return wrapItems(items.getItems());
	}

	public org.w3c.dom.Document toJoinedXML() throws Exception
	{
		ArrayList al = new ArrayList();
		al.add(this.getItem());
		al.add(org.nrg.xft.search.ItemSearch.GetItem("xnat:subjectData.ID",this.getItem().getProperty("xnat:mrSessionData.subject_ID"),getItem().getUser(),false));
		al.trimToSize();
		return org.nrg.xft.schema.Wrappers.XMLWrapper.XMLWriter.ItemListToDOM(al);
	}
	public ArrayList<ResourceFile> getFileResources(String rootPath, boolean preventLoop){
ArrayList<ResourceFile> _return = new ArrayList<ResourceFile>();
	 boolean localLoop = preventLoop;
	        localLoop = preventLoop;
	
	        //subjectAssessorData
	        XnatSubjectassessordata childSubjectassessordata = (XnatSubjectassessordata)this.getSubjectassessordata();
	            if (childSubjectassessordata!=null){
	              for(ResourceFile rf: ((XnatSubjectassessordata)childSubjectassessordata).getFileResources(rootPath, localLoop)) {
	                 rf.setXpath("subjectAssessorData[" + ((XnatSubjectassessordata)childSubjectassessordata).getItem().getPKString() + "]/" + rf.getXpath());
	                 rf.setXdatPath("subjectAssessorData/" + ((XnatSubjectassessordata)childSubjectassessordata).getItem().getPKString() + "/" + rf.getXpath());
	                 _return.add(rf);
	              }
	            }
	
	        localLoop = preventLoop;
	
	return _return;
}
}
