package dk.dtu.compute.se.mdsu.petrinet;

import java.util.List;

/**
 * @model
 */
public interface Place extends Node {
	
	/**
	 * @model opposite="place" containment="true"
	 */
	List<Token> getTokens();

}