/**
 */
package dk.dtu.compute.se.mdsu.petrinet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.dtu.compute.se.mdsu.petrinet.Place#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @see dk.dtu.compute.se.mdsu.petrinet.PetrinetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends Node {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.mdsu.petrinet.Token}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.mdsu.petrinet.Token#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see dk.dtu.compute.se.mdsu.petrinet.PetrinetPackage#getPlace_Tokens()
	 * @see dk.dtu.compute.se.mdsu.petrinet.Token#getPlace
	 * @model opposite="place" containment="true"
	 * @generated
	 */
	EList<Token> getTokens();

} // Place
