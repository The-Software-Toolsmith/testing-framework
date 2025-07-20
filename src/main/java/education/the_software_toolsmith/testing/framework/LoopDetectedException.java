/* @formatter:off
 *
 * © David M Rosenberg, The Software Toolsmith (education)
 *
 * This file is part of the Testing Framework for Java.
 * Repository: https://github.com/The-Software-Toolsmith/testing-framework-for-java
 *
 * Licensed under the Creative Commons Attribution-NonCommercial 4.0 International License.
 * You may obtain a copy of the license at:
 *     https://creativecommons.org/licenses/by-nc/4.0/
 *
 * You may use, share, and adapt this file for non-commercial purposes,
 * provided you give appropriate credit.
 *
 * @formatter:on
 */


package education.the_software_toolsmith.testing.framework ;

/**
 * Runtime exception throws when a loop is detected in a chain
 *
 * @author Dave Rosenberg
 *
 * @version 1.0 2025-06-14 Initial implementation
 */
public class LoopDetectedException extends RuntimeException
    {

    /**
     * Support serialization
     */
    private static final long serialVersionUID = 1L ;


    // constructors


    /**
     * no-arg constructor
     */
    public LoopDetectedException()
        {

        super() ;

        }   // end no-arg constructor


    /**
     * constructor with message
     *
     * @param message
     *     the message text associated with this exception
     */
    public LoopDetectedException( final String message )
        {

        super( message ) ;

        }   // end constructor with descriptive message


    /**
     * constructor with cause
     *
     * @param cause
     *     the 'wrapped' exception
     */
    public LoopDetectedException( final Throwable cause )
        {

        super( cause ) ;

        }   // end 'simple wrapper' constructor without message


    /**
     * constructor with cause and message
     *
     * @param message
     *     descriptive message related to the {@code cause}
     * @param cause
     *     the 'wrapped' exception
     */
    public LoopDetectedException( final String message, final Throwable cause )
        {

        super( message, cause ) ;

        }   // end 'wrapper' constructor with descriptive message

    }   // end class LoopDetectedException