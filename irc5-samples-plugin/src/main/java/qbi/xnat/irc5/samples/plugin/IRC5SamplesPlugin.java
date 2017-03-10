package qbi.xnat.irc5.samples.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.bean.Irc5BlooddataBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(name="QBI IRC5 Bio samples", value="IRC5SamplesPlugin", description="QBI IRC5 Bio samples",
		entityPackages = "qbi.xnat.irc5.blood.subjectmapping",
dataModels = {@XnatDataModel(value = Irc5BlooddataBean.SCHEMA_ELEMENT_NAME,
                             singular = "Blood sample",
                             plural = "Blood samples")})
@ComponentScan(basePackages = {"qbi.xnat.irc5.samples.subjectmapping.preferences",
        "qbi.xnat.irc5.samples.subjectmapping.repositories",
        "qbi.xnat.irc5.samples.subjectmapping.rest",
        "qbi.xnat.irc5.samples.subjectmapping.services.impl"})

public class IRC5SamplesPlugin {
	 @Bean
	 public String IRC5SamplesPluginMessage() {
	        return "Hello there from the IRC5SamplesPlugin!";
	    }
}
