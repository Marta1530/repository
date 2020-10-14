package com.tas.tastool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tas.tastool.Repository.AccidentRepository;
import com.tas.tastool.Repository.MotoristRepository;
import com.tas.tastool.Repository.VehicleRepository;
import com.tas.tastool.domain.Accident;
import com.tas.tastool.domain.Motorist;
import com.tas.tastool.domain.Vehicle;

@SpringBootApplication
public class TastoolApplication implements CommandLineRunner{
 @Autowired
 AccidentRepository Accrepo;
 @Autowired
 VehicleRepository Vehrepo;
 @Autowired
 MotoristRepository Motrepo;
 
	public static void main(String[] args) {
		SpringApplication.run(TastoolApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//TODO Auto-generated method stub
		Accident acc= new Accident();
		acc.setAcidentid(01);
		acc.setAddress("Debrebirhan");
		
		this.Accrepo.save(acc);
		
		Vehicle veh= new Vehicle();
		veh.setVehicleid("vv1");
		veh.setMake("toyota");
		veh.setModel("BMW");
		veh.setColor("yello");
		veh.setAccident(acc);
		
		this.Vehrepo.save(veh);
		
		Motorist mot= new Motorist();
		mot.setDriverlicense("Auto123");
		mot.setFirstname("Hana");
		mot.setLastname("Ayele");
		mot.setAge(30);
		mot.setVehicle(veh);
		
		this.Motrepo.save(mot);
	
		
	}

}
  