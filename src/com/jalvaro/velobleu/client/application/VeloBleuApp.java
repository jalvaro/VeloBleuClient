package com.jalvaro.velobleu.client.application;

import com.jalvaro.velobleu.client.io.VeloBleuApi;
import com.jalvaro.velolibrary.client.application.VeloApp;

public class VeloBleuApp extends VeloApp {

	public VeloBleuApp() {
		super();
		setVeloApi(new VeloBleuApi());
	}
}
