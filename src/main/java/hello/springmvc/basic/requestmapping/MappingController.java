package hello.springmvc.basic.requestmapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappingController {

    private Logger log = LoggerFactory.getLogger(getClass());

    /**
     * Basic request
     * Accept both /hello-basic and /hello-basic/
     * Accept every HTTP method GET, HEAD, POST, PUT, PATCH, and DELETE
     */
    @RequestMapping("/hello-basic")
    public String helloBasic() {

        log.info("helloBasic");
        return "ok";
    }
}
