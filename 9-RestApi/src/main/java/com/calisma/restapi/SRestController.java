package com.calisma.restapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Subscriber;
@RestController
public class SRestController {

	
	DataRepository repo= new DataRepository();
	
@PostMapping(path = "/subscriber")
	public void Insert(@RequestBody Subscriber sp) {
    repo.Insert(sp);
 
	}


@PutMapping(path = "/subscriber")
public ResponseEntity<String> update(@RequestBody Subscriber s) {
	boolean statu =repo.Update(s);
	if(!statu) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not found id");
	}else {
		return ResponseEntity.status(HttpStatus.OK).body("successfully updated");
	}
}


@DeleteMapping(path = "/subscriber")
public ResponseEntity<String> delete(@RequestBody Subscriber s) {
	
		boolean statu =repo.Delete(s);
	if(!statu) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not found id");
	}else {
		return ResponseEntity.status(HttpStatus.OK).body("successfully deleted");
	}
}


}
