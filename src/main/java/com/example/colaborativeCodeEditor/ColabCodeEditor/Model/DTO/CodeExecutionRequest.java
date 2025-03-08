package com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DTO;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CodeExecutionRequest {

    private String language;
    private String code;
    private String input;
    private String name;

}
