package pon.shinhan.banking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pon.shinhan.banking.entity.ShinhanEntity;

import java.util.List;

@Repository
public interface ShinhanRepository extends CrudRepository<ShinhanEntity, Long> {
    List<ShinhanEntity> findAll();

    ShinhanEntity findById(long id);
}
