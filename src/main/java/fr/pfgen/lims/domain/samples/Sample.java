/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pfgen.lims.domain.samples;

import fr.pfgen.lims.domain.projects.Activity;
import fr.pfgen.lims.domain.runs.AbstractRun;
import fr.pfgen.lims.domain.util.AbstractGenericEntity;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author eric
 */
@Entity
@Table(name = "samples")
public class Sample extends AbstractGenericEntity{
    
    @NotNull
    @Size(min = 1,max = 50)
    private String name;
    
   /* @ManyToMany    
    private Set<Activity> activity;
    
   @OneToMany
    private AbstractRun runs;
    
    */
}