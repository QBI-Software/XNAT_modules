package qbi.xnat.irc5.samples.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.bean.Irc5BlooddataBean;
import org.nrg.xdat.bean.Irc5BraindataBean;
import org.nrg.xdat.bean.Irc5NpsdataBean;
import org.nrg.xdat.bean.Irc5OpiniondataBean;
import org.nrg.xdat.bean.Irc5SalivadataBean;
import org.nrg.xdat.bean.Irc5SkindataBean;
import org.nrg.xdat.bean.Irc5ImageanalysisdataBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(name="IRC5 Bio samples", value="IRC5SamplesPlugin",
		description="IRC5 Bio samples",
		entityPackages = "qbi.xnat.irc5.samples.subjectmapping.entities",
		dataModels = {@XnatDataModel(value = Irc5BlooddataBean.SCHEMA_ELEMENT_NAME,
                             singular = "Blood sample",
                             plural = "Blood samples",
							 code = "BLO"),
		@XnatDataModel(value = Irc5BraindataBean.SCHEMA_ELEMENT_NAME,
				singular = "Brain sample",
				plural = "Brain samples",
				code = "BRA"),
		@XnatDataModel(value = Irc5NpsdataBean.SCHEMA_ELEMENT_NAME,
				singular = "NeuroPsych scores",
				plural = "NeuroPsych scores",
				code = "NPS"),
		@XnatDataModel(value = Irc5OpiniondataBean.SCHEMA_ELEMENT_NAME,
				singular = "Medical Opinion",
				plural = "Medical Opinions",
				code = "MO"),
		@XnatDataModel(value = Irc5SalivadataBean.SCHEMA_ELEMENT_NAME,
				singular = "Saliva sample",
				plural = "Saliva samples",
				code = "SAL"),
		@XnatDataModel(value = Irc5SkindataBean.SCHEMA_ELEMENT_NAME,
				singular = "Skin sample",
				plural = "Skin samples",
				code = "SK"),
		@XnatDataModel(value = Irc5ImageanalysisdataBean.SCHEMA_ELEMENT_NAME,
				singular = "Image analysis",
				plural = "Image analysis",
				code = "IA")
} )
public class IRC5SamplesPlugin {
	 @Bean
	 public String IRC5SamplesPluginMessage() {
	        return "Hello there from the IRC5SamplesPlugin!";
	    }
}
