package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	  public int add(int a , int b) {

        return  a+b;
    }

    public int multiply(int a , int b) {

        return  a*b;
    }

    public int divide(int a , int b) {
	if (b==0){
		throw new IllegalArgumentException("Cannot divide by zero");
	}
        return a/b;
    }
}

}
