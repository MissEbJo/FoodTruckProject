package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FoodTruck[]	foodTrucks = new FoodTruck[5];
		
		System.out.println("Welcome to Better Elp");
		System.out.println("To determine what you're going to eat for dinner, please follow the prompts!");
		
//		boolean keepGoing = true;
		
		while(true) {
			
			System.out.print("Please enter the name of the food truck: ");
			String truckName = input.nextLine();
			
			if(truckName.equals("quit")) {
				continue;
			} break;
			
			System.out.print("Please enter the food type of the food truck: ");
			String foodType = input.nextLine();
			
			System.out.print("Please enter the rating of the food truck from 1-5 stars: ");
			double truckRating = input.nextDouble();
			input.nextLine();
			
			FoodTruck internals = new FoodTruck (truckName, foodType, truckRating);
			
			System.out.println(internals);
			
			
			
		
		while(true) {
		System.out.println("************************************************");
		System.out.println("-----1. Display all available food trucks:-------");
		System.out.println("------2. View average Rating of Food Trucks:-----");
		System.out.println("-------3. View the highest rated Food Truck:------");
		System.out.println("-----------4. Quit the program.------------------");
		System.out.println("************************************************");
		
		System.out.println("Please select an option: ");
		int choice = input.nextInt();
			
			if(choice == 1) {
				//list all existing food truck
				
			internals.displayFoodTruck();
			
			}else if (choice == 2) {
//				avg rating of food truck
				
				double sum = 0;
				for (int i =0; i < foodTrucks.length; i++) {
					sum = sum + truckRating;  
					sum = sum / foodTrucks.length;
				System.out.println("The avg rating of the food trucks is: " + sum);	
			} 
			}
				else if (choice == 3) {
//				display highest rated 
				FoodTruck max = foodTrucks[0];
				for(int i =1; i < foodTrucks.length; i++) {
					if (0> 1) {
						max = foodTrucks[i];
					}
					System.out.println("The highest rated food truck: " + max);
				}
			}else if (choice == 4) {
//				quit
				break;
			}
		
	}
	
	}
	}
	}
