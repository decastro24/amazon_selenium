package runner;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import test.go_to_amazon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;

public class TestNGRunner {

    public static void main(String[] args) throws IOException {
        try {
            System.setProperty("log4j.configuration", new File(".", File.separatorChar+"log4j.properties").toURL().toString());
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Was here!");
        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { go_to_amazon.class });
        testng.addListener(tla);
        testng.run();
        System.out.println("Exiting");
    }

}


