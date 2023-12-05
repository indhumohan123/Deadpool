package com.example.Deadpool;



	@RestController
	@RequestMapping(path="/go")
	public class AvengersExecution{
		@GetMapping(path="/boy")
		public String check() {
			return "I am Immortal";
		}
	}

