package com.portfolio.mr.Repository;

import com.portfolio.mr.Entity.Banner;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RBanner extends JpaRepository<Banner, Integer> {
    public Optional<Banner> findById(int id);
    public boolean existsById(int id);
}
