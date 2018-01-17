

package br.com.internacionalizacao.camadauso;

import java.util.Locale;
import javax.swing.JOptionPane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UsaInternacionalizacao {
     public static void main(String[]args){
         ApplicationContext apContext =
         new ClassPathXmlApplicationContext("br/com/internacionalizacao/beans/spring/applicationContext.xml");

          MessageSource ms = (MessageSource)apContext.getBean("messageSource");


    }

 }
