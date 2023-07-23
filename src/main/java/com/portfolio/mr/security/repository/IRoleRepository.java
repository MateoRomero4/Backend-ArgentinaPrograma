package com.portfolio.mr.security.repository;

import com.portfolio.mr.security.entity.Role;
import com.portfolio.mr.security.enums.RoleName;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByRoleName(RoleName roleName);

}
