package com.dental.view;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;

import com.dental.Data;
import com.dental.design.BuildingDentalDesign;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ExternalResource;
import com.vaadin.spring.annotation.SpringView;


@SpringView(name = MenuView.VIEW_NAME)
public class MenuView extends BuildingDentalDesign implements View {
	
	public static final String VIEW_NAME = "";
	private Data sd;

	
	@Autowired
	public MenuView(Data sharedData) {
		
		this.sd = sharedData;
		
		//sturing UI Uitbreiding 200
		
		browserFrameCamera.setSource(new ExternalResource("http://mail.vernafix.be:8103/control/userimage.html"));
		browserFrameWeather.setSource(new ExternalResource("https://www.accuweather.com/nl/be/oostende/31865/hourly-weather-forecast/31865"));
		
		
		tabSheet.addTab(new VerlichtingUIView(), "Verlichting");
		tabSheet.addTab(new RolluikUIView(),
		          "Rolluiken");

	}



				@Override
				public void enter(ViewChangeEvent event) {
					// TODO Auto-generated method stub
					
				}
	
			}
		

	

	