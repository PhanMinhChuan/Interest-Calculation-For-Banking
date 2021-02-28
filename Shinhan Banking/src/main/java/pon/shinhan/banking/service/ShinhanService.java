package pon.shinhan.banking.service;

import org.springframework.stereotype.Service;
import pon.shinhan.banking.entity.ShinhanEntity;
import pon.shinhan.banking.model.ShinhanMinMax;
import pon.shinhan.banking.model.ShinhanMinMaxOld;

import java.util.List;

@Service
public interface ShinhanService {

    //ShinhanMinMax getShinhanLSService(double salary, boolean methodOfReceive);

    List<ShinhanEntity> getShinhanListLS();

    ShinhanMinMax getMinMax(double salary, double rental, long methodOfReceive);
}
