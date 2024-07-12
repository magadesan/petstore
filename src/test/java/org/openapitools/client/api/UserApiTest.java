/*
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.7
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.logs.PrintLogs;
import org.openapitools.client.model.User;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.TestListeners;

import java.util.List;

/**
 * API tests for UserApi
 */
//@Disabled
@Listeners(TestListeners.class)
public class UserApiTest {

    private final UserApi api = new UserApi();
    PrintLogs printLogs = new PrintLogs(getClass(), "PetstoreReport.html");
    /**
     * Create user
     *
     * This can only be done by the logged in user.
     *
     * @throws ApiException if the Api call fails
     */
    //@Test
    public void createUserTest() throws ApiException {
        User body = null;
        api.createUser(body);
        // TODO: test validations
    }

    /**
     * Creates list of users with given input array
     *
     * @throws ApiException if the Api call fails
     */
    //@Test
    public void createUsersWithArrayInputTest() throws ApiException {
        List<User> body = null;
        api.createUsersWithArrayInput(body);
        // TODO: test validations
    }

    /**
     * Creates list of users with given input array
     *
     * @throws ApiException if the Api call fails
     */
    //@Test
    public void createUsersWithListInputTest() throws ApiException {
        List<User> body = null;
        api.createUsersWithListInput(body);
        // TODO: test validations
    }

    /**
     * Delete user
     *
     * This can only be done by the logged in user.
     *
     * @throws ApiException if the Api call fails
     */
    //@Test
    public void deleteUserTest() throws ApiException {
        String username = null;
        api.deleteUser(username);
        // TODO: test validations
    }

    /**
     * Get user by user name
     *
     * @throws ApiException if the Api call fails
     */
    //@Test
    public void getUserByNameTest() throws ApiException {
        String username = null;
        User response = api.getUserByName(username);
        // TODO: test validations
    }

    /**
     * Logs user into the system
     *
     * @throws ApiException if the Api call fails
     */
    //@Test
    public void loginUserTest() throws ApiException {
        String username = null;
        String password = null;
        String response = api.loginUser(username, password);
        // TODO: test validations
    }

    /**
     * Logs out current logged in user session
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void logoutUserTest() throws ApiException {
        api.logoutUser();
        // TODO: test validations
    }

    /**
     * Updated user
     *
     * This can only be done by the logged in user.
     *
     * @throws ApiException if the Api call fails
     */
    //@Test
    public void updateUserTest() throws ApiException {
        String username = null;
        User body = null;
        api.updateUser(username, body);
        // TODO: test validations
    }

}
