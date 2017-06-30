package qbi.xnat.opex.samples.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(name="QBI OPEX Bio samples", value="OPEXPlugin", description="QBI OPEX Bio samples",
dataModels = {@XnatDataModel(value = OpexBloodmultiplexdataBean.SCHEMA_ELEMENT_NAME,
                             singular = "Blood Multiplex sample",
                             plural = "Blood Multiplex samples",
			 				code="BM"),
		@XnatDataModel(value = OpexBloodcobasdataBean.SCHEMA_ELEMENT_NAME,
				singular = "Blood Cobas sample",
				plural = "Blood Cobas samples",
				code="BM"),
		@XnatDataModel(value = OpexBloodelisasdataBean.SCHEMA_ELEMENT_NAME,
				singular = "Blood Elisas sample",
				plural = "Blood Elisas sample",
				code="BE"),
		@XnatDataModel(value = OpexCantabdmsBean.SCHEMA_ELEMENT_NAME,
				singular = "CANTAB DMS",
				plural = "CANTAB DMS",
				code="DMS"),
		@XnatDataModel(value = OpexCantabmotBean.SCHEMA_ELEMENT_NAME,
				singular = "CANTAB MOT",
				plural = "CANTAB MOT",
				code="MOT"),
		@XnatDataModel(value = OpexCantabpalBean.SCHEMA_ELEMENT_NAME,
				singular = "CANTAB PAL",
				plural = "CANTAB PAL",
				code="PAL"),
		@XnatDataModel(value = OpexCantabswmBean.SCHEMA_ELEMENT_NAME,
				singular = "CANTAB SWM",
				plural = "CANTAB SWM",
				code="SWM"),
		@XnatDataModel(value = OpexAmunetBean.SCHEMA_ELEMENT_NAME,
				singular = "Virtual Water Maze",
				plural = "Virtual Water Maze",
				code="VWM"),
		@XnatDataModel(value = OpexAcerBean.SCHEMA_ELEMENT_NAME,
				singular = "ACER",
				plural = "ACER",
				code="AC"),
		@XnatDataModel(value = OpexMetricBean.SCHEMA_ELEMENT_NAME,
				singular = "Participant screening metrics",
				plural = "Participant screening metrics",
				code="MX"),
		@XnatDataModel(value = OpexCosmedBean.SCHEMA_ELEMENT_NAME,
				singular = "COSMED",
				plural = "COSMED",
				code="COS"),
		@XnatDataModel(value = OpexDexaBean.SCHEMA_ELEMENT_NAME,
				singular = "DEXA",
				plural = "DEXA",
				code="DEX"),

} )
public class OPEXPlugin {
	 @Bean
	 public String OPEXPluginMessage() {
	        return "Hello there from the OPEXPlugin!";
	    }
}
