package qbi.xnat.qtab.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.bean.*;
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
		@XnatDataModel(value = QtabBiosampleBean.SCHEMA_ELEMENT_NAME,
				singular = "QTAB Biosample",
				plural = "QTAB Biosample")


} )
public class QTABPlugin {
	 @Bean
	 public String QTABPluginMessage() {
	        return "Hello there from the QTABPlugin!";
	    }
}
