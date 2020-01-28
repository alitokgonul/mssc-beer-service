package guru.springframework.msscbeerservice.repositories;

import guru.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by at 1/28/2020
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
