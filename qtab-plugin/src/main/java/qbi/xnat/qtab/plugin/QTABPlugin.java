package qbi.xnat.qtab.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.bean.*;
import org.nrg.xdat.om.QtabBloodspotdata;
import org.nrg.xdat.om.QtabQtabdemographics;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(name="QBI OPEX Bio samples", value="QTABPlugin", description="QBI OPEX Bio samples",
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

} )
public class QTABPlugin {
	 @Bean
	 public String OPEXPluginMessage() {
	        return "Hello there from the QTABPlugin!";
	    }
}
