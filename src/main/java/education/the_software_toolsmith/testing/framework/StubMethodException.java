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
 * Runtime exception to indicate that a method is a stub
 *
 * @author Dave Rosenberg
 *
 * @version 1.0 2021-06-13 Initial implementation
 */
public class StubMethodException extends RuntimeException
    {
    
    /*
     * constants
     */

    /** Support serialization */
    private static final long serialVersionUID = 1L ;


    /*
     *  constructors
     */


    /**
     * no-arg constructor
     */
    public StubMethodException()
        {

        super() ;

        }   // end no-arg constructor


    /**
     * constructor with message
     *
     * @param message
     *     the message text associated with this exception
     */
    public StubMethodException( final String message )
        {

        super( message ) ;

        }   // end constructor with descriptive message

    }   // end class StubMethodException