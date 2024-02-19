package pkg1.univ1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnivCon {
	@Autowired
	UnivRepo univRepo;
	
	@PostMapping("/addUniv1")
	public ResponseEntity<UnivEntity> addUniv(@RequestBody UnivEntity ue) {
		UnivEntity ue2=univRepo.save(ue);
		return new ResponseEntity<>(ue2,HttpStatus.CREATED);
	}
}