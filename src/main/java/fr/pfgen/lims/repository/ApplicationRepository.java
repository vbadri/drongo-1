/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pfgen.lims.repository;

import fr.pfgen.lims.domain.projects.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


/**
 *
 * @author eric
 */
@Repository
public interface ApplicationRepository extends JpaSpecificationExecutor<Application>, JpaRepository<Application, Long>{
   
    public Application findByCode(String code);
    
    public Application findByName(String name);
}
