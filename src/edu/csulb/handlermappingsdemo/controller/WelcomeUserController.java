/**
 * 
 */
package edu.csulb.handlermappingsdemo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @author Manav
 *
 */
public class WelcomeUserController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ModelAndView model = new ModelAndView("welcomeUser");
		model.addObject("msg", "Hello User. Welcome to Handler Mappig Demo");

		return model;
	}
}
