/*
 * GENERATED FILE
 * Created on Tue Mar 14 16:56:31 AEST 2017
 *
 */
package org.nrg.xdat.model;

import java.util.List;

/**
 * @author XDAT
 *
 */
public interface Irc5BlooddataI extends XnatSubjectassessordataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the date_analysed.
	 */
	public Object getDateAnalysed();

	/**
	 * Sets the value for date_analysed.
	 * @param v Value to Set.
	 */
	public void setDateAnalysed(Object v);

	/**
	 * @return Returns the summary.
	 */
	public String getSummary();

	/**
	 * Sets the value for summary.
	 * @param v Value to Set.
	 */
	public void setSummary(String v);

	/**
	 * @return Returns the comments.
	 */
	public String getComments();

	/**
	 * Sets the value for comments.
	 * @param v Value to Set.
	 */
	public void setComments(String v);
}
