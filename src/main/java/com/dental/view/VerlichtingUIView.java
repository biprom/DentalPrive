package com.dental.view;

import com.dental.design.VerlichtingUIDesign;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;


public class VerlichtingUIView extends VerlichtingUIDesign implements View{

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {

    }




//        bUitbreding1.addClickListener(new Button.ClickListener() {
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
