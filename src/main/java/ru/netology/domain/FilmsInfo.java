package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class FilmsInfo {
    private int id;
    private String name;
    private int resultLength = 10;

    public FilmsInfo(int resultLength) {
        this.resultLength = resultLength;
    }

}
