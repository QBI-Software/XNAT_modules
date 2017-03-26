/*
 * GENERATED FILE
 * Created on Mon Mar 27 08:57:11 AEST 2017
 *
 */
package org.apache.turbine.app.xnat.modules.screens;
import org.apache.turbine.util.RunData;
import org.apache.velocity.context.Context;
import org.nrg.xft.ItemI;

/**
 * @author XDAT
 *
 */
public class XDATScreen_edit_irc5_qbiccDemographics extends org.nrg.xdat.turbine.modules.screens.EditScreenA {
	static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XDATScreen_edit_irc5_qbiccDemographics.class);
	/* (non-Javadoc)
	 * @see org.nrg.xdat.turbine.modules.screens.EditScreenA#getElementName()
	 */
	public String getElementName() {
	    return "irc5:qbiccDemographics";
	}
	
	public ItemI getEmptyItem(RunData data) throws Exception
	{
		return super.getEmptyItem(data);
	}
	/* (non-Javadoc)
	 * @see org.nrg.xdat.turbine.modules.screens.SecureReport#finalProcessing(org.apache.turbine.util.RunData, org.apache.velocity.context.Context)
	 */
	public void finalProcessing(RunData data, Context context) {
	}}
