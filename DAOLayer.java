package com.Practice;

import java.util.*;

public class DAOLayer {
	List<Restaurent> RestInfo=new ArrayList();
	Set<Restaurent> restauInfo=new HashSet();
  public Set<Restaurent> searchRestaurent( ArrayList<Restaurent> contacts,String info) {
	  for(Restaurent r:contacts)
//	  Iterator<Restaurent> r= contacts.iterator();
	  {
		  if((r.name).equals(info)) {
			  restauInfo.add(r);} }
		  
	  
	  
	  
	  return restauInfo;
	  
	  
  }
  
  
  
   void addRestaurent(ArrayList<Restaurent> al) {
	  for(Restaurent r:al) {
		  RestInfo.add(r);}
	  
	  for(Restaurent r:RestInfo) {
		  System.out.println(r);}}
	  
	  
  


}
