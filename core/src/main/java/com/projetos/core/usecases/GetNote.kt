package com.projetos.core.usecases

import com.projetos.core.repository.NoteRepository

class GetNote(private val noteRepository: NoteRepository) {

    suspend fun invoke(id: Long) = noteRepository.getNote(id)
}