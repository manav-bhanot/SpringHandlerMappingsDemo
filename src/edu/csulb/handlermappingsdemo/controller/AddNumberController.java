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
public class AddNumberController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ModelAndView model = new ModelAndView("addition");
		Integer number = 2 + 3;
		model.addObject("result", number.toString());
		return model;
	}

}
