/*
 * GENERATED FILE
 * Created on Fri Mar 24 09:16:37 AEST 2017
 *
 */

/**
 * @author XDAT
 *
 */

function irc5_qbiccDemographics(){
this.xsiType="irc5:qbiccDemographics";

	this.getSchemaElementName=function(){
		return "qbiccDemographics";
	}

	this.getFullSchemaElementName=function(){
		return "irc5:qbiccDemographics";
	}
this.extension=dynamicJSLoad('xnat_demographicData','generated/xnat_demographicData.js');
	this.Medical =null;
	function getMedical() {
		return this.Medical;
	}
	this.getMedical=getMedical;


	function setMedical(v){
		this.Medical =v;
	}
	this.setMedical=setMedical;

	this.Medical_MedicalIrc5MedicaldataId=null;


	function getMedical_MedicalIrc5MedicaldataId(){
		return this.Medical_MedicalIrc5MedicaldataId;
	}
	this.getMedical_MedicalIrc5MedicaldataId=getMedical_MedicalIrc5MedicaldataId;


	function setMedical_MedicalIrc5MedicaldataId(v){
		this.Medical_MedicalIrc5MedicaldataId=v;
	}
	this.setMedical_MedicalIrc5MedicaldataId=setMedical_MedicalIrc5MedicaldataId;
	this.Birth =null;
	function getBirth() {
		return this.Birth;
	}
	this.getBirth=getBirth;


	function setBirth(v){
		this.Birth =v;
	}
	this.setBirth=setBirth;

	this.Birth_BirthIrc5BirthdataId=null;


	function getBirth_BirthIrc5BirthdataId(){
		return this.Birth_BirthIrc5BirthdataId;
	}
	this.getBirth_BirthIrc5BirthdataId=getBirth_BirthIrc5BirthdataId;


	function setBirth_BirthIrc5BirthdataId(v){
		this.Birth_BirthIrc5BirthdataId=v;
	}
	this.setBirth_BirthIrc5BirthdataId=setBirth_BirthIrc5BirthdataId;


	this.getProperty=function(xmlPath){
			if(xmlPath.startsWith(this.getFullSchemaElementName())){
				xmlPath=xmlPath.substring(this.getFullSchemaElementName().length + 1);
			}
			if(xmlPath=="demographicData"){
				return this.Demographicdata ;
			} else 
			if(xmlPath.startsWith("demographicData")){
				xmlPath=xmlPath.substring(15);
				if(xmlPath=="")return this.Demographicdata ;
				if(xmlPath.startsWith("[")){
					if (xmlPath.indexOf("/")>-1){
						var optionString=xmlPath.substring(0,xmlPath.indexOf("/"));
						xmlPath=xmlPath.substring(xmlPath.indexOf("/")+1);
					}else{
						var optionString=xmlPath;
						xmlPath="";
					}
					
					var options = loadOptions(optionString);//omUtils.js
				}else{xmlPath=xmlPath.substring(1);}
				if(this.Demographicdata!=undefined)return this.Demographicdata.getProperty(xmlPath);
				else return null;
			} else 
			if(xmlPath=="medical"){
				return this.Medical ;
			} else 
			if(xmlPath.startsWith("medical")){
				xmlPath=xmlPath.substring(7);
				if(xmlPath=="")return this.Medical ;
				if(xmlPath.startsWith("[")){
					if (xmlPath.indexOf("/")>-1){
						var optionString=xmlPath.substring(0,xmlPath.indexOf("/"));
						xmlPath=xmlPath.substring(xmlPath.indexOf("/")+1);
					}else{
						var optionString=xmlPath;
						xmlPath="";
					}
					
					var options = loadOptions(optionString);//omUtils.js
				}else{xmlPath=xmlPath.substring(1);}
				if(this.Medical!=undefined)return this.Medical.getProperty(xmlPath);
				else return null;
			} else 
			if(xmlPath=="birth"){
				return this.Birth ;
			} else 
			if(xmlPath.startsWith("birth")){
				xmlPath=xmlPath.substring(5);
				if(xmlPath=="")return this.Birth ;
				if(xmlPath.startsWith("[")){
					if (xmlPath.indexOf("/")>-1){
						var optionString=xmlPath.substring(0,xmlPath.indexOf("/"));
						xmlPath=xmlPath.substring(xmlPath.indexOf("/")+1);
					}else{
						var optionString=xmlPath;
						xmlPath="";
					}
					
					var options = loadOptions(optionString);//omUtils.js
				}else{xmlPath=xmlPath.substring(1);}
				if(this.Birth!=undefined)return this.Birth.getProperty(xmlPath);
				else return null;
			} else 
			if(xmlPath=="meta"){
				return this.Meta ;
			} else 
			{
				return this.extension.getProperty(xmlPath);
			}
	}


	this.setProperty=function(xmlPath,value){
			if(xmlPath.startsWith(this.getFullSchemaElementName())){
				xmlPath=xmlPath.substring(this.getFullSchemaElementName().length + 1);
			}
			if(xmlPath=="demographicData"){
				this.Demographicdata=value;
			} else 
			if(xmlPath.startsWith("demographicData")){
				xmlPath=xmlPath.substring(15);
				if(xmlPath=="")return this.Demographicdata ;
				if(xmlPath.startsWith("[")){
					if (xmlPath.indexOf("/")>-1){
						var optionString=xmlPath.substring(0,xmlPath.indexOf("/"));
						xmlPath=xmlPath.substring(xmlPath.indexOf("/")+1);
					}else{
						var optionString=xmlPath;
						xmlPath="";
					}
					
					var options = loadOptions(optionString);//omUtils.js
				}else{xmlPath=xmlPath.substring(1);}
				if(this.Demographicdata!=undefined){
					this.Demographicdata.setProperty(xmlPath,value);
				}else{
						if(options && options.xsiType){
							this.Demographicdata= instanciateObject(options.xsiType);//omUtils.js
						}else{
							this.Demographicdata= instanciateObject("xnat:demographicData");//omUtils.js
						}
						if(options && options.where)this.Demographicdata.setProperty(options.where.field,options.where.value);
						this.Demographicdata.setProperty(xmlPath,value);
				}
			} else 
			if(xmlPath=="medical"){
				this.Medical=value;
			} else 
			if(xmlPath.startsWith("medical")){
				xmlPath=xmlPath.substring(7);
				if(xmlPath=="")return this.Medical ;
				if(xmlPath.startsWith("[")){
					if (xmlPath.indexOf("/")>-1){
						var optionString=xmlPath.substring(0,xmlPath.indexOf("/"));
						xmlPath=xmlPath.substring(xmlPath.indexOf("/")+1);
					}else{
						var optionString=xmlPath;
						xmlPath="";
					}
					
					var options = loadOptions(optionString);//omUtils.js
				}else{xmlPath=xmlPath.substring(1);}
				if(this.Medical!=undefined){
					this.Medical.setProperty(xmlPath,value);
				}else{
						if(options && options.xsiType){
							this.Medical= instanciateObject(options.xsiType);//omUtils.js
						}else{
							this.Medical= instanciateObject("irc5:medicalData");//omUtils.js
						}
						if(options && options.where)this.Medical.setProperty(options.where.field,options.where.value);
						this.Medical.setProperty(xmlPath,value);
				}
			} else 
			if(xmlPath=="birth"){
				this.Birth=value;
			} else 
			if(xmlPath.startsWith("birth")){
				xmlPath=xmlPath.substring(5);
				if(xmlPath=="")return this.Birth ;
				if(xmlPath.startsWith("[")){
					if (xmlPath.indexOf("/")>-1){
						var optionString=xmlPath.substring(0,xmlPath.indexOf("/"));
						xmlPath=xmlPath.substring(xmlPath.indexOf("/")+1);
					}else{
						var optionString=xmlPath;
						xmlPath="";
					}
					
					var options = loadOptions(optionString);//omUtils.js
				}else{xmlPath=xmlPath.substring(1);}
				if(this.Birth!=undefined){
					this.Birth.setProperty(xmlPath,value);
				}else{
						if(options && options.xsiType){
							this.Birth= instanciateObject(options.xsiType);//omUtils.js
						}else{
							this.Birth= instanciateObject("irc5:birthData");//omUtils.js
						}
						if(options && options.where)this.Birth.setProperty(options.where.field,options.where.value);
						this.Birth.setProperty(xmlPath,value);
				}
			} else 
			if(xmlPath=="meta"){
				this.Meta=value;
			} else 
			{
				return this.extension.setProperty(xmlPath,value);
			}
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	this.setReferenceField=function(xmlPath,v) {
		if (xmlPath=="medical"){
			this.setMedical(v);
		}else if (xmlPath=="birth"){
			this.setBirth(v);
		}
		else{
			this.extension.setReferenceField(xmlPath,v);
		}
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	this.getReferenceFieldName=function(xmlPath) {
		if (xmlPath=="medical"){
			return "http://qbi.uq.edu.au/irc5:medicalData";
		}else if (xmlPath=="birth"){
			return "http://qbi.uq.edu.au/irc5:birthData";
		}
		else{
			return this.extension.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	this.getFieldType=function(xmlPath){
		if (xmlPath=="medical"){
			return "field_single_reference";
		}else if (xmlPath=="birth"){
			return "field_single_reference";
		}
		else{
			return this.extension.getFieldType(xmlPath);
		}
	}


	this.toXML=function(xmlTxt,preventComments){
		xmlTxt+="<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		xmlTxt+="\n<irc5:qbicc";
		xmlTxt+=this.getXMLAtts();
		xmlTxt+=" xmlns:arc=\"http://nrg.wustl.edu/arc\"";
		xmlTxt+=" xmlns:cat=\"http://nrg.wustl.edu/catalog\"";
		xmlTxt+=" xmlns:irc5=\"http://qbi.uq.edu.au/irc5\"";
		xmlTxt+=" xmlns:pipe=\"http://nrg.wustl.edu/pipe\"";
		xmlTxt+=" xmlns:prov=\"http://www.nbirn.net/prov\"";
		xmlTxt+=" xmlns:scr=\"http://nrg.wustl.edu/scr\"";
		xmlTxt+=" xmlns:val=\"http://nrg.wustl.edu/val\"";
		xmlTxt+=" xmlns:wrk=\"http://nrg.wustl.edu/workflow\"";
		xmlTxt+=" xmlns:xdat=\"http://nrg.wustl.edu/security\"";
		xmlTxt+=" xmlns:xnat=\"http://nrg.wustl.edu/xnat\"";
		xmlTxt+=" xmlns:xnat_a=\"http://nrg.wustl.edu/xnat_assessments\"";
		xmlTxt+=" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"";
		xmlTxt+=">";
		xmlTxt+=this.getXMLBody(preventComments)
		xmlTxt+="\n</irc5:qbicc>";
		return xmlTxt;
	}


	this.getXMLComments=function(preventComments){
		var str ="";
		if((preventComments==undefined || !preventComments) && this.hasXMLComments()){
		}
		return str;
	}


	this.getXMLAtts=function(){
		var attTxt = this.extension.getXMLAtts();
		return attTxt;
	}


	this.getXMLBody=function(preventComments){
		var xmlTxt=this.getXMLComments(preventComments);
		xmlTxt+=this.extension.getXMLBody(preventComments);
		if (this.Medical!=null){
			xmlTxt+="\n<irc5:medical";
			xmlTxt+=this.Medical.getXMLAtts();
			if(this.Medical.xsiType!="irc5:medicalData"){
				xmlTxt+=" xsi:type=\"" + this.Medical.xsiType + "\"";
			}
			if (this.Medical.hasXMLBodyContent()){
				xmlTxt+=">";
				xmlTxt+=this.Medical.getXMLBody(preventComments);
				xmlTxt+="</irc5:medical>";
			}else {xmlTxt+="/>";}
		}
		else{
			xmlTxt+="\n<irc5:medical/>";//REQUIRED
		}
		if (this.Birth!=null){
			xmlTxt+="\n<irc5:birth";
			xmlTxt+=this.Birth.getXMLAtts();
			if(this.Birth.xsiType!="irc5:birthData"){
				xmlTxt+=" xsi:type=\"" + this.Birth.xsiType + "\"";
			}
			if (this.Birth.hasXMLBodyContent()){
				xmlTxt+=">";
				xmlTxt+=this.Birth.getXMLBody(preventComments);
				xmlTxt+="</irc5:birth>";
			}else {xmlTxt+="/>";}
		}
		else{
			xmlTxt+="\n<irc5:birth/>";//REQUIRED
		}
		return xmlTxt;
	}


	this.hasXMLComments=function(){
	}


	this.hasXMLBodyContent=function(){
		if (this.Medical!=null){
			if (this.Medical.hasXMLBodyContent()) return true;
		}
		return true;//REQUIRED medical
	}
}
