package pon.server.banking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import pon.server.banking.ShinhanModel.ShinhanMinMax;

@Controller
@RequestMapping("server")
public class ServerController {

    @GetMapping("{salary}/{rental}/{method}")
    public String getShinhanLSDemo(@PathVariable double salary, @PathVariable double rental, @PathVariable Long method, Model model) {
        String uri = "http://localhost:8090/shinhan/"+ salary  + "/"  + rental + "/"  + method;
        RestTemplate restTemplate = new RestTemplate();

        ShinhanMinMax shinhanMinMax = restTemplate.getForObject(uri, ShinhanMinMax.class);

        model.addAttribute("bankingName", "Shinhan Banking: ");
        model.addAttribute("shinhan", shinhanMinMax);

        return "index";
    }

}
