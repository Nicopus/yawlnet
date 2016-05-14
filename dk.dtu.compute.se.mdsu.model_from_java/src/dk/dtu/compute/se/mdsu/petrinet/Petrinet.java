package dk.dtu.compute.se.mdsu.petrinet;

import java.util.List;

/**
 * @model
 */
public interface Petrinet {
	
	/**
	 * @model opposite="petrinet" containment="true"
	 */
	List<Node> getNodes();

	/**
	 * @model opposite="petrinet" containment="true"
	 */
	List<Arc> getArcs();

	/**
	 * @model
	 */
	String getName();

}
