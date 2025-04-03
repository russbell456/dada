package com.example.mscompras.util;

import com.example.ms-compras.Entity.Compra;
import com.example.ms-compras.Repository.CompraRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CompraSeeder implements CommandLineRunner {

    private final CompraRepository compraRepository;

    public CompraSeeder(CompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }

    @Override
    public void run(String... args) {
        if (compraRepository.count() == 0) {
            Compra compra1 = new Compra(null, "Laptop", "Computadoras", 1200.00);
            Compra compra2 = new Compra(null, "Zapatillas", "Deportes", 80.00);
            Compra compra3 = new Compra(null, "Celular", "Celulares", 600.00);
            Compra compra4 = new Compra(null, "Libro de Java", "Libros", 40.00);
            Compra compra5 = new Compra(null, "Audífonos", "Electrónica", 50.00);

            compraRepository.save(compra1);
            compraRepository.save(compra2);
            compraRepository.save(compra3);
            compraRepository.save(compra4);
            compraRepository.save(compra5);

            System.out.println("Datos de compras insertados correctamente.");
        } else {
            System.out.println("Las compras ya existen, no se insertaron datos.");
        }
    }
}
