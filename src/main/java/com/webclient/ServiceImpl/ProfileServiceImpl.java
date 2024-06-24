//package com.AaL.AuditingAndLombok.ServiceImpl;
//
//import java.util.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import com.AaL.AuditingAndLombok.Entities.ProfileEntity;
//import com.AaL.AuditingAndLombok.Repository.ProfileRepository;
//import com.AaL.AuditingAndLombok.Service.ProfileService;
//
//@Service
//public class ProfileServiceImpl implements ProfileService {
//
//	@Autowired
//    private ProfileRepository profileRepo;
//
//	/**
//	 * 
//	 */
//	@Override
//	public ProfileEntity saveProfile(ProfileEntity profile) {
//		ProfileEntity savedProfile = profileRepo.save(profile);
//		return savedProfile;
//	}
//
//	/**
//	 * 
//	 */
//	@Override
//	public ProfileEntity updateProfileById(Long id, ProfileEntity updatedProfile) {
//		Optional<ProfileEntity> optionalProfile = profileRepo.findById(id);
//		if (optionalProfile.isPresent()) {
//			ProfileEntity existingProfile = optionalProfile.get();
//			existingProfile.setName(updatedProfile.getName());
//			return profileRepo.save(existingProfile);
//		}
//		return null;
//	}
//
//	/**
//	 * 
//	 */
//	@Override
//	public List<ProfileEntity> getAllUsers() {
//		List<ProfileEntity> allUsers=profileRepo.findAll();
//		return allUsers;
//	}
//
//	/**
//	 * 
//	 */
//	@Override
//	public Optional<ProfileEntity> getUserById(long id) {
//		
//		return profileRepo.findById(id);
//	}
//
//}
package com;


