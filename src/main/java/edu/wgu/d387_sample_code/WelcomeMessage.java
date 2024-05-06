package edu.wgu.d387_sample_code;

import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class WelcomeMessage {

    static ExecutorService welcomeExecutor = newFixedThreadPool(5);
    private List<String> welcomeMessage = new ArrayList<String>();
    public List<String > runWelcomeMessage() {
        welcomeExecutor.execute(() -> {
            try {
                Properties properties = new Properties();
                InputStream englishWelcome = new ClassPathResource("translation_english.properties").getInputStream();
//                InputStream englishWelcome = getClass().getClassLoader().getResourceAsStream("translation_english.properties");
                properties.load(englishWelcome);
                welcomeMessage.add(properties.getProperty("welcome"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        welcomeExecutor.execute(() -> {
            try {
                Properties properties = new Properties();
                InputStream frenchWelcome = new ClassPathResource("translation_french.properties").getInputStream();
//                InputStream frenchWelcome = getClass().getClassLoader().getResourceAsStream("translation_french.properties");
                properties.load(frenchWelcome);
                welcomeMessage.add(properties.getProperty("welcome"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return welcomeMessage;
    }
}