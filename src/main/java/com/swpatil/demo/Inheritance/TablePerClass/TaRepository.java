package com.swpatil.demo.Inheritance.TablePerClass;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaRepository extends JpaRepository<TA, Long> {

    public TA save(TA ta);
}
