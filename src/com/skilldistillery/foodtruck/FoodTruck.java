package com.skilldistillery.foodtruck;

public class FoodTruck {
	private static int uniqueId = 5;
	private int truckId;
	private String truckName;
	private String foodType;
	private double truckRating;

	
	public FoodTruck() {
		
	}
	
	public FoodTruck(String truckName, String foodType, double truckRating) {
		this.truckId = uniqueId++;
		this.truckName = truckName;
		this.foodType = foodType;
		this.truckRating = truckRating;
	}
	public int getTruckId() {

		return truckId;
	}
	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getTruckRating() {
		return truckRating;
	}

	public void setTruckRating(double truckRating) {
		this.truckRating = truckRating;
	}
	
	public String toString() {

		String output = "Food truck id: " + truckId + ", Food Truck name: " + truckName + ", Type of Food Truck: "
				+ foodType + ", Rating of Food Truck (1-5 stars): " + truckRating;
		return output;
		
	}
	
	public void displayFoodTruck() { 
		String truckData = this.toString();
		System.out.println(truckData);
	}
}
