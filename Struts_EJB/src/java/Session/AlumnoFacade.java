/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Bean.Alumno;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Bryan
 */
@Stateless
public class AlumnoFacade extends AbstractFacade<Alumno> {
    @PersistenceContext(unitName = "StrutsEjbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AlumnoFacade() {
        super(Alumno.class);
    }
    
}
