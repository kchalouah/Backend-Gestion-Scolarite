package com.springboot.projetggetionscolarite.repositories;

import com.springboot.projetggetionscolarite.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
