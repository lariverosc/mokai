package org.mokai.impl.camel;

/**
 * Uri endpoints used by Apache Camel to route the messages between applications and connections.
 * 
 * @author German Escobar
 */
public class UriConstants {

	public static final String CONNECTIONS_PROCESSED_MESSAGES = "direct:connectionsProcessedMessages";
	
	public static final String CONNECTIONS_FAILED_MESSAGES = "activemq:connectionsFailedMessages";
	
	public static final String CONNECTIONS_UNROUTABLE_MESSAGES = "activemq:connectionsUnroutableMessages";
	
	public static final String CONNECTIONS_ROUTER = "activemq:connectionsRouter";
	
	public static final String APPLICATIONS_PROCESSED_MESSAGES = "direct:applicationsProcessedMessages";
	
	public static final String APPLICATIONS_FAILED_MESSAGES = "activemq:applicationsFailedMessages";
	
	public static final String APPLICATIONS_UNROUTABLE_MESSAGES = "activemq:applicationsUnroutableMessages";
	
	public static final String APPLICATIONS_ROUTER = "activemq:applicationsRouter";
}