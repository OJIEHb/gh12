package garage.configuration;

import garage.Car;
import garage.carParts.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by andrey on 01.02.17.
 */
@Configuration
public class AppConfig {
    @Bean(initMethod = "init")
    public Tyres tyres(){
        return new Tyres();
    }

    @Bean(initMethod = "init")
    public WinterTyres winterTyres(){
        return new WinterTyres();
    }

    @Bean(initMethod = "init")
    public SummerTyres summerTyres(){
        return new SummerTyres();
    }

    @Bean
    public Wheel wheel(){
        return new Wheel(tyres());
    }

    @Bean(initMethod = "init")
    public Engine engine(){
        return new Engine();
    }
    @Bean
    public Car car(){
        return new Car(wheel(),engine());
    }
}
