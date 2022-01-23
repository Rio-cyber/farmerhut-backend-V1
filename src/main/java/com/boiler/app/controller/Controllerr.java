package com.boiler.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boiler.app.pojo.consumerlogin;
import com.boiler.app.pojo.consumerregister;
import com.boiler.app.pojo.crops;
import com.boiler.app.pojo.farmerlogin;
import com.boiler.app.pojo.farmerreg;
import com.boiler.app.service.consumerloginservice;
import com.boiler.app.service.cropsservice;
import com.boiler.app.service.customerregservice;
import com.boiler.app.service.farmerloginservice;
import com.boiler.app.service.farmerregservice;



@RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class Controllerr {
	@Autowired
	consumerloginservice clservice;
	@Autowired
	customerregservice crservice;
	@Autowired
	farmerloginservice flservice;
	@Autowired
	farmerregservice frservice;
	@Autowired
	cropsservice cpservice;
	@GetMapping("/consumerlogin")
	public List<consumerlogin> getcl()
	{
		return clservice.getcl();
	}
	
	@PostMapping("/consumerlogin")
	
	public boolean addcl(@RequestBody consumerlogin login)
	{
		clservice.addcl(login);
		return true;
	}
	@GetMapping("/consumerreg")
	public List<consumerregister> getcr()
	{
		return crservice.getcr();
	}
	
	@PostMapping("/consumerreg")
	public boolean addcr(@RequestBody consumerregister reg)
	{
		crservice.addcr(reg);
		return true;
	}
	@GetMapping("/farmerlogin")
	public List<farmerlogin> getfl()
	{
		return flservice.getfl();
	}
	
	@PostMapping("/farmerlogin")
	
	public boolean addfl(@RequestBody farmerlogin login)
	{
		flservice.addfl(login);
		return true;
	}
	@GetMapping("/farmerreg")
	public List<farmerreg> getfr()
	{
		return frservice.getfr();
	}
	
	@PostMapping("/farmerreg")
	public boolean addfr(@RequestBody farmerreg reg)
	{
		frservice.addfr(reg);
		return true;
	}
	@GetMapping("/crops")
	public List<crops> getcp()
	{
		return cpservice.getcp();
	}
	
	@PostMapping("/crops")
	public boolean addcp(@RequestBody crops reg)
	{
		cpservice.addcp(reg);
		return true;
	}
}
