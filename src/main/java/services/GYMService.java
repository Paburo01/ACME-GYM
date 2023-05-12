
package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import domain.GYM;
import repositories.GYMRepository;

@Service
@Transactional
public class GYMService {

	@Autowired
	private GYMRepository gymRepository;


	public Collection<GYM> findAll() {
		Collection<GYM> result;
		result = this.gymRepository.findByActive(true);
		return result;
	}
}
