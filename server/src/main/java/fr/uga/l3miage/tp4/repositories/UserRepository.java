package fr.uga.l3miage.tp4.repositories;

import com.sun.xml.bind.v2.model.core.ID;
import fr.uga.l3miage.tp4.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.yaml.snakeyaml.events.Event;

@NoRepositoryBean
public interface UserRepository<T extends UserEntity> extends JpaRepository<T, Long> {


}
