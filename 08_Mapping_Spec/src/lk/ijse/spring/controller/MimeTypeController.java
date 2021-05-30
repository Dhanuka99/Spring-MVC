package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/api/v1/mime")
public class MimeTypeController {

//    We can narrow down a request using request headers (Content-Type)

/*    //depend on the request Content-Type
    //filter out if the request content type have application/json content or not.
    @GetMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}) // we can check the type of request body
    public String test1() {
        return "Content JSON";
    }
    //filter out if the request content type have text/html content or not.
    @GetMapping(consumes = {MediaType.TEXT_HTML_VALUE})
    public String test2() {
        return "Content Text";
    }*/

    //produce - what request sender hope as the response content (defined in the Accept header)
    @GetMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String test3() {
        return "Request Content Type Must be application/json - Response Content Type must be application/json";
    }

    @GetMapping(consumes = {MediaType.TEXT_HTML_VALUE}, produces = {MediaType.TEXT_PLAIN_VALUE})
    public String test4() {
        return "Request Content Type Must be text/html - Response Content Type must be plain/text";
    }

    @GetMapping(headers = {"Content-Type=text/html","Accept=text/html"})
    public String test5() {
        return "Request Content Type Must be text/html - Response Content Type must be text/html";
    }




}
