package com.jfinal.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration.Dynamic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jfinal.config.JFinalConfig;
import com.jfinal.core.JFinalInitializer;
import com.jfinal.kit.DemoKit;

/**
 * 
 * @author cokolin
 * @version 1.0
 */
public class DemoInitializer extends JFinalInitializer {
	private static Logger logger = LoggerFactory.getLogger(DemoInitializer.class);

	@Override
	protected void beforRegister(ServletContext ctx) {
		DemoKit.setCtx(ctx);
		logger.info("{}", System.currentTimeMillis());
	}

	@Override
	protected void afterRegister(Dynamic dynamic) {
		logger.info("{}", System.currentTimeMillis());
	}

	@Override
	protected JFinalConfig jfinalConfig() {
		return new DemoConfig();
	}

}