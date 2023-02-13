package com.plantplace;

import org.springframework.stereotype.Controller;

@Controller

public class PlantPlacesController {

	@RequestMapping("/start")
	public String start() {
		return "start";
	}
}
