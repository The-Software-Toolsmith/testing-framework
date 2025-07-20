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


package education.the_software_toolsmith.testing.framework.tests;

import java.util.ArrayList ;
import java.util.Arrays ;
import java.util.Map ;
import java.util.WeakHashMap ;


/**
 * a class with lots of components to interrogate
 * 
 * @author David M Rosenberg
 * 
 * @version 2.0 2025-06-14
 *     <ul>
 *     <li>unknown version and modification history
 *     <li>various modifications to enable exploration by {@code TestClassDMRTests}
 *     </ul>
 */
@SuppressWarnings( { "javadoc", "unused", "unchecked" } )
public class TestClass <T> implements Comparable<TestClass<T>>
    {

    private static int nextId = 1 ;
    private int id ;
    private String name ;
    ArrayList<T> stuff ;
    private Node firstNode ;
    private int numberOfEntries ;
    private T[] array ;
    private Facade face ;
    private long[] numbers ;
    private MyEnum myEnum ;
    protected boolean integrityOK ;
    public boolean[] freeForAll ;
    int[][][] threeD ;
    ArrayList<T>[][] matrix ;
    Map<T, T> myMap ;

	
	private TestClass()
    	{
    	this.id =					TestClass.nextId++ ;
    	this.name =					"nuthin'" ;
    	this.stuff =				new ArrayList<>() ;
    	this.firstNode =			null ;
    	this.numberOfEntries =		42 ;
    	T[] tempArray =				(T[]) new Object[ 100 ] ;
    	this.array =				tempArray ;
    	this.face =					null ;
    	this.numbers =				new long[] { 1, 2, 3, 5, 8, 13, 21 } ;
    	this.myEnum =				MyEnum.A ;
    	this.integrityOK =			true ;
    	this.freeForAll =			null ;
    	this.threeD =				null ;
    	this.matrix =				null ;
    	this.myMap =                new WeakHashMap<>() ;
    	}
	
	
	private TestClass( String initialName )
    	{
    	this() ;
    	this.name =					initialName ;
    	}
	
	
	public void buildChain( T... entries )
    	{
    	for ( int i = 0; i < entries.length; i++ )
    		{
    		this.firstNode =		new Node( entries[ i ], this.firstNode ) ;
    		this.numberOfEntries++ ;
    		}
    	}


    @Override
    public int compareTo ( TestClass<T> other )
        {
        // order by ids
        
        return this.id - other.id ;
        
        }   // end compareTo()
	
	
	@Override
	public String toString()
    	{
    	StringBuilder result =		new StringBuilder() ;
    	result.append( String.format( "[%,2d] %s; [", 
    	                              this.id, 
    	                              this.name ) ) ;
    	String separator =			"" ;
    	Node currentNode =			this.firstNode ;

        while ( currentNode != null )
            {
            result.append( separator ) ;
            result.append( currentNode.getData().toString() ) ;
            
            currentNode = currentNode.getNextNode() ;
            separator = ", " ;
            }

    	result.append( "]" ) ;
    	return result.toString() ;
    	}
	
	
	private void foo()
        {
        System.out.println( "in foo" ) ;
        }
	
	
	private void foo( int number )
    	{
    	System.out.println( "in foo with " + number ) ;
    	}
	
	
	private void foo( String text )
    	{
    	System.out.println( "in foo with '" + text + "'" ) ;
    	}
	
	
	private void bar( Object... objects )
    	{
    	System.out.println( "in bar with: " + Arrays.toString( objects ) ) ;
    	}
	
	
	private void bar( int number, String text )
    	{
    	System.out.printf( "in bar with: %,d and '%s'%n", 
    	                   number, 
    	                   text ) ;
    	}
	
	
	boolean tantrum( boolean badMood ) throws TantrumException
    	{
    	if ( badMood )
    		{
    		throw new TantrumException() ;
    		}
    	
    	return !badMood ;
    	}
	
	
	boolean tantrum( boolean badMood, 
	                 String message ) throws TantrumException
    	{
    	if ( badMood )
    		{
    		throw new TantrumException( message ) ;
    		}
    	
    	return !badMood ;
    	}
	
	
	/**
	 * Inner class Node provides the basis for singly linked-list functionality
	 */
	private class Node implements Facade
		{

		/*
		 * instance variables
		 */
		private T data ;	         // reference to the entry
		private Node next ;	         // link to the next node in the chain


		/**
		 * Sets up a node given supplied data; next pointer is set to null.
		 *
		 * @param dataPortion
		 *        the information this node holds
		 */
		private Node( T dataPortion )
			{
			this( dataPortion, null ) ;

			}	// end 1-arg constructor


		/**
		 * Sets up a node given supplied data and next pointer.
		 *
		 * @param dataPortion
		 *        the information this node holds
		 * @param nextNode
		 *        reference to the next node in the linked list
		 */
		private Node( T dataPortion, Node nextNode )
			{
			this.data =		dataPortion ;
			this.next =		nextNode ;

			}	// end 2-arg constructor


		/**
		 * Retrieve the data referenced by this node
		 *
		 * @return a reference to the data stored in this node
		 */
		private T getData()
			{
			return this.data ;

			}	// end getData()


		/**
		 * Retrieve the next field
		 *
		 * @return reference to the next Node in the chain
		 */
		private Node getNextNode()
			{
			return this.next ;

			}	// end getNextNode()


		/**
		 * Points the data field at the supplied data
		 *
		 * @param newData
		 *        reference to the data to store
		 */
		private void setData( T newData )
			{
			this.data =		newData ;

			}	// end setData()


		/**
		 * Set the next field
		 *
		 * @param nextNode
		 *        another Node in the chain or null to indicate none
		 */
		private void setNextNode( Node nextNode )
			{
			this.next =		nextNode ;

			} // end setNextNode()

		}	// end inner class Node
	
	
	private enum MyEnum { A, B, C }
	
	
	private interface Facade { }
	

	/**
	 * @param args -unused-
	 */
	public static void main( String[] args )
		{

		System.out.printf( "hi there from main()%n" ) ;

		} // end main()

	}  // end class TestClass
