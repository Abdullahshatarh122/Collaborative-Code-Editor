package com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DTO;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OpenRoomResponse {
    private Long projectId;
    private String code;
    private String language;
}