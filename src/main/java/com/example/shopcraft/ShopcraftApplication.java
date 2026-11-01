package com.example.shopcraft;

import com.example.shopcraft.model.Product;
import com.example.shopcraft.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShopcraftApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopcraftApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository) {
        return args -> {
            // Laptops & Computers
            productRepository.save(new Product("Gaming Laptop 15 Pro", "Electronics", 1200.00, 10));
            productRepository.save(new Product("UltraBook Thin 14", "Electronics", 950.00, 15));
            productRepository.save(new Product("MacBook Air Pro 13", "Electronics", 1100.00, 12));
            productRepository.save(new Product("Desktop PC Workstation", "Electronics", 1500.00, 5));
            productRepository.save(new Product("Mini PC Station", "Electronics", 450.00, 20));
            productRepository.save(new Product("Gaming Laptop 17 Max", "Electronics", 1850.00, 8));
            productRepository.save(new Product("Student Chromebook 11", "Electronics", 299.00, 30));

            // Smartphones & Tablets
            productRepository.save(new Product("Smartphone Pro Max 256GB", "Mobiles", 999.00, 25));
            productRepository.save(new Product("Smartphone Lite 128GB", "Mobiles", 499.00, 40));
            productRepository.save(new Product("Foldable Smartphone Z", "Mobiles", 1399.00, 7));
            productRepository.save(new Product("Budget Smartphone 5G", "Mobiles", 249.00, 50));
            productRepository.save(new Product("Pro Tablet 11-Inch", "Mobiles", 650.00, 18));
            productRepository.save(new Product("Tablet Air 10.5", "Mobiles", 420.00, 22));
            productRepository.save(new Product("E-Reader Paperwhite", "Mobiles", 129.00, 35));

            // Audio & Headphones
            productRepository.save(new Product("Wireless Noise Canceling Headphones", "Audio", 150.00, 25));
            productRepository.save(new Product("True Wireless Earbuds", "Audio", 89.00, 60));
            productRepository.save(new Product("Bluetooth Soundbar Speaker", "Audio", 120.00, 15));
            productRepository.save(new Product("Gaming Headset 7.1 Surround", "Audio", 75.00, 30));
            productRepository.save(new Product("Portable Waterproof Speaker", "Audio", 55.00, 45));
            productRepository.save(new Product("Studio Monitor Headphones", "Audio", 199.00, 12));
            productRepository.save(new Product("Podcast USB Condenser Microphone", "Audio", 110.00, 18));

            // Wearables & Watches
            productRepository.save(new Product("Smartwatch Series 5 Ultra", "Wearables", 250.00, 15));
            productRepository.save(new Product("Fitness Tracker Band HR", "Wearables", 49.00, 75));
            productRepository.save(new Product("Hybrid Analog Smartwatch", "Wearables", 180.00, 20));
            productRepository.save(new Product("GPS Running Watch", "Wearables", 299.00, 14));
            productRepository.save(new Product("Kids GPS Tracker Watch", "Wearables", 69.00, 28));

            // PC Accessories & Peripherals
            productRepository.save(new Product("RGB Mechanical Gaming Keyboard", "Accessories", 85.00, 35));
            productRepository.save(new Product("Ergonomic Wireless Mouse", "Accessories", 35.00, 50));
            productRepository.save(new Product("27-Inch 4K IPS Monitor", "Accessories", 320.00, 12));
            productRepository.save(new Product("Full HD 1080p Webcam", "Accessories", 45.00, 40));
            productRepository.save(new Product("USB-C Multi-Port Hub", "Accessories", 39.00, 60));
            productRepository.save(new Product("Extra Large Gaming Mousepad", "Accessories", 20.00, 100));
            productRepository.save(new Product("Adjustable Aluminium Laptop Stand", "Accessories", 29.00, 45));
            productRepository.save(new Product("External SSD 1TB Portable", "Accessories", 109.00, 30));
            productRepository.save(new Product("Uninterruptible Power Supply (UPS)", "Accessories", 95.00, 15));

            // Cameras & Photography
            productRepository.save(new Product("Mirrorless 4K Camera Kit", "Cameras", 899.00, 9));
            productRepository.save(new Product("Action Camera Waterproof 4K", "Cameras", 199.00, 25));
            productRepository.save(new Product("HD Dash Camera for Cars", "Cameras", 65.00, 35));
            productRepository.save(new Product("Compact Tripod Stand", "Cameras", 25.00, 50));
            productRepository.save(new Product("3-Axis Handheld Smartphone Gimbal", "Cameras", 119.00, 16));

            // Gaming Consoles & Accessories
            productRepository.save(new Product("Next-Gen Home Gaming Console", "Gaming", 499.00, 10));
            productRepository.save(new Product("Handheld Portable Gaming Console", "Gaming", 349.00, 20));
            productRepository.save(new Product("Wireless Bluetooth Gamepad", "Gaming", 59.00, 40));
            productRepository.save(new Product("Virtual Reality (VR) Headset", "Gaming", 399.00, 8));
            productRepository.save(new Product("Racing Wheel and Pedals Set", "Gaming", 249.00, 6));

            // Smart Home & Networking
            productRepository.save(new Product("Smart Home Voice Assistant Speaker", "Smart Home", 49.00, 65));
            productRepository.save(new Product("Wi-Fi 6 Mesh Router System", "Networking", 189.00, 18));
            productRepository.save(new Product("Smart Security Camera 2-Pack", "Smart Home", 89.00, 22));
            productRepository.save(new Product("Smart LED Light Strip 5M", "Smart Home", 24.00, 80));
            productRepository.save(new Product("Smart Doorbell with Video", "Smart Home", 129.00, 14));
        };
    }
}