package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	public String[] arr = {
			"Abcdedf" , "ijklmno" ,"qrwxyz"
	};
	
	private Random random = new Random();
	@Override
	public String getFortuneService() {
		int index = random.nextInt(arr.length);
		
		String word = arr[index];
		return word;
	}

}
