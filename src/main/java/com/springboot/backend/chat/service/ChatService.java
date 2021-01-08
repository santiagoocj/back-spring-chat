package com.springboot.backend.chat.service;

import com.springboot.backend.chat.models.documents.Mensaje;

import java.util.List;

public interface ChatService {

    public List<Mensaje> obtenerUltimos10Mensajes();

    public Mensaje save(Mensaje mensaje);
}
