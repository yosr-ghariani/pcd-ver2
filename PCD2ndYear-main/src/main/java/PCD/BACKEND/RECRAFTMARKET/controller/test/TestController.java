package PCD.BACKEND.RECRAFTMARKET.controller.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/test")
public class TestController {



    @GetMapping()
    public String test(){
        return "success from secured end point";
    }
}
