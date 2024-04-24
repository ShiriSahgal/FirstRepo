package com.uv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.uv.entity.User;
import com.uv.entity.Vehichle;
import com.uv.repo.UserRepository;
import com.uv.repo.VehicleRepository;

@SpringBootApplication
public class OneToOneMappingApplication {

	public static void main(String[] args) {
		ApplicationContext context	=SpringApplication.run(OneToOneMappingApplication.class, args);
	

	UserRepository urepo=context.getBean(UserRepository.class);
	
	VehicleRepository vrepo=context.getBean(VehicleRepository.class);
	
	User u=new User();
	
	Vehichle v=new Vehichle();
	
	u.setName("jhon smith");
	
	v.setVname("Creta");
	
	v.setModel(2023);
	u.setVeh(v);
	
	urepo.save(u);
	}

}
