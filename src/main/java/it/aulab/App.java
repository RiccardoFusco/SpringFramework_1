package it.aulab;
import it.aulab.model.Batman;
import it.aulab.model.Batmobile;
import it.aulab.model.Suit;
import it.aulab.service.BatmanService;

// import java.security.Provider.Service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);  
        Batman batman = context.getBean("batman", Batman.class);
        Batmobile batmobile1 = context.getBean("batmobile", Batmobile.class);
        Batmobile batmobile2 = context.getBean("batmobile", Batmobile.class);
        Suit suit = context.getBean("suit", Suit.class);


        // System.out.println(batman.getBatmobile());
        // System.out.println(batman.getSuit());
        // System.out.println(batmobile1);
        // System.out.println(batmobile2);
        // System.out.println(suit);

        BatmanService service = context.getBean("batmanService", BatmanService.class);


        service.attack();
        service.climb();
        service.glide();
        service.goForwardWithBatmobile();
        service.goBackWithBatmobile();

        System.out.println(service);



    }
}
