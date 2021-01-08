package com.springboot.backend.chat.service.impl;

import com.springboot.backend.chat.models.documents.Mensaje;
import com.springboot.backend.chat.repository.ChatRepository;
import com.springboot.backend.chat.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ChatServiceImpl")
public class ChatServiceImpl implements ChatService {

    @Autowired
    private ChatRepository chatRepository;

    @Override
    public List<Mensaje> obtenerUltimos10Mensajes() {
        return chatRepository.findFirst10ByOrderByFechaDesc();
    }

    @Override
    public Mensaje save(Mensaje mensaje) {
        return chatRepository.save(mensaje);
    }
}
