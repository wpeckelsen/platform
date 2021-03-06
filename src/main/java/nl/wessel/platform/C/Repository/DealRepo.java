package nl.wessel.platform.C.Repository;

import nl.wessel.platform.B.BusinessLogic.Model.Deal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DealRepo extends JpaRepository<Deal, Long> {
    List<Deal> findDealsByName(String name);
}
