package com.pavan.restController;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/wish")
public class WishController {
	
	public ResponseEntity<String> generateWishMessage()
	{
		LocalDateTime ldt = LocalDateTime.now();
		String body = null;
		 if (hour < 12)
		 body = "Good Morning";
		 else if (hour < 16)
		 body = "Good Afternoon";
		 else if (hour < 20)
		 body = "Good Evening";
		 else
		 body = "Good night";
		 return body;
	}
}
