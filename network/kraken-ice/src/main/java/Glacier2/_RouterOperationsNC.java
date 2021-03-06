// **********************************************************************
//
// Copyright (c) 2003-2010 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.4.1

package Glacier2;

// <auto-generated>
//
// Generated from file `Router.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


/**
 * The Glacier2 specialization of the {@link Ice.Router}
 * interface.
 * 
 **/
public interface _RouterOperationsNC extends Ice._RouterOperationsNC
{
    /**
     * This category must be used in the identities of all of the client's
     * callback objects. This is necessary in order for the router to
     * forward callback requests to the intended client. If the Glacier2
     * server endpoints are not set, the returned category is an empty 
     * string.
     * 
     * @return The category.
     * 
     **/
    String getCategoryForClient();

    /**
     * Create a per-client session with the router. If a
     * {@link SessionManager} has been installed, a proxy to a {@link Session}
     * object is returned to the client. Otherwise, null is returned
     * and only an internal session (i.e., not visible to the client)
     * is created.
     * 
     * If a session proxy is returned, it must be configured to route
     * through the router that created it. This will happen automatically
     * if the router is configured as the client's default router at the
     * time the session proxy is created in the client process, otherwise
     * the client must configure the session proxy explicitly.
     * 
     * @param __cb The callback object for the operation.
     * @param userId The user id for which to check the password.
     * 
     * @param password The password for the given user id.
     * 
     **/
    void createSession_async(AMD_Router_createSession __cb, String userId, String password)
        throws CannotCreateSessionException,
               PermissionDeniedException;

    /**
     * Create a per-client session with the router. The user is
     * authenticated through the SSL certificates that have been
     * associated with the connection. If a {@link SessionManager} has been
     * installed, a proxy to a {@link Session} object is returned to the
     * client. Otherwise, null is returned and only an internal
     * session (i.e., not visible to the client) is created.
     * 
     * If a session proxy is returned, it must be configured to route
     * through the router that created it. This will happen automatically
     * if the router is configured as the client's default router at the
     * time the session proxy is created in the client process, otherwise
     * the client must configure the session proxy explicitly.
     * 
     * @param __cb The callback object for the operation.
     **/
    void createSessionFromSecureConnection_async(AMD_Router_createSessionFromSecureConnection __cb)
        throws CannotCreateSessionException,
               PermissionDeniedException;

    /**
     * Keep the calling client's session with this router alive.
     * 
     * @throws SessionNotExistException Raised if no session exists
     * for the calling client.
     * 
     **/
    void refreshSession()
        throws SessionNotExistException;

    /**
     * Destroy the calling client's session with this router.
     * 
     * @throws SessionNotExistException Raised if no session exists
     * for the calling client.
     * 
     **/
    void destroySession()
        throws SessionNotExistException;

    /**
     * Get the value of the session timeout. Sessions are destroyed
     * if they see no activity for this period of time.
     * 
     * @return The timeout (in seconds).
     * 
     **/
    long getSessionTimeout();
}
