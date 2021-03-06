package com.training.maps;

import java.util.*;

public class TranslateService {
	
	private Hashtable<String, String> hindiToEnglish;
	
	public TranslateService(){
		
		hindiToEnglish = new Hashtable<String, String>();
		init();
	}
	
	public void init(){
		
		hindiToEnglish.put("Ek", "One");
		hindiToEnglish.put("Two", "Do");
		hindiToEnglish.put("Teen", "Three");
	}
	
	public String findEngWord(String hindiWord){
		return  hindiToEnglish.get(hindiWord);
	}

	public void printWords(){
		
		Set<Map.Entry<String,String>> list = hindiToEnglish.entrySet();
		
		for(Map.Entry<String, String> words : list)
		{
			System.out.println(words.getKey() + " := " +words.getValue());
		}
		
	}
}
