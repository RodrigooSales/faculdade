package com.rodrigo.trabalhoarquitetura.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigo.trabalhoarquitetura.Model.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {
}
