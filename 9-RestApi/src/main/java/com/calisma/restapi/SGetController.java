package com.calisma.restapi;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Subscriber;

@RestController
public class SGetController {
	
	// all subscriber Rest -> json
	// Return HashMap<String, Object>
	
	DataRepository repo= new DataRepository();
	
	@RequestMapping(value="/getAllSubscribers", method = RequestMethod.GET)
	 public HashMap<String, Object> getAllSubscribers(){
		HashMap<String, Object> hm = new HashMap<>();
		
		List<Subscriber> ls = repo.List();
		if(ls.size() == 0) {
			hm.put("statu", false);
			hm.put("message", "Subscribers list is empty");
		} else {
			hm.put("statu", true);
			hm.put("message", "Kullanıcılar başarıyla listelendi");
			hm.put("count", ls.size());
			hm.put("subscribers", ls);
		}

			return hm;	 
	 }
	
	@RequestMapping(value="/getAllSubscribersById/{id}", method = RequestMethod.GET)
	 public HashMap<String, Object> getAllSubscribersById(@PathVariable int id){
		HashMap<String, Object> hm = new HashMap<>();
		
		List<Subscriber> ls = repo.ListById(id);
		if(ls.size() == 0) {
			hm.put("statu", false);
			hm.put("message", "Subscribers list is empty");
		} else {
			hm.put("statu", true);
			hm.put("message", "Kullanıcılar başarıyla listelendi");
			hm.put("count", ls.size());
			hm.put("subscribers", ls);
		}	
			return hm;		 
	 }
	

}
