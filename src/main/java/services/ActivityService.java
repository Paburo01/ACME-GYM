
package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import domain.Activity;
import repositories.ActivityRepository;

@Service
@Transactional
public class ActivityService {

	@Autowired
	private ActivityRepository activityRepository;


	public Collection<Activity> findAll() {
		Collection<Activity> result;

		result = this.activityRepository.findAll();

		return result;
	}

}
