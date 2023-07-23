package com.Portfolio.mr.security.repository;

import com.Portfolio.mr.security.entity.Role;
import com.Portfolio.mr.security.enums.RoleName;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByRoleName(RoleName roleName);

}
