package gov.ca.ceres.mylocalplan.client;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

import edu.ucdavis.gwt.gis.client.config.GadgetConfig;
import edu.ucdavis.gwt.gis.client.config.LayerConfig;

public class MyLocalPlanConfig extends GadgetConfig {
	
	protected MyLocalPlanConfig() {}
	
	public final native JsArray<ServiceConfig> getSearchServices() /*-{
		if( this.searchServices ) return this.searchServices;
		return [];
	}-*/;

}
