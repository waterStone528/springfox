package com.zx.springfox.model;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@Data
@NoArgsConstructor
public class Stock {
    private String no;
    private String name;
    private double price;

    public Stock(String no, String name, double price) {
        this.no = no;
        this.name = name;
        this.price = price;
    }
}
