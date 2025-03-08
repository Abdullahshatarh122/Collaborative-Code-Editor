package com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DTO;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProjectRequest {
    private String name;
    private String language;
}
