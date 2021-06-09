package lk.ijse.spring.util;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StandaredResponse {

    private String code;
    private String status;
    private Object data;
}
