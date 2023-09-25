package com.project.expensesapi.data.validation;


import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvalidResponseDTO {

    private Map<String, String> errors;

}

