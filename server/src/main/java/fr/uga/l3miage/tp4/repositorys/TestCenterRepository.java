package fr.uga.l3miage.tp4.repositorys;

import fr.uga.l3miage.tp4.models.TestCenterEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TestCenterRepository  extends JpaRepository<TestCenterEntity, Long> {
}
