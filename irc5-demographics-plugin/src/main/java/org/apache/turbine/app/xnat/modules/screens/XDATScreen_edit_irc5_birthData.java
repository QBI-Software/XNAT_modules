/*
 * GENERATED FILE
 * Created on Thu Mar 23 16:53:10 AEST 2017
 *
 */
package org.apache.turbine.app.xnat.modules.screens;

import org.apache.turbine.util.RunData;
import org.apache.velocity.context.Context;
import org.nrg.xdat.XDAT;
import org.nrg.xdat.om.XnatDemographicdata;
import org.nrg.xdat.om.XnatSubjectdata;
import org.nrg.xft.ItemI;
import org.nrg.xft.XFTItem;
import org.nrg.xft.exception.ElementNotFoundException;
import org.nrg.xft.exception.FieldNotFoundException;
import org.nrg.xft.exception.XFTInitException;

import java.util.List;

/**
 * @author XDAT
 */
public class XDATScreen_edit_irc5_birthData extends org.nrg.xdat.turbine.modules.screens.EditScreenA {
    static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XDATScreen_edit_irc5_birthData.class);

    /* (non-Javadoc)
     * @see org.nrg.xdat.turbine.modules.screens.EditScreenA#getElementName()
     */
    public String getElementName() {
        return "irc5:birthData";
    }

    public ItemI getEmptyItem(RunData data) throws Exception {
        return super.getEmptyItem(data);
    }

    /* (non-Javadoc)
     * @see org.nrg.xdat.turbine.modules.screens.SecureReport#finalProcessing(org.apache.turbine.util.RunData, org.apache.velocity.context.Context)
     *
     * https://groups.google.com/forum/#!searchin/xnat_discussion/demographic%7Csort:relevance/xnat_discussion/1tIAP92EYiI/u8dr8vPbuhoJ
     * #if($om.getChildItems("demographics").get(0).instanceOf("xnat:demographicData"))
     * <div class='alert'>DEMO</div>
     * #elseif($om.getChildItems("demographics").get(0).instanceOf("xnat:somethingElse"))
     * <div class='alert'>DEMO</div>
     * #else
     * <div class='alert'>$om.getChildItems("demographics").get(0).getXSIType()</div>
     * #end
     */
    public void finalProcessing(RunData data, Context context) {
        //super.finalProcessing(data, context);

        try {
            final String subjectId;
            if (!context.containsKey("subjectId")) {
                if (context.containsKey("part")) {
                    final Object part = context.get("part");
                    if (part instanceof XnatSubjectdata) {
                        subjectId = ((XnatSubjectdata) part).getId();
                    } else if (part instanceof XFTItem) {
                        subjectId = ((XFTItem) part).getStringProperty("ID");
                    } else {
                        subjectId = part.toString();
                    }
                    context.put("subjectId", subjectId);
                } else {
                    subjectId = (String) context.get("part_id");
                }
            } else {
                subjectId = (String) context.get("subjectId");
            }

            if (!context.containsKey("label")) {
                final XnatSubjectdata subject = XnatSubjectdata.getXnatSubjectdatasById(subjectId, XDAT.getUserDetails(), false);
                final List<XnatDemographicdata> demographics;
                try {
                    demographics = subject.getChildItems("demographics");
                    boolean matches = false;
                    for (final XnatDemographicdata dem : demographics) {
                        if (dem.getSchemaElement().equals("irc5:birthData")) {
                            matches = true;
                            break;
                        }
                    }
                    if (matches) {
                        context.put("birthdata", matches);
                    }


                } catch (XFTInitException | ElementNotFoundException | FieldNotFoundException e) {
                    final String message = "An error occurred trying to get the subject ID when creating a IRC5 QBI Demographics.";
                    log.error(message, e);
                    throw new RuntimeException(message, e);
                }

            }
        } catch (ElementNotFoundException | XFTInitException | FieldNotFoundException e) {
            e.printStackTrace();
        }
    }
}