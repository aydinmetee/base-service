package tr.com.metea.baseservice.util;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KeyValue implements Serializable {
    private String key;
    private String value;
    private String additionalData;

    public KeyValue(String key, String value) {
        this.setKey(key);
        this.setValue(value);
        this.setAdditionalData("");
    }
}