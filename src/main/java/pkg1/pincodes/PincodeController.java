package pkg1.pincodes;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PincodeController {
	@Autowired
	PincodeRepo pincodeRepo;
	
	@GetMapping("/pincode/{param1}")
	public Optional<PincodeEntity> getDetails(@PathVariable Integer param1) {
		Optional<PincodeEntity> list1=pincodeRepo.findById(param1);
		return list1;
	}
	@GetMapping("/pincode2/{param1}")
	public PincodeEntity getDetailsInList(@PathVariable Integer param1) {
		return pincodeRepo.findById(param1).get();
	}

}
