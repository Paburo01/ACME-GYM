
package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import domain.Training;
import repositories.TrainingRepository;

@Service
@Transactional
public class TrainingService {

	@Autowired
	private TrainingRepository trainingRepository;


	public Collection<Training> findAll() {
		Collection<Training> trainings;

		trainings = this.trainingRepository.findAll();

		return trainings;
	}
}
