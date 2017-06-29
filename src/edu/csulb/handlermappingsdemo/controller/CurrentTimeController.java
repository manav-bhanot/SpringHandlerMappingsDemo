/**
 * 
 */
package edu.csulb.handlermappingsdemo.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @author Manav
 *
 */
public class CurrentTimeController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ModelAndView model = new ModelAndView("currentTime");
		model.addObject("msg", new Date());

		return model;
	}
}
