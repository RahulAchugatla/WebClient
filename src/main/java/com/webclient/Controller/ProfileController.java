//package com.AaL.AuditingAndLombok.Controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.envers.repository.support.EnversRevisionRepositoryFactoryBean;
//import org.springframework.data.history.Revision;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.AaL.AuditingAndLombok.Entities.ProfileEntity;
//import com.AaL.AuditingAndLombok.Repository.ProfileRepository;
//import com.AaL.AuditingAndLombok.Service.ProfileService;
//
//@RestController
//@RequestMapping("/Auditing")
//@EnableJpaRepositories(repositoryFactoryBeanClass = EnversRevisionRepositoryFactoryBean.class)
//public class ProfileController {
//
//	@Autowired
//	private ProfileService profileServiceImpl;
//
//	@Autowired
//	private ProfileRepository profileRepo;
//
//	@PostMapping("/saveProfile")
//	public ResponseEntity<ProfileEntity> saveProfile(@RequestBody ProfileEntity profile) {
//		ProfileEntity savedProfile = profileServiceImpl.saveProfile(profile);
//		return ResponseEntity.ok(savedProfile);
//	}
//
//	@PutMapping("/update/{id}")
//	public ResponseEntity<ProfileEntity> updateProfileById(@PathVariable Long id,
//			@RequestBody ProfileEntity updatedProfile) {
//		ProfileEntity updatedEntity = profileServiceImpl.updateProfileById(id, updatedProfile);
//		if (updatedEntity != null) {
//			return ResponseEntity.ok(updatedEntity);
//		} else {
//			return ResponseEntity.notFound().build();
//		}
//	}
//	
//	/**
//	 * getting all users
//	 * @return
//	 */
//	@GetMapping("/getAllUsers")
//	public ResponseEntity<List<ProfileEntity>> getAllUsers(){
//		List<ProfileEntity> allUsers= profileServiceImpl.getAllUsers();
//		return ResponseEntity.ok(allUsers);
//	}
//	/*
//	 * Getting user by id
//	 */
//	@GetMapping("/getUserById/{id}")
//	public Optional<ProfileEntity> getUserById(@PathVariable long id){
//		Optional<ProfileEntity> user= profileServiceImpl.getUserById(id);
//		return user;
//	}
//	
////	@GetMapping("/getinfo/{id}")
////	 public void  getInfo(@PathVariable Long id){
////		Optional<Revision<Long, ProfileEntity>> profile = profileRepo.findLastChangeRevision(id);
////		System.out.println(profile);
////	}
//
//}
package com;


