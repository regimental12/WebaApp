/**
 * Created by Richard on 20/02/2017.
 */

package com.richard.shiftplanner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController
{
    @RequestMapping(value = "/")
    public String index()
    {
        return "index";
    }
}
