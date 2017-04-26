@SpringBootApplication
@RestController
public class ConfigServerHandsonApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(ConfigServerHandsonApplication.class);
	
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
