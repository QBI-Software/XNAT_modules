/*
 * GENERATED FILE
 * Created on Mon Mar 13 12:13:43 AEST 2017
 *
 */
package org.nrg.xdat.om.base;
import org.nrg.xdat.om.base.auto.*;
import org.nrg.xft.*;
import org.nrg.xft.security.UserI;

import java.util.*;

/**
 * @author XDAT
 *
 *//*
 ******************************** 
 * DO NOT MODIFY THIS FILE HERE
 *
 * TO MODIFY, COPY THIS FILE to src/main/java/org/nrg/xdat/om/base/ and modify it there 
 ********************************/
@SuppressWarnings({"unchecked","rawtypes"})
public abstract class BaseIrc5Blooddata extends AutoIrc5Blooddata {

	public BaseIrc5Blooddata(ItemI item)
	{
		super(item);
	}

	public BaseIrc5Blooddata(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use BaseIrc5Blooddata(UserI user)
	 **/
	public BaseIrc5Blooddata()
	{}

	public BaseIrc5Blooddata(Hashtable properties, UserI user)
	{
		super(properties,user);
	}

}
