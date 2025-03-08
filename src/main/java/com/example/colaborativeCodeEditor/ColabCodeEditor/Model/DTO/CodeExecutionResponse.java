package com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DTO;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CodeExecutionResponse {
    private String output;
    private String error;

}