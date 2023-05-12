
package security;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import controllers.AbstractController;

@Controller
@RequestMapping("/security")
public class RegisterController extends AbstractController {

	@Autowired
	RegisterService service;


	public RegisterController() {
		super();
	}

	@RequestMapping("/register")
	public ModelAndView register(@Valid final RegisterCredentials registerCredentials, final BindingResult bindingResult, @RequestParam(required = false) final boolean showError) {
		Assert.notNull(registerCredentials);
		Assert.notNull(bindingResult);

		ModelAndView result;
		result = new ModelAndView("/security/register");

		result.addObject("registerCredentials", registerCredentials);
		result.addObject("showError", showError);
		return result;
	}
}
