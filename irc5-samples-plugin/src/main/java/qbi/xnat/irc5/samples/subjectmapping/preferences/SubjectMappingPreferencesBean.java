/*
 * xnat-workshop: org.nrg.xnat.workshop.subjectmapping.preferences.SubjectMappingPreferencesBean
 * XNAT http://www.xnat.org
 * Copyright (c) 2017, Washington University School of Medicine
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 */

package qbi.xnat.irc5.samples.subjectmapping.preferences;

import org.nrg.framework.configuration.ConfigPaths;
import org.nrg.prefs.annotations.NrgPreference;
import org.nrg.prefs.annotations.NrgPreferenceBean;
import org.nrg.prefs.beans.AbstractPreferenceBean;
import org.nrg.prefs.exceptions.InvalidPreferenceName;
import org.nrg.prefs.services.NrgPreferenceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@NrgPreferenceBean(toolId = "subjectMapping", toolName = "XNAT Subject Mapping Plugin")
public class SubjectMappingPreferencesBean extends AbstractPreferenceBean {
    @Autowired
    public SubjectMappingPreferencesBean(final NrgPreferenceService preferenceService, final ConfigPaths configFolderPaths) {
        super(preferenceService, configFolderPaths);
    }

    @NrgPreference
    public List<String> getSourceSystemIds() {
        return getListValue("sourceSystemIds");
    }

    public void setSourceSystemIds(final List<String> sourceSystemIds) {
        try {
            setListValue("sourceSystemIds", sourceSystemIds);
        } catch (InvalidPreferenceName invalidPreferenceName) {
            //
        }
    }
}
