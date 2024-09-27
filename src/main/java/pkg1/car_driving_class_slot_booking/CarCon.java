package pkg1.car_driving_class_slot_booking;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;

public class CarCon {
	@PostMapping("/test1")
	public String method1() {
		return "Booking Successful";
	}
	@PostMapping("/test2")
	public String method2() {
		return "Booking Confirmed";
	}
	ArrayList<String>c1=new ArrayList<>();
}
