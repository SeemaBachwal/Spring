package com.springannotationsdemo;

import org.springframework.stereotype.Component;

@Component("restfortune")
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "RESTFortuneService called";
	}

}
