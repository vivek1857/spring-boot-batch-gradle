package com.vmtech.batch.hello;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Autowired
    public Pix2ConfigPorperties pix2Properteis;
    
    @Autowired
	private ApplicationContext ctx;
    
    
    @Override
    public Person process(final Person person) throws Exception {
    	
    	//System.out.println("%%%%%%%%%%%%%%%%%%  "+pix2Properteis.getcolumnNumbers().size());
    	//System.out.println("~~~~~~~~~~~~~~~~~  "+pix2Properteis.getName());
    	
    	System.out.println("Calling wirter::::");
		Arrays.asList(ctx.getBeanDefinitionNames()).forEach(System.out::println);
		
    	List<Integer> getcolumnNumbers = pix2Properteis.getcolumnNumbers();
        getcolumnNumbers.forEach(System.out::println);
        final String firstName = person.getFirstName().toUpperCase();
        final String lastName = person.getLastName().toUpperCase();

        final Person transformedPerson = new Person(firstName, lastName);

        log.info("Converting (" + person + ") into (" + transformedPerson + ")");
        System.out.println(transformedPerson.toString());

        return transformedPerson;
    }

}
