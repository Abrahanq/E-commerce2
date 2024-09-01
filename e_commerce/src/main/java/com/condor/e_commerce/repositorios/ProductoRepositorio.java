package com.condor.e_commerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.condor.e_commerce.entidades.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Long> {

}
