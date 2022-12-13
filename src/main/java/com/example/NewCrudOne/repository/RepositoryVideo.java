package com.example.NewCrudOne.repository;

import com.example.NewCrudOne.domain.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryVideo extends JpaRepository<Video, Long> {
}
