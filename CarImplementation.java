package com.Practice;
import java.util.*;
import java.util.stream.Collectors;

public class CarImplementation {

    
    public double sumOfPrices(List<Car> carList) {
        return carList.stream()
                .mapToDouble(x->x.getPrice()) 
                .sum();  
    }

   
    public List<String> printName(List<Car> carList) {
        return carList.stream().filter(x -> x.getPrice() > 25000) .map(Car::getCarName).collect(Collectors.toList());  
    }

    
    public double maxPrice(List<Car> carList) {
        return carList.stream() .mapToDouble(Car::getPrice).max().orElse(0);  
    }
     public static void main(String [] args) {
    	 List<Car> carList = Arrays.asList(
    			    new Car("John", "Alfa Romeo", 50000),
    			    new Car("Jane", "Bugatti", 2000000),
    			    new Car("Jack", "Chrysler", 30000),
    			    new Car("Jill", "Dodge", 40000),
    			    new Car("James", "Essen", 50000)
    			);

    			CarImplementation implementation = new CarImplementation();
    			double totalPrice = implementation.sumOfPrices(carList);
    			List<String> carNames = implementation.printName(carList);
    			double maxPrice = implementation.maxPrice(carList);

    			
    			System.out.println(totalPrice);   
    			System.out.println(carNames);     
    			System.out.println(maxPrice);     


}}