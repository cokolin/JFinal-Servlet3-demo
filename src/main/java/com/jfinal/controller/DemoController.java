package com.jfinal.controller;

import com.jfinal.core.Controller;

public class DemoController extends Controller {

	public void index() {
		this.renderHtml("<html><head><title>Hello</title><head><body><h1>Hello JFinal!</h1></body></html>");
	}

}
