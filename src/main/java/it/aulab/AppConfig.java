package it.aulab;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import it.aulab.model.Batman;
import it.aulab.model.Batmobile;
import it.aulab.model.Hook;
import it.aulab.model.Mask;
import it.aulab.model.Suit;

@Configuration
@ComponentScan("it.aulab")
public class AppConfig {
    @Bean(name = "batmanBlack")
    // @Scope("singleton")
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public Batman getBatman(){
        return new Batman(getSuitBlack(), getBatmobile());

    }


    @Bean(name = "batmanWhite")
    // @Scope("singleton")
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public Batman getBatmanWhite(){
        return new Batman(getSuitWhite(), getBatmobile());

    }


    @Bean(name = "batmobile")
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public Batmobile getBatmobile(){
        return new Batmobile("#0F0F0F");
    }


    @Bean(name = "hook")
    public Hook getHook(){
        return new Hook(10);
    }


    @Bean(name = "mask")
    public Mask getMask(){
        return new Mask("#000000");
    }


    @Bean(name = "suitBlack")
    public Suit getSuitBlack(){
        return new Suit("000000", getMask(), getHook());
    }



    @Bean(name = "suitWhite")
    public Suit getSuitWhite(){
        return new Suit("FFFFFF", getMask(), getHook());
    }
}

