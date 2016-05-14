package dk.dtu.compute.se.mdsu.petrinet;

/**
 * @model
 */
public interface Token {
	
	/**
	 * @model opposite="tokens" transient="false"
	 */
	Place getPlace();

}
