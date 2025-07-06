package com.kavya.ecommerce;

import com.kavya.ecommerce.model.Order;
import com.kavya.ecommerce.repository.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Bean
	CommandLineRunner initData(OrderRepository repository) {
		return args -> {
			repository.save(new Order("ORD001", "Jeevan Reddy", "Laptop", LocalDate.of(2024, 7, 5), 600.0, "Completed"));
			repository.save(new Order("ORD002", "Kavya Reddy", "Mobile", LocalDate.of(2024, 7, 6), 450.0, "Continuing"));
			repository.save(new Order("ORD003", "Sharvya Reddy", "Tablet", LocalDate.of(2024, 7, 7), 720.0, "Canceled"));
			repository.save(new Order("ORD004", "Charan Reddy", "Headphones", LocalDate.of(2024, 7, 8), 150.0, "Pending"));
			repository.save(new Order("ORD005", "Deepak", "Monitor", LocalDate.of(2024, 7, 9), 550.0, "Shipped"));
			repository.save(new Order("ORD006", "Sai Priya", "Keyboard", LocalDate.of(2024, 7, 10), 110.0, "Completed"));
			repository.save(new Order("ORD007", "Divya", "Mouse", LocalDate.of(2024, 7, 11), 90.0, "Pending"));
			repository.save(new Order("ORD008", "Ram", "Webcam", LocalDate.of(2024, 7, 12), 240.0, "Shipped"));
			repository.save(new Order("ORD009", "Lohitha", "Power Bank", LocalDate.of(2024, 7, 13), 400.0, "Completed"));
			repository.save(new Order("ORD010", "Teja", "Bluetooth Speaker", LocalDate.of(2024, 7, 14), 350.0, "Canceled"));
			repository.save(new Order("ORD011", "Vamsi", "Smartwatch", LocalDate.of(2024, 7, 15), 810.0, "Shipped"));
			repository.save(new Order("ORD012", "Meghana", "Printer", LocalDate.of(2024, 7, 16), 950.0, "Restitute"));
			repository.save(new Order("ORD013", "Tarun", "Charger", LocalDate.of(2024, 7, 17), 120.0, "Pending"));
			repository.save(new Order("ORD014", "Bhavya", "Hard Drive", LocalDate.of(2024, 7, 18), 670.0, "Shipped"));
			repository.save(new Order("ORD015", "Surya", "Earbuds", LocalDate.of(2024, 7, 19), 275.0, "Canceled"));
		};
	}
}


