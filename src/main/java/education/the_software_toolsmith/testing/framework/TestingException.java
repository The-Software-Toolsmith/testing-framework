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
 * unchecked exception to wrap lower-level exceptions during testing using exception chaining
 *
 * @author David M Rosenberg
 *
 * @version 1.0 2020-09-13 Initial implementation
 * @version 1.1 2021-06-19 add no-arg and 1-arg String constructors
 */
public class TestingException extends RuntimeException
    {

    /*
     * constants
     */


    /** Support serialization */
    private static final long serialVersionUID = 1L ;


    /*
     * constructors
     */


    /**
     * no-arg constructor
     */
    public TestingException()
        {

        super() ;

        }   // end no-arg constructor


    /**
     * constructor with message
     *
     * @param message
     *     the message text associated with this exception
     */
    public TestingException( final String message )
        {

        super( message ) ;

        }   // end constructor with descriptive message


    /**
     * constructor with cause
     * 
     * @param cause
     *     the 'wrapped' exception
     */
    public TestingException( final Throwable cause )
        {

        super( cause ) ;

        }   // end 'simple wrapper' constructor without message


    /**
     * constructor with message and cause
     * 
     * @param message
     *     descriptive message related to the {@code cause}
     * @param cause
     *     the 'wrapped' exception
     */
    public TestingException( final String message, final Throwable cause )
        {

        super( message, cause ) ;

        }   // end 'wrapper' constructor with descriptive message

    }   // end class TestingException