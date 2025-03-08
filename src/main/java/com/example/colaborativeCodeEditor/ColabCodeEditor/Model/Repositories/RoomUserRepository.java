package com.example.colaborativeCodeEditor.ColabCodeEditor.Model.Repositories;

import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DAO.RoomUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomUserRepository extends JpaRepository<RoomUser, Long> {

    RoomUser findByMemberIdAndRoomRoomId(Long memberId, String roomId);
}
