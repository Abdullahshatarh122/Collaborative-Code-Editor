package com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommitRequest {

    private long projectId;
    private String Code;
}
