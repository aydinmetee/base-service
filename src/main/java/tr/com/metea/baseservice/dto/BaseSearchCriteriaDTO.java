package tr.com.metea.baseservice.dto;

import tr.com.metea.baseservice.util.SearchCriteriaOptions;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */

public interface BaseSearchCriteriaDTO<E> {
    String orgId = null;

    SearchCriteriaOptions<E> criteriaFieldMapper();

    void setOrgId(String orgId);
}
