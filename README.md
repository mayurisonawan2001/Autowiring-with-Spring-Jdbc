Autowiring in Spring means automatically injecting dependencies using annotations like @Autowired, without manually defining beans in XML.
In Spring JDBC, you typically autowire:
1. JdbcTemplate into your DAO class
2. DAO into your service/controller (if needed)

🧠 Key Annotations Used
Annotation	Purpose
@Autowired	Injects a bean automatically
@Component / @Repository	Marks the class as a Spring-managed component
@Configuration	Java-based configuration
@Bean	Declares a bean in Java config

✅ Example: Autowiring JdbcTemplate in a Spring JDBC Project
1. AppConfig.java (Java-based Configuration)
2. StudentDaoImpl.java with Autowiring
3. App.java (Main Class)
   
✅ Summary
JdbcTemplate -	In StudentDaoImpl
DataSource -	Into JdbcTemplate via Java config
All beans -	Automatically scanned via @ComponentScan

💡 Tip:
You don’t need to use @Autowired on constructors if your class has only one constructor – Spring does it automatically.

