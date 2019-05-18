package com.ironmountain.rcr;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ishara Madhawa on 5/18/2019.
 */
@RestController
public class Controller{
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(){
        return "Successful!";
    }
}
