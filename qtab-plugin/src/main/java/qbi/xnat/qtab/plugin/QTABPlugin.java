package qbi.xnat.qtab.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.bean.*;
import org.nrg.xdat.om.QtabBloodspotdata;
import org.nrg.xdat.om.QtabQtabdemographics;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(name="QTAB data", value="QTABPlugin", description="QTAB Demographic and Bio samples",
dataModels = {@XnatDataModel(value = QtabBloodspotdataBean.SCHEMA_ELEMENT_NAME,
                             singular = "QTAB Bloodspot sample",
                             plural = "QTAB Bloodspot samples"),
		@XnatDataModel(value = QtabNaplandataBean.SCHEMA_ELEMENT_NAME,
				singular = "QTAB NAPLAN",
				plural = "QTAB NAPLAN"),
		@XnatDataModel(value = QtabParticipantdataBean.SCHEMA_ELEMENT_NAME,
				singular = "QTAB Participant",
				plural = "QTAB Participant"),
		@XnatDataModel(value = QtabPerinataldataBean.SCHEMA_ELEMENT_NAME,
				singular = "QTAB Perinatal",
				plural = "QTAB Perinatal"),
		@XnatDataModel(value = QtabQtabdemographicsBean.SCHEMA_ELEMENT_NAME,
				singular = "QTAB Demographics",
				plural = "QTAB Demographics"),
		@XnatDataModel(value = QtabQtabexperimentBean.SCHEMA_ELEMENT_NAME,
				singular = "QTAB Experiment",
				plural = "QTAB Experiment"),
		@XnatDataModel(value = QtabHomedataBean.SCHEMA_ELEMENT_NAME,
				singular = "QTAB Home Experiment",
				plural = "QTAB Home Experiment"),
		@XnatDataModel(value = QtabHairdataBean.SCHEMA_ELEMENT_NAME,
				singular = "QTAB Hair Experiment",
				plural = "QTAB Hair Experiment"),
		@XnatDataModel(value = QtabBlooddataBean.SCHEMA_ELEMENT_NAME,
				singular = "QTAB Blood Experiment",
				plural = "QTAB Blood Experiment"),

} )
public class QTABPlugin {
	 @Bean
	 public String QTABPluginMessage() {
	        return "Hello there from the QTABPlugin!";
	    }
}
