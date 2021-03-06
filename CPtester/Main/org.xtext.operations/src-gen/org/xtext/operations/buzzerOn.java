/**
 * generated by Xtext 2.26.0
 */
package org.xtext.operations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>buzzer On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.operations.buzzerOn#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.xtext.operations.OperationsPackage#getbuzzerOn()
 * @model
 * @generated
 */
public interface buzzerOn extends Command
{
  /**
   * Returns the value of the '<em><b>Time</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.operations.Time}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' containment reference list.
   * @see org.xtext.operations.OperationsPackage#getbuzzerOn_Time()
   * @model containment="true"
   * @generated
   */
  EList<Time> getTime();

} // buzzerOn
