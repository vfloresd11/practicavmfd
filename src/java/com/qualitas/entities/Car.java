/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualitas.entities;

/**
 *
 * @author vflores
 */
public class Car {
private String getRandomId;
private String getRandomBrand;
private int getRandomYear;
private String getRandomColor;
private int getRandomPrice;
private boolean getRandomSoldState;

	public Car(String getRandomId,
	           String getRandomBrand,
                   int getRandomYear,
                   String getRandomColor,
                   int getRandomPrice,
                   boolean getRandomSoldState
  ){
		this.getRandomBrand=getRandomBrand;
                this.getRandomColor=getRandomColor;
                this.getRandomId=getRandomId;
                this.getRandomPrice=getRandomPrice;
                this.getRandomSoldState=getRandomSoldState;
                this.getRandomYear=getRandomYear;
	}

    /**
     * @return the getRandomId
     */
    public String getGetRandomId() {
        return getRandomId;
    }

    /**
     * @param getRandomId the getRandomId to set
     */
    public void setGetRandomId(String getRandomId) {
        this.getRandomId = getRandomId;
    }

    /**
     * @return the getRandomBrand
     */
    public String getGetRandomBrand() {
        return getRandomBrand;
    }

    /**
     * @param getRandomBrand the getRandomBrand to set
     */
    public void setGetRandomBrand(String getRandomBrand) {
        this.getRandomBrand = getRandomBrand;
    }

    /**
     * @return the getRandomYear
     */
    public int getGetRandomYear() {
        return getRandomYear;
    }

    /**
     * @param getRandomYear the getRandomYear to set
     */
    public void setGetRandomYear(int getRandomYear) {
        this.getRandomYear = getRandomYear;
    }

    /**
     * @return the getRandomColor
     */
    public String getGetRandomColor() {
        return getRandomColor;
    }

    /**
     * @param getRandomColor the getRandomColor to set
     */
    public void setGetRandomColor(String getRandomColor) {
        this.getRandomColor = getRandomColor;
    }

    /**
     * @return the getRandomPrice
     */
    public int getGetRandomPrice() {
        return getRandomPrice;
    }

    /**
     * @param getRandomPrice the getRandomPrice to set
     */
    public void setGetRandomPrice(int getRandomPrice) {
        this.getRandomPrice = getRandomPrice;
    }

    /**
     * @return the getRandomSoldState
     */
    public boolean isGetRandomSoldState() {
        return getRandomSoldState;
    }

    /**
     * @param getRandomSoldState the getRandomSoldState to set
     */
    public void setGetRandomSoldState(boolean getRandomSoldState) {
        this.getRandomSoldState = getRandomSoldState;
    }
 
}
