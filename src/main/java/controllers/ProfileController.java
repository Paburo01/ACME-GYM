/*
 * ProfileController.java
 *
 * Copyright (C) 2018 Universidad de Sevilla
 *
 * The use of this project is hereby constrained to the conditions of the
 * TDG Licence, a copy of which you may download from
 * http://www.tdg-seville.info/License.html
 */

package controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import domain.Activity;
import domain.GYM;
import domain.Training;
import services.ActivityService;
import services.GYMService;
import services.TrainingService;

@Controller
@RequestMapping("/profile")
public class ProfileController extends AbstractController {

	@Autowired
	private ActivityService	activityService;
	@Autowired
	private GYMService		gymService;
	@Autowired
	private TrainingService	trainingService;


	// Action-1 ---------------------------------------------------------------

	@RequestMapping(value = "/see_activities", method = RequestMethod.GET)
	public ModelAndView action1() {
		ModelAndView result;
		Collection<Activity> activities;

		activities = this.activityService.findAll();

		result = new ModelAndView("profile/see_activities");
		result.addObject("activities", activities);

		return result;
	}

	// Action-2 ---------------------------------------------------------------

	@RequestMapping(value = "/see_gyms", method = RequestMethod.GET)
	public ModelAndView action2() {
		ModelAndView result;
		Collection<GYM> gyms;

		gyms = this.gymService.findAll();

		result = new ModelAndView("profile/see_gyms");
		result.addObject("gyms", gyms);

		return result;
	}

	// Action-2 ---------------------------------------------------------------

	@RequestMapping(value = "/see_trainings", method = RequestMethod.GET)
	public ModelAndView action3() {
		ModelAndView result;
		Collection<Training> trainings;

		trainings = this.trainingService.findAll();

		result = new ModelAndView("/profile/see_trainings");
		result.addObject("trainings", trainings);

		return result;
	}

}
