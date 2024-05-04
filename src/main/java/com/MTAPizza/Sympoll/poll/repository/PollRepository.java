package com.MTAPizza.Sympoll.poll.repository;

import com.MTAPizza.Sympoll.poll.PostgresPoll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollRepository extends JpaRepository<PostgresPoll, Integer> {
}
