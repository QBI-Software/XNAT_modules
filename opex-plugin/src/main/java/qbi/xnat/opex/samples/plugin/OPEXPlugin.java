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
		@XnatDataModel(value = OpexExercisedataBean.SCHEMA_ELEMENT_NAME,
				singular = "Exercise sample",
				plural = "Exercise sample"),

} )
public class OPEXPlugin {
	 @Bean
	 public String OPEXPluginMessage() {
	        return "Hello there from the OPEXPlugin!";
	    }
}
