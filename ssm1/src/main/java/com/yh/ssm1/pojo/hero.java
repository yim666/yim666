package com.yh.ssm1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Component
public class hero {
    private Integer id;
    private  String name;
    private  String type;
    private  Integer money;
}
