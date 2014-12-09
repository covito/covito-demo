package org.covito.demo.rest.action;


import javax.servlet.http.HttpServletRequest;

import org.covito.demo.rest.JsonReturn;
import org.covito.demo.rest.JsonReturnHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping
public class RestController {

    @RequestMapping(value = "/json/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonReturn getJsonRestObject(@PathVariable Integer id) {
        return JsonReturnHelper.ok(id);
    }

    @RequestMapping("/json/index")  
    public ModelAndView testLogin(@RequestParam(value="id") Integer id) {

    	return new ModelAndView(new RedirectView(id+""));  
    }
  
}
