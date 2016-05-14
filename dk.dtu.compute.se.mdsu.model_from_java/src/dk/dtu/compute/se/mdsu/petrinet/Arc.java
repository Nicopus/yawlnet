package dk.dtu.compute.se.mdsu.petrinet;

/**
 * @model
 */
public interface Arc {
	
	/**
	 * @model opposite="out" required="true"
	 */
	Node getSource();

	/**
	 * @model opposite="in" required="true"
	 */
	Node getTarget();

	/**
	 * @model opposite="arcs" transient="false"
	 */
	Petrinet getPetrinet();

} 
