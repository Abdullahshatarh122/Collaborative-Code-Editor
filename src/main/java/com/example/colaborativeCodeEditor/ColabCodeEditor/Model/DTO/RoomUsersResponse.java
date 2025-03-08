package com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DTO;

import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DAO.RoomUser;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomUsersResponse {
    private long userId;
    private String name;
    private String userEmail;
    private RoomUser.Role role;
    private String roomId;

}
