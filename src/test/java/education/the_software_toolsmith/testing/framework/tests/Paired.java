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


package education.the_software_toolsmith.testing.framework.tests ;

import java.util.Objects ;

/**
 * Utility class to facilitate testing if {@code sort()} is stable
 * <p>
 * Note: This class is immutable
 *
 * @author Dave Rosenberg
 *
 * @version 1.0 2020-07-18 Initial implementation
 * @version 1.1 2021-07-30 Correct {@code equals()} to not consider {@code id}
 * @version 1.2 2021-11-16 Add {@code identical()} to facilitate stable sort check
 * @version 1.3 2023-04-05
 *     <ul>
 *     <li>update implementations of {@code equals()} and {@code hashCode()}
 *     <li>deprecate {@code identical()} since it can't evaluate to {@code true}
 *     </ul>
 * @version 2.0 2025-02-26
 *     <ul>
 *     <li>remove deprecated {@code identical()}
 *     <li>rearrange result of {@code toString()}
 *     </ul>
 */
public final class Paired implements Comparable<Paired>
    {

    // static/class variable
    private static int nextId = 1 ;     // counter for assignment to this.id

    // instance variables
    private final int id ;
    private final int value ;


    /*
     * constructor(s)
     */


    /**
     * Fully initialize an instance - id is automatically assigned
     *
     * @param initialValue
     *     'corresponds' to the id
     */
    public Paired( final int initialValue )
        {

        this.id = Paired.nextId++ ;

        this.value = initialValue ;

        }   // end 1-arg constructor


    /*
     * API methods
     */


    /**
     * retrieve the instance's id
     *
     * @return the id
     */
    public int getId()
        {

        return this.id ;

        }   // end getId()


    /**
     * retrieve the instance's value
     *
     * @return the value
     */
    public int getValue()
        {

        return this.value ;

        }   // end getValue()


    /**
     * ordering is based upon this.value
     *
     * @param otherPaired
     *     the other instance of Paired to which this instance is ordered
     *
     * @return 0 if the two instances have the same value; a negative value if this should come
     *     before otherPaired; a positive value (greater than 0) if this should come after
     *     otherPaired
     */
    @Override
    public int compareTo( final Paired otherPaired )
        {

        return this.value - otherPaired.value ;

        }   // end compareTo()


    @Override
    public boolean equals( final Object otherObject )
        {

        if ( this == otherObject )
            {
            return true ;
            }

        if ( otherObject instanceof final Paired otherPaired )
            {
            return this.value == otherPaired.value ;
            }

        return false ;

        }   // end equals()


    @Override
    public int hashCode()
        {

        return Objects.hash( this.id, this.value ) ;

        }   // end hashCode()


    @Override
    public String toString()
        {

        return String.format( "#%,d: %,d", this.id, this.value ) ;

        }   // end toString()

    }   // end class Paired