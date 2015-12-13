package com.jfinal.web;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.controller.DemoController;
import com.jfinal.render.ViewType;

/**
 * 
 * @author cokolin
 * @version 1.0
 */
public class DemoConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants me) {
		me.setDevMode(true);
		me.setViewType(ViewType.JSP);
	}

	@Override
	public void configRoute(Routes me) {
		me.add("/", DemoController.class);
		me.add("/demo", DemoController.class);
	}

	@Override
	public void configPlugin(Plugins me) {
		this.loadPropertyFile("config.properties");
	}

	@Override
	public void configInterceptor(Interceptors me) {
		// TODO Auto-generated method stub
	}

	@Override
	public void configHandler(Handlers me) {
		// TODO Auto-generated method stub
	}

}
