@SpringBootApplication
@RestController
public class ConfigServerHandsonApplication {	
	@Autowired
	MyConfig myConfig;	
	
	@RequestMapping("/fromprop")
	public String fromEnv() {
		return myConfig.getGreeting();
	}
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerHandsonApplication.class, args);
	}

}
