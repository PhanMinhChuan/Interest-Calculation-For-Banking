package pon.shinhan.banking.service.ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pon.shinhan.banking.entity.ShinhanEntity;
import pon.shinhan.banking.model.ShinhanMinMax;
import pon.shinhan.banking.model.ShinhanMinMaxOld;
import pon.shinhan.banking.repository.ShinhanRepository;
import pon.shinhan.banking.service.ShinhanService;

import java.util.List;

@Service
public class ShinhanServiceImpl implements ShinhanService {

    @Autowired
    private ShinhanRepository shinhanRepository;

    @Override
    public List<ShinhanEntity> getShinhanListLS() {
        return shinhanRepository.findAll();
    }

    @Override
    public ShinhanMinMax getMinMax(double salary, double rental, long methodOfReceive) {
        try {
            long IDRange = getSalaryIDRange(salary);
            ShinhanEntity shinhanEntity = shinhanRepository.findById(IDRange);
            return getMinMaxByType(shinhanEntity, rental, methodOfReceive);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    public long getSalaryIDRange(double salary) {
        List<ShinhanEntity> listShinhan = shinhanRepository.findAll();
        double countSalary = 0;
        if (salary >= listShinhan.get(listShinhan.size() - 1).getSalary()) {
            return listShinhan.get(listShinhan.size() - 1).getId();
        }
        for (int i = 1; i < listShinhan.size() - 1; i++) {
            if (salary >= countSalary && salary < listShinhan.get(i - 1).getSalary()) {
                return listShinhan.get(i - 1).getId();
            }
            countSalary = 0;                                    // Khởi tạo lại biến điếm
            countSalary += listShinhan.get(i - 1).getSalary();  // Gán biến đếm với số lương tương ứng
        }
        return 0;
    }
    public ShinhanMinMax getMinMaxByType(ShinhanEntity shinhanEntity, double rental, long type) {
        switch ((int) type) {
            case 1: // TH1: Nhận lương bằng chuyển khoản
                return getShinhanLSAndRental(rental, shinhanEntity.getPsck(), shinhanEntity.getNpsck(), shinhanEntity.getPrime());  // Get LS ở mức cao nhất
            case 2: // TH2: Nhận lương bằng tiền mặt
                return getShinhanLSAndRental(rental, shinhanEntity.getPstm(), shinhanEntity.getNpstm(), shinhanEntity.getPrime());  // Get LS ở mức cao nhất
        }
        return null;
    }
    public ShinhanMinMax getShinhanLSAndRental(double rental, double ps , double nps, double prime) {
        double maxRental = 0, minRentalPrime = 0, minRental = 0;
        if (ps != 0 || nps != 0) {
            minRental = rental + rental * ps/100;
            maxRental = rental + rental * nps/100;
            if (prime == ps || prime != 0) {
                minRentalPrime = rental + rental * prime/100;
                ps = prime;
                minRental = minRentalPrime;
            }
        }
        return new ShinhanMinMax(ps, nps,  minRental, maxRental);
    }

}
