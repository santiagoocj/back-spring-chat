package com.springboot.backend.chat.repository;

import com.springboot.backend.chat.models.documents.Mensaje;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ChatRepository")
public interface ChatRepository extends MongoRepository<Mensaje, String> {

    public List<Mensaje> findFirst10ByOrderByFechaDesc();

}
