package lintran.oec.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by linhtran on 28/04/2017.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String str="https://www.w3schools.com/php/webdictionary.txt";
        String str2="classpath:lintran/oec/com/example.txt";

         ApplicationContext applicationContext= new ClassPathXmlApplicationContext();
        System.out.println(applicationContext.getResource(str).exists());
        System.out.println(applicationContext.getResource(str).getURL().toString());

        System.out.println(applicationContext.getResource(str2).exists());
        System.out.println(applicationContext.getResource(str2).getURL().toString());
        getInputStream(applicationContext,str2);

    }

    public static void getInputStream(ApplicationContext applicationContext,String str) throws IOException {
        InputStream inputStream=applicationContext.getResource(str).getInputStream();
        int c;
        while ((c=inputStream.read())!=-1)
        {
            System.out.print((char)c);
        }
    }
}
