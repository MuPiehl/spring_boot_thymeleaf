package mpi_tryouts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by matthiaspiehl on 14.03.15.
 */
@Controller
class HomeController {

    @RequestMapping("/")
    String index() {
        return "index";
    }
}