package pkg1.pincodes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PincodeRepo extends JpaRepository<PincodeEntity,Integer>{

}
