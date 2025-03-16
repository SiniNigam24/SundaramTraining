package com.Practice;

import java.util.*;

public class Source {

	public static void main(String[] args) {
		ArrayList<Restaurent> objList=new ArrayList();
		DAOLayer daoObj=new DAOLayer();
		Restaurent obj1=new Restaurent("NH8","Indiranagar","Indian","3");
		Restaurent obj2=new Restaurent("NH7","Kanpur","Italian","4");
		Restaurent obj3=new Restaurent("NH1","Delhi","NorthIndian","5");
		Restaurent obj4=new Restaurent("NH3","Banglore","SouthIndian","4");
		
		objList.add(obj4);objList.add(obj2);objList.add(obj3);
		daoObj.addRestaurent(objList);
		
		
		daoObj.searchRestaurent(objList,"NH8");
		
		

	}

}
