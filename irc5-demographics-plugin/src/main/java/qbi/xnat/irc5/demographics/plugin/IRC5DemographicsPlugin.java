package qbi.xnat.irc5.demographics.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.bean.*;
import org.springframework.context.annotation.Bean;

@XnatPlugin(name="QBI IRC5 Demographics", value="IRC5DemographicsPlugin", description="QBI IRC5 Demographics",
dataModels = {@XnatDataModel(value = Irc5BirthdataBean.SCHEMA_ELEMENT_NAME,
                             singular = "Birth History",
                             plural = "Birth History"),
		@XnatDataModel(value = Irc5MedicaldataBean.SCHEMA_ELEMENT_NAME,
				singular = "Medical History",
				plural = "Medical History"),
})

public class IRC5DemographicsPlugin {
	 @Bean
	 public String IRC5DemographicsPluginMessage() {
	        return "Hello there from the IRC5DemographicsPlugin!";
	    }
}
