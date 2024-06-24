//package com.AaL.AuditingAndLombok.Controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.AaL.AuditingAndLombok.Entities.ProfileEntity;
//import com.AaL.AuditingAndLombok.ServiceImpl.RestTemplateService;
//
//@RestController
//@RequestMapping("/restTemplate")
//public class RestTemplateController {
//	
//	@Autowired
//	private RestTemplateService restTemplateService;
//	
//	@PostMapping("/saveProfile")
//	public ResponseEntity<ProfileEntity> saveProfile(@RequestBody ProfileEntity profile) {
//		return restTemplateService.saveProfile(profile);	 
//	}
//	
//	@GetMapping("/getAllUsers")
//	public ResponseEntity<String> getAllUsers(){
//		return restTemplateService.getAllUsers();
//	}
//	
//	/**
//	 * 
//	 */
//	@GetMapping("/getUserById/{id}")
//	public ProfileEntity getUserById(@PathVariable long id){
//		return restTemplateService.getUserById(id);
//	}
//	/**
//	 * 
//	 * @param id
//	 * @param updatedProfile
//	 * @return
//	 */
//	@PutMapping("/update/{id}")
//	public void updateProfileById(@PathVariable Long id,@RequestBody ProfileEntity updatedProfile) {
//		restTemplateService.updateProfileById(id, updatedProfile);
//	}
//	
//}
package com;


