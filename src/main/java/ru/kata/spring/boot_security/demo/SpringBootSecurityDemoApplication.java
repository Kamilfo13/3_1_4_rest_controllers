package ru.kata.spring.boot_security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSecurityDemoApplication  {

//	@Autowired
//	private UserService userService; // Ваш сервис для работы с пользователями
//	@Autowired
//	private PasswordEncoder passwordEncoder;
//	@Autowired
//	private RoleService roleService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityDemoApplication.class, args);
	}
}
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		initRoles();
//
//
//		createUser ("admin", "admin123", "ROLE_ADMIN");
//		createUser ("user", "user123", "ROLE_USER");
//	}
//
//	private void initRoles() {
//		// Инициализация ролей
//		if (roleService.findByName("ROLE_ADMIN") == null) {
//			Role adminRole = new Role();
//			adminRole.setName("ROLE_ADMIN");
//			roleService.saveRole(adminRole);
//		}
//		if (roleService.findByName("ROLE_USER") == null) {
//			Role userRole = new Role();
//			userRole.setName("ROLE_USER");
//			roleService.saveRole(userRole);
//		}
//	}
//
//	private void createUser (String username, String password, String roleName) {
//		if (userService.findByUsername(username) == null) {
//			User user = new User();
//			user.setUsername(username);
//			user.setPassword(passwordEncoder.encode(password));
//
//
//			Role role = roleService.findByName(roleName);
//			if (role != null) {
//				Set<Role> rolesSet = new HashSet<>();
//				rolesSet.add(role);
//				user.setRoles(rolesSet);
//			} else {
//				throw new IllegalArgumentException("Role not found: " + roleName);
//			}
//
//			userService.saveUser (user);
//		}
//	}
//}


//	@Bean
//	CommandLineRunner initTestUsers(UserRepository userRepository,
//									RoleRepository roleRepository,
//									PasswordEncoder passwordEncoder) {
//		return args -> {
//			// Создание ролей
//			Role adminRole = roleRepository.findByName("ROLE_ADMIN")
//					.orElseGet(() -> {
//						Role newRole = new Role("ROLE_ADMIN");
//						return roleRepository.save(newRole);
//					});
//
//			Role userRole = roleRepository.findByName("ROLE_USER")
//					.orElseGet(() -> {
//						Role newRole = new Role("ROLE_USER");
//						return roleRepository.save(newRole);
//					});
//
//			// Создание тестовых пользователей
//			if (userRepository.findByUsername("admin").isEmpty()) {
//				User adminUser  = new User();
//				adminUser .setUsername("admin");
//				adminUser .setPassword(passwordEncoder.encode("admin123"));
//				adminUser .setRoles(Set.of(adminRole));
//				userRepository.save(adminUser );
//			}
//
//			if (userRepository.findByUsername("user").isEmpty()) {
//				User normalUser  = new User();
//				normalUser .setUsername("user");
//				normalUser .setPassword(passwordEncoder.encode("user123"));
//				normalUser .setRoles(Set.of(userRole));
//				userRepository.save(normalUser );
//			}
//		};
//	}
