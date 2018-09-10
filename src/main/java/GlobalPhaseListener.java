package main.java;

import javax.faces.event.PhaseId;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseListener;

import org.apache.log4j.Logger;

@SuppressWarnings("serial")
public class GlobalPhaseListener implements PhaseListener {
	
	private static final Logger log = Logger.getLogger(GlobalPhaseListener.class);

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}
	
	@Override
	public void afterPhase(PhaseEvent event) {
		System.out.println("hey");
		log.debug("Before phase: " + event.getPhaseId());	
	}

	@Override
	public void beforePhase(PhaseEvent event) {
		log.debug("After phase: " + event.getPhaseId());
	}
	
}
