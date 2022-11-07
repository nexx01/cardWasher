package carWasher;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

@SpringBootApplication
@EnableConfigurationProperties(value = CarWasherProperties.class)
//@ServletComponentScan
@EnableJpaRepositories(basePackages = "src")
@EnableScheduling
public class App{
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

//	@Bean(name="entityManagerFactory")
//	public LocalSessionFactoryBean sessionFactory() {
//		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//		return sessionFactory;
//	}



}


