package com.valaxy.TaxiGrabber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CTGController {

	@GetMapping("/")
	public String getIndex() {
		return "index.html";
	}

	@GetMapping(value = "/services")
	public String getServices() {
		return "services.html";
	}

	@GetMapping(value = "/drivers")
	public String getDrivers() {
		return "drivers.html";
	}

	@GetMapping(value = "/cars")
	public String getCars() {
		return "cars.html";
	}

	@GetMapping(value = "/garage")
	public String getGarage() {
		return "garage.html";
	}

	@GetMapping(value = "/locations")
	public String getLocations() {
		return "locations.html";
	}

	@GetMapping(value = "/post")
	public String getPost() {
		return "post.html";
	}

	@GetMapping(value = "/about")
	public String getAbout() {
		return "about.html";
	}		

	@GetMapping(value = "/testimonials")
	public String getTestimonials() {
		return "testimonials.html";
	}		

	@GetMapping(value = "/jobs")
	public String getJobs() {
		return "jobs.html";
	}		

	@GetMapping(value = "/blog")
	public String getBlog() {
		return "blog.html";
	}		

	@GetMapping(value = "/contact")
	public String getContact() {
		return "contact.html";
	}
}
