package br.com.squad.course.entities;

import java.time.Instant;
import java.util.Objects;

public class Payment {
    private long id;
    private Instant moment;

    public Payment() {
    }

    public Payment(long id, Instant moment) {
        this.id = id;
        this.moment = moment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return id == payment.id && Objects.equals(moment, payment.moment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, moment);
    }
}

