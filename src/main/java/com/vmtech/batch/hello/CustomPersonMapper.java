package com.vmtech.batch.hello;

import java.util.Properties;

import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class CustomPersonMapper<T> extends BeanWrapperFieldSetMapper<Person> {
	@Override
	public Person mapFieldSet(FieldSet fs) throws BindException{
		
		String[] names = fs.getNames();
		String[] values = fs.getValues();
		Properties properties = fs.getProperties();
		System.out.println(names);
		System.out.println(values);
		System.out.println(properties.toString());
		return null;
	}
}
