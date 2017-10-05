package com.dental;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("sharedData")
@Scope("singleton")
public class Data {
	
	boolean boolVoordeurBuiten = false;					//uitgang 11
	boolean boolVInkomPlafond = false;					//uitgang 12
	boolean boolVInkomVloer = false;					//uitgang 13
	boolean boolVLedBureau = false; 					//uitgang 14
	boolean boolVLedKeuken = false;				 		//uitgang 15
	boolean boolVGarage = false;						//uitgang 16
	boolean boolVBureau1 = false;						//uitgang 17
	boolean boolVBureau2 = false;						//uitgang 18
	boolean boolVLeeshoek = false;						//uitgang 21
	boolean boolVKeuken = false;						//uitgang 22
	boolean boolVEettafel = false;						//uitgang 23
	boolean boolVKeuken2 = false;						//uitgang 24
	boolean boolVSpotsKeuken = false;					//uitgang 25
	boolean boolVLivingTV1 = false;						//uitgang 26
	boolean boolVLivingTV2 = false;						//uitgang 27
	boolean boolVNachthall = false;						//uitgang 28
	boolean boolVNachthallboven = false;				//uitgang 31
	boolean boolVTrapverlichting = false;				//uitgang 32
	boolean boolVTuin1 = false;							//uitgang 33
	boolean boolVTuin2 = false;							//uitgang 34
	boolean boolVTuin3 = false;							//uitgang 35


	public boolean isBoolVoordeurBuiten() {
		return boolVoordeurBuiten;
	}

	public void setBoolVoordeurBuiten(boolean boolVoordeurBuiten) {
		this.boolVoordeurBuiten = boolVoordeurBuiten;
	}

	public boolean isBoolVInkomPlafond() {
		return boolVInkomPlafond;
	}

	public void setBoolVInkomPlafond(boolean boolVInkomPlafond) {
		this.boolVInkomPlafond = boolVInkomPlafond;
	}

	public boolean isBoolVInkomVloer() {
		return boolVInkomVloer;
	}

	public void setBoolVInkomVloer(boolean boolVInkomVloer) {
		this.boolVInkomVloer = boolVInkomVloer;
	}

	public boolean isBoolVLedBureau() {
		return boolVLedBureau;
	}

	public void setBoolVLedBureau(boolean boolVLedBureau) {
		this.boolVLedBureau = boolVLedBureau;
	}

	public boolean isBoolVLedKeuken() {
		return boolVLedKeuken;
	}

	public void setBoolVLedKeuken(boolean boolVLedKeuken) {
		this.boolVLedKeuken = boolVLedKeuken;
	}

	public boolean isBoolVGarage() {
		return boolVGarage;
	}

	public void setBoolVGarage(boolean boolVGarage) {
		this.boolVGarage = boolVGarage;
	}

	public boolean isBoolVBureau1() {
		return boolVBureau1;
	}

	public void setBoolVBureau1(boolean boolVBureau1) {
		this.boolVBureau1 = boolVBureau1;
	}

	public boolean isBoolVBureau2() {
		return boolVBureau2;
	}

	public void setBoolVBureau2(boolean boolVBureau2) {
		this.boolVBureau2 = boolVBureau2;
	}

	public boolean isBoolVLeeshoek() {
		return boolVLeeshoek;
	}

	public void setBoolVLeeshoek(boolean boolVLeeshoek) {
		this.boolVLeeshoek = boolVLeeshoek;
	}

	public boolean isBoolVKeuken() {
		return boolVKeuken;
	}

	public void setBoolVKeuken(boolean boolVKeuken) {
		this.boolVKeuken = boolVKeuken;
	}

	public boolean isBoolVEettafel() {
		return boolVEettafel;
	}

	public void setBoolVEettafel(boolean boolVEettafel) {
		this.boolVEettafel = boolVEettafel;
	}

	public boolean isBoolVKeuken2() {
		return boolVKeuken2;
	}

	public void setBoolVKeuken2(boolean boolVKeuken2) {
		this.boolVKeuken2 = boolVKeuken2;
	}

	public boolean isBoolVSpotsKeuken() {
		return boolVSpotsKeuken;
	}

	public void setBoolVSpotsKeuken(boolean boolVSpotsKeuken) {
		this.boolVSpotsKeuken = boolVSpotsKeuken;
	}

	public boolean isBoolVLivingTV1() {
		return boolVLivingTV1;
	}

	public void setBoolVLivingTV1(boolean boolVLivingTV1) {
		this.boolVLivingTV1 = boolVLivingTV1;
	}

	public boolean isBoolVLivingTV2() {
		return boolVLivingTV2;
	}

	public void setBoolVLivingTV2(boolean boolVLivingTV2) {
		this.boolVLivingTV2 = boolVLivingTV2;
	}

	public boolean isBoolVNachthall() {
		return boolVNachthall;
	}

	public void setBoolVNachthall(boolean boolVNachthall) {
		this.boolVNachthall = boolVNachthall;
	}

	public boolean isBoolVNachthallboven() {
		return boolVNachthallboven;
	}

	public void setBoolVNachthallboven(boolean boolVNachthallboven) {
		this.boolVNachthallboven = boolVNachthallboven;
	}

	public boolean isBoolVTrapverlichting() {
		return boolVTrapverlichting;
	}

	public void setBoolVTrapverlichting(boolean boolVTrapverlichting) {
		this.boolVTrapverlichting = boolVTrapverlichting;
	}

	public boolean isBoolVTuin1() {
		return boolVTuin1;
	}

	public void setBoolVTuin1(boolean boolVTuin1) {
		this.boolVTuin1 = boolVTuin1;
	}

	public boolean isBoolVTuin2() {
		return boolVTuin2;
	}

	public void setBoolVTuin2(boolean boolVTuin2) {
		this.boolVTuin2 = boolVTuin2;
	}

	public boolean isBoolVTuin3() {
		return boolVTuin3;
	}

	public void setBoolVTuin3(boolean boolVTuin3) {
		this.boolVTuin3 = boolVTuin3;
	}
}
