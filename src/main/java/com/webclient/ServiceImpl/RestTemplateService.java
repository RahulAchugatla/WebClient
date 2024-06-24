//package com.AaL.AuditingAndLombok.ServiceImpl;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Optional;
//
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import com.AaL.AuditingAndLombok.Entities.ProfileEntity;
//
//
//@Service
//public class RestTemplateService {
//    
//	/**
//	 * RestTemplate is a class which contains methods
//	 */
//	RestTemplate restTemplate=new RestTemplate();
//	
//	private static final String get_All_Users_URL = "http://localhost:8080/Auditing/getAllUsers";
//	private static final String create_Users_URL = "http://localhost:8080/Auditing/saveProfile";
//	private static final String get_User_URL = "http://localhost:8080/Auditing/getUserById/{id}";
//	private static final String update_User_URL = "http://localhost:8080/Auditing/update/{id}";
//	
//	/**
//	 * This method is for getting all users
//	 * @return
//	 */
//	public ResponseEntity<String> getAllUsers() {
//		HttpHeaders headers=new HttpHeaders();
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		
//		HttpEntity<String> entity=new HttpEntity<String>("parameters",headers);
//		
//		ResponseEntity<String> response=restTemplate.exchange(get_All_Users_URL, HttpMethod.GET, entity,String.class);
//		return response;
//	}
//
//	/**
//	 * This method is for saving users
//	 * @param profile
//	 * @return
//	 */
//	public ResponseEntity<ProfileEntity> saveProfile(ProfileEntity profile){ 
//		return restTemplate.postForEntity(create_Users_URL, profile, ProfileEntity.class);
//	}
//
//	/**
//	 * This method is for getting user by id
//	 * @param id
//	 * @return
//	 */
//	public ProfileEntity getUserById(long id) {
//		Map<String,Long> map=new HashMap<String,Long>();
//		map.put("id",id);
//		return restTemplate.getForObject(get_User_URL, ProfileEntity.class, map);
//	}
//
//	public void updateProfileById(Long id, ProfileEntity updatedProfile) {
//		Map<String,Long> map=new HashMap<String,Long>();
//		map.put("id",id);
//	    restTemplate.put(update_User_URL, updatedProfile,map);
//	}
//}
package com;


