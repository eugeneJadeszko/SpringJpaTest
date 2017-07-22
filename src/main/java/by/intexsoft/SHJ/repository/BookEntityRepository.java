package by.intexsoft.SHJ.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import by.intexsoft.SHJ.entity.BookEntity;

public interface BookEntityRepository extends JpaRepository<BookEntity, Long> {

}
