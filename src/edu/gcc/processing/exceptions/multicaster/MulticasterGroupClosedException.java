package edu.gcc.processing.exceptions.multicaster;

import processing.core.PApplet;
import edu.gcc.processing.exceptions.ExceptionBase;

/**
 * A specific exception to be thrown inside of the Multicaster class, whenever
 * an attempt to join a multicast group fails, since the group is already 
 * closed
 *
 * @category   Exceptions
 * @package    edu.gcc.processing.exceptions.multicaster
 * @access     public
 * @since      v0.1 Dev
 */

public class MulticasterGroupClosedException extends ExceptionBase {
/**
 * A constructor method which passes a message to the super constructor
 *
 * @param      String      message     The message to send to the console
 * @param      PApplet     applet      A reference to the object which extends the PApplet class
 * @access     public
 * @return     void
 * @since      v0.1 Dev
 */
	public MulticasterGroupClosedException(String message, PApplet applet) {		
		super(message, new Exception("System message not avaliable."), applet);
	}
}