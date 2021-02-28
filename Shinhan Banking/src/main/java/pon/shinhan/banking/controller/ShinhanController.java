package pon.shinhan.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pon.shinhan.banking.entity.ShinhanEntity;
import pon.shinhan.banking.model.ShinhanMinMax;
import pon.shinhan.banking.model.ShinhanMinMaxOld;
import pon.shinhan.banking.service.ShinhanService;

import java.util.List;

@RestController
@RequestMapping("shinhan")
public class ShinhanController {

    @Autowired
    private ShinhanService shinhanService;

    @GetMapping
    public List<ShinhanEntity> getShinhanLS() { //@PathVariable double salary, @PathVariable boolean MethodOfReceive
        return shinhanService.getShinhanListLS();
    }

    @GetMapping("{salary}/{rental}/{method}")
    public ShinhanMinMax getShinhanLSBySalary (@PathVariable double salary, @PathVariable double rental, @PathVariable Long method) {
        return shinhanService.getMinMax(salary, rental, method);
    }
}
