/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *
 * @author PC-1
 */
public class FasesCicloVidaSensor implements PhaseListener  {

    @Override
    public void afterPhase(PhaseEvent event) {
        
    }

    @Override
    public void beforePhase(PhaseEvent event) {
        System.out.println(event.getPhaseId());
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
    
    
}
