package com.example.colaborativeCodeEditor.ColabCodeEditor.Model.Repositories;


import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DAO.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {
    Room findByRoomId(String roomId);
}
