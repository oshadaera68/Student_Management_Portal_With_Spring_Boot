package lk.booleanlabs.sms.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : oshadaera68
 * @since : 0.1.0
 **/
@Configuration
public class WebAppConfig {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
