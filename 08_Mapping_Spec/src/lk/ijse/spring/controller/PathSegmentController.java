package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/api/v1/item")
public class PathSegmentController {

    //character matching - can match one character in a path segment
    @GetMapping(path = "/c??1")
    public String getItem1() {
        return "Item One Get";
    }

    @GetMapping(path = "/c?2")
    public String getItem2() {
        return "Item Two Get";
    }


    //wild card
    //Matches 0 or more characters within a path segment
    //c/ddanjnadjsans/123
    @GetMapping(path = "/c/*/123")
    public String getItem3() {
        return "Item Three Get";
    }

    //Matches 0 or more path segments until the end of the path
    //c/dfffff/ddddddd/dfffff/555
    @GetMapping(path = "/c/**/555")
    public String getItem4() {
        return "Item Four Get";
    }







}
