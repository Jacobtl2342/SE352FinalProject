package com.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.server.Repositories.OrdersRepository;
import com.server.Repositories.UserRepository;
import com.server.Repositories.CouponsRepository;
import com.server.Repositories.ReviewsRepository;
import com.server.Repositories.PaymentRepository;
import com.server.Repositories.LogsRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrdersRepository OrdersRepository;
    @Autowired
    private CouponsRepository CouponsRepository;
    @Autowired
    private ReviewsRepository ReviewsRepository;
    @Autowired
    private PaymentRepository PaymentRepository;
    @Autowired
    private LogsRepository LogsRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(userRepository.findAll());
        System.out.println(OrdersRepository.findAll());
        System.out.println(CouponsRepository.findAll());
        System.out.println(ReviewsRepository.findAll());
        System.out.println(PaymentRepository.findAll());
        System.out.println(LogsRepository.findAll());
        System.out.println("Above this should appear the test data");
    }
} 