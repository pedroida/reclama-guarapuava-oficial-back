package br.edu.utfpr.reclamaguarapuava.occurrences.repositories;

import br.edu.utfpr.reclamaguarapuava.occurrences.entities.Occurrence;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OccurrenceRepository extends PagingAndSortingRepository<Occurrence, Long> {
    Page<Occurrence> findAllByUserId(Long id, Pageable pageable);
}
