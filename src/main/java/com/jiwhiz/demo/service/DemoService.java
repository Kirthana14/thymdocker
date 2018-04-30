package com.jiwhiz.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import com.jiwhiz.demo.model.Demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface DemoService {
                
	       	void addService(String name, String description, String version);
		List<Demo> findAll();
                List<Demo> findAllVersion();
	
}

