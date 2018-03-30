package com.vmtech.batch.hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ConfigurationProperties("pix2")
@PropertySource("classpath:pix2configuration.properites")
@Component
public class Pix2ConfigPorperties {
	
	public List<Integer> columnNumbers = new ArrayList<>();
	
	public String name;

	public List<Integer> getColumnNumbers() {
		return columnNumbers;
	}

	public void setColumnNumbers(List<Integer> columnNumbers) {
		this.columnNumbers = columnNumbers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getcolumnNumbers() {
		return columnNumbers;
	}

	public void setcolumnNumbers(List<Integer> columnNumbers) {
		System.out.println("******************************");
		this.columnNumbers = columnNumbers;
	}
	public Integer[] getPix2columnNumbers(){
		return columnNumbers.toArray(new Integer[columnNumbers.size()]);
	}
	

}
