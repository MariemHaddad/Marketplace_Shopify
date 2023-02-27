package com.example.marketplace.Repositories;

import com.example.marketplace.Entities.Chat;
import org.springframework.data.repository.CrudRepository;

public interface ChatRepository extends CrudRepository<Chat,Long> {
}
