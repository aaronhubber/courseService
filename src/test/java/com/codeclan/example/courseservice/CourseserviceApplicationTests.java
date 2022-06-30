package com.codeclan.example.courseservice;

import com.codeclan.example.courseservice.models.Booking;
import com.codeclan.example.courseservice.models.Course;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseserviceApplicationTests {

	Course course;
	List<Booking> bookingList1 = new ArrayList<>();
	List<Booking> booking2;
	Booking booking;

	@Before
	public void before(){
		booking = new Booking("4th August");
		
//		booking = Booking
//				.builder()
//				.date("4th August")
//				.build();

		bookingList1.add(booking);

		course = Course
				.builder()
				.name("Advanced Hungarian Folk Dance")
				.town("Norwich")
				.starRating(3)
				.bookings(booking2)
				.build();
	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void courseHasName(){
		assertEquals("Advanced Hungarian Folk Dance", course.getName());
	}
	@Test
	public void courseHasTown(){
		assertEquals("Norwich", course.getTown());
	}
	@Test
	public void courseHasStarRating(){
		assertEquals(3, course.getStarRating());
	}




}
