package com.example.demo.listener;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	
	@JmsListener(destination = "standalone.queue")
   // public void consume(HashMap<String,String> message) {
	   public void consume(String message) {
		
		
		System.out.println("Found transaction over alert threshold: "+ "\n" + "description: Weird transaction, " + message);
    }	
	
	
}
