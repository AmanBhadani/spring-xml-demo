package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 = context.getBean("movie1", Movie.class);
        Movie movie2 = context.getBean("movie2", Movie.class);
        Movie movieA = context.getBean("MovieA", Movie.class);
        Movie movieb = context.getBean("MovieB", Movie.class);
        System.out.println(movie1.toString());
        System.out.println(movie2.toString());
        System.out.println(movieA.toString());
        System.out.println(movie1==movie2);


    }
}
