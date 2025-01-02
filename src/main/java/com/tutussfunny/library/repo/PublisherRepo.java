package com.tutussfunny.library.repo;

import com.tutussfunny.library.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepo extends JpaRepository<Publisher,Integer> {
}
