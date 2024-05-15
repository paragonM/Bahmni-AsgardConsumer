package com.asgard.consumer.odoo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.asgard.consumer.odoo.model.DrugProduct;
import com.asgard.consumer.odoo.model.SaleOrder;

@Repository
public interface DrugProductRepo extends JpaRepository<DrugProduct,Integer>{

    
    @Query("SELECT rp FROM DrugProduct rp WHERE rp.uuid = :value")
    List<DrugProduct> find(@Param("value") String value);

}
