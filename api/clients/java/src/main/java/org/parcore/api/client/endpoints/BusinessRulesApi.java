package org.parcore.api.client.endpoints;

import org.parcore.api.client.async.ApiCallback;
import org.parcore.api.client.utilities.ApiException;
import org.parcore.domain.BusinessRule;
import org.parcore.domain.BusinessRules;

/**
 * PAR API
 * <p>
 * BusinessRulesApi
 * <p>
 * Client interface for the BusinessRule PAR Core Entity endpoint
 * <p>
 * OpenAPI spec version: 1.0.0
 * <p>
 * This class is based on code auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */
@SuppressWarnings("unused")
public interface BusinessRulesApi {

    /**
     * Retrieve all Business Rules
     *
     * @return BusinessRules wrapper of all business rules
     * @throws ApiException on error
     */
    BusinessRules getAllBusinessRules() throws ApiException;

    /**
     * Retrieve a paged list of Business Rules
     *
     * @param offset Offset from which to start the list
     * @param limit  Maximum number of tools to return
     * @return BusinessRules wrapper of up to limit rules
     * @throws ApiException on error
     */
    BusinessRules getPagedListOfBusinessRules(Integer offset, Integer limit) throws ApiException;

    /**
     * Retrieve a paged list of Business Rules modified between given dates
     *
     * @param modifiedAfter  Filter the business rules to return only the ones having a localLastModifiedDate value GREATER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time. (optional)
     * @param modifiedBefore Filter the business rules to return only the ones having a localLastModifiedDate value LOWER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time (optional)
     * @param offset         Offset from which to start the list
     * @param limit          Maximum number of tools to return
     * @return BusinessRules wrapper of up to limit rules
     * @throws ApiException on error
     */
    BusinessRules getPagedListOfBusinessRulesByModifiedDate(String modifiedAfter, String modifiedBefore, Integer offset, Integer limit) throws ApiException;

    /**
     * Retrieve all Business Rules modified between given dates
     *
     * @param modifiedAfter  Filter the business rules to return only the ones having a localLastModifiedDate value GREATER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time. (optional)
     * @param modifiedBefore Filter the business rules to return only the ones having a localLastModifiedDate value LOWER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time (optional)
     * @return BusinessRules wrapper of the rules
     * @throws ApiException on error
     */
    BusinessRules getBusinessRulesByModifiedDate(String modifiedAfter, String modifiedBefore) throws ApiException;

    /**
     * Aysnchronously retrieve all Business Rules modified between given dates
     *
     * @param modifiedAfter  Filter the business rules to return only the ones having a localLastModifiedDate value GREATER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time. (optional)
     * @param modifiedBefore Filter the business rules to return only the ones having a localLastModifiedDate value LOWER than the one passed in. Allowed datetime formats are YYYY-MM-DD\\&#39;T\\&#39;hh\\:mm\\:ssTZD and YYYY-MM-DD. In the second scenario, when the time is not provided, it will be assumed to be 00\\:00\\:00 UTC time (optional)
     * @param callback       The callback to be executed when the API call finishes
     * @throws ApiException on error
     */
    void getBusinessRulesAsync(String modifiedAfter, String modifiedBefore, ApiCallback<BusinessRules> callback) throws ApiException;

    /**
     * Retrieve a specific Business Rule
     *
     * @param id The unique identifier of the rule to retrieve
     * @return The Business Rule
     * @throws ApiException on error
     */
    BusinessRule getBusinessRuleById(String id) throws ApiException;

    /**
     * Asynchronously retrieve a specific Business Rule
     *
     * @param id       The unique identifier of the rule to retrieve
     * @param callback The callback to be executed when the API call finishes
     * @throws ApiException on error
     */
    void getBusinessRuleByIdAsync(String id, ApiCallback<BusinessRule> callback) throws ApiException;

    /**
     * Update an existing BusinessRule. The newly updated rule is returned by the request
     *
     * @param id   The unique identifier of the rule to update
     * @param data Business Rule to save
     * @return The newly updated Business Rule
     * @throws ApiException on error
     */
    BusinessRule updateBusinessRule(String id, BusinessRule data) throws ApiException;

    /**
     * Asynchronously update an existing Business Rule
     *
     * @param id       The unique identifier of the rule to update
     * @param data     Business Rule to save
     * @param callback The callback to be executed when the API call finishes
     * @throws ApiException on error
     */
    void updateBusinessRuleAsync(String id, BusinessRule data, ApiCallback<BusinessRule> callback) throws ApiException;

    /**
     * Create a new Business Rule. The newly created rule is returned by the request
     *
     * @param data Business Rule to create
     * @return The newly created Business Rule
     * @throws ApiException on error
     */
    BusinessRule createBusinessRule(BusinessRule data) throws ApiException;

    /**
     * Asynchronously create a new Business Rule.
     *
     * @param data     Business Rule to create
     * @param callback The callback to be executed when the API call finishes
     * @throws ApiException on error
     */
    void createBusinessRuleAsync(BusinessRule data, ApiCallback<BusinessRule> callback) throws ApiException;
}
