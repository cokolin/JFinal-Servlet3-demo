package com.jfinal.kit;

import javax.servlet.ServletContext;

/**
 * 
 * @author cokolin
 */
public class DemoKit {
	private static ServletContext ctx;

	public static ServletContext getCtx() {
		return ctx;
	}

	public static ServletContext setCtx(ServletContext context) {
		return ctx = context;
	}

}
