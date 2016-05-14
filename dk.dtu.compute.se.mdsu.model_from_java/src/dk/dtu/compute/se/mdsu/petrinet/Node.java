package dk.dtu.compute.se.mdsu.petrinet;

import java.util.List;

/**
 * @model abstract="true"
 */
public interface Node {
	
	/**
	 * @model opposite="nodes" transient="false"
	 */
	Petrinet getPetrinet();

	/**
	 * @model opposite="target"
	 */
	List<Arc> getIn();

	/**
	 * @model opposite="source"
	 */
	List<Arc> getOut();

	/**
	 * @model
	 */
	String getName();

}
