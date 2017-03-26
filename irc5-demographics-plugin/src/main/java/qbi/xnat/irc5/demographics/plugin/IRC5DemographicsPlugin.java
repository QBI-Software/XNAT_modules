package qbi.xnat.irc5.demographics.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.bean.*;
import org.springframework.context.annotation.Bean;

@XnatPlugin(name="QBI CC IRC5 Demographics", value="IRC5DemographicsPlugin", description="QBI CC IRC5 Demographics",
dataModels = {
		@XnatDataModel(value = Irc5QbiccdemographicsBean.SCHEMA_ELEMENT_NAME,
				singular = "QBI CC IRC5 Demographics",
				plural = "QBI CC IRC5 Demographics"),
		@XnatDataModel(value = Irc5BirthdataBean.SCHEMA_ELEMENT_NAME,
                             singular = "Birth History",
                             plural = "Birth History"),
		@XnatDataModel(value = Irc5MedicaldataBean.SCHEMA_ELEMENT_NAME,
				singular = "Medical History",
				plural = "Medical History"),
		@XnatDataModel(value = Irc5ConsentdataBean.SCHEMA_ELEMENT_NAME,
				singular = "Consent Forms",
				plural = "Consent Forms"),
		@XnatDataModel(value = Irc5DevelopmentaldataBean.SCHEMA_ELEMENT_NAME,
				singular = "Development History",
				plural = "Development History"),
		@XnatDataModel(value = Irc5DiagnosticdataBean.SCHEMA_ELEMENT_NAME,
				singular = "Diagnoses",
				plural = "Diagnoses"),
		@XnatDataModel(value = Irc5FamilydataBean.SCHEMA_ELEMENT_NAME,
				singular = "Family History",
				plural = "Family History"),
		@XnatDataModel(value = Irc5ParticipantdataBean.SCHEMA_ELEMENT_NAME,
				singular = "Participant Details",
				plural = "Participant Details"),
		@XnatDataModel(value = Irc5SeizuredataBean.SCHEMA_ELEMENT_NAME,
				singular = "Seizure History",
				plural = "Seizure History"),
})

public class IRC5DemographicsPlugin {
	 @Bean
	 public String IRC5DemographicsPluginMessage() {
	        return "Hello there from the QBI CC IRC5 DemographicsPlugin!";
	    }
}
