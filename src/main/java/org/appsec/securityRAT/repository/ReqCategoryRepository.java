package org.appsec.securityRAT.repository;

import org.appsec.securityRAT.domain.ReqCategory;
import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the ReqCategory entity.
 */
public interface ReqCategoryRepository extends JpaRepository<ReqCategory,Long>, ReqCategoryRepositoryCustom {

    @Query("select distinct reqCategory from ReqCategory reqCategory where reqCategory.active=true")
    List<ReqCategory> findAllActive();

}
