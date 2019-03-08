package com.scorpio.alen.keycloakspring.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by a.roguljic on 2019-03-07
 */
@RestController
public class ApiController {

	@GetMapping(value = "/admin/{value}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String adminAPI(@PathVariable String value) {
		return "Admin: " + value;
	}

	@GetMapping(value = "/user/{value}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String userAPI(@PathVariable String value) {
		return "User: " + value;
	}

	@GetMapping(value = "/public/{value}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String publicAPI(@PathVariable String value) {
		return "Public: " + value;
	}
}
