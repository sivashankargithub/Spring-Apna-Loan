package pkg1.univ1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UnivRepo extends JpaRepository<UnivEntity, Integer>{
	String s1="";
	@Query(value = s1)
	public List<String>getUnivById();
}
