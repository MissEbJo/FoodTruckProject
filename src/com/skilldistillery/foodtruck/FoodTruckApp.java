package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FoodTruck[] foodTrucks = new FoodTruck[5];
		FoodTruckApp app = new FoodTruckApp();

		System.out.println("Welcome to Better Elp");
		System.out.println("To determine what you're going to eat for dinner, please follow the prompts!");

		boolean keepGoing = true;
		boolean keepGoing1 = true;
		int count = 0;

		while (keepGoing) {
			System.out.print("Please enter the name of the food truck: ");
			String truckName = input.nextLine();

			if (truckName.equals("quit")) {
				keepGoing = false;
				break;
			}

			System.out.print("Please enter the food type of the food truck: ");
			String foodType = input.nextLine();

			System.out.print("Please enter the rating of the food truck from 1-5 stars: ");
			double truckRating = input.nextDouble();
			input.nextLine();

			FoodTruck internalsOfFoodTrucks = new FoodTruck(truckName, foodType, truckRating);

			foodTrucks[count] = internalsOfFoodTrucks;
			count++;
		}
//			

		while (keepGoing1) {

			System.out.println("************************************************");
			System.out.println("-----1. Display all available food trucks:-------");
			System.out.println("------2. View average Rating of Food Trucks:-----");
			System.out.println("-------3. View the highest rated Food Truck:------");
			System.out.println("-----------4. Quit the program.------------------");
			System.out.println("************************************************");

			System.out.println("Please select an option: ");
			int choice = input.nextInt();

			if (choice == 1) {
				// list all existing food truck

				for (FoodTruck foodTruck : foodTrucks) {
					if (foodTruck != null) {
						System.out.println(foodTruck);
					}
				}
			} else if (choice == 2) {
//				avg rating of food truck

				double sum = 0;
				int count1 = 0;
				double average = 0;
				for (FoodTruck foodTruck : foodTrucks) {
					if (foodTruck != null) {
						sum = sum + foodTruck.getTruckRating();
						count1++;
					}
				}
				average = sum / count1;
				System.out.println("The avg rating of the food trucks is: " + average);
			} else if (choice == 3) {
//				display highest rated 
				int max = 0;
				int i = 0;
				int count3 = 0;
				String maxTruck = "";
				for (i = 0; i < foodTrucks.length; i++) {
					if (foodTrucks[i] == null) {
						continue;
					} else if (foodTrucks[i].getTruckRating() > max) {
						maxTruck = foodTrucks[i].getTruckName();
						max = (int) foodTrucks[i].getTruckRating();
						count3++;
					}
				}
				System.out.println("The highest rated food truck: " + maxTruck + " with a rating of " + max);
			} else if (choice == 4) {
//				quit
				System.out.println("Thank you for using Better Elp! Enjoy your meal!");
				keepGoing1 = false;
			}
		}
	}
}
