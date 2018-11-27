package beans.config;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import beans.dao.FileUploadDao;
import beans.dao.FilrUploadDaoImpl;

@Configuration
@ComponentScan(basePackages={"beans"})
public class AppConfig
{
	@Autowired
	@Bean(name = "fileUploadDao")
	public FileUploadDao getUserDao(SessionFactory sessionFactory) {
	    return new FilrUploadDaoImpl(sessionFactory);
	}
	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver getCommonsMultipartResolver() {
	    CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
	    multipartResolver.setMaxUploadSize(20971520);   // 20MB
	    multipartResolver.setMaxInMemorySize(1048576);  // 1MB
	    return multipartResolver;
	}
	@Bean(name = "dataSource")
	public DataSource getDataSource() {
	    BasicDataSource dataSource = new BasicDataSource();
	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/filedb");
	    dataSource.setUsername("root");
	    dataSource.setPassword("secret");
	 
	    return dataSource;
	}
}
