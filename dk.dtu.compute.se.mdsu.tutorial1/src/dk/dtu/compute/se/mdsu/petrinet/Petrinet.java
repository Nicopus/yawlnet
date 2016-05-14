/**
 */
package dk.dtu.compute.se.mdsu.petrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petrinet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.dtu.compute.se.mdsu.petrinet.Petrinet#getNodes <em>Nodes</em>}</li>
 *   <li>{@link dk.dtu.compute.se.mdsu.petrinet.Petrinet#getArcs <em>Arcs</em>}</li>
 *   <li>{@link dk.dtu.compute.se.mdsu.petrinet.Petrinet#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see dk.dtu.compute.se.mdsu.petrinet.PetrinetPackage#getPetrinet()
 * @model
 * @generated
 */
public interface Petrinet extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.mdsu.petrinet.Node}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.mdsu.petrinet.Node#getPetrinet <em>Petrinet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see dk.dtu.compute.se.mdsu.petrinet.PetrinetPackage#getPetrinet_Nodes()
	 * @see dk.dtu.compute.se.mdsu.petrinet.Node#getPetrinet
	 * @model opposite="petrinet" containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.mdsu.petrinet.Arc}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.mdsu.petrinet.Arc#getPetrinet <em>Petrinet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see dk.dtu.compute.se.mdsu.petrinet.PetrinetPackage#getPetrinet_Arcs()
	 * @see dk.dtu.compute.se.mdsu.petrinet.Arc#getPetrinet
	 * @model opposite="petrinet" containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dk.dtu.compute.se.mdsu.petrinet.PetrinetPackage#getPetrinet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.mdsu.petrinet.Petrinet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Petrinet
