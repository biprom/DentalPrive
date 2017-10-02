package com.dental.view;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;

import com.dental.Data;
import com.dental.design.BuildingDentalDesign;
import com.dental.view.MenuView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ClassResource;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.ThemeResource;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;

@SpringView(name = MenuView.VIEW_NAME)
public class MenuView extends BuildingDentalDesign implements View {
	
	public static final String VIEW_NAME = "";
	private Data sd;
	ThemeResource resource = new ThemeResource("img/grondplanDental.png");
	Image backGround = new Image("My Theme Image", resource);
	
	@Autowired
	public MenuView(Data sharedData) {
		
		this.sd = sharedData;
		
		//sturing UI Uitbreiding 200
		
		browserFrameCamera.setSource(new ExternalResource("http://mail.vernafix.be:8103/control/userimage.html"));
		browserFrameWeather.setSource(new ExternalResource("http://meteo1.nieuwsblad.be/weer/Oostende"));
		
		
		tabSheetButtons.addTab(new Label("Contents of the first tab"),
		          "First Tab");
		tabSheetButtons.addTab(new Label("Contents of the second tab"),
		          "Second Tab");
		tabSheetButtons.addTab(new Label("Contents of the third tab"),
		          "Third tab");
		
		
//		bUitbreding1.addClickListener(new Button.ClickListener() {
//
//			@Override
//			public void buttonClick(ClickEvent event) {
//				
//				if( sd.isStatusuitbereiding1()== true){
//					sd.setUitbereiding1(true);
//					try {
//						TimeUnit.MILLISECONDS.sleep(200);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					sd.setUitbereiding1(false);
//					try {
//						TimeUnit.MILLISECONDS.sleep(200);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					sd.setStatusuitbereiding1(false);
//					bUitbreding1.setStyleName("danger");
//					
//					
//				}
//				else{
//					
//					sd.setUitbereiding1(true);
//					try {
//						TimeUnit.MILLISECONDS.sleep(200);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					sd.setUitbereiding1(false);
//					try {
//						TimeUnit.MILLISECONDS.sleep(200);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					sd.setStatusuitbereiding1(true);
//					bUitbreding1.setStyleName("friendly");
//					}
//				
//			}
//		});
				
	}
				
				@Override
				public void enter(ViewChangeEvent event) {
					// TODO Auto-generated method stub
					
				}
	
			}
		

	

	