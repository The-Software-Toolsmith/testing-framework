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
 * Support {@code compareTo()} tests
 *
 * @author David M Rosenberg
 *
 * @version 1.0 2021-06-20 Initial implementation - extracted from {@code TimeOfDayDMRTests.java}
 * @version 1.1 2023-10-19 rewrite {@code opposite()} to use {@code switch} expression instead of
 *     nested ternary conditional expression
 */
public enum CompareToRange
    {

    /** represents any value less than zero */
    NEGATIVE ( "<0" )

    ,
    /** represents the value zero */
    ZERO ( "0" )

    ,
    /** represents any value greater than zero */
    POSITIVE ( ">0" )

    ,
    /** represents any non-numeric value */
    NOT_APPLICABLE ( "n/a" );


    /** text to display for this range */
    private final String descriptiveText ;


    /**
     * configure the instance
     *
     * @param description
     *     text to display for this range
     *
     * @since 1.0
     */
    private CompareToRange( final String description )
        {

        this.descriptiveText = description ;

        }   // end constructor


    /**
     * Returns the opposite condition
     *
     * @return the opposite enum instance
     *
     * @since 1.0
     */
    public CompareToRange opposite()
        {

        return switch ( this )
            {
            case ZERO
                -> ZERO ;
            case NEGATIVE
                -> POSITIVE ;
            case POSITIVE
                -> NEGATIVE ;
            default
                -> NOT_APPLICABLE ;
            } ;

        }   // end opposite()


    @Override
    public String toString()
        {

        return this.descriptiveText ;

        }   // end toString()

    }   // end enum CompareToRange