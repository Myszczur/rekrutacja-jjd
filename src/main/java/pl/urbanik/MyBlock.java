package pl.urbanik;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import pl.urbanik.interfaces.Block;

@AllArgsConstructor
@Getter
@ToString
public class MyBlock implements Block {

    private String color;
    private String material;
}
