package pon.shinhan.banking.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "shinhan")
public class ShinhanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public double salary;
    public double psck;
    public double pstm;
    public double npsck;
    public double npstm;
    public double prime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getNpsck() {
        return npsck;
    }

    public double getNpstm() {
        return npstm;
    }

    public double getPrime() {
        return prime;
    }

    public double getPsck() {
        return psck;
    }

    public double getPstm() {
        return pstm;
    }

    public double getSalary() {
        return salary;
    }

    public void setNpsck(double npsck) {
        this.npsck = npsck;
    }

    public void setNpstm(double npstm) {
        this.npstm = npstm;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    public void setPsck(double psck) {
        this.psck = psck;
    }

    public void setPstm(double pstm) {
        this.pstm = pstm;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ShinhanEntity(){
        super();
    }

    public ShinhanEntity(long id, double salary, double psck, double pstm, double npsck, double npstm, double prime) {
        this.id = id;
        this.salary = salary;
        this.psck = psck;
        this.pstm = pstm;
        this.npsck = npsck;
        this.npstm = npstm;
        this.prime = prime;
    }
}
