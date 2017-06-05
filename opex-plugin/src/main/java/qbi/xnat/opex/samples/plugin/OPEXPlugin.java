package qbi.xnat.opex.samples.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(name="QBI OPEX Bio samples", value="OPEXPlugin", description="QBI OPEX Bio samples",
dataModels = {@XnatDataModel(value = OpexBloodmultiplexdataBean.SCHEMA_ELEMENT_NAME,
                             singular = "Blood Multiplex sample",
                             plural = "Blood Multiplex samples"),
		@XnatDataModel(value = OpexBloodcobasdataBean.SCHEMA_ELEMENT_NAME,
				singular = "Blood Cobas sample",
				plural = "Blood Cobas samples"),
		@XnatDataModel(value = OpexBloodelisasdataBean.SCHEMA_ELEMENT_NAME,
				singular = "Blood Elisas sample",
				plural = "Blood Elisas sample"),
		@XnatDataModel(value = OpexCantabdmsBean.SCHEMA_ELEMENT_NAME,
				singular = "CANTAB DMS",
				plural = "CANTAB DMS"),
		@XnatDataModel(value = OpexCantabmotBean.SCHEMA_ELEMENT_NAME,
				singular = "CANTAB MOT",
				plural = "CANTAB MOT"),
		@XnatDataModel(value = OpexCantabpalBean.SCHEMA_ELEMENT_NAME,
				singular = "CANTAB PAL",
				plural = "CANTAB PAL"),
		@XnatDataModel(value = OpexCantabswmBean.SCHEMA_ELEMENT_NAME,
				singular = "CANTAB SWM",
				plural = "CANTAB SWM"),

} )
public class OPEXPlugin {
	 @Bean
	 public String OPEXPluginMessage() {
	        return "Hello there from the OPEXPlugin!";
	    }
}
